package DesignPatterns.CommandDesign;

public class Document {
    private String data;
    public void makeBold(){
        this.data = "<b>"+data+"</b>";
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
