package com.oce.survey.biz.dao;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.AnCheckbox;
import com.oce.survey.biz.entity.DataCross;
import com.oce.survey.biz.entity.Question;

import java.util.List;


/**
 * 多选题数据 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnCheckboxDao extends BaseDao<AnCheckbox, String>{

	public void findGroupStats(Question question);

	public List<DataCross> findStatsDataCross(Question rowQuestion,
                                              Question colQuestion);

	public List<DataCross> findStatsDataChart(Question question);

}
