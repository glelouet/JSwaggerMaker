package www.googleapis.com.oauth2c.videos;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import www.googleapis.com.Oauth2c;

public class Rate
    extends DelegateTransfer<Oauth2c>
{

    public Rate(Oauth2c delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Add a like or dislike rating to a video or remove a rating from a video.
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
     * @param id
     *     The id parameter specifies the YouTube video ID of the video that is being rated or having its rating removed.
     * @param rating
     *     Specifies the rating to record.
     */
    public void post(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        String id,
        www.googleapis.com.structures.rating rating) {
        String url = ("https://www.googleapis.com/youtube/v3/videos/rate"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id))+(rating==null?"":"&rating="+flatten(rating)));
        requestPost(url, null, null, Void.class);
    }
}
