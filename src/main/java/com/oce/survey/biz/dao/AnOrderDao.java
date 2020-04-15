package com.oce.survey.biz.dao;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.AnOrder;
import com.oce.survey.biz.entity.Question;

/**
 * 排序题 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnOrderDao extends BaseDao<AnOrder, String>{

	public void findGroupStats(Question question);

}
