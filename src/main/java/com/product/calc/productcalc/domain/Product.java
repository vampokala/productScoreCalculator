package com.product.calc.productcalc.domain;

public class Product {
    
  
    private String name;
    private String type;
    private String color;
    private double cost;
    private double weight;
    private int memory;
    private double screenSize;
    private String brand;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Product(String name, String type, String color, double cost, double weight, int memory, double screenSize,
            String brand) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.cost = cost;
        this.weight = weight;
        this.memory = memory;
        this.screenSize = screenSize;
        this.brand = brand;
    }
    public Product() {
    
    }

    // Generate toString method
    @Override
public String toString() {
    return "Product{" +
            "name='" + name + '\'' +
            ", type='" + type + '\'' +
            ", color='" + color + '\'' +
            ", cost=" + cost +
            ", weight=" + weight +
            ", memory=" + memory +
            ", screenSize=" + screenSize +
            ", brand='" + brand + '\'' +
            '}';
}



}






