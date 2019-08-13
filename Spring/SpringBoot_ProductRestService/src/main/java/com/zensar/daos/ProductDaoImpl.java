package com.zensar.daos;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;
@Repository
/*
 * Author: SHIVAM SHUKLA
 * Creation Date: 31th July 2019 10.44AM
 * Modified Date: 31th July 2019 10.44AM
 * Version: 3.0
 * Copyright: Zensar Technologies. Alll rights reserved. 
 * Description: Represents business entity product.
 * value object of application,
 * domain or application object.
 * It is also POJO. 
 * */

public class ProductDaoImpl implements ProductDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void insert(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(product);
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(product);
	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(product);
	}

	public Product getById(int ProductId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Product.class, ProductId);
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Product.class);
	}
}