package DesignPatterns.Decorator;

public class Main {
    public static void main(String[] args) {
        //storeCreditCard(new CloudStream(),"1234");

        //storeCreditCard(new CompressedCloudStream(new CloudStream()),"1234-5678");
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())),"1234-5678");
        //if we had gone with inheritance then there would be one more class for EncryptedCompressedCloudStream but with decorator we can combine 2 different implementation
    }

    public static void storeCreditCard(Stream stream,String data){
        stream.write(data);
    }
}
