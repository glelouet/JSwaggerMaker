package api.github.com;

import api.github.com.anonymous.Emojis;
import api.github.com.anonymous.Events;
import api.github.com.anonymous.Feeds;
import api.github.com.anonymous.Gists;
import api.github.com.anonymous.Gitignore;
import api.github.com.anonymous.Issues;
import api.github.com.anonymous.Legacy;
import api.github.com.anonymous.Markdown;
import api.github.com.anonymous.Meta;
import api.github.com.anonymous.Networks;
import api.github.com.anonymous.Notifications;
import api.github.com.anonymous.Orgs;
import api.github.com.anonymous.RateLimit;
import api.github.com.anonymous.Repos;
import api.github.com.anonymous.Repositories;
import api.github.com.anonymous.Search;
import api.github.com.anonymous.Teams;
import api.github.com.anonymous.User;
import api.github.com.anonymous.Users;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Disconnected;


/**
 * access api.github.com with no authorization.
 */
public class Anonymous
    extends Disconnected
{
    public final Emojis emojis = new Emojis(this);
    public final Events events = new Events(this);
    public final Feeds feeds = new Feeds(this);
    public final Gists gists = new Gists(this);
    public final Gitignore gitignore = new Gitignore(this);
    public final Issues issues = new Issues(this);
    public final Legacy legacy = new Legacy(this);
    public final Markdown markdown = new Markdown(this);
    public final Meta meta = new Meta(this);
    public final Networks networks = new Networks(this);
    public final Notifications notifications = new Notifications(this);
    public final Orgs orgs = new Orgs(this);
    public final RateLimit rate_limit = new RateLimit(this);
    public final Repos repos = new Repos(this);
    public final Repositories repositories = new Repositories(this);
    public final Search search = new Search(this);
    public final Teams teams = new Teams(this);
    public final User user = new User(this);
    public final Users users = new Users(this);
}
