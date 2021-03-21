package com.zz.cloudmall.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zz
 * @create 2021-03-10 23:31
 **/
@SpringBootApplication
@MapperScan(basePackages = {"com.zz.cloudmall.goods.mapper"})
public class CloudMallGoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudMallGoodApplication.class, args);
    }
}
