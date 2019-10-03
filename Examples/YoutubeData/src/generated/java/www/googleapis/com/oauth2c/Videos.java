package www.googleapis.com.oauth2c;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import www.googleapis.com.Oauth2c;
import www.googleapis.com.definitions.Video;
import www.googleapis.com.definitions.VideoListResponse;
import www.googleapis.com.oauth2c.videos.Getrating;
import www.googleapis.com.oauth2c.videos.Rate;
import www.googleapis.com.oauth2c.videos.Reportabuse;

public class Videos
    extends DelegateTransfer<Oauth2c>
{
    public final Getrating getrating;
    public final Rate rate;
    public final Reportabuse reportabuse;

    public Videos(Oauth2c delegate) {
        super(delegate);
        getrating = new Getrating((delegate));
        rate = new Rate((delegate));
        reportabuse = new Reportabuse((delegate));
    }

    /**
     * 
     * <p>
     * Returns a list of videos that match the API request parameters.
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
     * @param chart
     *     The chart parameter identifies the chart that you want to retrieve.
     * @param hl
     *     The hl parameter instructs the API to retrieve localized resource metadata for a specific application language that the YouTube website supports. The parameter value must be a language code included in the list returned by the i18nLanguages.list method.
     *     
     *     If localized resource details are available in that language, the resource's snippet.localized object will contain the localized values. However, if localized details are not available, the snippet.localized object will contain resource details in the resource's default language.
     * @param id
     *     The id parameter specifies a comma-separated list of the YouTube video ID(s) for the resource(s) that are being retrieved. In a video resource, the id property specifies the video's ID.
     * @param locale
     *     DEPRECATED
     * @param maxHeight
     *     The maxHeight parameter specifies a maximum height of the embedded player. If maxWidth is provided, maxHeight may not be reached in order to not violate the width request.
     * @param maxResults
     *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
     *     
     *     Note: This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter.
     * @param maxWidth
     *     The maxWidth parameter specifies a maximum width of the embedded player. If maxHeight is provided, maxWidth may not be reached in order to not violate the height request.
     * @param myRating
     *     Set this parameter's value to like or dislike to instruct the API to only return videos liked or disliked by the authenticated user.
     * @param onBehalfOfContentOwner
     *     Note: This parameter is intended exclusively for YouTube content partners.
     *     
     *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
     * @param pageToken
     *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
     *     
     *     Note: This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter.
     * @param part
     *     The part parameter specifies a comma-separated list of one or more video resource properties that the API response will include.
     *     
     *     If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a video resource, the snippet property contains the channelId, title, description, tags, and categoryId properties. As such, if you set part=snippet, the API response will contain all of those properties.
     * @param regionCode
     *     The regionCode parameter instructs the API to select a video chart available in the specified region. This parameter can only be used in conjunction with the chart parameter. The parameter value is an ISO 3166-1 alpha-2 country code.
     * @param videoCategoryId
     *     The videoCategoryId parameter identifies the video category for which the chart should be retrieved. This parameter can only be used in conjunction with the chart parameter. By default, charts are not restricted to a particular category.
     */
    public Requested<VideoListResponse> get(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        www.googleapis.com.structures.chart chart,
        String hl,
        String id,
        String locale,
        Long maxHeight,
        Long maxResults,
        Long maxWidth,
        www.googleapis.com.structures.myRating myRating,
        String onBehalfOfContentOwner,
        String pageToken,
        String part,
        String regionCode,
        String videoCategoryId) {
        String url = ("https://www.googleapis.com/youtube/v3/videos"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(chart==null?"":"&chart="+flatten(chart))+(hl==null?"":"&hl="+flatten(hl))+(id==null?"":"&id="+flatten(id))+(locale==null?"":"&locale="+flatten(locale))+(maxHeight==null?"":"&maxHeight="+flatten(maxHeight))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(maxWidth==null?"":"&maxWidth="+flatten(maxWidth))+(myRating==null?"":"&myRating="+flatten(myRating))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part))+(regionCode==null?"":"&regionCode="+flatten(regionCode))+(videoCategoryId==null?"":"&videoCategoryId="+flatten(videoCategoryId)));
        return requestGet(url, null, VideoListResponse.class);
    }

    /**
     * 
     * <p>
     * Uploads a video to YouTube and optionally sets the video's metadata.
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
     * @param autoLevels
     *     The autoLevels parameter indicates whether YouTube should automatically enhance the video's lighting and color.
     * @param body
     * @param notifySubscribers
     *     The notifySubscribers parameter indicates whether YouTube should send a notification about the new video to users who subscribe to the video's channel. A parameter value of True indicates that subscribers will be notified of newly uploaded videos. However, a channel owner who is uploading many videos might prefer to set the value to False to avoid sending a notification about each new video to the channel's subscribers.
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
     *     Note that not all parts contain properties that can be set when inserting or updating a video. For example, the statistics object encapsulates statistics that YouTube calculates for a video and does not contain values that you can set or modify. If the parameter value specifies a part that does not contain mutable values, that part will still be included in the API response.
     * @param stabilize
     *     The stabilize parameter indicates whether YouTube should adjust the video to remove shaky camera motions.
     */
    public Requested<Video> post(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        Boolean autoLevels,
        Video body,
        Boolean notifySubscribers,
        String onBehalfOfContentOwner,
        String onBehalfOfContentOwnerChannel,
        String part,
        Boolean stabilize) {
        String url = ("https://www.googleapis.com/youtube/v3/videos"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(autoLevels==null?"":"&autoLevels="+flatten(autoLevels))+(notifySubscribers==null?"":"&notifySubscribers="+flatten(notifySubscribers))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel))+(part==null?"":"&part="+flatten(part))+(stabilize==null?"":"&stabilize="+flatten(stabilize)));
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, null, content, Video.class);
    }

    /**
     * 
     * <p>
     * Updates a video's metadata.
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
     *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
     * @param part
     *     The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.
     *     
     *     Note that this method will override the existing values for all of the mutable properties that are contained in any parts that the parameter value specifies. For example, a video's privacy setting is contained in the status part. As such, if your request is updating a private video, and the request's part parameter value includes the status part, the video's privacy setting will be updated to whatever value the request body specifies. If the request body does not specify a value, the existing privacy setting will be removed and the video will revert to the default privacy setting.
     *     
     *     In addition, not all parts contain properties that can be set when inserting or updating a video. For example, the statistics object encapsulates statistics that YouTube calculates for a video and does not contain values that you can set or modify. If the parameter value specifies a part that does not contain mutable values, that part will still be included in the API response.
     */
    public Requested<Video> put(www.googleapis.com.structures.alt alt,
        String fields,
        String key,
        String oauth_token,
        Boolean prettyPrint,
        String quotaUser,
        String userIp,
        Video body,
        String onBehalfOfContentOwner,
        String part) {
        String url = ("https://www.googleapis.com/youtube/v3/videos"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(part==null?"":"&part="+flatten(part)));
        Map<String, Object> content = new HashMap<>();
        content.put("body", (body));
        return requestPut(url, null, content, Video.class);
    }

    /**
     * 
     * <p>
     * Deletes a YouTube video.
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
     *     The id parameter specifies the YouTube video ID for the resource that is being deleted. In a video resource, the id property specifies the video's ID.
     * @param onBehalfOfContentOwner
     *     Note: This parameter is intended exclusively for YouTube content partners.
     *     
     *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
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
        String url = ("https://www.googleapis.com/youtube/v3/videos"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner)));
        requestDel(url, null, Void.class);
    }
}
