package com.poc.redis_as_cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisAsCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisAsCacheApplication.class, args);
    }

}
