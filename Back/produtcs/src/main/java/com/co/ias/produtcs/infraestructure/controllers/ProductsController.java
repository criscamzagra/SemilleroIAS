package com.co.ias.produtcs.infraestructure.controllers;

import com.co.ias.produtcs.products.application.models.ProductDTO;
import com.co.ias.produtcs.products.application.ports.in.CreateProductUseCase;
import com.co.ias.produtcs.products.application.ports.in.DeleteProductUseCase;
import com.co.ias.produtcs.products.application.ports.in.QueryProductUseCase;
import com.co.ias.products.shared.errors.AplicationError;
import com.co.ias.produtcs.products.application.ports.in.UpdateProductUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductsController {

    private final CreateProductUseCase createProductUseCase;
    private final QueryProductUseCase queryProductUseCase;

    private final DeleteProductUseCase deleteProductUseCase;

    private final UpdateProductUseCase updateProductUseCase;

    public ProductsController(CreateProductUseCase createProductUseCase, QueryProductUseCase queryProductUseCase, DeleteProductUseCase deleteProductUseCase, UpdateProductUseCase updateProductUseCase) {
        this.createProductUseCase = createProductUseCase;
        this.queryProductUseCase = queryProductUseCase;
        this.deleteProductUseCase = deleteProductUseCase;
        this.updateProductUseCase = updateProductUseCase;
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<?> createProduct(@RequestBody ProductDTO productDTO) {
        try {
            ProductDTO product = createProductUseCase.excute(productDTO);
            return ResponseEntity.ok(product);

        } catch (IllegalArgumentException | NullPointerException e) {
            AplicationError aplicationError = new AplicationError(
                 "InputValidation",
                 "Bad input data"
            );
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(aplicationError);
        } catch (Exception exception) {
            AplicationError aplicationError = new AplicationError(
                    "SystemError",
                    exception.getMessage()
            );
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(aplicationError);
        }
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getProduct(@PathVariable("id") Integer id) {
        try {
            Optional<ProductDTO> productDTO = queryProductUseCase.excute(id);
            return productDTO.isPresent() ? ResponseEntity.ok(productDTO) : ResponseEntity.status(HttpStatus.NO_CONTENT).body(id);
        } catch (IllegalArgumentException | NullPointerException e) {
            AplicationError aplicationError = new AplicationError(
                    "InputValidation",
                    "Bad input data"
            );
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(aplicationError);
        } catch (Exception exception) {
            AplicationError aplicationError = new AplicationError(
                    "SystemError",
                    exception.getMessage()
            );
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(aplicationError);
        }
    }


    @RequestMapping(value = "/product/update", method = RequestMethod.POST)
    public ResponseEntity<?> UpdateProduct(@RequestBody ProductDTO productDTO) {
        try {
            String product = updateProductUseCase.excute(productDTO);
            return ResponseEntity.ok(product);

        } catch (IllegalArgumentException | NullPointerException e) {
            AplicationError aplicationError = new AplicationError(
                    "InputValidation",
                    "Bad input data"
            );
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(aplicationError);
        } catch (Exception exception) {
            AplicationError aplicationError = new AplicationError(
                    "SystemError",
                    exception.getMessage()
            );
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(aplicationError);
        }
    }



    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteProduct(@PathVariable("id") Integer id) {
        try {
            String productDTO = deleteProductUseCase.excute(id);
            return ResponseEntity.ok(productDTO);
        } catch (IllegalArgumentException | NullPointerException e) {
            AplicationError aplicationError = new AplicationError(
                    "InputValidation",
                    "Bad input data"
            );
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(aplicationError);
        } catch (Exception exception) {
            AplicationError aplicationError = new AplicationError(
                    "SystemError",
                    exception.getMessage()
            );
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(aplicationError);
        }
    }
}
