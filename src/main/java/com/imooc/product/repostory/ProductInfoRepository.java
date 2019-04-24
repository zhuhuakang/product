package com.imooc.product.repostory;

import com.imooc.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 朱华康
 * @date 2019/4/10 10:41
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByStatus(Integer status);
}
