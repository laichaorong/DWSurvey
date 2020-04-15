package com.oce.survey.biz.service;

import java.util.List;

import com.oce.survey.common.service.BaseService;
import com.oce.survey.biz.entity.Question;
import com.oce.survey.biz.entity.SurveyDirectory;

/**
 * 题基础
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface QuestionManager extends BaseService<Question, String>{

	public Question getDetail(String quId);

	public List<Question> find(String belongId,String tag);

	public List<Question> findDetails(String belongId,String tag);

	public void getQuestionOption(Question question);

	public List<Question> findByParentQuId(String parentQuId);

	public List<Question> findByQuIds(String[] quIds, boolean b);

	public void deletes(String[] delQuIds);
	//交接排序位置--前台交换
	public boolean upsort(String prevId, String nextId);

	public void saveBySurvey(String belongId  ,int tag, List<Question> questions);

	public void saveChangeQu(String belongId, int tag, String[] quIds);

	public List<Question> findStatsRowVarQus(SurveyDirectory survey);

	public List<Question> findStatsColVarQus(SurveyDirectory survey);

	public void update(Question entity);

}