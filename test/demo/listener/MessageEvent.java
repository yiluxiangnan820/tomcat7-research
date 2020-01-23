package demo.listener;

public class MessageEvent implements IMessageEvent {

    private boolean isSendMessage;

    private MessageListener messageListener;


    @Override
    public void setEventListener(MessageListener messageListener) {
        this.messageListener = messageListener;
    }

    @Override
    public void sendMessage(String message) {
        isSendMessage = true;
        System.out.println(message);
        messageListener.doEvent(this);
        System.out.println("notify ending");
    }

    @Override
    public boolean isSendMessage() {
        return isSendMessage;
    }
}
