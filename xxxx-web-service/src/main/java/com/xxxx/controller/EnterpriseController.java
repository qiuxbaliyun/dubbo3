package com.xxxx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xxxx.mybatis.domain.Enterprise;
import com.xxxx.repo.IEnterpriseService;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {
	
	@Autowired
	IEnterpriseService enterpriseService;
	
	@RequestMapping("/getName")
	@ResponseBody
	public Enterprise getName() {
		System.out.println("qiuqiu");
		return enterpriseService.getEnterpriseById(1);
	}
}
