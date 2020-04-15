package com.oce.survey.biz.service;

import java.util.List;

import com.oce.survey.common.service.BaseService;
import com.oce.survey.biz.entity.Question;
import com.oce.survey.biz.entity.AnChenCheckbox;

/**
 * 矩陈多选题业务
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */

public interface AnChenCheckboxManager extends BaseService<AnChenCheckbox, String> {
	public List<AnChenCheckbox> findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
