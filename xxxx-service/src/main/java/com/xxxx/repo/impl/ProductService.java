package com.xxxx.repo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxxx.mybatis.IDao.ProductMapper;
import com.xxxx.mybatis.domain.Product;
import com.xxxx.repo.IProductService;

@Service("productService")
public class ProductService implements IProductService {

	@Autowired 
	ProductMapper productMapper;
	
	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return productMapper.selectByPrimaryKey(productId);
	}

	@Override
	public void insertProduct(Product product) {
		// TODO Auto-generated method stub
		productMapper.insert(product);
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
        productMapper.deleteByPrimaryKey(productId);
	}

}
