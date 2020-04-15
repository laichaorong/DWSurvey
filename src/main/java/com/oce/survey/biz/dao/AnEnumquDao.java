package com.oce.survey.biz.dao;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.Question;
import com.oce.survey.biz.entity.AnEnumqu;

/**
 * 枚举题 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnEnumquDao extends BaseDao<AnEnumqu, String>{

	public void findGroupStats(Question question);

}
