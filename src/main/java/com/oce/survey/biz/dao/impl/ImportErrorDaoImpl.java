package com.oce.survey.biz.dao.impl;

import com.oce.survey.biz.entity.ImportError;
import com.oce.survey.biz.dao.ImportErrorDao;
import org.springframework.stereotype.Repository;

import com.oce.survey.common.dao.BaseDaoImpl;

/**
 * 导入错误记录 dao
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */

@Repository
public class ImportErrorDaoImpl  extends BaseDaoImpl<ImportError, String> implements ImportErrorDao {

}
