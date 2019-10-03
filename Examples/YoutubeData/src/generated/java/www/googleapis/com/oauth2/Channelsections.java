package www.googleapis.com.oauth2;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import www.googleapis.com.Oauth2;
import www.googleapis.com.definitions.ChannelSection;
import www.googleapis.com.definitions.ChannelSectionListResponse;

public class Channelsections
    extends DelegateTransfer<Oauth2>
{

    public Channelsections(Oauth2 delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Returns channelSection resources that match the API request criteria.
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
     *     The channelId parameter specifies a YouTube channel ID. The API will only return that channel's channelSections.
     * @param hl
     *     The hl parameter indicates that the snippet.localized property values in the returned channelSection resources should be in the specified language if localized values for that language are available. For example, if the API request specifies hl=de, the snippet.localized properties in the API response will contain German titles if German titles are available. Channel owners can provide localized channel section titles using either the channelSections.insert or channelSections.update method.
     * @param id
     *     The id parameter specifies a comma-separated list of the YouTube channelSection ID(s) for the resource(s) that are being retrieved. In a channelSection resource, the id property specifies the YouTube channelSection ID.
     * @param mine
     *     Set this parameter's value to true to retrieve a feed of the authenticated user's channelSections.
     * @param onBehalfOfContentOwner
     *     Note: This parameter is intended exclusively for YouTube content partners.
     *     
     *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
     * @param part
     *     The part parameter specifies a comma-separated list of one or more channelSection resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, and contentDetails.
     *     
     *     If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a channelSection resource, the snippet property contains other properties, such as a display title for the channelSection. If you set part=snippet, the API response will also contain all of those nested properties.
     */
    public Requested<ChannelSectionListResponse> get(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        String channelId,
        String hl,
        String id,
        Boolean mine,
        String onBehalfOfContentOwner,
        String part) {
        String url = ("https://www.googleapis.com/youtube/v3/channelSections"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(channelId==null?"":"&channelId="+flatten(channelId))+(hl==null?"":"&hl="+flatten(hl))+(id==null?"":"&id="+flatten(id))+(mine==null?"":"&mine="+flatten(mine))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(part==null?"":"&part="+flatten(part)));
        return requestGet(url, null, ChannelSectionListResponse.class);
    }

    /**
     * 
     * <p>
     * Adds a channelSection for the authenticated user's channel.
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
     * @param onBehalfOfContentOwnerChannel
     *     This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.
     *     
     *     The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies.
     *     
     *     This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
     * @param part
     *     The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.
     *     
     *     The part names that you can include in the parameter value are snippet and contentDetails.
     */
    public Requested<ChannelSection> post(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        ChannelSection body,
        String onBehalfOfContentOwner,
        String onBehalfOfContentOwnerChannel,
        String part) {
        String url = ("https://www.googleapis.com/youtube/v3/channelSections"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel))+(part==null?"":"&part="+flatten(part)));
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, null, content, ChannelSection.class);
    }

    /**
     * 
     * <p>
     * Update a channelSection.
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
     * @param part
     *     The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.
     *     
     *     The part names that you can include in the parameter value are snippet and contentDetails.
     */
    public Requested<ChannelSection> put(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        ChannelSection body,
        String onBehalfOfContentOwner,
        String part) {
        String url = ("https://www.googleapis.com/youtube/v3/channelSections"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(part==null?"":"&part="+flatten(part)));
        Map<String, Object> content = new HashMap<>();
        content.put("body", (body));
        return requestPut(url, null, content, ChannelSection.class);
    }

    /**
     * 
     * <p>
     * Deletes a channelSection.
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
     *     The id parameter specifies the YouTube channelSection ID for the resource that is being deleted. In a channelSection resource, the id property specifies the YouTube channelSection ID.
     * @param onBehalfOfContentOwner
     *     Note: This parameter is intended exclusively for YouTube content partners.
     *     
     *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
     */
    public void delete(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        String id,
        String onBehalfOfContentOwner) {
        String url = ("https://www.googleapis.com/youtube/v3/channelSections"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner)));
        requestDel(url, null, Void.class);
    }
}
