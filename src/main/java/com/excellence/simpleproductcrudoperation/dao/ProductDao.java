package com.excellence.simpleproductcrudoperation.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.excellence.simpleproductcrudoperation.dto.Product;
import com.excellence.simpleproductcrudoperation.repository.ProductRepository;


@Repository
public class ProductDao {

	@Autowired
	ProductRepository productRepository;
	
	
	/*
	 * insertProduct Method
	 */

	
	public Product insertProduct(Product product) {
		return productRepository.save(product);
	}


	/*
	 * deleteProduct
	 */

	public void deleteProductById(int productId) {
		Optional<Product> optional = productRepository.findById(productId);
		if (optional.isPresent()) {
			productRepository.delete(optional.get());
		}
	}
	
	/*
	 * getProductId
	 */
	public Product getProductById(int productId) {
		Optional<Product> optional = productRepository.findById(productId);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}
	
	
	
	/*
	 * update product
	 */
	
	public Product updateProductById(Product product)
	{
		Product product2=getProductById(product.getProductId());
		
		if(product2!=null)
		{
			product2.setProductName(product.getProductName());
			product2.setProductColor(product.getProductColor());
			product2.setProductPrice(product.getProductPrice());
			
			return productRepository.save(product2);
		}
		else
		{
			return null;
		}
	}
	
	/*
	 * getAll data
	 */

	public List<Product> getAllProduct()
	{
		return productRepository.findAll();
	}
	

	
	
}
