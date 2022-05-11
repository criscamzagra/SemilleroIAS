package com.co.ias.produtcs.infraestructure.adapters.out;

import com.co.ias.produtcs.shared.domain.PageQuery;
import com.co.ias.produtcs.types.application.domain.Id;
import com.co.ias.produtcs.types.application.domain.TypeProduct;
import com.co.ias.produtcs.types.application.ports.out.TypeProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PosgrestsqlTypeProductRepository implements TypeProductRepository {
    @Override
    public Integer store(TypeProduct typeProduct) {
        return null;
    }

    @Override
    public TypeProduct get(Id id) {
        return null;
    }

    @Override
    public void update(TypeProduct typeProduct) {

    }

    @Override
    public void delete(Id id) {

    }

    @Override
    public List<TypeProduct> getTypeProduct(PageQuery pageQuery) {
        return null;
    }
}
