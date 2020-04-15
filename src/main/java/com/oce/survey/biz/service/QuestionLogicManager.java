package com.oce.survey.biz.service;

import java.util.List;

import com.oce.survey.biz.entity.QuestionLogic;

/**
 * 题逻辑
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface QuestionLogicManager {

	List<QuestionLogic> findByCkQuId(String quId);

}
