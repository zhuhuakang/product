package com.imooc.product.service.impl;

import com.imooc.product.dataobject.ProductTypes;
import com.imooc.product.repostory.ProductTypesRepository;
import com.imooc.product.service.ProductService;
import com.imooc.product.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 朱华康
 * @date 2019/4/10 14:13
 */

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private ProductTypesRepository productTypesRepository;

    @Override
    public List<ProductTypes> findByTypeIn(List<Integer> typeList) {
        return productTypesRepository.findByTypeIn(typeList);
    }
}
