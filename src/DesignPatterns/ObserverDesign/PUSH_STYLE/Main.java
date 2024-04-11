package DesignPatterns.ObserverDesign.PUSH_STYLE;

public class Main {
    public static void main(String[] args) {
        DataSource source = new DataSource();
        Spreadsheet sheet1 = new Spreadsheet();
        Spreadsheet sheet2 = new Spreadsheet();
        Chart chart = new Chart();

        source.attach(sheet1);
        source.attach(sheet2);
        source.attach(chart);

        source.setData("1");
    }

}
