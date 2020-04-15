package com.oce.survey.biz.service;

import java.util.List;

import com.oce.survey.common.service.BaseService;
import com.oce.survey.biz.entity.AnRadio;
import com.oce.survey.biz.entity.Question;
import com.oce.survey.biz.entity.DataCross;

/**
 * 单选题
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface AnRadioManager extends BaseService<AnRadio, String>{
	public AnRadio findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);

	public List<DataCross> findStatsDataCross(Question rowQuestion,
			Question colQuestion);

	public List<DataCross> findStatsDataChart(Question question);
}
