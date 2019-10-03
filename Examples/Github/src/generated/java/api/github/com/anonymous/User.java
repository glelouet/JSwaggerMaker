package api.github.com.anonymous;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.anonymous.user.Emails;
import api.github.com.anonymous.user.Followers;
import api.github.com.anonymous.user.Following;
import api.github.com.anonymous.user.Issues;
import api.github.com.anonymous.user.Keys;
import api.github.com.anonymous.user.Orgs;
import api.github.com.anonymous.user.Repos;
import api.github.com.anonymous.user.Starred;
import api.github.com.anonymous.user.Subscriptions;
import api.github.com.anonymous.user.Teams;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class User
    extends DelegateTransfer<Anonymous>
{
    public final Emails emails;
    public final Followers followers;
    public final Following following;
    public final Issues issues;
    public final Keys keys;
    public final Orgs orgs;
    public final Repos repos;
    public final Starred starred;
    public final Subscriptions subscriptions;
    public final Teams teams;

    public User(Anonymous delegate) {
        super(delegate);
        emails = new Emails((delegate));
        followers = new Followers((delegate));
        following = new Following((delegate));
        issues = new Issues((delegate));
        keys = new Keys((delegate));
        orgs = new Orgs((delegate));
        repos = new Repos((delegate));
        starred = new Starred((delegate));
        subscriptions = new Subscriptions((delegate));
        teams = new Teams((delegate));
    }

    /**
     * 
     * <p>
     * Get the authenticated user.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.User> get(String Accept) {
        String url = ("https://api.github.com//user");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.User.class);
    }
}
