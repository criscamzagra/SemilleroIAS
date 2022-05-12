package com.co.ias.produtcs.products.application.ports.out;

import com.co.ias.produtcs.products.application.domain.Product;
import com.co.ias.produtcs.products.application.domain.ProductId;
import com.co.ias.produtcs.shared.domain.PageQuery;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    void store(Product product);
    Optional<Product> get(ProductId productId);
    void update(Product product);
    void delete(ProductId productId);
    List<Product> getProducts(PageQuery pageQuery);
}
