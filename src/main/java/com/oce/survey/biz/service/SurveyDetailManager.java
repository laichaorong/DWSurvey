package com.oce.survey.biz.service;

import com.oce.survey.common.service.BaseService;
import com.oce.survey.biz.entity.SurveyDetail;

/**
 * 问卷评情
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface SurveyDetailManager extends BaseService<SurveyDetail, String>{

	public SurveyDetail getBySurveyId(String surveyId);

}
