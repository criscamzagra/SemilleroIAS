package com.co.ias.produtcs.types.application.ports.out;

import com.co.ias.produtcs.shared.domain.PageQuery;
import com.co.ias.produtcs.types.application.domain.Id;
import com.co.ias.produtcs.types.application.domain.TypeProduct;

import java.util.List;

public interface TypeProductRepository {
    Integer store(TypeProduct typeProduct);
    TypeProduct get(Id id);
    void update(TypeProduct typeProduct);
    void delete(Id id);
    List<TypeProduct> getTypeProduct(PageQuery pageQuery);
}
