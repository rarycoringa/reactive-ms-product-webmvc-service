package br.edu.ufrn.product.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProductAPIController {
    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return new String("Hello, " + name + "!");
    }
    
    @GetMapping("/{id}")
    public void getProduct(@PathVariable("id") Long id) {

    }

    @GetMapping
    public void getProducts() {

    }

    @PostMapping
    public void createProduct(@RequestBody Object product) {

    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable("id") Long id, @RequestBody Object product) {

    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {

    }
}
