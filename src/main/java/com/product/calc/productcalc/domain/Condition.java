package com.product.calc.productcalc.domain;

public class Condition {
    
    
        private String attribute;
        private String operator;
        private Object value;
        public String getAttribute() {
            return attribute;
        }
        public void setAttribute(String attributeName) {
            this.attribute = attributeName;
        }
        public String getOperator() {
            return operator;
        }
        public void setOperator(String operator) {
            this.operator = operator;
        }
        public Object getValue() {
            return value;
        }
        public void setValue(Object value) {
            this.value = value;
        }
    
        // Getters and Setters
    
}
