package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Top
    extends DelegateTransfer<Anonymous>
{

    public Top(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get the top topics filtered by specified flag
     * </p>
     * 
     * @param flag
     */
    public void getByFlag(discourse.example.com.structures.flag flag) {
        String url = ("https://discourse.example.com//top/{flag}.json".replace("{flag}", ""+flag));
        requestGet(url, null, Void.class);
    }
}
