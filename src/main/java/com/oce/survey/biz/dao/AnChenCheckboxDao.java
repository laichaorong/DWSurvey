package com.oce.survey.biz.dao;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.Question;
import com.oce.survey.biz.entity.AnChenCheckbox;

/**
 * 矩陈多选题数据 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnChenCheckboxDao extends BaseDao<AnChenCheckbox, String>{

	public void findGroupStats(Question question);

}
