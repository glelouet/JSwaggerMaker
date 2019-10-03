package api.github.com.anonymous.repos.git;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.Tree;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Trees
    extends DelegateTransfer<Anonymous>
{

    public Trees(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Create a Tree.
     * The tree creation API will take nested entries as well. If both a tree and
     * a nested path modifying that tree are specified, it will overwrite the
     * contents of that tree with the new path contents and write a new tree out.
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
    public Requested<api.github.com.definitions.Trees> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        Tree body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/git/trees".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, api.github.com.definitions.Trees.class);
    }

    /**
     * 
     * <p>
     * Get a Tree.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param shaCode
     *     Tree SHA.
     * @param recursive
     *     Get a Tree Recursively. (0 or 1)
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Tree> getByOwnerRepoShaCode(String owner,
        String repo,
        String shaCode,
        Long recursive,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/git/trees/{shaCode}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{shaCode}", ""+shaCode)+"?"+(recursive==null?"":"&recursive="+flatten(recursive)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Tree.class);
    }
}
