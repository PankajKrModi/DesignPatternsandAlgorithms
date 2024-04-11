package DesignPatterns.ObserverDesign.PUSH_STYLE;

import DesignPatterns.ObserverDesign.PUSH_STYLE.framework.Observer;

public class Chart implements Observer {
    @Override
    public void update(String data) {
        System.out.println("Chart updated data: "+data);
    }
}
