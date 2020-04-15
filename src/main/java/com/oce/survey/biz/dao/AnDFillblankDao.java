package com.oce.survey.biz.dao;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.AnDFillblank;
import com.oce.survey.biz.entity.Question;

/**
 * 多项填空题 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnDFillblankDao extends BaseDao<AnDFillblank, String>{

	public void findGroupStats(Question question);

}
