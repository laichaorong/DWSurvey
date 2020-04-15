package com.oce.survey.biz.service;

import java.util.List;

import com.oce.survey.common.service.BaseService;
import com.oce.survey.biz.entity.AnScore;
import com.oce.survey.biz.entity.Question;

/**
 * 评分题
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface AnScoreManager extends BaseService<AnScore, String>{
	public List<AnScore>  findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
