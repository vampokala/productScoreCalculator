package com.product.calc.productcalc.domain;

import java.util.List;

  
    public class Rule {
    private List<Condition> conditions;
    private double score;
    public List<Condition> getConditions() {
        return conditions;
    }
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

}
