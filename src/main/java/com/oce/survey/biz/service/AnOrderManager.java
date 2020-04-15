package com.oce.survey.biz.service;

import java.util.List;

import com.oce.survey.common.service.BaseService;
import com.oce.survey.biz.entity.Question;
import com.oce.survey.biz.entity.AnOrder;

/**
 * 排序题
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface AnOrderManager extends BaseService<AnOrder, String>{
	public List<AnOrder>  findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
