package api.github.com.anonymous.repos.git;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.Tag;
import api.github.com.definitions.TagBody;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Tags
    extends DelegateTransfer<Anonymous>
{

    public Tags(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Create a Tag Object.
     * Note that creating a tag object does not create the reference that makes a
     * tag in Git. If you want to create an annotated tag in Git, you have to do
     * this call to create the tag object, and then create the refs/tags/[tag]
     * reference. If you want to create a lightweight tag, you only have to create
     * the tag reference - this call would be unnecessary.
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
    public Requested<Tag> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        TagBody body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/git/tags".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, Tag.class);
    }

    /**
     * 
     * <p>
     * Get a Tag.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param shaCode
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Tag> getByOwnerRepoShaCode(String owner,
        String repo,
        String shaCode,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/git/tags/{shaCode}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{shaCode}", ""+shaCode));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Tag.class);
    }
}
