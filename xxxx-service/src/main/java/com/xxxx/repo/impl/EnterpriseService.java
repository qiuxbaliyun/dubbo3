package com.xxxx.repo.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxxx.mybatis.IDao.EnterpriseMapper;
import com.xxxx.mybatis.domain.Enterprise;
import com.xxxx.repo.IEnterpriseService;

@Service("enterpriseService")
public class EnterpriseService implements IEnterpriseService {
    
	Logger logger = Logger.getLogger(EnterpriseService.class); 
	
	@Autowired
	EnterpriseMapper enterpriseMapper;
	
	@Override
	public Enterprise getEnterpriseById(int enterpriseId) {
		// TODO Auto-generated method stub
		System.out.println("qiuqiuqiu");
		return enterpriseMapper.selectByPrimaryKey(enterpriseId);
	}
		
}
