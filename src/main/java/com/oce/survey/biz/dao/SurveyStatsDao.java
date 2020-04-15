package com.oce.survey.biz.dao;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.Question;
import com.oce.survey.biz.entity.SurveyStats;

public interface SurveyStatsDao extends BaseDao<SurveyStats, String>{

	public void findStatsDataCross(Question rowQuestion, Question colQuestion);

}
