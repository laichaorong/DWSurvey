package com.oce.survey.biz.service;

import java.util.List;

import com.oce.survey.common.service.BaseService;
import com.oce.survey.biz.entity.QuChenColumn;

/**
 * 矩陈题列
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface QuChenColumnManager extends BaseService<QuChenColumn, String> {

	public List<QuChenColumn> findByQuId(String quId);

	public String getContentByQuId(String quId);

	public QuChenColumn upOptionName(String quId,String quItemId, String optionName);

	public void ajaxDelete(String quItemId);

}
