package www.googleapis.com.oauth2c;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import www.googleapis.com.Oauth2c;
import www.googleapis.com.definitions.Subscription;
import www.googleapis.com.definitions.SubscriptionListResponse;

public class Subscriptions
    extends DelegateTransfer<Oauth2c>
{

    public Subscriptions(Oauth2c delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Returns subscription resources that match the API request criteria.
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
     * @param channelId
     *     The channelId parameter specifies a YouTube channel ID. The API will only return that channel's subscriptions.
     * @param forChannelId
     *     The forChannelId parameter specifies a comma-separated list of channel IDs. The API response will then only contain subscriptions matching those channels.
     * @param id
     *     The id parameter specifies a comma-separated list of the YouTube subscription ID(s) for the resource(s) that are being retrieved. In a subscription resource, the id property specifies the YouTube subscription ID.
     * @param maxResults
     *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
     * @param mine
     *     Set this parameter's value to true to retrieve a feed of the authenticated user's subscriptions.
     * @param myRecentSubscribers
     *     Set this parameter's value to true to retrieve a feed of the subscribers of the authenticated user in reverse chronological order (newest first).
     * @param mySubscribers
     *     Set this parameter's value to true to retrieve a feed of the subscribers of the authenticated user in no particular order.
     * @param onBehalfOfContentOwner
     *     Note: This parameter is intended exclusively for YouTube content partners.
     *     
     *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
     * @param onBehalfOfContentOwnerChannel
     *     This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.
     *     
     *     The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies.
     *     
     *     This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
     * @param order
     *     The order parameter specifies the method that will be used to sort resources in the API response.
     * @param pageToken
     *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
     * @param part
     *     The part parameter specifies a comma-separated list of one or more subscription resource properties that the API response will include.
     *     
     *     If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a subscription resource, the snippet property contains other properties, such as a display title for the subscription. If you set part=snippet, the API response will also contain all of those nested properties.
     */
    public Requested<SubscriptionListResponse> get(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        String channelId,
        String forChannelId,
        String id,
        Long maxResults,
        Boolean mine,
        Boolean myRecentSubscribers,
        Boolean mySubscribers,
        String onBehalfOfContentOwner,
        String onBehalfOfContentOwnerChannel,
        www.googleapis.com.structures.order order,
        String pageToken,
        String part) {
        String url = ("https://www.googleapis.com/youtube/v3/subscriptions"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(channelId==null?"":"&channelId="+flatten(channelId))+(forChannelId==null?"":"&forChannelId="+flatten(forChannelId))+(id==null?"":"&id="+flatten(id))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(mine==null?"":"&mine="+flatten(mine))+(myRecentSubscribers==null?"":"&myRecentSubscribers="+flatten(myRecentSubscribers))+(mySubscribers==null?"":"&mySubscribers="+flatten(mySubscribers))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel))+(order==null?"":"&order="+flatten(order))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part)));
        return requestGet(url, null, SubscriptionListResponse.class);
    }

    /**
     * 
     * <p>
     * Adds a subscription for the authenticated user's channel.
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
     * @param part
     *     The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.
     */
    public Requested<Subscription> post(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        Subscription body,
        String part) {
        String url = ("https://www.googleapis.com/youtube/v3/subscriptions"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(part==null?"":"&part="+flatten(part)));
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, null, content, Subscription.class);
    }

    /**
     * 
     * <p>
     * Deletes a subscription.
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
     *     The id parameter specifies the YouTube subscription ID for the resource that is being deleted. In a subscription resource, the id property specifies the YouTube subscription ID.
     */
    public void delete(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        String id) {
        String url = ("https://www.googleapis.com/youtube/v3/subscriptions"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id)));
        requestDel(url, null, Void.class);
    }
}
