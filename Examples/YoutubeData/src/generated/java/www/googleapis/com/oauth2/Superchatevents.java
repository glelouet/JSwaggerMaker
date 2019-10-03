package www.googleapis.com.oauth2;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import www.googleapis.com.Oauth2;
import www.googleapis.com.definitions.SuperChatEventListResponse;

public class Superchatevents
    extends DelegateTransfer<Oauth2>
{

    public Superchatevents(Oauth2 delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Lists Super Chat events for a channel.
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
     *     The hl parameter instructs the API to retrieve localized resource metadata for a specific application language that the YouTube website supports. The parameter value must be a language code included in the list returned by the i18nLanguages.list method.
     *     
     *     If localized resource details are available in that language, the resource's snippet.localized object will contain the localized values. However, if localized details are not available, the snippet.localized object will contain resource details in the resource's default language.
     * @param maxResults
     *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
     * @param pageToken
     *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
     * @param part
     *     The part parameter specifies the superChatEvent resource parts that the API response will include. Supported values are id and snippet.
     */
    public Requested<SuperChatEventListResponse> get(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        String hl,
        Long maxResults,
        String pageToken,
        String part) {
        String url = ("https://www.googleapis.com/youtube/v3/superChatEvents"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(hl==null?"":"&hl="+flatten(hl))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part)));
        return requestGet(url, null, SuperChatEventListResponse.class);
    }
}
