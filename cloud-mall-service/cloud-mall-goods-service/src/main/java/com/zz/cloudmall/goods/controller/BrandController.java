package com.zz.cloudmall.goods.controller;

import com.zz.cloudmall.RespResult;
import com.zz.cloudmall.goods.model.Brand;
import com.zz.cloudmall.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zz
 * @create 2021-03-19 23:55
 **/
@RestController
@RequestMapping(value = "/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @RequestMapping(value = "hello")
    public String hello() {
        return "hello";
    }

    /**
     * 增加
     * @param brand
     * @return
     */
    @PostMapping
    public RespResult add(@RequestBody Brand brand) {
        brandService.save(brand);
        return RespResult.OK();
    }

    /**
     * 修改
     * @param brand
     * @return
     */
    @PutMapping
    public RespResult update(@RequestBody Brand brand) {
        brandService.updateById(brand);
        return RespResult.OK();
    }

    @DeleteMapping("/id")
    public RespResult delete(@PathVariable(value = "id")String id) {
        brandService.removeById(id);
        return RespResult.OK();
    }
}
