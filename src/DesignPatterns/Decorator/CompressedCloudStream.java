package DesignPatterns.Decorator;

public class CompressedCloudStream implements Stream{
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressedStream = compress(data);
        stream.write(compressedStream);
    }

    private String compress(String data){
        return data.substring(0,7);
    }
}
