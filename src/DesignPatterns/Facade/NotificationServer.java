package DesignPatterns.Facade;

public class NotificationServer {
    //connnect() - Connection
    //authenticate(appId, key) -> AuthToken
    //send(authToken, message, target)
    //conn.disconnect()

    public Connection connect(String ipaddress){
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target) {
    }
}
