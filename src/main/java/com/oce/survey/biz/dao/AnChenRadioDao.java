package com.oce.survey.biz.dao;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.Question;
import com.oce.survey.biz.entity.AnChenRadio;

/**
 * 矩陈单选题数据 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnChenRadioDao extends BaseDao<AnChenRadio, String>{

	public void findGroupStats(Question question);

}
