package com.co.ias.produtcs.types.application.domain;

import org.apache.commons.lang3.Validate;

public class Name {
    private final String value;

    public Name(String value) {
        Validate.notNull(value, "product type name cannot be null");
        Validate.isTrue(value.length() < 40, "the product type name is greater than 40 characters");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
