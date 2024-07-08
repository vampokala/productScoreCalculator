package com.product.calc.productcalc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.product.calc.productcalc.domain.Product;
import com.product.calc.productcalc.service.ProductLoader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class ProductServiceTest {

	@Autowired
	private ProductLoader productLoader;

	@Test
	void testReadProductsCommon() throws Exception {
		String filePath = "path_to_your_csv_file.csv";
		List<Product> products = productLoader.readProductsCommon(filePath);
		assertNotNull(products);
		assertEquals(5, products.size()); // Replace 5 with the expected number of products in the CSV file
	}
}
