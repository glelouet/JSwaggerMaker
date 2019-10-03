package api.github.com.anonymous;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.anonymous.users.Events;
import api.github.com.anonymous.users.Followers;
import api.github.com.anonymous.users.Following;
import api.github.com.anonymous.users.Gists;
import api.github.com.anonymous.users.Keys;
import api.github.com.anonymous.users.Orgs;
import api.github.com.anonymous.users.ReceivedEvents;
import api.github.com.anonymous.users.Repos;
import api.github.com.anonymous.users.Starred;
import api.github.com.anonymous.users.Subscriptions;
import api.github.com.definitions.User;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Users
    extends DelegateTransfer<Anonymous>
{
    public final Events events;
    public final Followers followers;
    public final Following following;
    public final Gists gists;
    public final Keys keys;
    public final Orgs orgs;
    public final ReceivedEvents received_events;
    public final Repos repos;
    public final Starred starred;
    public final Subscriptions subscriptions;

    public Users(Anonymous delegate) {
        super(delegate);
        events = new Events((delegate));
        followers = new Followers((delegate));
        following = new Following((delegate));
        gists = new Gists((delegate));
        keys = new Keys((delegate));
        orgs = new Orgs((delegate));
        received_events = new ReceivedEvents((delegate));
        repos = new Repos((delegate));
        starred = new Starred((delegate));
        subscriptions = new Subscriptions((delegate));
    }

    /**
     * 
     * <p>
     * Get all users.
     * This provides a dump of every user, in the order that they signed up for GitHub.
     * Note: Pagination is powered exclusively by the since parameter. Use the Link
     * header to get the URL for the next page of users.
     * </p>
     * 
     * @param since
     *     The integer ID of the last user that you've seen.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<User[]> get(Long since, String Accept) {
        String url = ("https://api.github.com//users"+"?"+(since==null?"":"&since="+flatten(since)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, User[].class);
    }

    /**
     * 
     * <p>
     * Get a single user.
     * </p>
     * 
     * @param username
     *     Name of user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<User> getByUsername(String username, String Accept) {
        String url = ("https://api.github.com//users/{username}".replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, User.class);
    }
}
