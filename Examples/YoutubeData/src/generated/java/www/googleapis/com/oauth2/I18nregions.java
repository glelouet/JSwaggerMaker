package www.googleapis.com.oauth2;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import www.googleapis.com.Oauth2;
import www.googleapis.com.definitions.I18nRegionListResponse;

public class I18nregions
    extends DelegateTransfer<Oauth2>
{

    public I18nregions(Oauth2 delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Returns a list of content regions that the YouTube website supports.
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
     * @param part
     *     The part parameter specifies the i18nRegion resource properties that the API response will include. Set the parameter value to snippet.
     */
    public Requested<I18nRegionListResponse> get(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        String hl,
        String part) {
        String url = ("https://www.googleapis.com/youtube/v3/i18nRegions"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(hl==null?"":"&hl="+flatten(hl))+(part==null?"":"&part="+flatten(part)));
        return requestGet(url, null, I18nRegionListResponse.class);
    }
}
