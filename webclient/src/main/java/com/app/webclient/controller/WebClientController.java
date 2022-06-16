package com.app.webclient.controller;

import com.app.webclient.dto.ProductDto;
import com.app.webclient.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class WebClientController {

    private final ProductService productService;

    @GetMapping("/{id}")
    public Mono<ProductDto> getProduct(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @GetMapping
    public Flux<ProductDto> getAllProducts() {
        return productService.getAllProduct();
    }

    @PostMapping
    public Mono<ProductDto> addNewProduct(@RequestBody ProductDto productDto) {
        return productService.addProduct(productDto);
    }

    @DeleteMapping("/{id}")
    public Mono<ProductDto> deleteById(@PathVariable String id) {
        return productService.removeProductById(id);
    }

    @DeleteMapping
    public Mono<Void> deleteAllProducts() {
        return productService.removeAllProducts();
    }

    @PutMapping
    public Mono<ProductDto> updateProduct(@RequestBody ProductDto productDto) {
        return productService.updateProduct(productDto);
    }

    public Mono<ProductDto> partialUpdateProduct(@RequestBody ProductDto productDto) {
        return productService.partialUpdateProduct(productDto);
    }
}
