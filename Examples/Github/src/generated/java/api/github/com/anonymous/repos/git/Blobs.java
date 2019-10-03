package api.github.com.anonymous.repos.git;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.Blob;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Blobs
    extends DelegateTransfer<Anonymous>
{

    public Blobs(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Create a Blob.
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
    public Requested<api.github.com.definitions.Blobs> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        Blob body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/git/blobs".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, api.github.com.definitions.Blobs.class);
    }

    /**
     * 
     * <p>
     * Get a Blob.
     * Since blobs can be any arbitrary binary data, the input and responses for
     * the blob API takes an encoding parameter that can be either utf-8 or
     * base64. If your data cannot be losslessly sent as a UTF-8 string, you can
     * base64 encode it.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param shaCode
     *     SHA-1 code.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Blob> getByOwnerRepoShaCode(String owner,
        String repo,
        String shaCode,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/git/blobs/{shaCode}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{shaCode}", ""+shaCode));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Blob.class);
    }
}
