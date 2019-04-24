package com.imooc.product.enums;

import lombok.Getter;

/**
 * 商品上下架状态
 * @author 朱华康
 * @date 2019/4/10 11:52
 */

@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
