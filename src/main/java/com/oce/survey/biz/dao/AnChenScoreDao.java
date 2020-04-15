package com.oce.survey.biz.dao;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.AnChenScore;
import com.oce.survey.biz.entity.Question;

/**
 * 矩陈评分题 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnChenScoreDao extends BaseDao<AnChenScore, String>{

	public void findGroupStats(Question question);

}
