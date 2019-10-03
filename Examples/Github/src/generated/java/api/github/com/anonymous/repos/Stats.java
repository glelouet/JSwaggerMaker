package api.github.com.anonymous.repos;

import api.github.com.Anonymous;
import api.github.com.anonymous.repos.stats.CodeFrequency;
import api.github.com.anonymous.repos.stats.CommitActivity;
import api.github.com.anonymous.repos.stats.Contributors;
import api.github.com.anonymous.repos.stats.Participation;
import api.github.com.anonymous.repos.stats.PunchCard;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Stats
    extends DelegateTransfer<Anonymous>
{
    public final CodeFrequency code_frequency;
    public final CommitActivity commit_activity;
    public final Contributors contributors;
    public final Participation participation;
    public final PunchCard punch_card;

    public Stats(Anonymous delegate) {
        super(delegate);
        code_frequency = new CodeFrequency((delegate));
        commit_activity = new CommitActivity((delegate));
        contributors = new Contributors((delegate));
        participation = new Participation((delegate));
        punch_card = new PunchCard((delegate));
    }
}
