package com.controllers;

import com.domain.Product;
import com.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ProductController {

    private ProductRepo productRepo;
    @RequestMapping("/product")

    public Iterable<Product> main(Map<String , Object> model){
        Iterable <Product> listOfProduct = productRepo.findAll();
        model.put("products", listOfProduct);
        return listOfProduct;
    }
}
