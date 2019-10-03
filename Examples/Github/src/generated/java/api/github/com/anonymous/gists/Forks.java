package api.github.com.anonymous.gists;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Forks
    extends DelegateTransfer<Anonymous>
{

    public Forks(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Fork a gist.
     * </p>
     * 
     * @param id
     *     Id of gist.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void postById(long id, String Accept) {
        String url = ("https://api.github.com//gists/{id}/forks".replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestPost(url, headerProperties, null, Void.class);
    }
}
