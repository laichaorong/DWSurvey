package com.oce.survey.biz.dao;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.AnAnswer;
import com.oce.survey.biz.entity.Question;

/**
 * 答卷数据 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnAnswerDao extends BaseDao<AnAnswer, String> {

	public void findGroupStats(Question question);

}
