package com.co.ias.produtcs;

import com.co.ias.produtcs.types.application.domain.Id;
import com.co.ias.produtcs.types.application.domain.Name;
import com.co.ias.produtcs.types.application.domain.TypeProduct;
import com.co.ias.produtcs.types.application.models.TypeProductDTO;

public class TestAplication {
    public static void main(String[] args) {
       try {
           Id id = new Id(1);
           Name name = new Name("Electronic");

           TypeProduct typeProduct = new TypeProduct(id,name);
          //ouput
           TypeProductDTO typeProductDTO = new TypeProductDTO(2,"Food");

           //input
           TypeProduct typeProduct1 = typeProductDTO.toDomain();

       }catch (NullPointerException exception){
           System.out.println("Error "+ exception.getMessage());
       }

    }


}
