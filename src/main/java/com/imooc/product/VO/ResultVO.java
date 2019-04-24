package com.imooc.product.VO;

import lombok.Data;

/**
 * HTTP请求返回的最外层对象
 * @author 朱华康
 * @date 2019/4/10 15:29
 */

@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体类容
     */
    private T data;
}
