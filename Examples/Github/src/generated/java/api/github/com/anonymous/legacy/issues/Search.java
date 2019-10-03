package api.github.com.anonymous.legacy.issues;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.SearchIssuesByKeyword;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Search
    extends DelegateTransfer<Anonymous>
{

    public Search(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Find issues by state and keyword.
     * </p>
     * 
     * @param keyword
     *     The search term.
     * @param state
     *     Indicates the state of the issues to return. Can be either open or closed.
     * @param owner
     * @param repository
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<SearchIssuesByKeyword> getByOwnerRepositoryStateKeyword(String keyword,
        api.github.com.structures.state state,
        String owner,
        String repository,
        String Accept) {
        String url = ("https://api.github.com//legacy/issues/search/{owner}/{repository}/{state}/{keyword}".replace("{keyword}", ""+keyword).replace("{state}", ""+state).replace("{owner}", ""+owner).replace("{repository}", ""+repository));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, SearchIssuesByKeyword.class);
    }
}
