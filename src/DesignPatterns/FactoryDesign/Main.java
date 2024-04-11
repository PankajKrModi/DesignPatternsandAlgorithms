package DesignPatterns.FactoryDesign;

public class Main {
    public static void main(String[] args) throws Exception {
        Operation operation = OperationFactory.getOperation("Add").orElseThrow(()->new Exception("Invalid operation"));
        System.out.println(operation.apply(3,4));
    }
}
