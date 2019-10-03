package api.github.com.anonymous.repos;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.ContentsPath;
import api.github.com.definitions.CreateFile;
import api.github.com.definitions.CreateFileBody;
import api.github.com.definitions.DeleteFile;
import api.github.com.definitions.DeleteFileBody;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Contents
    extends DelegateTransfer<Anonymous>
{

    public Contents(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get contents.
     * This method returns the contents of a file or directory in a repository.
     * Files and symlinks support a custom media type for getting the raw content.
     * Directories and submodules do not support custom media types.
     * Note: This API supports files up to 1 megabyte in size.
     * Here can be many outcomes. For details see "http://developer.github.com/v3/repos/contents/"
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param path
     * @param path2
     *     The content path.
     * @param ref
     *     The String name of the Commit/Branch/Tag. Defaults to 'master'.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<ContentsPath> getByOwnerRepoPath(String owner,
        String repo,
        String path,
        String path2,
        String ref,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/contents/{path}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{path}", ""+path)+"?"+(path2==null?"":"&path2="+flatten(path2))+(ref==null?"":"&ref="+flatten(ref)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, ContentsPath.class);
    }

    /**
     * 
     * <p>
     * Create a file.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param path
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<CreateFile> putByOwnerRepoPath(String owner,
        String repo,
        String path,
        String Accept,
        CreateFileBody body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/contents/{path}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{path}", ""+path));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", (body));
        return requestPut(url, headerProperties, content, CreateFile.class);
    }

    /**
     * 
     * <p>
     * Delete a file.
     * This method deletes a file in a repository.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param path
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<DeleteFile> deleteByOwnerRepoPath(String owner,
        String repo,
        String path,
        String Accept,
        DeleteFileBody body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/contents/{path}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{path}", ""+path));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestDel(url, headerProperties, DeleteFile.class);
    }
}
