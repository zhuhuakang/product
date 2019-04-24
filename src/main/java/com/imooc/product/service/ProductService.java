package com.imooc.product.service;

import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @author 朱华康
 * @date 2019/4/10 11:44
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();
}
