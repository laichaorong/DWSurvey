package com.oce.survey.common.base.dao;

import com.oce.survey.common.base.entity.User;
import com.oce.survey.common.dao.BaseDaoImpl;
import org.springframework.stereotype.Repository;


/**
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User, String> implements UserDao{

	@Override
	public void resetUserGroup(String groupId) {
		String sql="UPDATE t_user SET user_group_id = '' WHERE id = id";
		this.getSession().createSQLQuery(sql).executeUpdate();
	}

}
