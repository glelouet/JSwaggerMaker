package api.github.com.anonymous.repos;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.Label;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Labels
    extends DelegateTransfer<Anonymous>
{

    public Labels(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List all labels for this repository.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Labels[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/labels".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Labels[].class);
    }

    /**
     * 
     * <p>
     * Create a label.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<Label> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        String[] body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/labels".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, Label.class);
    }

    /**
     * 
     * <p>
     * Get a single label.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param name
     *     Name of the label.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Label> getByOwnerRepoName(String owner,
        String repo,
        String name,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/labels/{name}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{name}", ""+name));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Label.class);
    }

    /**
     * 
     * <p>
     * Delete a label.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param name
     *     Name of the label.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOwnerRepoName(String owner,
        String repo,
        String name,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/labels/{name}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{name}", ""+name));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
