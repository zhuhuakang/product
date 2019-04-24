package com.imooc.product.service.impl;

import com.imooc.product.dataobject.ProductTypes;
import com.imooc.product.repostory.ProductTypesRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 朱华康
 * @date 2019/4/10 14:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TypeServiceImplTest {

    @Autowired
    private ProductTypesRepository productTypesRepository;

    @Test
    public void findByTypeIn() {
        List<ProductTypes> list=productTypesRepository.findByTypeIn(Arrays.asList(11,22));
        Assert.assertTrue(list.size()>0);
    }
}