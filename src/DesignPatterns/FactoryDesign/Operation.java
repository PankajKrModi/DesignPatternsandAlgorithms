package DesignPatterns.FactoryDesign;

public interface Operation {
    public int apply(int a, int b);
}
class Addition implements Operation{

    @Override
    public int apply(int a, int b) {
        return a+b;
    }
}
class Subtraction implements Operation{

    @Override
    public int apply(int a, int b) {
        return a-b;
    }
}
