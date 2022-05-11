package com.co.ias.produtcs.types.application.domain;

public class TypeProduct {

    private final Id id;
    private final Name name;

    public TypeProduct(Id id, Name name) {
        this.id = id;
        this.name = name;
    }

    public Id getId() {
        return id;
    }

    public Name getName() {
        return name;
    }
}
