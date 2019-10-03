package api.github.com.anonymous.gists;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Star
    extends DelegateTransfer<Anonymous>
{

    public Star(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Check if a gist is starred.
     * </p>
     * 
     * @param id
     *     Id of gist.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getById(long id, String Accept) {
        String url = ("https://api.github.com//gists/{id}/star".replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }

    /**
     * 
     * <p>
     * Star a gist.
     * </p>
     * 
     * @param id
     *     Id of gist.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void putById(long id, String Accept) {
        String url = ("https://api.github.com//gists/{id}/star".replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestPut(url, headerProperties, null, Void.class);
    }

    /**
     * 
     * <p>
     * Unstar a gist.
     * </p>
     * 
     * @param id
     *     Id of gist.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteById(long id, String Accept) {
        String url = ("https://api.github.com//gists/{id}/star".replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
