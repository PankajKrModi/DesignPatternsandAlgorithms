package DesignPatterns.ObserverDesign.PUSH_STYLE;
import DesignPatterns.ObserverDesign.PUSH_STYLE.framework.Subject;

public class DataSource extends Subject {
    String data;


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        notifyObservers(data);
    }



}
