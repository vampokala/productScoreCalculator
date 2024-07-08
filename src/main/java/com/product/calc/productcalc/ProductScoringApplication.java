package com.product.calc.productcalc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.product.calc.productcalc.domain.Product;
import com.product.calc.productcalc.evaulator.RuleEvaluator;
import com.product.calc.productcalc.service.ProductLoader;

@SpringBootApplication
public class ProductScoringApplication implements CommandLineRunner {

   
    @Autowired
    private RuleEvaluator ruleEvaluator;
    @Autowired
    private ProductLoader productLoader;

    public static void main(String[] args) {
        SpringApplication.run(ProductScoringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        int threshold = 50;
        List<Product> products = loadProducts();

        // filter products that scores over threshold
        List<Product> filteredProducts = products.stream()
                .filter(product -> ruleEvaluator.calculateScore(product) > threshold)
                .toList();
        double total = filteredProducts.stream().mapToDouble(Product::getCost).sum();
        double average = filteredProducts.isEmpty() ? 0 : total / products.size();

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        for (Product product : filteredProducts) {
            System.out.println(product.getName());
            System.out.println(ruleEvaluator.calculateScore(product));
        }

    }

    private List<Product> loadProducts() {
        // Load products from csv file
        // Example:
        List<Product> products = new ArrayList<>();
        // read csv file and add to products list
        try {
            products = productLoader.readProductsCommon("Smartphones.csv");
        } catch (Exception e) {
            System.err.println("Error reading products.csv: " + e.getMessage());
            e.printStackTrace();
        }

        return products;
    }
   
}
