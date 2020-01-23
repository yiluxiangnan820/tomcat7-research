package demo.listener;

import org.junit.Test;

public class ListenerTest {
    @Test
    public void testListener(){
        MessageEvent messageEvent = new MessageEvent();
        MessageListener messageListener = new MessageListenerImpl();
        messageEvent.setEventListener(messageListener);
        messageEvent.sendMessage("starting notify 1");
        messageEvent.sendMessage("starting notify 2");
        messageEvent.sendMessage("starting notify 3");
        messageEvent.sendMessage("starting notify 4");
    }
}
