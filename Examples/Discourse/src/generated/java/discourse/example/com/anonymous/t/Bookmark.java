package discourse.example.com.anonymous.t;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Bookmark
    extends DelegateTransfer<Anonymous>
{

    public Bookmark(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Bookmark a topic
     * </p>
     * 
     * @param id
     */
    public void putById(long id) {
        String url = ("https://discourse.example.com//t/{id}/bookmark".replace("{id}", ""+id));
        requestPut(url, null, null, Void.class);
    }
}
