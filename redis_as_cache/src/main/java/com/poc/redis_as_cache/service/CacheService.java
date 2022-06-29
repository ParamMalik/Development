package com.poc.redis_as_cache.service;

import com.poc.redis_as_cache.model.CacheModel;

import java.util.List;

public interface CacheService {
    CacheModel addCacheData(CacheModel cacheModel);

    CacheModel getCacheDataById(String id);

    List<CacheModel> getAllData();

    void deleteCacheDataById(String id);
}
