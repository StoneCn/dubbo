package com.stone.service.impl;

import com.stone.entity.Product;
import com.stone.service.IProductService;
import org.springframework.stereotype.Service;

/**
 * @author stone
 * @date 2018/1/22 10:06
 */
public class ProductServiceImpl implements IProductService {


    @Override
    public Product getProduct(Long id) {
        Product product = new Product();
        product.setName("特步");
        product.setId(1L);
        return product;
    }

}
