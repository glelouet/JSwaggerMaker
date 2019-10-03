package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tags
    extends DelegateTransfer<Anonymous>
{

    public Tags(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get a list of tags
     * </p>
     */
    public void get() {
        String url = ("https://discourse.example.com//tags");
        requestGet(url, null, Void.class);
    }

    /**
     * 
     * <p>
     * Get a specific tag
     * </p>
     * 
     * @param tag
     */
    public void getByTag(String tag) {
        String url = ("https://discourse.example.com//tags/{tag}".replace("{tag}", ""+tag));
        requestGet(url, null, Void.class);
    }
}
