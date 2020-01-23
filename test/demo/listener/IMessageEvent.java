package demo.listener;

public interface IMessageEvent {

    void setEventListener(MessageListener messageListener);

    void sendMessage(String message);

    boolean isSendMessage();

}
