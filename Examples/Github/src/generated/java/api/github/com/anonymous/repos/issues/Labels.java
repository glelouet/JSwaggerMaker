package api.github.com.anonymous.repos.issues;

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
     * List labels on an issue.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param number
     *     Number of issue.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Labels[]> getByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/labels".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Labels[].class);
    }

    /**
     * 
     * <p>
     * Add labels to an issue.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param number
     *     Number of issue.
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<Label> postByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept,
        String[] body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/labels".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
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
     * Replace all labels for an issue.
     * Sending an empty array ([]) will remove all Labels from the Issue.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param number
     *     Number of issue.
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<Label> putByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept,
        String[] body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/labels".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", (body));
        return requestPut(url, headerProperties, content, Label.class);
    }

    /**
     * 
     * <p>
     * Remove all labels from an issue.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param number
     *     Number of issue.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/labels".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }

    /**
     * 
     * <p>
     * Remove a label from an issue.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param number
     *     Number of issue.
     * @param name
     *     Name of the label.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOwnerRepoNumber_Name(String owner,
        String repo,
        long number,
        String name,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/labels/{name}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number).replace("{name}", ""+name));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
