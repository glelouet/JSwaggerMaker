package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinTrustToEditWikiPost
    extends DelegateTransfer<Anonymous>
{

    public MinTrustToEditWikiPost(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min trust to edit wiki post
     * </p>
     * 
     * @param min_trust_to_edit_wiki_post
     *     "The minimum trust level required to edit post marked as wiki."
     *     
     */
    public void put(long min_trust_to_edit_wiki_post) {
        String url = ("https://discourse.example.com//admin/site_settings/min_trust_to_edit_wiki_post");
        Map<String, Object> content = new HashMap<>();
        content.put("min_trust_to_edit_wiki_post", (min_trust_to_edit_wiki_post));
        requestPut(url, null, content, Void.class);
    }
}
