package com.co.ias.produtcs.products.application.services;

import com.co.ias.produtcs.products.application.domain.ProductId;
import com.co.ias.produtcs.products.application.models.ProductDTO;
import com.co.ias.produtcs.products.application.ports.in.DeleteProductUseCase;
import com.co.ias.produtcs.products.application.ports.out.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class DeleteProductService implements DeleteProductUseCase {
    public static final String ELIMINATED_PRODUCT = "eliminated product";
    private final ProductRepository productRepository;

    public DeleteProductService(ProductRepository productRepository) {this.productRepository = productRepository;}


    @Override
    public String excute(Integer id) {
        ProductId productId = new ProductId(id);
        productRepository.delete(productId);
        return ELIMINATED_PRODUCT;
    }


}
