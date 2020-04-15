package com.oce.survey.biz.service;

import com.oce.survey.common.service.BaseService;
import com.oce.survey.biz.entity.Question;
import com.oce.survey.biz.entity.AnAnswer;

/**
 * 答卷业务
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */

public interface AnAnswerManager extends BaseService<AnAnswer, String> {
	public AnAnswer findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
