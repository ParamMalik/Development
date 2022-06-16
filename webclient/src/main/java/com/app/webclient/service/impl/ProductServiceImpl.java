package com.app.webclient.service.impl;

import com.app.webclient.dto.ProductDto;
import com.app.webclient.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Autowired
    private WebClient webClient;


    @Override
    public Mono<ProductDto> getProductById(String id) {
        return webClient.get().uri("/{id}", id)
                .retrieve()
                .bodyToMono(ProductDto.class)
                .doOnError(throwable -> {
                    System.out.println("Error Occurred");
                });
    }

    @Override
    public Flux<ProductDto> getAllProduct() {
        return webClient.get()
                .retrieve()
                .bodyToFlux(ProductDto.class);
    }

    @Override
    public Mono<ProductDto> addProduct(ProductDto productDto) {
        return webClient.post()
                .uri("/")
                .body(Mono.just(productDto), ProductDto.class)
                .retrieve()
                .bodyToMono(ProductDto.class);
    }

    @Override
    public Mono<ProductDto> removeProductById(String id) {
        return webClient.delete()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(ProductDto.class);
    }

    @Override
    public Mono<Void> removeAllProducts() {
        return webClient.delete()
                .uri("/")
                .retrieve()
                .bodyToMono(Void.class);
    }

    @Override
    public Mono<ProductDto> updateProduct(ProductDto productDto) {
        return webClient.put()
                .uri("/")
                .body(Mono.just(productDto), ProductDto.class)
                .retrieve()
                .bodyToMono(ProductDto.class);
    }

    @Override
    public Mono<ProductDto> partialUpdateProduct(ProductDto productDto) {
        return webClient.patch()
                .uri("/")
                .body(Mono.just(productDto), ProductDto.class)
                .retrieve()
                .bodyToMono(ProductDto.class);
    }
}
