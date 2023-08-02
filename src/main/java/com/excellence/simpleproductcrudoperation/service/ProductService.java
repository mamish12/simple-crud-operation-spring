package com.excellence.simpleproductcrudoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excellence.simpleproductcrudoperation.dao.ProductDao;
import com.excellence.simpleproductcrudoperation.dto.Product;



@Service
public class ProductService {
	
	
	@Autowired
	ProductDao productDao;
	
	
	/*
	 * insertproduct
	 */

	public Product insertProduct(Product product)
	{
		if(product.getProductPrice()<=40000)
		{
			return productDao.insertProduct(product);
		}
		else
		{
			return null;
		}
		
	}
	
	/*
	 * deleteProduct
	 */

	public void deleteProductById(int productId) {
		
		productDao.deleteProductById(productId);
	}
	
	/*
	 * getProductId
	 */
	public Product  getProductById(int productId)
	{
		Product product=productDao.getProductById(productId);
		if(product!=null)
		{
			return productDao.getProductById(productId);
		}
		else
		{
			return null;
		}
		
	}
	
	/*
	 * update product
	 */
	
	public Product updateProductById(Product product)
	{
		return productDao.updateProductById(product);
	}
	
	
	/*
	 * getAll data
	 */

	public List<Product> getAllProduct()
	{
		return productDao.getAllProduct();
	}


}
