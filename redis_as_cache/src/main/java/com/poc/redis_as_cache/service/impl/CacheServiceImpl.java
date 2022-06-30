package com.poc.redis_as_cache.service.impl;

import com.poc.redis_as_cache.model.CacheModel;
import com.poc.redis_as_cache.repository.CacheRepository;
import com.poc.redis_as_cache.service.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CacheServiceImpl implements CacheService {

    private final CacheRepository cacheRepository;

    @Override
    @CachePut(value = "CacheModel", key = "#cacheModel.name")
    public CacheModel addCacheData(CacheModel cacheModel) {
        System.out.println("Post To db");
        return cacheRepository.save(cacheModel);
    }

    @Override
    @Cacheable(value = "CacheModel", key = "#id")
    public CacheModel getCacheDataById(String id) {
        System.out.println("Calling get by Id From DB");
        return cacheRepository.findById(id).get();
    }

    @Override
    @Cacheable(value = "CacheModel")
    public List<CacheModel> getAllData() {
        return cacheRepository.findAll();
    }

    @Override
    @CacheEvict(value = "CacheModel", key = "#id")
    public void deleteCacheDataById(String id) {
        cacheRepository.deleteById(id);
    }
}
