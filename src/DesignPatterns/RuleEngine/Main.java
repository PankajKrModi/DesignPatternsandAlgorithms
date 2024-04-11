package DesignPatterns.RuleEngine;

public class Main {
    public static void main(String[] args) {
        Expression expression = new Expression(5, 5, Operator.ADD);
        RuleEngine engine = new RuleEngine();
        Integer result = engine.process(expression);
        System.out.println(result);
    }
}
