package com.zz.cloudmall.goods.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zz
 * @create 2021-03-08 23:44
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "brand")
public class Brand {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO, value = "id")
    private Integer id;
    private String name;
    private String image;
    private String initial;
    private Integer sort;
}
