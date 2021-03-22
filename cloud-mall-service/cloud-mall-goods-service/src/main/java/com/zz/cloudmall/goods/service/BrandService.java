package com.zz.cloudmall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zz.cloudmall.goods.model.Brand;

import java.util.List;

/**
 * @author zz
 * @create 2021-03-19 23:51
 **/
public interface BrandService extends IService<Brand> {

    /**
     * 条件查询
     * @param brand
     * @return List<Brand>
     */
    List<Brand> queryList(Brand brand);

    /**
     *
     * @param brand
     * @param currentPage
     * @param size
     * @return Page<Brand>
     */
    Page<Brand> queryList(Brand brand, Long currentPage, Long size);
}
