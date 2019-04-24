package com.imooc.product.VO;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author 朱华康
 * @date 2019/4/10 15:40
 */

@Data
public class ProductVO {

    @JsonProperty("name")
    private String tname;

    @JsonProperty("type")
    private Integer type;

    @JsonProperty("foods")
    List<ProductInfoVO> productInfoVOList;
}
