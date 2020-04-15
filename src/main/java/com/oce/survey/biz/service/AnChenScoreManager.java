package com.oce.survey.biz.service;

import java.util.List;

import com.oce.survey.common.service.BaseService;
import com.oce.survey.biz.entity.AnChenScore;
import com.oce.survey.biz.entity.Question;

/**
 * 矩陈评分题
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface AnChenScoreManager extends BaseService<AnChenScore, String>{
	public List<AnChenScore> findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
