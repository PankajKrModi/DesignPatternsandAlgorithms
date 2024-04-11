package DesignPatterns.ObserverDesign.PULL_STYLE;

import DesignPatterns.ObserverDesign.PULL_STYLE.framework.Observer;

public class Spreadsheet implements Observer {
    DataSource dataSource;
    public Spreadsheet(DataSource ds) {
        this.dataSource = ds;
    }
    @Override
    public void update() {
        System.out.println("Spreadsheet updated data: "+dataSource.getData());
    }
}
