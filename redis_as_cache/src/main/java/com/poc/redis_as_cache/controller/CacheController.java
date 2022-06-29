package com.poc.redis_as_cache.controller;

import com.poc.redis_as_cache.model.CacheModel;
import com.poc.redis_as_cache.service.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/data")
public class CacheController {

    private final CacheService cacheService;

    @PostMapping
    public CacheModel addCacheData(CacheModel cacheModel) {
        return cacheService.addCacheData(cacheModel);
    }

    @GetMapping("/{id}")
    public CacheModel getCacheDataById(@PathVariable String id) {
        return cacheService.getCacheDataById(id);
    }

    @GetMapping
    public List<CacheModel> getAllData() {
        return cacheService.getAllData();
    }

    @DeleteMapping("/{id}")
    public void deleteCacheDataById(@PathVariable String id) {
        cacheService.deleteCacheDataById(id);
    }
}
