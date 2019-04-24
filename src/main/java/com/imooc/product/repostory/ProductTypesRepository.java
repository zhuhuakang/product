package com.imooc.product.repostory;

import com.imooc.product.dataobject.ProductTypes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 朱华康
 * @date 2019/4/10 11:27
 */
public interface ProductTypesRepository extends JpaRepository<ProductTypes,Integer> {

    List<ProductTypes> findByTypeIn(List<Integer> typeList);
}
