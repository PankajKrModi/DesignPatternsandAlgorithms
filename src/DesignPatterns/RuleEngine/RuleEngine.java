package DesignPatterns.RuleEngine;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {
    private static List<Rule> rules=  new ArrayList<>();
    static{
        rules.add(new AddRule());
    }
    public int process (Expression e){
        return rules.stream().filter(r->r.evaluate(e)).findFirst()
                .orElseThrow(()->new RuntimeException("Invalid expression")).getResult();
    }
}
