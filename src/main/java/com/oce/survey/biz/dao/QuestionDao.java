package com.oce.survey.biz.dao;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.Question;

/**
 * 题基础 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface QuestionDao extends BaseDao<Question, String>{

	public void update(Question entity);
	public void quOrderByIdDel1(String belongId,Integer orderById);
}
