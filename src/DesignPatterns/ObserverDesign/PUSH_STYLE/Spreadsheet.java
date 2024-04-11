package DesignPatterns.ObserverDesign.PUSH_STYLE;

import DesignPatterns.ObserverDesign.PUSH_STYLE.framework.Observer;

public class Spreadsheet implements Observer {
    @Override
    public void update(String data) {
        System.out.println("Spreadsheet updated data: "+data);
    }
}
