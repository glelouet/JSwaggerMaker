package www.googleapis.com.oauth2c;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import www.googleapis.com.Oauth2c;
import www.googleapis.com.definitions.SponsorListResponse;

public class Sponsors
    extends DelegateTransfer<Oauth2c>
{

    public Sponsors(Oauth2c delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Lists sponsors for a channel.
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
     * @param filter
     *     The filter parameter specifies which channel sponsors to return.
     * @param maxResults
     *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
     * @param pageToken
     *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
     * @param part
     *     The part parameter specifies the sponsor resource parts that the API response will include. Supported values are id and snippet.
     */
    public Requested<SponsorListResponse> get(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        www.googleapis.com.structures.filter filter,
        Long maxResults,
        String pageToken,
        String part) {
        String url = ("https://www.googleapis.com/youtube/v3/sponsors"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(filter==null?"":"&filter="+flatten(filter))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part)));
        return requestGet(url, null, SponsorListResponse.class);
    }
}
