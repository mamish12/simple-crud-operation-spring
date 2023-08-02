package com.excellence.simpleproductcrudoperation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excellence.simpleproductcrudoperation.dto.Product;
import com.excellence.simpleproductcrudoperation.service.ProductService;


@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	/*
	 * insert
	 */
	
	@PostMapping(value="/insertProduct")
	public Product insertProduct(@RequestBody Product product)
	{
		return productService.insertProduct(product);
	}

	/*
	 * delete
	 */
	
	@DeleteMapping(value="/deleteProduct/{productId}")
	public void deleteProductById(@PathVariable int productId)
	{
		productService.deleteProductById(productId);
	}
	
	
	/*'
	 *getproduct
	 */
	@GetMapping(value="/getProductById/{productId}")
	public Product getProductById(@PathVariable int productId)
	{
		return productService.getProductById(productId);
	}
	
	/*
	 * update product
	 */
	
	@PutMapping(value="/updateProduct")
	public Product updateProductById(@RequestBody Product product)
	{
		return productService.updateProductById(product);
	}
	
	/*
	 * getAll data
	 */

	@GetMapping(value="/getAllProduct")
	public List<Product> getAllProduct()
	{
		return productService.getAllProduct();
	}
}
