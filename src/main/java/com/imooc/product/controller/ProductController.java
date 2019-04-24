package com.imooc.product.controller;

import com.imooc.product.VO.ProductInfoVO;
import com.imooc.product.VO.ProductVO;
import com.imooc.product.VO.ResultVO;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.dataobject.ProductTypes;
import com.imooc.product.service.ProductService;
import com.imooc.product.service.TypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private TypeService typeService;

    /**
     * 1.查询所有在架商品
     * 2.获取类目列表
     * 3.查询类目
     * 4.构造数据
     */

    @GetMapping("/list")
    public ResultVO<ProductVO> list(){

        //1.查询所有在架商品
        List<ProductInfo> productInfoList=productService.findUpAll();

        //2.获取类目列表
        List<Integer> productTypesList=productInfoList.stream()
                .map(ProductInfo::getType)
                .collect(Collectors.toList());

        //3.从数据库中查询类目
        List<ProductTypes> typeList = typeService.findByTypeIn(productTypesList);

        //4.构造数据
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductTypes productTypes : typeList){
           ProductVO productVO=new ProductVO();
           productVO.setTname(productTypes.getTname());
           productVO.setType(productTypes.getType());

            List<ProductInfoVO> productInfoVOList=new ArrayList<>();
            for (ProductInfo productInfo:productInfoList){
                if (productInfo.getType().equals(productTypes.getType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(1);
        resultVO.setMsg("成功");
        resultVO.setData(productVOList);
        return resultVO;
    }
}
