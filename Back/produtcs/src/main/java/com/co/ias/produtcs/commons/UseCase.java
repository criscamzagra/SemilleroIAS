package com.co.ias.produtcs.commons;

public interface UseCase<Input, Output> {
    Output excute(Input input);
}
