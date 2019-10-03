package www.googleapis.com.oauth2.videos;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import www.googleapis.com.Oauth2;
import www.googleapis.com.definitions.VideoAbuseReport;

public class Reportabuse
    extends DelegateTransfer<Oauth2>
{

    public Reportabuse(Oauth2 delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Report abuse for a video.
     * </p>
     * 
     * @param alt
     *     Data format for the response.
     * @param fields
     *     Selector specifying which fields to include in a partial response.
     * @param key
     *     API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
     * @param oauth_token
     *     OAuth 2.0 token for the current user.
     * @param prettyPrint
     *     Returns response with indentations and line breaks.
     * @param quotaUser
     *     An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
     * @param userIp
     *     Deprecated. Please use quotaUser instead.
     * @param body
     * @param onBehalfOfContentOwner
     *     Note: This parameter is intended exclusively for YouTube content partners.
     *     
     *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
     */
    public void post(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        VideoAbuseReport body,
        String onBehalfOfContentOwner) {
        String url = ("https://www.googleapis.com/youtube/v3/videos/reportAbuse"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner)));
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPost(url, null, content, Void.class);
    }
}
