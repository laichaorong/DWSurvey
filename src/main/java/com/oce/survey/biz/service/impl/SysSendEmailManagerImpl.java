package com.oce.survey.biz.service.impl;

import com.oce.survey.biz.dao.SysSendEmailDao;
import com.oce.survey.biz.entity.SysSendEmail;
import com.oce.survey.biz.service.SysSendEmailManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oce.survey.common.service.BaseServiceImpl;

@Service
public class SysSendEmailManagerImpl extends BaseServiceImpl<SysSendEmail, String> implements SysSendEmailManager {

	@Autowired
	private SysSendEmailDao sysSendEmailDao;

	@Override
	public void setBaseDao() {
		this.baseDao=sysSendEmailDao;
	}

	@Override
	public void scanning() {
		//扫描没有发送的邮件，进行邮件发送操作，ok.

	}

}
