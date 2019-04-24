package com.imooc.product.dataobject;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author 朱华康
 * @date 2019/4/10 11:16
 */

@Data
@Entity
public class ProductTypes {

    @Id
    @GeneratedValue
    private Integer tid;

    private String tname;

    private Integer type;

    private Date createtime;

    private Date updatetime;
}
