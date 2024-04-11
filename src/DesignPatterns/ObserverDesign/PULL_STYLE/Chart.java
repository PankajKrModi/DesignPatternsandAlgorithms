package DesignPatterns.ObserverDesign.PULL_STYLE;

import DesignPatterns.ObserverDesign.PULL_STYLE.framework.Observer;

public class Chart implements Observer {
    DataSource dataSource;
    public Chart(DataSource ds) {
        this.dataSource = ds;
    }

    @Override
    public void update() {
        System.out.println("Chart updated data: "+dataSource.getData());
    }
}
