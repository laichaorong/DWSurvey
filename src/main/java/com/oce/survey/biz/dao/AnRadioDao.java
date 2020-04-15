package com.oce.survey.biz.dao;

import java.util.List;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.AnRadio;
import com.oce.survey.biz.entity.Question;
import com.oce.survey.biz.entity.DataCross;

/**
 * 单选题 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnRadioDao extends BaseDao<AnRadio, String> {

	public void findGroupStats(Question question);

	public List<DataCross> findStatsDataCross(Question rowQuestion,
			Question colQuestion);

	public List<DataCross> findStatsDataChart(Question question);

}
