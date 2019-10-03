package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.polls.Vote;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Polls
    extends DelegateTransfer<Anonymous>
{
    public final Vote vote;

    public Polls(Anonymous delegate) {
        super(delegate);
        vote = new Vote((delegate));
    }
}
