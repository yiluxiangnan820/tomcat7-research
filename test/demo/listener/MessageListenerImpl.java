package demo.listener;


public class MessageListenerImpl implements MessageListener {

    @Override
    public void doEvent(IMessageEvent event) {
        if (event.isSendMessage()) {
            System.out.println("accept the message");
        }
    }
}
