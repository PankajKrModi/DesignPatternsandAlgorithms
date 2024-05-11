package JAVA8Features;

import java.util.*;
import java.util.stream.Collectors;

public class SortingMapinJava {
    public static void main(String[] args) {
        Map<String, Integer> budget = new HashMap<>();
        budget.put("clothes", 120);
        budget.put("grocery", 150);
        budget.put("transportation", 100);
        budget.put("utility", 130);
        budget.put("rent", 1150);
        budget.put("miscellneous", 90);

        Map<String,Integer> sortedMapOnKeysUsingStreamApi =  budget.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2)->e1, LinkedHashMap::new));

        System.out.println("Sorted Map on Keys Using Stream Api" + sortedMapOnKeysUsingStreamApi);

        Map<String,Integer> sortedMapOnValuesUsingStreamApi =  budget.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));


        System.out.println("Sorted Map on Values Using Stream Api" + sortedMapOnValuesUsingStreamApi);

        List<Map.Entry<String,Integer>> mapList = new LinkedList<>(budget.entrySet());
        Collections.sort(mapList, Comparator.comparing(Map.Entry::getKey));
        HashMap<String,Integer> sortedMapOnKeyUsingCollections = new LinkedHashMap<>();
        for(Map.Entry<String,Integer> aa:mapList){
            sortedMapOnKeyUsingCollections.put(aa.getKey(), aa.getValue());
        }

        System.out.println("Sorted Map on Keys Using Collections Api" + sortedMapOnKeyUsingCollections);

        List<Map.Entry<String,Integer>> mapList2 = new LinkedList<>(budget.entrySet());

        Collections.sort(mapList2,Map.Entry.comparingByValue());
        HashMap<String,Integer> sortedMapOnValuesUsingCollection = new LinkedHashMap<>();
        for (Map.Entry<String,Integer> entry : mapList2){
            sortedMapOnValuesUsingCollection.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted Map on Values Using Collections Api" + sortedMapOnValuesUsingCollection);


        List<String> keyMap = new ArrayList<>(budget.keySet());
        List<Integer> valueMap = new ArrayList<>(budget.values());

        Collections.sort(keyMap);
        Collections.sort(valueMap);

        HashMap<String,Integer> sortedMap = new LinkedHashMap<>();
        Iterator<Integer> valueIterator = valueMap.iterator();
        while(valueIterator.hasNext()){
            Integer value = valueIterator.next();
            Iterator<String> keyIterator =  keyMap.iterator();
            while(keyIterator.hasNext()){
                String key = keyIterator.next();
                if(budget.get(key).equals(value)){
                    sortedMap.put(key,value);
                    break;
                }
            }
        }
    }
}
