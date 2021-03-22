package com.zz.cloudmall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zz.cloudmall.goods.mapper.BrandMapper;
import com.zz.cloudmall.goods.model.Brand;
import com.zz.cloudmall.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zz
 * @create 2021-03-19 23:51
 **/
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    /**
     * 条件查询
     * @param brand
     * @return List<Brand>
     */
    @Override
    public List<Brand> queryList(Brand brand) {
        QueryWrapper<Brand> queryWrapper = new QueryWrapper<>();

        queryWrapper.like("name", brand.getName());

        queryWrapper.eq("initial", brand.getInitial());

        return brandMapper.selectList(queryWrapper);
    }

    @Override
    public Page<Brand> queryList(Brand brand, Long currentPage, Long size) {
        QueryWrapper<Brand> queryWrapper = new QueryWrapper<>();

        queryWrapper.like("name", brand.getName());

        return brandMapper.selectPage(new Page<Brand>(currentPage, size), queryWrapper);
    }
}
