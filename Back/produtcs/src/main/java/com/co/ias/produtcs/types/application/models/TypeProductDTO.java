package com.co.ias.produtcs.types.application.models;

import com.co.ias.produtcs.types.application.domain.Id;
import com.co.ias.produtcs.types.application.domain.Name;
import com.co.ias.produtcs.types.application.domain.TypeProduct;

public class TypeProductDTO {
    private Integer id;
    private String name;

    public TypeProductDTO() {
    }

    public TypeProductDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public  TypeProduct toDomain(){
        return new TypeProduct(
                new Id(id),
                new Name(name)
        );

    }

    public static TypeProductDTO fromDomain(TypeProduct typeProduct){
        return new TypeProductDTO(
                typeProduct.getId().getValue(),
                typeProduct.getName().getValue()
                );

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
