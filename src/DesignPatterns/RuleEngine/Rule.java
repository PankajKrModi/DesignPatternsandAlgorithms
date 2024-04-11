package DesignPatterns.RuleEngine;



public interface Rule {
    public boolean evaluate(Expression e);
    public int getResult();
}

class AddRule implements Rule{
    int result = 0;
    @Override
    public boolean evaluate(Expression e) {
        if(e.getOperator()==Operator.ADD){
            this.result = e.getX()+e.getY();
            return true;
        }
        return false;
    }

    @Override
    public int getResult() {
        return result;
    }
}
