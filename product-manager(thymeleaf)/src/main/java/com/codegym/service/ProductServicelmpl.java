package com.codegym.service;

import com.codegym.model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServicelmpl implements ProductService{
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"Socola",10,1));
    }

    @Override
    public List<Product> listAll() {
        return null;
    }
}
