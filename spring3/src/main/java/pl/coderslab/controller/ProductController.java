package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.ProductService;
import pl.coderslab.shop.Product;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public List<Product> listView(){
        return productService.getProductList();
    }

    @GetMapping("/{id}")
    public Product productView(@PathVariable int id){
        return productService.getProduct(id);
    }

    @PostMapping("/")
    public void addView(@RequestBody Product product){
        productService.addProduct(product);
    }

    @PutMapping("/")
    public void editProductView(@RequestBody Product product){
        productService.update(product) ;
    }


}
