package com.co.ias.produtcs.products.application.services;

import com.co.ias.produtcs.products.application.domain.Product;
import com.co.ias.produtcs.products.application.domain.ProductId;
import com.co.ias.produtcs.products.application.models.ProductDTO;
import com.co.ias.produtcs.products.application.ports.in.UpdateProductUseCase;
import com.co.ias.produtcs.products.application.ports.out.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class UpdateProductService implements UpdateProductUseCase {

    public static final String UPDATED_PRODUCT = "updated product";
    private final ProductRepository productRepository;

    public UpdateProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public String excute(ProductDTO productDTO) {
        Product product = productDTO.toDomain();
        productRepository.update(product);
        return UPDATED_PRODUCT;
    }
}
