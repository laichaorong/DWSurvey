package com.oce.survey.biz.service;

import com.oce.survey.common.plugs.page.Page;
import com.oce.survey.common.service.BaseService;
import com.oce.survey.biz.entity.AnFillblank;
import com.oce.survey.biz.entity.Question;

/**
 * 填空题
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface AnFillblankManager extends BaseService<AnFillblank, String>{
	public AnFillblank findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);

	Page<AnFillblank> findPage(Page<AnFillblank> page, String quId);
}
