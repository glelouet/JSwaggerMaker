package www.googleapis.com.oauth2;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import www.googleapis.com.Oauth2;
import www.googleapis.com.definitions.Channel;
import www.googleapis.com.definitions.ChannelListResponse;

public class Channels
    extends DelegateTransfer<Oauth2>
{

    public Channels(Oauth2 delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Returns a collection of zero or more channel resources that match the request criteria.
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
     * @param categoryId
     *     The categoryId parameter specifies a YouTube guide category, thereby requesting YouTube channels associated with that category.
     * @param forUsername
     *     The forUsername parameter specifies a YouTube username, thereby requesting the channel associated with that username.
     * @param hl
     *     The hl parameter should be used for filter out the properties that are not in the given language. Used for the brandingSettings part.
     * @param id
     *     The id parameter specifies a comma-separated list of the YouTube channel ID(s) for the resource(s) that are being retrieved. In a channel resource, the id property specifies the channel's YouTube channel ID.
     * @param managedByMe
     *     Note: This parameter is intended exclusively for YouTube content partners.
     *     
     *     Set this parameter's value to true to instruct the API to only return channels managed by the content owner that the onBehalfOfContentOwner parameter specifies. The user must be authenticated as a CMS account linked to the specified content owner and onBehalfOfContentOwner must be provided.
     * @param maxResults
     *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
     * @param mine
     *     Set this parameter's value to true to instruct the API to only return channels owned by the authenticated user.
     * @param mySubscribers
     *     Use the subscriptions.list method and its mySubscribers parameter to retrieve a list of subscribers to the authenticated user's channel.
     * @param onBehalfOfContentOwner
     *     Note: This parameter is intended exclusively for YouTube content partners.
     *     
     *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
     * @param pageToken
     *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
     * @param part
     *     The part parameter specifies a comma-separated list of one or more channel resource properties that the API response will include.
     *     
     *     If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a channel resource, the contentDetails property contains other properties, such as the uploads properties. As such, if you set part=contentDetails, the API response will also contain all of those nested properties.
     */
    public Requested<ChannelListResponse> get(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        String categoryId,
        String forUsername,
        String hl,
        String id,
        Boolean managedByMe,
        Long maxResults,
        Boolean mine,
        Boolean mySubscribers,
        String onBehalfOfContentOwner,
        String pageToken,
        String part) {
        String url = ("https://www.googleapis.com/youtube/v3/channels"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(categoryId==null?"":"&categoryId="+flatten(categoryId))+(forUsername==null?"":"&forUsername="+flatten(forUsername))+(hl==null?"":"&hl="+flatten(hl))+(id==null?"":"&id="+flatten(id))+(managedByMe==null?"":"&managedByMe="+flatten(managedByMe))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(mine==null?"":"&mine="+flatten(mine))+(mySubscribers==null?"":"&mySubscribers="+flatten(mySubscribers))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part)));
        return requestGet(url, null, ChannelListResponse.class);
    }

    /**
     * 
     * <p>
     * Updates a channel's metadata. Note that this method currently only supports updates to the channel resource's brandingSettings and invideoPromotion objects and their child properties.
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
     *     The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
     * @param part
     *     The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.
     *     
     *     The API currently only allows the parameter value to be set to either brandingSettings or invideoPromotion. (You cannot update both of those parts with a single request.)
     *     
     *     Note that this method overrides the existing values for all of the mutable properties that are contained in any parts that the parameter value specifies.
     */
    public Requested<Channel> put(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        Channel body,
        String onBehalfOfContentOwner,
        String part) {
        String url = ("https://www.googleapis.com/youtube/v3/channels"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(part==null?"":"&part="+flatten(part)));
        Map<String, Object> content = new HashMap<>();
        content.put("body", (body));
        return requestPut(url, null, content, Channel.class);
    }
}
