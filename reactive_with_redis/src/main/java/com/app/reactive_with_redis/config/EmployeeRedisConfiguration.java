package com.app.reactive_with_redis.config;

import com.app.reactive_with_redis.model.EmployeeModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class EmployeeRedisConfiguration {


    @Bean
    public ReactiveRedisTemplate<String, EmployeeModel> reactiveRedisTemplate(
            ReactiveRedisConnectionFactory factory) {
        StringRedisSerializer keySerializer = new StringRedisSerializer();
        Jackson2JsonRedisSerializer<EmployeeModel> valueSerializer =
                new Jackson2JsonRedisSerializer<>(EmployeeModel.class);
        RedisSerializationContext.RedisSerializationContextBuilder<String, EmployeeModel> builder =
                RedisSerializationContext.newSerializationContext(keySerializer);
        RedisSerializationContext<String, EmployeeModel> context =
                builder.value(valueSerializer).build();
        return new ReactiveRedisTemplate<>(factory, context);
    }

    @Bean
    @Primary
    public ReactiveRedisConnectionFactory reactiveRedisConnectionFactory() {
        return new LettuceConnectionFactory();
    }
}
