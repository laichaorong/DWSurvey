package com.oce.survey.biz.dao;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.AnFillblank;
import com.oce.survey.biz.entity.Question;

/**
 * 填空题 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnFillblankDao extends BaseDao<AnFillblank, String>{

	public void findGroupStats(Question question);

}
