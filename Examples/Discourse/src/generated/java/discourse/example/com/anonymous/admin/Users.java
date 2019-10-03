package discourse.example.com.anonymous.admin;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.admin.users.Activate;
import discourse.example.com.anonymous.admin.users.Anonymize;
import discourse.example.com.anonymous.admin.users.GenerateApiKey;
import discourse.example.com.anonymous.admin.users.Groups;
import discourse.example.com.anonymous.admin.users.List;
import discourse.example.com.anonymous.admin.users.LogOut;
import discourse.example.com.anonymous.admin.users.Silence;
import discourse.example.com.anonymous.admin.users.Suspend;
import discourse.example.com.anonymous.admin.users.Unsilence;
import discourse.example.com.anonymous.admin.users.Unsuspend;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Users
    extends DelegateTransfer<Anonymous>
{
    public final Suspend suspend;
    public final Unsuspend unsuspend;
    public final Silence silence;
    public final Unsilence unsilence;
    public final Activate activate;
    public final Anonymize anonymize;
    public final GenerateApiKey generate_api_key;
    public final Groups groups;
    public final List list;
    public final LogOut log_out;

    public Users(Anonymous delegate) {
        super(delegate);
        suspend = new Suspend((delegate));
        unsuspend = new Unsuspend((delegate));
        silence = new Silence((delegate));
        unsilence = new Unsilence((delegate));
        activate = new Activate((delegate));
        anonymize = new Anonymize((delegate));
        generate_api_key = new GenerateApiKey((delegate));
        groups = new Groups((delegate));
        list = new List((delegate));
        log_out = new LogOut((delegate));
    }

    /**
     * 
     * <p>
     * Get a specific user by id. Returns more info than the public user route.
     * </p>
     * 
     * @param id
     */
    public Requested<Object> getById(long id) {
        String url = ("https://discourse.example.com//admin/users/{id}.json".replace("{id}", ""+id));
        return requestGet(url, null, Object.class);
    }

    /**
     * 
     * <p>
     * Delete a user
     * </p>
     * 
     * @param id
     * @param delete_posts
     * @param block_email
     * @param block_urls
     * @param block_ip
     */
    public Requested<Object> deleteById(long id,
        boolean delete_posts,
        boolean block_email,
        boolean block_urls,
        boolean block_ip) {
        String url = ("https://discourse.example.com//admin/users/{id}.json".replace("{id}", ""+id));
        return requestDel(url, null, Object.class);
    }
}
