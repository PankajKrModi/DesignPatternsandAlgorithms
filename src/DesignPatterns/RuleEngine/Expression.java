package DesignPatterns.RuleEngine;

public class Expression {
    private Integer X,Y;
    private Operator operator;

    public Expression(Integer x, Integer y, Operator operator) {
        X = x;
        Y = y;
        this.operator = operator;
    }

    public Integer getX() {
        return X;
    }

    public void setX(Integer x) {
        X = x;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        Y = y;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
