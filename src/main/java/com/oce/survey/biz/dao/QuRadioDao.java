package com.oce.survey.biz.dao;

import com.oce.survey.common.dao.BaseDao;
import com.oce.survey.biz.entity.QuRadio;

public interface QuRadioDao extends BaseDao<QuRadio, String> {

	public void quOrderByIdDel1(String quId,Integer orderById);

}
