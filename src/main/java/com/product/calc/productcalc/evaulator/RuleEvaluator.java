package com.product.calc.productcalc.evaulator;


import org.springframework.stereotype.Service;

import com.product.calc.productcalc.domain.Product;

@Service
public class RuleEvaluator {

    /**
 * Calculates the total score of a product based on various attributes.
 *
 * @param product The product object containing attributes to be evaluated.
 * @return The total score of the product.
 */
public int calculateScore(Product product) {
    //calculate color score
    //return total score
    int totalScore = calculateColorScore(product) + calculateWeightScore(product) + calculateNameScore(product) + calculateCostScore(product) + calculateMemoryScore(product) + calculateScreenSizeScore(product) + calculateBrandScore(product) + calculateTypeScore(product);
    return totalScore;
}

    /**
 * Calculates the cost score of a product based on its cost.
 *
 * @param product The product object containing the cost attribute to be evaluated.
 * @return The cost score of the product.
 */
private int calculateCostScore(Product product) {
    int score = 0;
    if (product.getCost() < 699) {
        score = score + 50;
    } else if (product.getCost() >= 699 && product.getCost() < 799) {
        score = score + 75;
    } else if (product.getCost() >= 799 && product.getCost() < 899) {
        score = score + 100;
    } else if (product.getCost() >= 899 && product.getCost() < 999) {
        score = score + 125;
    } else if (product.getCost() >= 999 && product.getCost() < 1099) {
        score = score + 150;
    } else if (product.getCost() >= 1099 && product.getCost() < 1199) {
        score = score + 175;
    } else if (product.getCost() >= 1199 && product.getCost() < 1299) {
        score = score + 200;
    } else if (product.getCost() >= 1299 && product.getCost() < 1399) {
        score = score + 225;
    } else if (product.getCost() >= 1399 && product.getCost() < 1499) {
        score = score + 250;
    }
    return score;
}

    /**
 * Calculates the weight score of a product based on its weight.
 *
 * @param product The product object containing the weight attribute to be evaluated.
 * @return The weight score of the product.
 */
private int calculateWeightScore(Product product) {
    int score = 0;
    if (product.getWeight() > 140) {
        score = score + 100;
    } else if (product.getWeight() < 140) {
        score = score + 50;
    }
    return score;
}

    /**
 * Calculates the name score of a product based on its name.
 *
 * @param product The product object containing the name attribute to be evaluated.
 * @return The name score of the product.
 */
private int calculateNameScore(Product product) {
    int score = 0;
    if (product.getName().equals("iphone 13")) {
        score = score + 50;
    } else if (product.getName().equals("iphone 14")) {
        score = score + 75;
    } else if (product.getName().equals("iphone 15")) {
        score = score + 100;
    } else if (product.getName().contains("pro")) {
        score = score + 100;
    } else if (product.getName().contains("max")) {
        score = score + 100;
    } else if (product.getName().contains("plus")) {
        score = score + 50;
    } else if (product.getName().equals("iphone 15")) {
        score = score + 100;
    } else if (product.getName().equals("iphone 15")) {
        score = score + 100;
    }

    return score;
}

    /**
 * Calculates the color score of a product based on its color.
 *
 * @param product The product object containing the color attribute to be evaluated.
 * @return The color score of the product.
 */
private int calculateColorScore(Product product) {
    int score = 0;
    if (product.getColor().equals("red")) {
        score = score - 25;
    } else if (product.getColor().equals("silver")) {
        score = score + 50;
    } else if (product.getColor().equals("blue")) {
        score = score + 35;
    }
    return score;
}

    /**
 * Calculates the memory score of a product based on its memory.
 *
 * @param product The product object containing the memory attribute to be evaluated.
 * @return The memory score of the product.
 */
private int calculateMemoryScore(Product product) {
    int score = 0;
    if (product.getMemory() > 128 && product.getMemory() < 256) {
        score = score + 50;
    } else if (product.getMemory() < 128) {
        score = score + 25;
    } else if (product.getMemory() > 256 && product.getMemory() < 512) {
        score = score + 100;
    } else if (product.getMemory() > 512 && product.getMemory() < 1024) {
        score = score + 150;
    }
    return score;
}    


    /**
 * Calculates the screen size score of a product based on its screen size.
 *
 * @param product The product object containing the screen size attribute to be evaluated.
 * @return The screen size score of the product.
 */
private int calculateScreenSizeScore(Product product) {
    int score = 0;
    if (product.getScreenSize() > 5.5 && product.getScreenSize() < 6) {
        score = score + 50;
    } else if (product.getScreenSize() < 6) {
        score = score + 25;
    } else if (product.getScreenSize() > 6 && product.getScreenSize() < 6.5) {
        score = score + 100;
    } else if (product.getScreenSize() > 6.5 && product.getScreenSize() < 7) {
        score = score + 150;
    }
    return score;
}

    /**
 * Calculates the brand score of a product based on its brand.
 *
 * @param product The product object containing the brand attribute to be evaluated.
 * @return The brand score of the product.
 */
private int calculateBrandScore(Product product) {
    int score = 0;
    if (product.getBrand().equals("apple")) {
        score = score + 100;
    } else if (product.getBrand().equals("samsung")) {
        score = score + 50;
    } else if (product.getBrand().equals("google")) {
        score = score + 25;
    } else if (product.getBrand().equals("oneplus")) {
        score = score + 75;
    }
    return score;
}

    /**
 * Calculates the type score of a product based on its type.
 *
 * @param product The product object containing the type attribute to be evaluated.
 * @return The type score of the product.
 */
private int calculateTypeScore(Product product) {
    int score = 0;
    if (product.getType().equals("smartphone")) {
        score = score + 150;
    } else if (product.getType().equals("tablet")) {
        score = score + 100;
    } else if (product.getType().equals("Foldable")) {
        score = score + 75;
    }
    return score;
}
}