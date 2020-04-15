package com.oce.survey.biz.dao;

import java.util.Map;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.SurveyStats;
import com.oce.survey.biz.entity.SurveyAnswer;

public interface SurveyAnswerDao extends BaseDao<SurveyAnswer, String>{

	public void saveAnswer(SurveyAnswer surveyAnswer,
			Map<String, Map<String, Object>> quMaps);

	public SurveyStats surveyStatsData(SurveyStats surveyStats);
}
