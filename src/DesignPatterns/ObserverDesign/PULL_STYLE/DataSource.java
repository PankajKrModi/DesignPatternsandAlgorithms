package DesignPatterns.ObserverDesign.PULL_STYLE;

import DesignPatterns.ObserverDesign.PULL_STYLE.framework.Subject;

public class DataSource extends Subject {
    String data;


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        notifyObservers();
    }



}
