package discourse.example.com;

import discourse.example.com.anonymous.About_json;
import discourse.example.com.anonymous.Admin;
import discourse.example.com.anonymous.C;
import discourse.example.com.anonymous.Categories;
import discourse.example.com.anonymous.Categories_json;
import discourse.example.com.anonymous.DirectoryItems_json;
import discourse.example.com.anonymous.ExportCsv;
import discourse.example.com.anonymous.Groups;
import discourse.example.com.anonymous.Groups_json;
import discourse.example.com.anonymous.Invites;
import discourse.example.com.anonymous.Latest_json;
import discourse.example.com.anonymous.Notifications;
import discourse.example.com.anonymous.Notifications_json;
import discourse.example.com.anonymous.PageViewTotalReqs;
import discourse.example.com.anonymous.Polls;
import discourse.example.com.anonymous.PostActions;
import discourse.example.com.anonymous.Posts;
import discourse.example.com.anonymous.Posts_json;
import discourse.example.com.anonymous.Search;
import discourse.example.com.anonymous.Session;
import discourse.example.com.anonymous.T;
import discourse.example.com.anonymous.TagGroups;
import discourse.example.com.anonymous.TagGroups_json;
import discourse.example.com.anonymous.Tags;
import discourse.example.com.anonymous.Top;
import discourse.example.com.anonymous.Top_json;
import discourse.example.com.anonymous.Topics;
import discourse.example.com.anonymous.U;
import discourse.example.com.anonymous.Uploads_json;
import discourse.example.com.anonymous.UserActions_json;
import discourse.example.com.anonymous.UserAvatar;
import discourse.example.com.anonymous.UserBadges;
import discourse.example.com.anonymous.UserBadges_json;
import discourse.example.com.anonymous.Users;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Disconnected;


/**
 * access discourse.example.com with no authorization.
 */
public class Anonymous
    extends Disconnected
{
    public final Categories_json categories_json = new Categories_json(this);
    public final C c = new C(this);
    public final Categories categories = new Categories(this);
    public final Posts_json posts_json = new Posts_json(this);
    public final Posts posts = new Posts(this);
    public final PostActions post_actions = new PostActions(this);
    public final T t = new T(this);
    public final Topics topics = new Topics(this);
    public final Notifications_json notifications_json = new Notifications_json(this);
    public final Notifications notifications = new Notifications(this);
    public final Invites invites = new Invites(this);
    public final TagGroups_json tag_groups_json = new TagGroups_json(this);
    public final TagGroups tag_groups = new TagGroups(this);
    public final Users users = new Users(this);
    public final U u = new U(this);
    public final Uploads_json uploads_json = new Uploads_json(this);
    public final DirectoryItems_json directory_items_json = new DirectoryItems_json(this);
    public final Tags tags = new Tags(this);
    public final Search search = new Search(this);
    public final Admin admin = new Admin(this);
    public final Groups_json groups_json = new Groups_json(this);
    public final Groups groups = new Groups(this);
    public final Latest_json latest_json = new Latest_json(this);
    public final Top_json top_json = new Top_json(this);
    public final Top top = new Top(this);
    public final Session session = new Session(this);
    public final UserBadges user_badges = new UserBadges(this);
    public final UserBadges_json user_badges_json = new UserBadges_json(this);
    public final UserActions_json user_actions_json = new UserActions_json(this);
    public final About_json about_json = new About_json(this);
    public final Polls polls = new Polls(this);
    public final PageViewTotalReqs page_view_total_reqs = new PageViewTotalReqs(this);
    public final ExportCsv export_csv = new ExportCsv(this);
    public final UserAvatar user_avatar = new UserAvatar(this);
}
