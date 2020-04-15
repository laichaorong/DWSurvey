package com.oce.survey.biz.service.impl;

import java.util.List;

import com.oce.survey.biz.entity.AnRadio;
import com.oce.survey.biz.dao.AnRadioDao;
import com.oce.survey.biz.entity.Question;
import com.oce.survey.biz.service.AnRadioManager;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oce.survey.common.service.BaseServiceImpl;
import com.oce.survey.biz.entity.DataCross;

/**
 * 单选题
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
@Service
public class AnRadioManagerImpl extends BaseServiceImpl<AnRadio, String> implements AnRadioManager {

	@Autowired
	private AnRadioDao anRadioDao;

	@Override
	public void setBaseDao() {
		this.baseDao=anRadioDao;
	}

	//根据exam_user信息查询答案
	public AnRadio findAnswer(String belongAnswerId,String quId){
		//belongAnswerId quId
		Criterion criterion1=Restrictions.eq("belongAnswerId", belongAnswerId);
		Criterion criterion2=Restrictions.eq("quId", quId);
		return anRadioDao.findUnique(criterion1,criterion2);
	}

	@Override
	public void findGroupStats(Question question) {
		anRadioDao.findGroupStats(question);
	}

	@Override
	public List<DataCross> findStatsDataCross(Question rowQuestion,
			Question colQuestion) {
		return anRadioDao.findStatsDataCross(rowQuestion, colQuestion);
	}

	@Override
	public List<DataCross> findStatsDataChart(Question question) {
		return anRadioDao.findStatsDataChart(question);
	}
}
