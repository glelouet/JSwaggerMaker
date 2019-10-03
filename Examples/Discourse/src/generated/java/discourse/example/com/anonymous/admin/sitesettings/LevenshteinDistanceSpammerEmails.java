package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class LevenshteinDistanceSpammerEmails
    extends DelegateTransfer<Anonymous>
{

    public LevenshteinDistanceSpammerEmails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * levenshtein distance spammer emails
     * </p>
     * 
     * @param levenshtein_distance_spammer_emails
     *     "When matching spammer emails, number of characters difference that will still allow a fuzzy match."
     *     
     */
    public void put(long levenshtein_distance_spammer_emails) {
        String url = ("https://discourse.example.com//admin/site_settings/levenshtein_distance_spammer_emails");
        Map<String, Object> content = new HashMap<>();
        content.put("levenshtein_distance_spammer_emails", (levenshtein_distance_spammer_emails));
        requestPut(url, null, content, Void.class);
    }
}
