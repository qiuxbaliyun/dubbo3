package com.xxxx.repo;

import com.xxxx.mybatis.domain.Product;

public interface IProductService {
	
	Product getProductById(int productId);
	public void insertProduct(Product product);
	public void deleteProduct(int productId);
}
