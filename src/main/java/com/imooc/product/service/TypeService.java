package com.imooc.product.service;

import com.imooc.product.dataobject.ProductTypes;

import java.util.List;

/**
 * @author 朱华康
 * @date 2019/4/10 14:08
 */
public interface TypeService {

    List<ProductTypes> findByTypeIn(List<Integer> typeList);
}
