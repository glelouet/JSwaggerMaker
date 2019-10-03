package api.github.com.anonymous.repos;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.anonymous.repos.hooks.Tests;
import api.github.com.definitions.Hook;
import api.github.com.definitions.HookBody;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Hooks
    extends DelegateTransfer<Anonymous>
{
    public final Tests tests;

    public Hooks(Anonymous delegate) {
        super(delegate);
        tests = new Tests((delegate));
    }

    /**
     * 
     * <p>
     * Get list of hooks.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Hook[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/hooks".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Hook[].class);
    }

    /**
     * 
     * <p>
     * Create a hook.
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
    public Requested<Hook[]> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        HookBody body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/hooks".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, Hook[].class);
    }

    /**
     * 
     * <p>
     * Get single hook.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param hookId
     *     Id of hook.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Hook[]> getByOwnerRepoHookId(String owner,
        String repo,
        long hookId,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/hooks/{hookId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{hookId}", ""+hookId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Hook[].class);
    }

    /**
     * 
     * <p>
     * Delete a hook.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param hookId
     *     Id of hook.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOwnerRepoHookId(String owner,
        String repo,
        long hookId,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/hooks/{hookId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{hookId}", ""+hookId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
