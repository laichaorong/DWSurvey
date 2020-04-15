package com.oce.survey.biz.service;

import java.util.List;

import com.oce.survey.common.service.BaseService;
import com.oce.survey.biz.entity.AnChenFbk;
import com.oce.survey.biz.entity.Question;

/**
 * 矩陈填空题
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */

public interface AnChenFbkManager extends BaseService<AnChenFbk, String>{
	public List<AnChenFbk> findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
