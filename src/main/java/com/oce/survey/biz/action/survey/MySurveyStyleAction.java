package com.oce.survey.biz.action.survey;

import com.oce.survey.common.base.action.CrudActionSupport;
import com.oce.survey.common.base.service.AccountManager;
import com.oce.survey.biz.entity.SurveyStyle;
import com.oce.survey.biz.service.SurveyDirectoryManager;
import com.oce.survey.biz.service.SurveyStyleManager;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 问卷样式
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */

@Namespaces({@Namespace("/design")})
@InterceptorRefs({ @InterceptorRef("paramsPrepareParamsStack")})
@Results({})
public class MySurveyStyleAction extends CrudActionSupport<SurveyStyle, String>{

	private String surveyId;
	@Autowired
	private SurveyStyleManager surveyStyleManager;
	@Autowired
	private SurveyDirectoryManager surveyDirectoryManager;
	@Autowired
	private AccountManager accountManager;

	public String save() throws Exception  {
		return NONE;
	}

	public String ajaxGetStyle() throws Exception {
	    return null;
	}


}
