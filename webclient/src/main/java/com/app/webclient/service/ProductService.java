package com.app.webclient.service;

import com.app.webclient.dto.ProductDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    Mono<ProductDto> getProductById(String id);

    Flux<ProductDto> getAllProduct();

    Mono<ProductDto> addProduct(ProductDto productDto);


    Mono<ProductDto> removeProductById(String id);

    Mono<Void> removeAllProducts();

    Mono<ProductDto> updateProduct(ProductDto productDto);

    Mono<ProductDto> partialUpdateProduct(ProductDto productDto);
}
