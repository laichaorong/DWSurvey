package com.oce.survey.biz.dao;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.AnChenFbk;
import com.oce.survey.biz.entity.Question;

/**
 * 矩陈填空题数据 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnChenFbkDao extends BaseDao<AnChenFbk, String>{

	void findGroupStats(Question question);

}
