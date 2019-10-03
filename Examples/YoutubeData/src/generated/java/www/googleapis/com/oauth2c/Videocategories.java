package www.googleapis.com.oauth2c;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import www.googleapis.com.Oauth2c;
import www.googleapis.com.definitions.VideoCategoryListResponse;

public class Videocategories
    extends DelegateTransfer<Oauth2c>
{

    public Videocategories(Oauth2c delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Returns a list of categories that can be associated with YouTube videos.
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
     * @param hl
     *     The hl parameter specifies the language that should be used for text values in the API response.
     * @param id
     *     The id parameter specifies a comma-separated list of video category IDs for the resources that you are retrieving.
     * @param part
     *     The part parameter specifies the videoCategory resource properties that the API response will include. Set the parameter value to snippet.
     * @param regionCode
     *     The regionCode parameter instructs the API to return the list of video categories available in the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
     */
    public Requested<VideoCategoryListResponse> get(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        String hl,
        String id,
        String part,
        String regionCode) {
        String url = ("https://www.googleapis.com/youtube/v3/videoCategories"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(hl==null?"":"&hl="+flatten(hl))+(id==null?"":"&id="+flatten(id))+(part==null?"":"&part="+flatten(part))+(regionCode==null?"":"&regionCode="+flatten(regionCode)));
        return requestGet(url, null, VideoCategoryListResponse.class);
    }
}
