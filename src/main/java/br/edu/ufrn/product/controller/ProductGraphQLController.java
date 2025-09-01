package br.edu.ufrn.product.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProductGraphQLController {
    @QueryMapping
    public String hello(@Argument String name) {
        return new String("Hello, " + name + "!");
    }

    @QueryMapping
    public void getProduct(Long id) {

    }

    @QueryMapping
    public void getProducts() {

    }

    @MutationMapping
    public void createProduct(Object product) {

    }

    @MutationMapping
    public void updateProduct(Long id, Object product) {

    }

    @MutationMapping
    public void deleteProduct(Long id) {

    }
}
