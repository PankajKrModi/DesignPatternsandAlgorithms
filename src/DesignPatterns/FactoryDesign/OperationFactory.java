package DesignPatterns.FactoryDesign;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperationFactory {
    public static Map<String,Operation> operationMap = new HashMap<>();
    static{
        operationMap.put("Add",new Addition());
        operationMap.put("Sub",new Subtraction());
    }
    public static Optional<Operation> getOperation(String operation){
        return Optional.ofNullable(operationMap.get(operation));
    }
}
