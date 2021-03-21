package com.zz.cloudmall.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zz.cloudmall.goods.mapper.BrandMapper;
import com.zz.cloudmall.goods.model.Brand;
import com.zz.cloudmall.goods.service.BrandService;
import org.springframework.stereotype.Service;

/**
 * @author zz
 * @create 2021-03-19 23:51
 **/
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {
}
