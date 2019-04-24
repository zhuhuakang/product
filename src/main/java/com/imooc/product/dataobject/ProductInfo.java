package com.imooc.product.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class ProductInfo {

    @Id
    private String id;

    private String name;

    private double price;

    private Integer stock;

    private String description;

    private String icon;

    private Integer status;

    private Integer type;

    private Date createtime;

    private Date updatetime;


}
