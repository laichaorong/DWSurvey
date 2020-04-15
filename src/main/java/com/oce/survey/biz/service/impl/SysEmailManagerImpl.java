package com.oce.survey.biz.service.impl;

import com.oce.survey.biz.dao.SysEmailDao;
import com.oce.survey.biz.entity.SysEmail;
import com.oce.survey.biz.service.SysEmailManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oce.survey.common.service.BaseServiceImpl;

@Service
public class SysEmailManagerImpl extends BaseServiceImpl<SysEmail, String> implements SysEmailManager {

	@Autowired
	private SysEmailDao sysEmailDao;

	@Override
	public void setBaseDao() {
		this.baseDao=sysEmailDao;
	}

}
