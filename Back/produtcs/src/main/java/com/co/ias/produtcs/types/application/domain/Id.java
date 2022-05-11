package com.co.ias.produtcs.types.application.domain;

import org.apache.commons.lang3.Validate;

public class Id {
    private final Integer value;

    public Id(Integer value) {
        Validate.notNull(value,  "product type id cannot be null");
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
