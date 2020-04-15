package com.oce.survey.common.base.dao;

import com.oce.survey.common.base.entity.User;
import com.oce.survey.common.dao.BaseDao;


/**
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface UserDao extends BaseDao<User, String> {

	public void resetUserGroup(String groupId);

}
