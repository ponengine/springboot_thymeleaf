package com.pon.webapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pon.webapp.model.Product;
@Component
public class ProductDAO {
	public List<Product> findAll(){
		List<Product> products = new ArrayList<Product>();
		products = Arrays.asList(
				new Product(1,"pon","thum.gif",new Date()),
				new Product(2,"pat","thum.gif",new Date()),
				new Product(3,"neem","thum.gif",new Date()));
	return products;
	}
}
