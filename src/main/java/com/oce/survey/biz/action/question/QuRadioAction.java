package com.oce.survey.biz.action.question;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.WebUtils;

import com.oce.survey.common.utils.web.Struts2Utils;
import com.oce.survey.common.CheckType;
import com.oce.survey.common.QuType;
import com.oce.survey.biz.entity.QuRadio;
import com.oce.survey.biz.entity.Question;
import com.oce.survey.biz.entity.QuestionLogic;
import com.oce.survey.biz.service.QuRadioManager;
import com.oce.survey.biz.service.QuestionManager;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 单选题 action
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
@Namespaces({@Namespace("/design")})
@InterceptorRefs({ @InterceptorRef("paramsPrepareParamsStack") })
@AllowedMethods({"ajaxSave","ajaxDelete"})
@Results({})
public class QuRadioAction extends ActionSupport{
	@Autowired
	private QuestionManager questionManager;
	@Autowired
	private QuRadioManager quRadioManager;


	public String ajaxSave() throws Exception {
		HttpServletRequest request=Struts2Utils.getRequest();
		HttpServletResponse response=Struts2Utils.getResponse();
		try{
			Question entity=ajaxBuildSaveOption(request);
			questionManager.save(entity);
			String resultJson=buildResultJson(entity);
			response.getWriter().write(resultJson);
		}catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("error");
		}
		return null;
	}

	private Question ajaxBuildSaveOption(HttpServletRequest request) throws UnsupportedEncodingException {
		String quId=request.getParameter("quId");
		String belongId=request.getParameter("belongId");
		String quTitle=request.getParameter("quTitle");
		String orderById=request.getParameter("orderById");
		String tag=request.getParameter("tag");
		String isRequired=request.getParameter("isRequired");
		String hv=request.getParameter("hv");
		String randOrder=request.getParameter("randOrder");
		String cellCount=request.getParameter("cellCount");
		String contactsAttr=request.getParameter("contactsAttr");
		String contactsField=request.getParameter("contactsField");

		if("".equals(quId)){
			quId=null;
		}
		Question entity=questionManager.getModel(quId);
		entity.setBelongId(belongId);
		if(quTitle!=null){
			quTitle=URLDecoder.decode(quTitle,"utf-8");
			entity.setQuTitle(quTitle);
		}
		entity.setOrderById(Integer.parseInt(orderById));
		entity.setTag(Integer.parseInt(tag));
		entity.setQuType(QuType.RADIO);
		isRequired=(isRequired==null || "".equals(isRequired))?"0":isRequired;
		hv=(hv==null || "".equals(hv))?"0":hv;
		randOrder=(randOrder==null || "".equals(randOrder))?"0":randOrder;
		cellCount=(cellCount==null || "".equals(cellCount))?"0":cellCount;
		contactsAttr=(contactsAttr==null || "".equals(contactsAttr))?"0":contactsAttr;
		entity.setContactsAttr(Integer.parseInt(contactsAttr));
		entity.setContactsField(contactsField);
		entity.setIsRequired(Integer.parseInt(isRequired));
		entity.setHv(Integer.parseInt(hv));
		entity.setRandOrder(Integer.parseInt(randOrder));
		entity.setCellCount(Integer.parseInt(cellCount));
		Map<String, Object> optionNameMap=WebUtils.getParametersStartingWith(request, "optionValue_");
		List<QuRadio> quRadios=new ArrayList<QuRadio>();
		for (String key : optionNameMap.keySet()) {
			String optionId=request.getParameter("optionId_"+key);
			String isNote=request.getParameter("isNote_"+key);
			String checkType=request.getParameter("checkType_"+key);
			String isRequiredFill=request.getParameter("isRequiredFill_"+key);

			Object optionName=optionNameMap.get(key);
			String optionNameValue=(optionName!=null)?optionName.toString():"";
			QuRadio quRadio=new QuRadio();
			if("".equals(optionId)){
				optionId=null;
			}
			quRadio.setId(optionId);
//			quRadio.setOptionTitle(key);
			optionNameValue=URLDecoder.decode(optionNameValue,"utf-8");
			quRadio.setOptionName(optionNameValue);
			quRadio.setOrderById(Integer.parseInt(key));

			isNote=(isNote==null || "".equals(isNote))?"0":isNote;
			checkType=(checkType==null || "".equals(checkType))?"NO":checkType;
			isRequiredFill=(isRequiredFill==null || "".equals(isRequiredFill))?"0":isRequiredFill;
			quRadio.setIsNote(Integer.parseInt(isNote));
			quRadio.setCheckType(CheckType.valueOf(checkType));
			quRadio.setIsRequiredFill(Integer.parseInt(isRequiredFill));
			quRadios.add(quRadio);
		}
		entity.setQuRadios(quRadios);

		//逻辑选项设置
		Map<String, Object> quLogicIdMap=WebUtils.getParametersStartingWith(request, "quLogicId_");
		List<QuestionLogic> quLogics=new ArrayList<QuestionLogic>();
		for (String key : quLogicIdMap.keySet()) {
			String cgQuItemId=request.getParameter("cgQuItemId_"+key);
			String skQuId=request.getParameter("skQuId_"+key);
			String visibility=request.getParameter("visibility_"+key);
			String logicType=request.getParameter("logicType_"+key);
			Object quLogicId=quLogicIdMap.get(key);
			String quLogicIdValue=(quLogicId!=null)?quLogicId.toString():null;
			QuestionLogic quLogic=new QuestionLogic();
			quLogic.setId(quLogicIdValue);
			quLogic.setCgQuItemId(cgQuItemId);
			quLogic.setSkQuId(skQuId);
			quLogic.setVisibility(Integer.parseInt(visibility));
			quLogic.setTitle(key);
			quLogic.setLogicType(logicType);
			quLogics.add(quLogic);
		}
		entity.setQuestionLogics(quLogics);

		return entity;
	}

	public static String buildResultJson(Question entity){
		StringBuffer strBuf=new StringBuffer();
		strBuf.append("{id:'").append(entity.getId());
		strBuf.append("',orderById:");
		strBuf.append(entity.getOrderById());
		strBuf.append(",quItems:[");
		List<QuRadio> quRadios=entity.getQuRadios();
		for (QuRadio quRadio : quRadios) {
			strBuf.append("{id:'").append(quRadio.getId());
			strBuf.append("',title:'").append(quRadio.getOrderById()).append("'},");
		}
		int strLen=strBuf.length();
		if(strBuf.lastIndexOf(",")==(strLen-1)){
			strBuf.replace(strLen-1, strLen, "");
		}
		strBuf.append("]");

		strBuf.append(",quLogics:[");
		List<QuestionLogic> questionLogics=entity.getQuestionLogics();
		if(questionLogics!=null){
			for (QuestionLogic questionLogic : questionLogics) {
				strBuf.append("{id:'").append(questionLogic.getId());
				strBuf.append("',title:'").append(questionLogic.getTitle()).append("'},");
			}
		}
		strLen=strBuf.length();
		if(strBuf.lastIndexOf(",")==(strLen-1)){
			strBuf.replace(strLen-1, strLen, "");
		}
		strBuf.append("]}");
		return strBuf.toString();
	}

	/**
	 * 删除选项
	 * @return
	 * @throws Exception
	 */
	public String ajaxDelete() throws Exception {
		HttpServletRequest request=Struts2Utils.getRequest();
		HttpServletResponse response=Struts2Utils.getResponse();
		try{
			String quItemId=request.getParameter("quItemId");
			quRadioManager.ajaxDelete(quItemId);
			response.getWriter().write("true");
		}catch(Exception e){
			e.printStackTrace();
			response.getWriter().write("error");
		}
		return null;
	}


}