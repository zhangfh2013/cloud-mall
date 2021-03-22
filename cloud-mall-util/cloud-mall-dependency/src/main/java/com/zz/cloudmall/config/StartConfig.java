package com.zz.cloudmall.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zz
 * @create 2021-03-22 22:39
 **/
@Configuration
public class StartConfig {
    /**
     * 分页拦截器
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置数据类型
        paginationInterceptor.setDbType(DbType.MYSQL);

        return paginationInterceptor;
    }
}
