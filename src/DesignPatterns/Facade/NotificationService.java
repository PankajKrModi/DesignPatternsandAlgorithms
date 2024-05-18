package DesignPatterns.Facade;

import java.security.MessageDigest;

public class NotificationService {
    public void send(String msg,String target){
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appId","key");
        server.send(authToken,new Message(msg),target);
        connection.disconnect();

    }
}
