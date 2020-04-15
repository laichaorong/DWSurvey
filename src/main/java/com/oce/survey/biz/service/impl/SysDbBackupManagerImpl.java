package com.oce.survey.biz.service.impl;

import com.oce.survey.biz.service.SysDbBackupManager;
import com.oce.survey.biz.dao.SysDbBackupDao;
import com.oce.survey.biz.entity.SysDbBackup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oce.survey.common.service.BaseServiceImpl;


/**
 * 问卷备份
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
@Service
public class SysDbBackupManagerImpl extends BaseServiceImpl<SysDbBackup, String> implements SysDbBackupManager {

	@Autowired
	private SysDbBackupDao sysDbBackupDao;

	@Override
	public void setBaseDao() {
		this.baseDao=sysDbBackupDao;
	}

}
