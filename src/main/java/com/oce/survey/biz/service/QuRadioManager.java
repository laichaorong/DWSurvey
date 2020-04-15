package com.oce.survey.biz.service;

import java.util.List;

import com.oce.survey.common.service.BaseService;
import com.oce.survey.biz.entity.QuRadio;

/**
 * 单选题
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface QuRadioManager  extends BaseService<QuRadio, String>{
	public List<QuRadio> findByQuId(String quId);

	public QuRadio upOptionName(String quId,String quItemId, String optionName);

	public List<QuRadio> saveManyOptions(String quId,List<QuRadio> quRadios);

	public void ajaxDelete(String quItemId);

	public void saveAttr(String quItemId, String isNote);
}
