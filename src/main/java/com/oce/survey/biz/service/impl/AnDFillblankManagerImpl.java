package com.oce.survey.biz.service.impl;

import java.util.List;

import com.oce.survey.common.plugs.page.Page;
import com.oce.survey.biz.dao.AnDFillblankDao;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oce.survey.common.service.BaseServiceImpl;
import com.oce.survey.biz.entity.AnDFillblank;
import com.oce.survey.biz.entity.Question;
import com.oce.survey.biz.service.AnDFillblankManager;

/**
 * 多行填空题
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
@Service
public class AnDFillblankManagerImpl extends BaseServiceImpl<AnDFillblank, String> implements AnDFillblankManager{

	@Autowired
	private AnDFillblankDao anDFillblankDao;

	@Override
	public void setBaseDao() {
		this.baseDao=anDFillblankDao;
	}

	//根据exam_user信息查询答案
	public List<AnDFillblank> findAnswer(String belongAnswerId,String quId){
		//belongAnswerId quId
		Criterion criterion1=Restrictions.eq("belongAnswerId", belongAnswerId);
		Criterion criterion2=Restrictions.eq("quId", quId);
		return anDFillblankDao.find(criterion1,criterion2);
	}

	@Override
	public void findGroupStats(Question question) {
		anDFillblankDao.findGroupStats(question);
	}

	public Page<AnDFillblank> findPage(Page<AnDFillblank> page, String quItemId){
		Criterion cri1 = Restrictions.eq("quItemId",quItemId);
		Criterion cri2 = Restrictions.eq("visibility",1);
		return findPage(page,cri1,cri2);
	}

}
