package com.repos;

import com.domain.Product;
import com.domain.User;
import org.springframework.data.repository.CrudRepository;



public interface ProductRepo extends CrudRepository<Product, Long> {

}
