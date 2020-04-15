package com.oce.survey.biz.service.impl;

import com.oce.survey.biz.dao.SurveyReqUrlDao;
import com.oce.survey.biz.entity.SurveyReqUrl;
import com.oce.survey.biz.service.SurveyReqUrlManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oce.survey.common.utils.RandomUtils;


/**
 * 短链地址
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
@Service
public class SurveyReqUrlManagerImpl  implements SurveyReqUrlManager {

	@Autowired
	private SurveyReqUrlDao surveyReqUrlDao;

	@Transactional
	public void save(SurveyReqUrl entity){
		String sId=entity.getSid();
		if(sId==null || "".equals(sId)){
			sId=RandomUtils.randomStr(6, 12);
			entity.setSid(sId);
		}
		surveyReqUrlDao.save(entity);
	}

	public void getByShortId(String shortId){

	}

}
