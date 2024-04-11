package DesignPatterns.ObserverDesign.PULL_STYLE.framework;

import java.util.ArrayList;
import java.util.List;


//Observable
public abstract class Subject {
    protected List<Observer> observers =  new ArrayList<>();

    public void attach(Observer obs) {
        this.observers.add(obs);
    }

    public void dettach(Observer obs) {
        this.observers.remove(obs);
    }

    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update();
        }
    }

}
