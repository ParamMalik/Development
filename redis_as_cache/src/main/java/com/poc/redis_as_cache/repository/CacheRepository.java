package com.poc.redis_as_cache.repository;

import com.poc.redis_as_cache.model.CacheModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CacheRepository extends MongoRepository<CacheModel, String> {

}
