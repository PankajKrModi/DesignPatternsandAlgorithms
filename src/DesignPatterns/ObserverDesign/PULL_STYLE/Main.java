package DesignPatterns.ObserverDesign.PULL_STYLE;

public class Main {
    public static void main(String[] args) {
        DataSource source = new DataSource();
        Spreadsheet sheet1 = new Spreadsheet(source);
        Spreadsheet sheet2 = new Spreadsheet(source);
        Chart chart = new Chart(source);

        source.attach(sheet1);
        source.attach(sheet2);
        source.attach(chart);

        source.setData("1");
    }

}
