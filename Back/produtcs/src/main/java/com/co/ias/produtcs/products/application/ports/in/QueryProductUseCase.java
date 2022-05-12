package com.co.ias.produtcs.products.application.ports.in;

import com.co.ias.produtcs.commons.UseCase;
import com.co.ias.produtcs.products.application.domain.ProductId;
import com.co.ias.produtcs.products.application.models.ProductDTO;

import java.util.Optional;

public interface QueryProductUseCase extends UseCase<Integer, Optional<ProductDTO>> {
}
