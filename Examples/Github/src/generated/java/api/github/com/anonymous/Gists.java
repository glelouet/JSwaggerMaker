package api.github.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.anonymous.gists.Comments;
import api.github.com.anonymous.gists.Forks;
import api.github.com.anonymous.gists.Public;
import api.github.com.anonymous.gists.Star;
import api.github.com.anonymous.gists.Starred;
import api.github.com.definitions.Gist;
import api.github.com.definitions.PostGist;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Gists
    extends DelegateTransfer<Anonymous>
{
    public final Public public_;
    public final Starred starred;
    public final Comments comments;
    public final Forks forks;
    public final Star star;

    public Gists(Anonymous delegate) {
        super(delegate);
        public_ = new Public((delegate));
        starred = new Starred((delegate));
        comments = new Comments((delegate));
        forks = new Forks((delegate));
        star = new Star((delegate));
    }

    /**
     * 
     * <p>
     * List the authenticated user's gists or if called anonymously, this will
     * return all public gists.
     * </p>
     * 
     * @param since
     *     Timestamp in ISO 8601 format YYYY-MM-DDTHH:MM:SSZ.
     *     Only gists updated at or after this time are returned.
     *     
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Gists[]> get(String since, String Accept) {
        String url = ("https://api.github.com//gists"+"?"+(since==null?"":"&since="+flatten(since)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Gists[].class);
    }

    /**
     * 
     * <p>
     * Create a gist.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<Gist> post(String Accept, PostGist body) {
        String url = ("https://api.github.com//gists");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, Gist.class);
    }

    /**
     * 
     * <p>
     * Get a single gist.
     * </p>
     * 
     * @param id
     *     Id of gist.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Gist> getById(long id, String Accept) {
        String url = ("https://api.github.com//gists/{id}".replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Gist.class);
    }

    /**
     * 
     * <p>
     * Delete a gist.
     * </p>
     * 
     * @param id
     *     Id of gist.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteById(long id, String Accept) {
        String url = ("https://api.github.com//gists/{id}".replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
