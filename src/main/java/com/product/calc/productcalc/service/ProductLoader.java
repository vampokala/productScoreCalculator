package com.product.calc.productcalc.service;

import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import com.product.calc.productcalc.domain.Product;

import java.util.ArrayList;
import java.io.InputStreamReader;
import org.apache.commons.csv.CSVParser;

import java.io.BufferedReader;



@Service
public class ProductLoader {
 
    /**
 * Reads products from a CSV file and returns a list of Product objects.
 *
 * @param filePath The path to the CSV file containing product data.
 * @return A list of Product objects, each representing a product in the CSV file.
 * @throws Exception If an error occurs while reading the CSV file.
 */
public List<Product> readProductsCommon(String filePath) throws Exception {
    List<Product> products = new ArrayList<>();
    try {
       ClassPathResource resource = new ClassPathResource(filePath);
        // Creating a BufferedReader to read text from the InputStream efficiently
        BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
        try (//FileReader reader = new FileReader(resource.getFile());
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader())) {
            for (CSVRecord record : csvParser) {
                Product product = new Product();
                product.setName(record.get("name"));
                product.setType(record.get("type"));
                product.setColor(record.get("color"));
                product.setCost(Double.parseDouble(record.get("cost")));
                product.setWeight(Double.parseDouble(record.get("weight")));
                product.setMemory(Integer.parseInt(record.get("memory")));
                product.setScreenSize(Double.parseDouble(record.get("screenSize")));

                product.setBrand(record.get("brand"));            
                products.add(product);
            }
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    return products;
}
}