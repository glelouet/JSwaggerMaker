package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.topics.PrivateMessages;
import discourse.example.com.anonymous.topics.PrivateMessagesSent;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Topics
    extends DelegateTransfer<Anonymous>
{
    public final PrivateMessages private_messages;
    public final PrivateMessagesSent private_messages_sent;

    public Topics(Anonymous delegate) {
        super(delegate);
        private_messages = new PrivateMessages((delegate));
        private_messages_sent = new PrivateMessagesSent((delegate));
    }
}
