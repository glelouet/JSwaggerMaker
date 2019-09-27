package www.googleapis.com;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Oauth2;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import www.googleapis.com.definitions.Activity;
import www.googleapis.com.definitions.ActivityListResponse;
import www.googleapis.com.definitions.Caption;
import www.googleapis.com.definitions.CaptionListResponse;
import www.googleapis.com.definitions.Channel;
import www.googleapis.com.definitions.ChannelBannerResource;
import www.googleapis.com.definitions.ChannelListResponse;
import www.googleapis.com.definitions.ChannelSection;
import www.googleapis.com.definitions.ChannelSectionListResponse;
import www.googleapis.com.definitions.Comment;
import www.googleapis.com.definitions.CommentListResponse;
import www.googleapis.com.definitions.CommentThread;
import www.googleapis.com.definitions.CommentThreadListResponse;
import www.googleapis.com.definitions.GuideCategoryListResponse;
import www.googleapis.com.definitions.I18nLanguageListResponse;
import www.googleapis.com.definitions.I18nRegionListResponse;
import www.googleapis.com.definitions.InvideoBranding;
import www.googleapis.com.definitions.LiveBroadcast;
import www.googleapis.com.definitions.LiveBroadcastListResponse;
import www.googleapis.com.definitions.LiveChatBan;
import www.googleapis.com.definitions.LiveChatMessage;
import www.googleapis.com.definitions.LiveChatMessageListResponse;
import www.googleapis.com.definitions.LiveChatModerator;
import www.googleapis.com.definitions.LiveChatModeratorListResponse;
import www.googleapis.com.definitions.LiveStream;
import www.googleapis.com.definitions.LiveStreamListResponse;
import www.googleapis.com.definitions.MemberListResponse;
import www.googleapis.com.definitions.MembershipsLevelListResponse;
import www.googleapis.com.definitions.Playlist;
import www.googleapis.com.definitions.PlaylistItem;
import www.googleapis.com.definitions.PlaylistItemListResponse;
import www.googleapis.com.definitions.PlaylistListResponse;
import www.googleapis.com.definitions.SearchListResponse;
import www.googleapis.com.definitions.SponsorListResponse;
import www.googleapis.com.definitions.Subscription;
import www.googleapis.com.definitions.SubscriptionListResponse;
import www.googleapis.com.definitions.SuperChatEventListResponse;
import www.googleapis.com.definitions.ThumbnailSetResponse;
import www.googleapis.com.definitions.Video;
import www.googleapis.com.definitions.VideoAbuseReport;
import www.googleapis.com.definitions.VideoAbuseReportReasonListResponse;
import www.googleapis.com.definitions.VideoCategoryListResponse;
import www.googleapis.com.definitions.VideoGetRatingResponse;
import www.googleapis.com.definitions.VideoListResponse;


/**
 * access www.googleapis.com with authorization type oauth2.
 */
public class Oauth2c
    extends Oauth2
{
    public static final String[] SCOPES = new String[] {"https://www.googleapis.com/auth/youtube.force-ssl", "https://www.googleapis.com/auth/youtube.readonly", "https://www.googleapis.com/auth/youtube", "https://www.googleapis.com/auth/youtubepartner-channel-audit", "https://www.googleapis.com/auth/youtubepartner", "https://www.googleapis.com/auth/youtube.upload"};
    public final Oauth2c.Activities activities = new Oauth2c.Activities();
    public final Oauth2c.Captions captions = new Oauth2c.Captions();
    public final Oauth2c.Channelbanners channelbanners = new Oauth2c.Channelbanners();
    public final Oauth2c.Channelsections channelsections = new Oauth2c.Channelsections();
    public final Oauth2c.Channels channels = new Oauth2c.Channels();
    public final Oauth2c.Commentthreads commentthreads = new Oauth2c.Commentthreads();
    public final Oauth2c.Comments comments = new Oauth2c.Comments();
    public final Oauth2c.Guidecategories guidecategories = new Oauth2c.Guidecategories();
    public final Oauth2c.I18nlanguages i18nlanguages = new Oauth2c.I18nlanguages();
    public final Oauth2c.I18nregions i18nregions = new Oauth2c.I18nregions();
    public final Oauth2c.Livebroadcasts livebroadcasts = new Oauth2c.Livebroadcasts();
    public final Oauth2c.Livechat livechat = new Oauth2c.Livechat();
    public final Oauth2c.Livestreams livestreams = new Oauth2c.Livestreams();
    public final Oauth2c.Members members = new Oauth2c.Members();
    public final Oauth2c.Membershipslevels membershipslevels = new Oauth2c.Membershipslevels();
    public final Oauth2c.Playlistitems playlistitems = new Oauth2c.Playlistitems();
    public final Oauth2c.Playlists playlists = new Oauth2c.Playlists();
    public final Oauth2c.Search search = new Oauth2c.Search();
    public final Oauth2c.Sponsors sponsors = new Oauth2c.Sponsors();
    public final Oauth2c.Subscriptions subscriptions = new Oauth2c.Subscriptions();
    public final Oauth2c.Superchatevents superchatevents = new Oauth2c.Superchatevents();
    public final Oauth2c.Thumbnails thumbnails = new Oauth2c.Thumbnails();
    public final Oauth2c.Videoabusereportreasons videoabusereportreasons = new Oauth2c.Videoabusereportreasons();
    public final Oauth2c.Videocategories videocategories = new Oauth2c.Videocategories();
    public final Oauth2c.Videos videos = new Oauth2c.Videos();
    public final Oauth2c.Watermarks watermarks = new Oauth2c.Watermarks();

    public Oauth2c(String refreshToken, String basicAuth) {
        super(refreshToken, basicAuth, "https://accounts.google.com/o/oauth2/auth");
    }

    public class Activities {

        /**
         * 
         * <p>
         * Returns a list of channel activity events that match the request criteria. For example, you can retrieve events associated with a particular channel, events associated with the user's subscriptions and Google+ friends, or the YouTube home page feed, which is customized for each user.
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
         *     The channelId parameter specifies a unique YouTube channel ID. The API will then return a list of that channel's activities.
         * @param home
         *     Set this parameter's value to true to retrieve the activity feed that displays on the YouTube home page for the currently authenticated user.
         * @param maxResults
         *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
         * @param mine
         *     Set this parameter's value to true to retrieve a feed of the authenticated user's activities.
         * @param pageToken
         *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
         * @param part
         *     The part parameter specifies a comma-separated list of one or more activity resource properties that the API response will include.
         *     
         *     If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in an activity resource, the snippet property contains other properties that identify the type of activity, a display title for the activity, and so forth. If you set part=snippet, the API response will also contain all of those nested properties.
         * @param publishedAfter
         *     The publishedAfter parameter specifies the earliest date and time that an activity could have occurred for that activity to be included in the API response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be included in the result set. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
         * @param publishedBefore
         *     The publishedBefore parameter specifies the date and time before which an activity must have occurred for that activity to be included in the API response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be excluded from the result set. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
         * @param regionCode
         *     The regionCode parameter instructs the API to return results for the specified country. The parameter value is an ISO 3166-1 alpha-2 country code. YouTube uses this value when the authorized user's previous activity on YouTube does not provide enough information to generate the activity feed.
         */
        public Requested<ActivityListResponse> get(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String channelId,
            Boolean home,
            Long maxResults,
            Boolean mine,
            String pageToken,
            String part,
            String publishedAfter,
            String publishedBefore,
            String regionCode) {
            String url = ("https://www.googleapis.com/youtube/v3/activities"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(channelId==null?"":"&channelId="+flatten(channelId))+(home==null?"":"&home="+flatten(home))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(mine==null?"":"&mine="+flatten(mine))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part))+(publishedAfter==null?"":"&publishedAfter="+flatten(publishedAfter))+(publishedBefore==null?"":"&publishedBefore="+flatten(publishedBefore))+(regionCode==null?"":"&regionCode="+flatten(regionCode)));
            return requestGet(url, null, ActivityListResponse.class);
        }

        /**
         * 
         * <p>
         * Posts a bulletin for a specific channel. (The user submitting the request must be authorized to act on the channel's behalf.)
         * Note: Even though an activity resource can contain information about actions like a user rating a video or marking a video as a favorite, you need to use other API methods to generate those activity resources. For example, you would use the API's videos.rate() method to rate a video and the playlistItems.insert() method to mark a video as a favorite.
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
        public Requested<Activity> post(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            Activity body,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/activities"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(part==null?"":"&part="+flatten(part)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPost(url, null, content, Activity.class);
        }
    }

    public class Captions {

        /**
         * 
         * <p>
         * Returns a list of caption tracks that are associated with a specified video. Note that the API response does not contain the actual captions and that the captions.download method provides the ability to retrieve a caption track.
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
         *     The id parameter specifies a comma-separated list of IDs that identify the caption resources that should be retrieved. Each ID must identify a caption track associated with the specified video.
         * @param onBehalfOf
         *     ID of the Google+ Page for the channel that the request is on behalf of.
         * @param onBehalfOfContentOwner
         *     Note: This parameter is intended exclusively for YouTube content partners.
         *     
         *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
         * @param part
         *     The part parameter specifies a comma-separated list of one or more caption resource parts that the API response will include. The part names that you can include in the parameter value are id and snippet.
         * @param videoId
         *     The videoId parameter specifies the YouTube video ID of the video for which the API should return caption tracks.
         */
        public Requested<CaptionListResponse> get(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String id,
            String onBehalfOf,
            String onBehalfOfContentOwner,
            String part,
            String videoId) {
            String url = ("https://www.googleapis.com/youtube/v3/captions"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id))+(onBehalfOf==null?"":"&onBehalfOf="+flatten(onBehalfOf))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(part==null?"":"&part="+flatten(part))+(videoId==null?"":"&videoId="+flatten(videoId)));
            return requestGet(url, null, CaptionListResponse.class);
        }

        /**
         * 
         * <p>
         * Uploads a caption track.
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
         * @param onBehalfOf
         *     ID of the Google+ Page for the channel that the request is be on behalf of
         * @param onBehalfOfContentOwner
         *     Note: This parameter is intended exclusively for YouTube content partners.
         *     
         *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
         * @param part
         *     The part parameter specifies the caption resource parts that the API response will include. Set the parameter value to snippet.
         * @param sync
         *     The sync parameter indicates whether YouTube should automatically synchronize the caption file with the audio track of the video. If you set the value to true, YouTube will disregard any time codes that are in the uploaded caption file and generate new time codes for the captions.
         *     
         *     You should set the sync parameter to true if you are uploading a transcript, which has no time codes, or if you suspect the time codes in your file are incorrect and want YouTube to try to fix them.
         */
        public Requested<Caption> post(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            Caption body,
            String onBehalfOf,
            String onBehalfOfContentOwner,
            String part,
            Boolean sync) {
            String url = ("https://www.googleapis.com/youtube/v3/captions"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOf==null?"":"&onBehalfOf="+flatten(onBehalfOf))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(part==null?"":"&part="+flatten(part))+(sync==null?"":"&sync="+flatten(sync)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPost(url, null, content, Caption.class);
        }

        /**
         * 
         * <p>
         * Updates a caption track. When updating a caption track, you can change the track's draft status, upload a new caption file for the track, or both.
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
         * @param onBehalfOf
         *     ID of the Google+ Page for the channel that the request is be on behalf of
         * @param onBehalfOfContentOwner
         *     Note: This parameter is intended exclusively for YouTube content partners.
         *     
         *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
         * @param part
         *     The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include. Set the property value to snippet if you are updating the track's draft status. Otherwise, set the property value to id.
         * @param sync
         *     Note: The API server only processes the parameter value if the request contains an updated caption file.
         *     
         *     The sync parameter indicates whether YouTube should automatically synchronize the caption file with the audio track of the video. If you set the value to true, YouTube will automatically synchronize the caption track with the audio track.
         */
        public Requested<Caption> put(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            Caption body,
            String onBehalfOf,
            String onBehalfOfContentOwner,
            String part,
            Boolean sync) {
            String url = ("https://www.googleapis.com/youtube/v3/captions"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOf==null?"":"&onBehalfOf="+flatten(onBehalfOf))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(part==null?"":"&part="+flatten(part))+(sync==null?"":"&sync="+flatten(sync)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPut(url, null, content, Caption.class);
        }

        /**
         * 
         * <p>
         * Deletes a specified caption track.
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
         *     The id parameter identifies the caption track that is being deleted. The value is a caption track ID as identified by the id property in a caption resource.
         * @param onBehalfOf
         *     ID of the Google+ Page for the channel that the request is be on behalf of
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
            String onBehalfOf,
            String onBehalfOfContentOwner) {
            String url = ("https://www.googleapis.com/youtube/v3/captions"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id))+(onBehalfOf==null?"":"&onBehalfOf="+flatten(onBehalfOf))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner)));
            requestDel(url, null, Void.class);
        }

        /**
         * 
         * <p>
         * Downloads a caption track. The caption track is returned in its original format unless the request specifies a value for the tfmt parameter and in its original language unless the request specifies a value for the tlang parameter.
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
         *     The id parameter identifies the caption track that is being retrieved. The value is a caption track ID as identified by the id property in a caption resource.
         * @param onBehalfOf
         *     ID of the Google+ Page for the channel that the request is be on behalf of
         * @param onBehalfOfContentOwner
         *     Note: This parameter is intended exclusively for YouTube content partners.
         *     
         *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
         * @param tfmt
         *     The tfmt parameter specifies that the caption track should be returned in a specific format. If the parameter is not included in the request, the track is returned in its original format.
         * @param tlang
         *     The tlang parameter specifies that the API response should return a translation of the specified caption track. The parameter value is an ISO 639-1 two-letter language code that identifies the desired caption language. The translation is generated by using machine translation, such as Google Translate.
         */
        public void getById(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String id,
            String onBehalfOf,
            String onBehalfOfContentOwner,
            www.googleapis.com.structures.tfmt tfmt,
            String tlang) {
            String url = ("https://www.googleapis.com/youtube/v3/captions/{id}".replace("{id}", ""+id)+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOf==null?"":"&onBehalfOf="+flatten(onBehalfOf))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(tfmt==null?"":"&tfmt="+flatten(tfmt))+(tlang==null?"":"&tlang="+flatten(tlang)));
            requestGet(url, null, Void.class);
        }
    }

    public class Channelbanners {
        public final Oauth2c.Channelbanners.Insert insert = new Oauth2c.Channelbanners.Insert();

        public class Insert {

            /**
             * 
             * <p>
             * Uploads a channel banner image to YouTube. This method represents the first two steps in a three-step process to update the banner image for a channel:
             * - Call the channelBanners.insert method to upload the binary image data to YouTube. The image must have a 16:9 aspect ratio and be at least 2120x1192 pixels.
             * - Extract the url property's value from the response that the API returns for step 1.
             * - Call the channels.update method to update the channel's branding settings. Set the brandingSettings.image.bannerExternalUrl property's value to the URL obtained in step 2.
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
             * @param channelId
             *     The channelId parameter identifies the YouTube channel to which the banner is uploaded. The channelId parameter was introduced as a required parameter in May 2017. As this was a backward-incompatible change, channelBanners.insert requests that do not specify this parameter will not return an error until six months have passed from the time that the parameter was introduced. Please see the API Terms of Service for the official policy regarding backward incompatible changes and the API revision history for the exact date that the parameter was introduced.
             * @param onBehalfOfContentOwner
             *     Note: This parameter is intended exclusively for YouTube content partners.
             *     
             *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
             */
            public Requested<ChannelBannerResource> post(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                ChannelBannerResource body,
                String channelId,
                String onBehalfOfContentOwner) {
                String url = ("https://www.googleapis.com/youtube/v3/channelBanners/insert"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(channelId==null?"":"&channelId="+flatten(channelId))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner)));
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, null, content, ChannelBannerResource.class);
            }
        }
    }

    public class Channels {

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
            content.put("body", body);
            return requestPut(url, null, content, Channel.class);
        }
    }

    public class Channelsections {

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
            content.put("body", body);
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

    public class Comments {
        public final Oauth2c.Comments.Markasspam markasspam = new Oauth2c.Comments.Markasspam();
        public final Oauth2c.Comments.Setmoderationstatus setmoderationstatus = new Oauth2c.Comments.Setmoderationstatus();

        /**
         * 
         * <p>
         * Returns a list of comments that match the API request parameters.
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
         *     The id parameter specifies a comma-separated list of comment IDs for the resources that are being retrieved. In a comment resource, the id property specifies the comment's ID.
         * @param maxResults
         *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
         *     
         *     Note: This parameter is not supported for use in conjunction with the id parameter.
         * @param pageToken
         *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken property identifies the next page of the result that can be retrieved.
         *     
         *     Note: This parameter is not supported for use in conjunction with the id parameter.
         * @param parentId
         *     The parentId parameter specifies the ID of the comment for which replies should be retrieved.
         *     
         *     Note: YouTube currently supports replies only for top-level comments. However, replies to replies may be supported in the future.
         * @param part
         *     The part parameter specifies a comma-separated list of one or more comment resource properties that the API response will include.
         * @param textFormat
         *     This parameter indicates whether the API should return comments formatted as HTML or as plain text.
         */
        public Requested<CommentListResponse> get(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String id,
            Long maxResults,
            String pageToken,
            String parentId,
            String part,
            www.googleapis.com.structures.textFormat textFormat) {
            String url = ("https://www.googleapis.com/youtube/v3/comments"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(parentId==null?"":"&parentId="+flatten(parentId))+(part==null?"":"&part="+flatten(part))+(textFormat==null?"":"&textFormat="+flatten(textFormat)));
            return requestGet(url, null, CommentListResponse.class);
        }

        /**
         * 
         * <p>
         * Creates a reply to an existing comment. Note: To create a top-level comment, use the commentThreads.insert method.
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
         *     The part parameter identifies the properties that the API response will include. Set the parameter value to snippet. The snippet part has a quota cost of 2 units.
         */
        public Requested<Comment> post(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            Comment body,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/comments"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(part==null?"":"&part="+flatten(part)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPost(url, null, content, Comment.class);
        }

        /**
         * 
         * <p>
         * Modifies a comment.
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
         *     The part parameter identifies the properties that the API response will include. You must at least include the snippet part in the parameter value since that part contains all of the properties that the API request can update.
         */
        public Requested<Comment> put(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            Comment body,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/comments"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(part==null?"":"&part="+flatten(part)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPut(url, null, content, Comment.class);
        }

        /**
         * 
         * <p>
         * Deletes a comment.
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
         *     The id parameter specifies the comment ID for the resource that is being deleted.
         */
        public void delete(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String id) {
            String url = ("https://www.googleapis.com/youtube/v3/comments"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id)));
            requestDel(url, null, Void.class);
        }

        public class Markasspam {

            /**
             * 
             * <p>
             * Expresses the caller's opinion that one or more comments should be flagged as spam.
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
             *     The id parameter specifies a comma-separated list of IDs of comments that the caller believes should be classified as spam.
             */
            public void post(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                String id) {
                String url = ("https://www.googleapis.com/youtube/v3/comments/markAsSpam"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id)));
                requestPost(url, null, null, Void.class);
            }
        }

        public class Setmoderationstatus {

            /**
             * 
             * <p>
             * Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the comments.
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
             * @param banAuthor
             *     The banAuthor parameter lets you indicate that you want to automatically reject any additional comments written by the comment's author. Set the parameter value to true to ban the author.
             *     
             *     Note: This parameter is only valid if the moderationStatus parameter is also set to rejected.
             * @param id
             *     The id parameter specifies a comma-separated list of IDs that identify the comments for which you are updating the moderation status.
             * @param moderationStatus
             *     Identifies the new moderation status of the specified comments.
             */
            public void post(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                Boolean banAuthor,
                String id,
                www.googleapis.com.structures.moderationStatus moderationStatus) {
                String url = ("https://www.googleapis.com/youtube/v3/comments/setModerationStatus"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(banAuthor==null?"":"&banAuthor="+flatten(banAuthor))+(id==null?"":"&id="+flatten(id))+(moderationStatus==null?"":"&moderationStatus="+flatten(moderationStatus)));
                requestPost(url, null, null, Void.class);
            }
        }
    }

    public class Commentthreads {

        /**
         * 
         * <p>
         * Returns a list of comment threads that match the API request parameters.
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
         * @param allThreadsRelatedToChannelId
         *     The allThreadsRelatedToChannelId parameter instructs the API to return all comment threads associated with the specified channel. The response can include comments about the channel or about the channel's videos.
         * @param channelId
         *     The channelId parameter instructs the API to return comment threads containing comments about the specified channel. (The response will not include comments left on videos that the channel uploaded.)
         * @param id
         *     The id parameter specifies a comma-separated list of comment thread IDs for the resources that should be retrieved.
         * @param maxResults
         *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
         *     
         *     Note: This parameter is not supported for use in conjunction with the id parameter.
         * @param moderationStatus
         *     Set this parameter to limit the returned comment threads to a particular moderation state.
         *     
         *     Note: This parameter is not supported for use in conjunction with the id parameter.
         * @param order
         *     The order parameter specifies the order in which the API response should list comment threads. Valid values are: 
         *     - time - Comment threads are ordered by time. This is the default behavior.
         *     - relevance - Comment threads are ordered by relevance.Note: This parameter is not supported for use in conjunction with the id parameter.
         * @param pageToken
         *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken property identifies the next page of the result that can be retrieved.
         *     
         *     Note: This parameter is not supported for use in conjunction with the id parameter.
         * @param part
         *     The part parameter specifies a comma-separated list of one or more commentThread resource properties that the API response will include.
         * @param searchTerms
         *     The searchTerms parameter instructs the API to limit the API response to only contain comments that contain the specified search terms.
         *     
         *     Note: This parameter is not supported for use in conjunction with the id parameter.
         * @param textFormat
         *     Set this parameter's value to html or plainText to instruct the API to return the comments left by users in html formatted or in plain text.
         * @param videoId
         *     The videoId parameter instructs the API to return comment threads associated with the specified video ID.
         */
        public Requested<CommentThreadListResponse> get(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String allThreadsRelatedToChannelId,
            String channelId,
            String id,
            Long maxResults,
            www.googleapis.com.structures.moderationStatus moderationStatus,
            www.googleapis.com.structures.order order,
            String pageToken,
            String part,
            String searchTerms,
            www.googleapis.com.structures.textFormat textFormat,
            String videoId) {
            String url = ("https://www.googleapis.com/youtube/v3/commentThreads"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(allThreadsRelatedToChannelId==null?"":"&allThreadsRelatedToChannelId="+flatten(allThreadsRelatedToChannelId))+(channelId==null?"":"&channelId="+flatten(channelId))+(id==null?"":"&id="+flatten(id))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(moderationStatus==null?"":"&moderationStatus="+flatten(moderationStatus))+(order==null?"":"&order="+flatten(order))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part))+(searchTerms==null?"":"&searchTerms="+flatten(searchTerms))+(textFormat==null?"":"&textFormat="+flatten(textFormat))+(videoId==null?"":"&videoId="+flatten(videoId)));
            return requestGet(url, null, CommentThreadListResponse.class);
        }

        /**
         * 
         * <p>
         * Creates a new top-level comment. To add a reply to an existing comment, use the comments.insert method instead.
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
         *     The part parameter identifies the properties that the API response will include. Set the parameter value to snippet. The snippet part has a quota cost of 2 units.
         */
        public Requested<CommentThread> post(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            CommentThread body,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/commentThreads"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(part==null?"":"&part="+flatten(part)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPost(url, null, content, CommentThread.class);
        }

        /**
         * 
         * <p>
         * Modifies the top-level comment in a comment thread.
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
         *     The part parameter specifies a comma-separated list of commentThread resource properties that the API response will include. You must at least include the snippet part in the parameter value since that part contains all of the properties that the API request can update.
         */
        public Requested<CommentThread> put(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            CommentThread body,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/commentThreads"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(part==null?"":"&part="+flatten(part)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPut(url, null, content, CommentThread.class);
        }
    }

    public class Guidecategories {

        /**
         * 
         * <p>
         * Returns a list of categories that can be associated with YouTube channels.
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
         *     The hl parameter specifies the language that will be used for text values in the API response.
         * @param id
         *     The id parameter specifies a comma-separated list of the YouTube channel category ID(s) for the resource(s) that are being retrieved. In a guideCategory resource, the id property specifies the YouTube channel category ID.
         * @param part
         *     The part parameter specifies the guideCategory resource properties that the API response will include. Set the parameter value to snippet.
         * @param regionCode
         *     The regionCode parameter instructs the API to return the list of guide categories available in the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
         */
        public Requested<GuideCategoryListResponse> get(www.googleapis.com.structures.alt alt,
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
            String url = ("https://www.googleapis.com/youtube/v3/guideCategories"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(hl==null?"":"&hl="+flatten(hl))+(id==null?"":"&id="+flatten(id))+(part==null?"":"&part="+flatten(part))+(regionCode==null?"":"&regionCode="+flatten(regionCode)));
            return requestGet(url, null, GuideCategoryListResponse.class);
        }
    }

    public class I18nlanguages {

        /**
         * 
         * <p>
         * Returns a list of application languages that the YouTube website supports.
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
         *     The part parameter specifies the i18nLanguage resource properties that the API response will include. Set the parameter value to snippet.
         */
        public Requested<I18nLanguageListResponse> get(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String hl,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/i18nLanguages"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(hl==null?"":"&hl="+flatten(hl))+(part==null?"":"&part="+flatten(part)));
            return requestGet(url, null, I18nLanguageListResponse.class);
        }
    }

    public class I18nregions {

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

    public class Livebroadcasts {
        public final Oauth2c.Livebroadcasts.Bind bind = new Oauth2c.Livebroadcasts.Bind();
        public final Oauth2c.Livebroadcasts.Control control = new Oauth2c.Livebroadcasts.Control();
        public final Oauth2c.Livebroadcasts.Transition transition = new Oauth2c.Livebroadcasts.Transition();

        /**
         * 
         * <p>
         * Returns a list of YouTube broadcasts that match the API request parameters.
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
         * @param broadcastStatus
         *     The broadcastStatus parameter filters the API response to only include broadcasts with the specified status.
         * @param broadcastType
         *     The broadcastType parameter filters the API response to only include broadcasts with the specified type. This is only compatible with the mine filter for now.
         * @param id
         *     The id parameter specifies a comma-separated list of YouTube broadcast IDs that identify the broadcasts being retrieved. In a liveBroadcast resource, the id property specifies the broadcast's ID.
         * @param maxResults
         *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
         * @param mine
         *     The mine parameter can be used to instruct the API to only return broadcasts owned by the authenticated user. Set the parameter value to true to only retrieve your own broadcasts.
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
         * @param pageToken
         *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
         * @param part
         *     The part parameter specifies a comma-separated list of one or more liveBroadcast resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, contentDetails, and status.
         */
        public Requested<LiveBroadcastListResponse> get(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            www.googleapis.com.structures.broadcastStatus broadcastStatus,
            www.googleapis.com.structures.broadcastType broadcastType,
            String id,
            Long maxResults,
            Boolean mine,
            String onBehalfOfContentOwner,
            String onBehalfOfContentOwnerChannel,
            String pageToken,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/liveBroadcasts"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(broadcastStatus==null?"":"&broadcastStatus="+flatten(broadcastStatus))+(broadcastType==null?"":"&broadcastType="+flatten(broadcastType))+(id==null?"":"&id="+flatten(id))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(mine==null?"":"&mine="+flatten(mine))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part)));
            return requestGet(url, null, LiveBroadcastListResponse.class);
        }

        /**
         * 
         * <p>
         * Creates a broadcast.
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
         *     The part properties that you can include in the parameter value are id, snippet, contentDetails, and status.
         */
        public Requested<LiveBroadcast> post(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            LiveBroadcast body,
            String onBehalfOfContentOwner,
            String onBehalfOfContentOwnerChannel,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/liveBroadcasts"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel))+(part==null?"":"&part="+flatten(part)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPost(url, null, content, LiveBroadcast.class);
        }

        /**
         * 
         * <p>
         * Updates a broadcast. For example, you could modify the broadcast settings defined in the liveBroadcast resource's contentDetails object.
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
         *     The part properties that you can include in the parameter value are id, snippet, contentDetails, and status.
         *     
         *     Note that this method will override the existing values for all of the mutable properties that are contained in any parts that the parameter value specifies. For example, a broadcast's privacy status is defined in the status part. As such, if your request is updating a private or unlisted broadcast, and the request's part parameter value includes the status part, the broadcast's privacy setting will be updated to whatever value the request body specifies. If the request body does not specify a value, the existing privacy setting will be removed and the broadcast will revert to the default privacy setting.
         */
        public Requested<LiveBroadcast> put(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            LiveBroadcast body,
            String onBehalfOfContentOwner,
            String onBehalfOfContentOwnerChannel,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/liveBroadcasts"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel))+(part==null?"":"&part="+flatten(part)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPut(url, null, content, LiveBroadcast.class);
        }

        /**
         * 
         * <p>
         * Deletes a broadcast.
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
         *     The id parameter specifies the YouTube live broadcast ID for the resource that is being deleted.
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
         */
        public void delete(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String id,
            String onBehalfOfContentOwner,
            String onBehalfOfContentOwnerChannel) {
            String url = ("https://www.googleapis.com/youtube/v3/liveBroadcasts"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel)));
            requestDel(url, null, Void.class);
        }

        public class Bind {

            /**
             * 
             * <p>
             * Binds a YouTube broadcast to a stream or removes an existing binding between a broadcast and a stream. A broadcast can only be bound to one video stream, though a video stream may be bound to more than one broadcast.
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
             *     The id parameter specifies the unique ID of the broadcast that is being bound to a video stream.
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
             *     The part parameter specifies a comma-separated list of one or more liveBroadcast resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, contentDetails, and status.
             * @param streamId
             *     The streamId parameter specifies the unique ID of the video stream that is being bound to a broadcast. If this parameter is omitted, the API will remove any existing binding between the broadcast and a video stream.
             */
            public Requested<LiveBroadcast> post(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                String id,
                String onBehalfOfContentOwner,
                String onBehalfOfContentOwnerChannel,
                String part,
                String streamId) {
                String url = ("https://www.googleapis.com/youtube/v3/liveBroadcasts/bind"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel))+(part==null?"":"&part="+flatten(part))+(streamId==null?"":"&streamId="+flatten(streamId)));
                return requestPost(url, null, null, LiveBroadcast.class);
            }
        }

        public class Control {

            /**
             * 
             * <p>
             * Controls the settings for a slate that can be displayed in the broadcast stream.
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
             * @param displaySlate
             *     The displaySlate parameter specifies whether the slate is being enabled or disabled.
             * @param id
             *     The id parameter specifies the YouTube live broadcast ID that uniquely identifies the broadcast in which the slate is being updated.
             * @param offsetTimeMs
             *     The offsetTimeMs parameter specifies a positive time offset when the specified slate change will occur. The value is measured in milliseconds from the beginning of the broadcast's monitor stream, which is the time that the testing phase for the broadcast began. Even though it is specified in milliseconds, the value is actually an approximation, and YouTube completes the requested action as closely as possible to that time.
             *     
             *     If you do not specify a value for this parameter, then YouTube performs the action as soon as possible. See the Getting started guide for more details.
             *     
             *     Important: You should only specify a value for this parameter if your broadcast stream is delayed.
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
             *     The part parameter specifies a comma-separated list of one or more liveBroadcast resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, contentDetails, and status.
             * @param walltime
             *     The walltime parameter specifies the wall clock time at which the specified slate change will occur. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sssZ) format.
             */
            public Requested<LiveBroadcast> post(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                Boolean displaySlate,
                String id,
                String offsetTimeMs,
                String onBehalfOfContentOwner,
                String onBehalfOfContentOwnerChannel,
                String part,
                String walltime) {
                String url = ("https://www.googleapis.com/youtube/v3/liveBroadcasts/control"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(displaySlate==null?"":"&displaySlate="+flatten(displaySlate))+(id==null?"":"&id="+flatten(id))+(offsetTimeMs==null?"":"&offsetTimeMs="+flatten(offsetTimeMs))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel))+(part==null?"":"&part="+flatten(part))+(walltime==null?"":"&walltime="+flatten(walltime)));
                return requestPost(url, null, null, LiveBroadcast.class);
            }
        }

        public class Transition {

            /**
             * 
             * <p>
             * Changes the status of a YouTube live broadcast and initiates any processes associated with the new status. For example, when you transition a broadcast's status to testing, YouTube starts to transmit video to that broadcast's monitor stream. Before calling this method, you should confirm that the value of the status.streamStatus property for the stream bound to your broadcast is active.
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
             * @param broadcastStatus
             *     The broadcastStatus parameter identifies the state to which the broadcast is changing. Note that to transition a broadcast to either the testing or live state, the status.streamStatus must be active for the stream that the broadcast is bound to.
             * @param id
             *     The id parameter specifies the unique ID of the broadcast that is transitioning to another status.
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
             *     The part parameter specifies a comma-separated list of one or more liveBroadcast resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, contentDetails, and status.
             */
            public Requested<LiveBroadcast> post(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                www.googleapis.com.structures.broadcastStatus broadcastStatus,
                String id,
                String onBehalfOfContentOwner,
                String onBehalfOfContentOwnerChannel,
                String part) {
                String url = ("https://www.googleapis.com/youtube/v3/liveBroadcasts/transition"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(broadcastStatus==null?"":"&broadcastStatus="+flatten(broadcastStatus))+(id==null?"":"&id="+flatten(id))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel))+(part==null?"":"&part="+flatten(part)));
                return requestPost(url, null, null, LiveBroadcast.class);
            }
        }
    }

    public class Livechat {
        public final Oauth2c.Livechat.Bans bans = new Oauth2c.Livechat.Bans();
        public final Oauth2c.Livechat.Messages messages = new Oauth2c.Livechat.Messages();
        public final Oauth2c.Livechat.Moderators moderators = new Oauth2c.Livechat.Moderators();

        public class Bans {

            /**
             * 
             * <p>
             * Adds a new ban to the chat.
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
             *     The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response returns. Set the parameter value to snippet.
             */
            public Requested<LiveChatBan> post(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                LiveChatBan body,
                String part) {
                String url = ("https://www.googleapis.com/youtube/v3/liveChat/bans"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(part==null?"":"&part="+flatten(part)));
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, null, content, LiveChatBan.class);
            }

            /**
             * 
             * <p>
             * Removes a chat ban.
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
             *     The id parameter identifies the chat ban to remove. The value uniquely identifies both the ban and the chat.
             */
            public void delete(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                String id) {
                String url = ("https://www.googleapis.com/youtube/v3/liveChat/bans"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id)));
                requestDel(url, null, Void.class);
            }
        }

        public class Messages {

            /**
             * 
             * <p>
             * Lists live chat messages for a specific chat.
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
             * @param liveChatId
             *     The liveChatId parameter specifies the ID of the chat whose messages will be returned.
             * @param maxResults
             *     The maxResults parameter specifies the maximum number of messages that should be returned in the result set.
             * @param pageToken
             *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken property identify other pages that could be retrieved.
             * @param part
             *     The part parameter specifies the liveChatComment resource parts that the API response will include. Supported values are id and snippet.
             * @param profileImageSize
             *     The profileImageSize parameter specifies the size of the user profile pictures that should be returned in the result set. Default: 88.
             */
            public Requested<LiveChatMessageListResponse> get(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                String hl,
                String liveChatId,
                Long maxResults,
                String pageToken,
                String part,
                Long profileImageSize) {
                String url = ("https://www.googleapis.com/youtube/v3/liveChat/messages"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(hl==null?"":"&hl="+flatten(hl))+(liveChatId==null?"":"&liveChatId="+flatten(liveChatId))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part))+(profileImageSize==null?"":"&profileImageSize="+flatten(profileImageSize)));
                return requestGet(url, null, LiveChatMessageListResponse.class);
            }

            /**
             * 
             * <p>
             * Adds a message to a live chat.
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
             *     The part parameter serves two purposes. It identifies the properties that the write operation will set as well as the properties that the API response will include. Set the parameter value to snippet.
             */
            public Requested<LiveChatMessage> post(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                LiveChatMessage body,
                String part) {
                String url = ("https://www.googleapis.com/youtube/v3/liveChat/messages"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(part==null?"":"&part="+flatten(part)));
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, null, content, LiveChatMessage.class);
            }

            /**
             * 
             * <p>
             * Deletes a chat message.
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
             *     The id parameter specifies the YouTube chat message ID of the resource that is being deleted.
             */
            public void delete(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                String id) {
                String url = ("https://www.googleapis.com/youtube/v3/liveChat/messages"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id)));
                requestDel(url, null, Void.class);
            }
        }

        public class Moderators {

            /**
             * 
             * <p>
             * Lists moderators for a live chat.
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
             * @param liveChatId
             *     The liveChatId parameter specifies the YouTube live chat for which the API should return moderators.
             * @param maxResults
             *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
             * @param pageToken
             *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
             * @param part
             *     The part parameter specifies the liveChatModerator resource parts that the API response will include. Supported values are id and snippet.
             */
            public Requested<LiveChatModeratorListResponse> get(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                String liveChatId,
                Long maxResults,
                String pageToken,
                String part) {
                String url = ("https://www.googleapis.com/youtube/v3/liveChat/moderators"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(liveChatId==null?"":"&liveChatId="+flatten(liveChatId))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part)));
                return requestGet(url, null, LiveChatModeratorListResponse.class);
            }

            /**
             * 
             * <p>
             * Adds a new moderator for the chat.
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
             *     The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response returns. Set the parameter value to snippet.
             */
            public Requested<LiveChatModerator> post(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                LiveChatModerator body,
                String part) {
                String url = ("https://www.googleapis.com/youtube/v3/liveChat/moderators"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(part==null?"":"&part="+flatten(part)));
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, null, content, LiveChatModerator.class);
            }

            /**
             * 
             * <p>
             * Removes a chat moderator.
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
             *     The id parameter identifies the chat moderator to remove. The value uniquely identifies both the moderator and the chat.
             */
            public void delete(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                String id) {
                String url = ("https://www.googleapis.com/youtube/v3/liveChat/moderators"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id)));
                requestDel(url, null, Void.class);
            }
        }
    }

    public class Livestreams {

        /**
         * 
         * <p>
         * Returns a list of video streams that match the API request parameters.
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
         *     The id parameter specifies a comma-separated list of YouTube stream IDs that identify the streams being retrieved. In a liveStream resource, the id property specifies the stream's ID.
         * @param maxResults
         *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
         * @param mine
         *     The mine parameter can be used to instruct the API to only return streams owned by the authenticated user. Set the parameter value to true to only retrieve your own streams.
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
         * @param pageToken
         *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
         * @param part
         *     The part parameter specifies a comma-separated list of one or more liveStream resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, cdn, and status.
         */
        public Requested<LiveStreamListResponse> get(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String id,
            Long maxResults,
            Boolean mine,
            String onBehalfOfContentOwner,
            String onBehalfOfContentOwnerChannel,
            String pageToken,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/liveStreams"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(mine==null?"":"&mine="+flatten(mine))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part)));
            return requestGet(url, null, LiveStreamListResponse.class);
        }

        /**
         * 
         * <p>
         * Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience.
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
         *     The part properties that you can include in the parameter value are id, snippet, cdn, and status.
         */
        public Requested<LiveStream> post(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            LiveStream body,
            String onBehalfOfContentOwner,
            String onBehalfOfContentOwnerChannel,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/liveStreams"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel))+(part==null?"":"&part="+flatten(part)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPost(url, null, content, LiveStream.class);
        }

        /**
         * 
         * <p>
         * Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings.
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
         *     The part properties that you can include in the parameter value are id, snippet, cdn, and status.
         *     
         *     Note that this method will override the existing values for all of the mutable properties that are contained in any parts that the parameter value specifies. If the request body does not specify a value for a mutable property, the existing value for that property will be removed.
         */
        public Requested<LiveStream> put(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            LiveStream body,
            String onBehalfOfContentOwner,
            String onBehalfOfContentOwnerChannel,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/liveStreams"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel))+(part==null?"":"&part="+flatten(part)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPut(url, null, content, LiveStream.class);
        }

        /**
         * 
         * <p>
         * Deletes a video stream.
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
         *     The id parameter specifies the YouTube live stream ID for the resource that is being deleted.
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
         */
        public void delete(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String id,
            String onBehalfOfContentOwner,
            String onBehalfOfContentOwnerChannel) {
            String url = ("https://www.googleapis.com/youtube/v3/liveStreams"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel)));
            requestDel(url, null, Void.class);
        }
    }

    public class Members {

        /**
         * 
         * <p>
         * Lists members for a channel.
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
         * @param hasAccessToLevel
         *     The hasAccessToLevel parameter specifies, when set, the ID of a pricing level that members from the results set should have access to. When not set, all members will be considered, regardless of their active pricing level.
         * @param maxResults
         *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
         * @param mode
         *     The mode parameter specifies which channel members to return.
         * @param pageToken
         *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
         * @param part
         *     The part parameter specifies the member resource parts that the API response will include. Supported values are id and snippet.
         */
        public Requested<MemberListResponse> get(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String hasAccessToLevel,
            Long maxResults,
            www.googleapis.com.structures.mode mode,
            String pageToken,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/members"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(hasAccessToLevel==null?"":"&hasAccessToLevel="+flatten(hasAccessToLevel))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(mode==null?"":"&mode="+flatten(mode))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part)));
            return requestGet(url, null, MemberListResponse.class);
        }
    }

    public class Membershipslevels {

        /**
         * 
         * <p>
         * Lists pricing levels for a channel.
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
         * @param part
         *     The part parameter specifies the membershipsLevel resource parts that the API response will include. Supported values are id and snippet.
         */
        public Requested<MembershipsLevelListResponse> get(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/membershipsLevels"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(part==null?"":"&part="+flatten(part)));
            return requestGet(url, null, MembershipsLevelListResponse.class);
        }
    }

    public class Playlistitems {

        /**
         * 
         * <p>
         * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or retrieve one or more playlist items by their unique IDs.
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
         *     The id parameter specifies a comma-separated list of one or more unique playlist item IDs.
         * @param maxResults
         *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
         * @param onBehalfOfContentOwner
         *     Note: This parameter is intended exclusively for YouTube content partners.
         *     
         *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
         * @param pageToken
         *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
         * @param part
         *     The part parameter specifies a comma-separated list of one or more playlistItem resource properties that the API response will include.
         *     
         *     If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a playlistItem resource, the snippet property contains numerous fields, including the title, description, position, and resourceId properties. As such, if you set part=snippet, the API response will contain all of those properties.
         * @param playlistId
         *     The playlistId parameter specifies the unique ID of the playlist for which you want to retrieve playlist items. Note that even though this is an optional parameter, every request to retrieve playlist items must specify a value for either the id parameter or the playlistId parameter.
         * @param videoId
         *     The videoId parameter specifies that the request should return only the playlist items that contain the specified video.
         */
        public Requested<PlaylistItemListResponse> get(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String id,
            Long maxResults,
            String onBehalfOfContentOwner,
            String pageToken,
            String part,
            String playlistId,
            String videoId) {
            String url = ("https://www.googleapis.com/youtube/v3/playlistItems"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part))+(playlistId==null?"":"&playlistId="+flatten(playlistId))+(videoId==null?"":"&videoId="+flatten(videoId)));
            return requestGet(url, null, PlaylistItemListResponse.class);
        }

        /**
         * 
         * <p>
         * Adds a resource to a playlist.
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
         */
        public Requested<PlaylistItem> post(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            PlaylistItem body,
            String onBehalfOfContentOwner,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/playlistItems"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(part==null?"":"&part="+flatten(part)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPost(url, null, content, PlaylistItem.class);
        }

        /**
         * 
         * <p>
         * Modifies a playlist item. For example, you could update the item's position in the playlist.
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
         *     Note that this method will override the existing values for all of the mutable properties that are contained in any parts that the parameter value specifies. For example, a playlist item can specify a start time and end time, which identify the times portion of the video that should play when users watch the video in the playlist. If your request is updating a playlist item that sets these values, and the request's part parameter value includes the contentDetails part, the playlist item's start and end times will be updated to whatever value the request body specifies. If the request body does not specify values, the existing start and end times will be removed and replaced with the default settings.
         */
        public Requested<PlaylistItem> put(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            PlaylistItem body,
            String onBehalfOfContentOwner,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/playlistItems"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(part==null?"":"&part="+flatten(part)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPut(url, null, content, PlaylistItem.class);
        }

        /**
         * 
         * <p>
         * Deletes a playlist item.
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
         *     The id parameter specifies the YouTube playlist item ID for the playlist item that is being deleted. In a playlistItem resource, the id property specifies the playlist item's ID.
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
            String url = ("https://www.googleapis.com/youtube/v3/playlistItems"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner)));
            requestDel(url, null, Void.class);
        }
    }

    public class Playlists {

        /**
         * 
         * <p>
         * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
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
         *     This value indicates that the API should only return the specified channel's playlists.
         * @param hl
         *     The hl parameter should be used for filter out the properties that are not in the given language. Used for the snippet part.
         * @param id
         *     The id parameter specifies a comma-separated list of the YouTube playlist ID(s) for the resource(s) that are being retrieved. In a playlist resource, the id property specifies the playlist's YouTube playlist ID.
         * @param maxResults
         *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
         * @param mine
         *     Set this parameter's value to true to instruct the API to only return playlists owned by the authenticated user.
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
         * @param pageToken
         *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
         * @param part
         *     The part parameter specifies a comma-separated list of one or more playlist resource properties that the API response will include.
         *     
         *     If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a playlist resource, the snippet property contains properties like author, title, description, tags, and timeCreated. As such, if you set part=snippet, the API response will contain all of those properties.
         */
        public Requested<PlaylistListResponse> get(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String channelId,
            String hl,
            String id,
            Long maxResults,
            Boolean mine,
            String onBehalfOfContentOwner,
            String onBehalfOfContentOwnerChannel,
            String pageToken,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/playlists"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(channelId==null?"":"&channelId="+flatten(channelId))+(hl==null?"":"&hl="+flatten(hl))+(id==null?"":"&id="+flatten(id))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(mine==null?"":"&mine="+flatten(mine))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part)));
            return requestGet(url, null, PlaylistListResponse.class);
        }

        /**
         * 
         * <p>
         * Creates a playlist.
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
         */
        public Requested<Playlist> post(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            Playlist body,
            String onBehalfOfContentOwner,
            String onBehalfOfContentOwnerChannel,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/playlists"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(onBehalfOfContentOwnerChannel==null?"":"&onBehalfOfContentOwnerChannel="+flatten(onBehalfOfContentOwnerChannel))+(part==null?"":"&part="+flatten(part)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPost(url, null, content, Playlist.class);
        }

        /**
         * 
         * <p>
         * Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
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
         *     Note that this method will override the existing values for mutable properties that are contained in any parts that the request body specifies. For example, a playlist's description is contained in the snippet part, which must be included in the request body. If the request does not specify a value for the snippet.description property, the playlist's existing description will be deleted.
         */
        public Requested<Playlist> put(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            Playlist body,
            String onBehalfOfContentOwner,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/playlists"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(part==null?"":"&part="+flatten(part)));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPut(url, null, content, Playlist.class);
        }

        /**
         * 
         * <p>
         * Deletes a playlist.
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
         *     The id parameter specifies the YouTube playlist ID for the playlist that is being deleted. In a playlist resource, the id property specifies the playlist's ID.
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
            String url = ("https://www.googleapis.com/youtube/v3/playlists"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner)));
            requestDel(url, null, Void.class);
        }
    }

    public class Search {

        /**
         * 
         * <p>
         * Returns a collection of search results that match the query parameters specified in the API request. By default, a search result set identifies matching video, channel, and playlist resources, but you can also configure queries to only retrieve a specific type of resource.
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
         *     The channelId parameter indicates that the API response should only contain resources created by the channel
         * @param channelType
         *     The channelType parameter lets you restrict a search to a particular type of channel.
         * @param eventType
         *     The eventType parameter restricts a search to broadcast events. If you specify a value for this parameter, you must also set the type parameter's value to video.
         * @param forContentOwner
         *     Note: This parameter is intended exclusively for YouTube content partners.
         *     
         *     The forContentOwner parameter restricts the search to only retrieve resources owned by the content owner specified by the onBehalfOfContentOwner parameter. The user must be authenticated using a CMS account linked to the specified content owner and onBehalfOfContentOwner must be provided.
         * @param forDeveloper
         *     The forDeveloper parameter restricts the search to only retrieve videos uploaded via the developer's application or website. The API server uses the request's authorization credentials to identify the developer. Therefore, a developer can restrict results to videos uploaded through the developer's own app or website but not to videos uploaded through other apps or sites.
         * @param forMine
         *     The forMine parameter restricts the search to only retrieve videos owned by the authenticated user. If you set this parameter to true, then the type parameter's value must also be set to video.
         * @param location
         *     The location parameter, in conjunction with the locationRadius parameter, defines a circular geographic area and also restricts a search to videos that specify, in their metadata, a geographic location that falls within that area. The parameter value is a string that specifies latitude/longitude coordinates e.g. (37.42307,-122.08427).
         *     
         *     
         *     - The location parameter value identifies the point at the center of the area.
         *     - The locationRadius parameter specifies the maximum distance that the location associated with a video can be from that point for the video to still be included in the search results.The API returns an error if your request specifies a value for the location parameter but does not also specify a value for the locationRadius parameter.
         * @param locationRadius
         *     The locationRadius parameter, in conjunction with the location parameter, defines a circular geographic area.
         *     
         *     The parameter value must be a floating point number followed by a measurement unit. Valid measurement units are m, km, ft, and mi. For example, valid parameter values include 1500m, 5km, 10000ft, and 0.75mi. The API does not support locationRadius parameter values larger than 1000 kilometers.
         *     
         *     Note: See the definition of the location parameter for more information.
         * @param maxResults
         *     The maxResults parameter specifies the maximum number of items that should be returned in the result set.
         * @param onBehalfOfContentOwner
         *     Note: This parameter is intended exclusively for YouTube content partners.
         *     
         *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
         * @param order
         *     The order parameter specifies the method that will be used to order resources in the API response.
         * @param pageToken
         *     The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
         * @param part
         *     The part parameter specifies a comma-separated list of one or more search resource properties that the API response will include. Set the parameter value to snippet.
         * @param publishedAfter
         *     The publishedAfter parameter indicates that the API response should only contain resources created after the specified time. The value is an RFC 3339 formatted date-time value (1970-01-01T00:00:00Z).
         * @param publishedBefore
         *     The publishedBefore parameter indicates that the API response should only contain resources created before the specified time. The value is an RFC 3339 formatted date-time value (1970-01-01T00:00:00Z).
         * @param q
         *     The q parameter specifies the query term to search for.
         *     
         *     Your request can also use the Boolean NOT (-) and OR (|) operators to exclude videos or to find videos that are associated with one of several search terms. For example, to search for videos matching either "boating" or "sailing", set the q parameter value to boating|sailing. Similarly, to search for videos matching either "boating" or "sailing" but not "fishing", set the q parameter value to boating|sailing -fishing. Note that the pipe character must be URL-escaped when it is sent in your API request. The URL-escaped value for the pipe character is %7C.
         * @param regionCode
         *     The regionCode parameter instructs the API to return search results for the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
         * @param relatedToVideoId
         *     The relatedToVideoId parameter retrieves a list of videos that are related to the video that the parameter value identifies. The parameter value must be set to a YouTube video ID and, if you are using this parameter, the type parameter must be set to video.
         * @param relevanceLanguage
         *     The relevanceLanguage parameter instructs the API to return search results that are most relevant to the specified language. The parameter value is typically an ISO 639-1 two-letter language code. However, you should use the values zh-Hans for simplified Chinese and zh-Hant for traditional Chinese. Please note that results in other languages will still be returned if they are highly relevant to the search query term.
         * @param safeSearch
         *     The safeSearch parameter indicates whether the search results should include restricted content as well as standard content.
         * @param topicId
         *     The topicId parameter indicates that the API response should only contain resources associated with the specified topic. The value identifies a Freebase topic ID.
         * @param type
         *     The type parameter restricts a search query to only retrieve a particular type of resource. The value is a comma-separated list of resource types.
         * @param videoCaption
         *     The videoCaption parameter indicates whether the API should filter video search results based on whether they have captions. If you specify a value for this parameter, you must also set the type parameter's value to video.
         * @param videoCategoryId
         *     The videoCategoryId parameter filters video search results based on their category. If you specify a value for this parameter, you must also set the type parameter's value to video.
         * @param videoDefinition
         *     The videoDefinition parameter lets you restrict a search to only include either high definition (HD) or standard definition (SD) videos. HD videos are available for playback in at least 720p, though higher resolutions, like 1080p, might also be available. If you specify a value for this parameter, you must also set the type parameter's value to video.
         * @param videoDimension
         *     The videoDimension parameter lets you restrict a search to only retrieve 2D or 3D videos. If you specify a value for this parameter, you must also set the type parameter's value to video.
         * @param videoDuration
         *     The videoDuration parameter filters video search results based on their duration. If you specify a value for this parameter, you must also set the type parameter's value to video.
         * @param videoEmbeddable
         *     The videoEmbeddable parameter lets you to restrict a search to only videos that can be embedded into a webpage. If you specify a value for this parameter, you must also set the type parameter's value to video.
         * @param videoLicense
         *     The videoLicense parameter filters search results to only include videos with a particular license. YouTube lets video uploaders choose to attach either the Creative Commons license or the standard YouTube license to each of their videos. If you specify a value for this parameter, you must also set the type parameter's value to video.
         * @param videoSyndicated
         *     The videoSyndicated parameter lets you to restrict a search to only videos that can be played outside youtube.com. If you specify a value for this parameter, you must also set the type parameter's value to video.
         * @param videoType
         *     The videoType parameter lets you restrict a search to a particular type of videos. If you specify a value for this parameter, you must also set the type parameter's value to video.
         */
        public Requested<SearchListResponse> get(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String channelId,
            www.googleapis.com.structures.channelType channelType,
            www.googleapis.com.structures.eventType eventType,
            Boolean forContentOwner,
            Boolean forDeveloper,
            Boolean forMine,
            String location,
            String locationRadius,
            Long maxResults,
            String onBehalfOfContentOwner,
            www.googleapis.com.structures.order order,
            String pageToken,
            String part,
            String publishedAfter,
            String publishedBefore,
            String q,
            String regionCode,
            String relatedToVideoId,
            String relevanceLanguage,
            www.googleapis.com.structures.safeSearch safeSearch,
            String topicId,
            String type,
            www.googleapis.com.structures.videoCaption videoCaption,
            String videoCategoryId,
            www.googleapis.com.structures.videoDefinition videoDefinition,
            www.googleapis.com.structures.videoDimension videoDimension,
            www.googleapis.com.structures.videoDuration videoDuration,
            www.googleapis.com.structures.videoEmbeddable videoEmbeddable,
            www.googleapis.com.structures.videoLicense videoLicense,
            www.googleapis.com.structures.videoSyndicated videoSyndicated,
            www.googleapis.com.structures.videoType videoType) {
            String url = ("https://www.googleapis.com/youtube/v3/search"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(channelId==null?"":"&channelId="+flatten(channelId))+(channelType==null?"":"&channelType="+flatten(channelType))+(eventType==null?"":"&eventType="+flatten(eventType))+(forContentOwner==null?"":"&forContentOwner="+flatten(forContentOwner))+(forDeveloper==null?"":"&forDeveloper="+flatten(forDeveloper))+(forMine==null?"":"&forMine="+flatten(forMine))+(location==null?"":"&location="+flatten(location))+(locationRadius==null?"":"&locationRadius="+flatten(locationRadius))+(maxResults==null?"":"&maxResults="+flatten(maxResults))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(order==null?"":"&order="+flatten(order))+(pageToken==null?"":"&pageToken="+flatten(pageToken))+(part==null?"":"&part="+flatten(part))+(publishedAfter==null?"":"&publishedAfter="+flatten(publishedAfter))+(publishedBefore==null?"":"&publishedBefore="+flatten(publishedBefore))+(q==null?"":"&q="+flatten(q))+(regionCode==null?"":"&regionCode="+flatten(regionCode))+(relatedToVideoId==null?"":"&relatedToVideoId="+flatten(relatedToVideoId))+(relevanceLanguage==null?"":"&relevanceLanguage="+flatten(relevanceLanguage))+(safeSearch==null?"":"&safeSearch="+flatten(safeSearch))+(topicId==null?"":"&topicId="+flatten(topicId))+(type==null?"":"&type="+flatten(type))+(videoCaption==null?"":"&videoCaption="+flatten(videoCaption))+(videoCategoryId==null?"":"&videoCategoryId="+flatten(videoCategoryId))+(videoDefinition==null?"":"&videoDefinition="+flatten(videoDefinition))+(videoDimension==null?"":"&videoDimension="+flatten(videoDimension))+(videoDuration==null?"":"&videoDuration="+flatten(videoDuration))+(videoEmbeddable==null?"":"&videoEmbeddable="+flatten(videoEmbeddable))+(videoLicense==null?"":"&videoLicense="+flatten(videoLicense))+(videoSyndicated==null?"":"&videoSyndicated="+flatten(videoSyndicated))+(videoType==null?"":"&videoType="+flatten(videoType)));
            return requestGet(url, null, SearchListResponse.class);
        }
    }

    public class Sponsors {

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

    public class Subscriptions {

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

    public class Superchatevents {

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

    public class Thumbnails {
        public final Oauth2c.Thumbnails.Set set = new Oauth2c.Thumbnails.Set();

        public class Set {

            /**
             * 
             * <p>
             * Uploads a custom video thumbnail to YouTube and sets it for a video.
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
             * @param onBehalfOfContentOwner
             *     Note: This parameter is intended exclusively for YouTube content partners.
             *     
             *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
             * @param videoId
             *     The videoId parameter specifies a YouTube video ID for which the custom video thumbnail is being provided.
             */
            public Requested<ThumbnailSetResponse> post(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                String onBehalfOfContentOwner,
                String videoId) {
                String url = ("https://www.googleapis.com/youtube/v3/thumbnails/set"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner))+(videoId==null?"":"&videoId="+flatten(videoId)));
                return requestPost(url, null, null, ThumbnailSetResponse.class);
            }
        }
    }

    public class Videoabusereportreasons {

        /**
         * 
         * <p>
         * Returns a list of abuse reasons that can be used for reporting abusive videos.
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
         *     The part parameter specifies the videoCategory resource parts that the API response will include. Supported values are id and snippet.
         */
        public Requested<VideoAbuseReportReasonListResponse> get(www.googleapis.com.structures.alt alt,
            String fields,
            String key,
            String oauth_token,
            Boolean prettyPrint,
            String quotaUser,
            String userIp,
            String hl,
            String part) {
            String url = ("https://www.googleapis.com/youtube/v3/videoAbuseReportReasons"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(hl==null?"":"&hl="+flatten(hl))+(part==null?"":"&part="+flatten(part)));
            return requestGet(url, null, VideoAbuseReportReasonListResponse.class);
        }
    }

    public class Videocategories {

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

    public class Videos {
        public final Oauth2c.Videos.Getrating getrating = new Oauth2c.Videos.Getrating();
        public final Oauth2c.Videos.Rate rate = new Oauth2c.Videos.Rate();
        public final Oauth2c.Videos.Reportabuse reportabuse = new Oauth2c.Videos.Reportabuse();

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
            content.put("body", body);
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

        public class Getrating {

            /**
             * 
             * <p>
             * Retrieves the ratings that the authorized user gave to a list of specified videos.
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
             *     The id parameter specifies a comma-separated list of the YouTube video ID(s) for the resource(s) for which you are retrieving rating data. In a video resource, the id property specifies the video's ID.
             * @param onBehalfOfContentOwner
             *     Note: This parameter is intended exclusively for YouTube content partners.
             *     
             *     The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
             */
            public Requested<VideoGetRatingResponse> get(www.googleapis.com.structures.alt alt,
                String fields,
                String key,
                String oauth_token,
                Boolean prettyPrint,
                String quotaUser,
                String userIp,
                String id,
                String onBehalfOfContentOwner) {
                String url = ("https://www.googleapis.com/youtube/v3/videos/getRating"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(id==null?"":"&id="+flatten(id))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner)));
                return requestGet(url, null, VideoGetRatingResponse.class);
            }
        }

        public class Rate {

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

        public class Reportabuse {

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
    }

    public class Watermarks {
        public final Oauth2c.Watermarks.Set set = new Oauth2c.Watermarks.Set();
        public final Oauth2c.Watermarks.Unset unset = new Oauth2c.Watermarks.Unset();

        public class Set {

            /**
             * 
             * <p>
             * Uploads a watermark image to YouTube and sets it for a channel.
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
             * @param channelId
             *     The channelId parameter specifies the YouTube channel ID for which the watermark is being provided.
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
                InvideoBranding body,
                String channelId,
                String onBehalfOfContentOwner) {
                String url = ("https://www.googleapis.com/youtube/v3/watermarks/set"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(channelId==null?"":"&channelId="+flatten(channelId))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner)));
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                requestPost(url, null, content, Void.class);
            }
        }

        public class Unset {

            /**
             * 
             * <p>
             * Deletes a channel's watermark image.
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
             *     The channelId parameter specifies the YouTube channel ID for which the watermark is being unset.
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
                String channelId,
                String onBehalfOfContentOwner) {
                String url = ("https://www.googleapis.com/youtube/v3/watermarks/unset"+"?"+(alt==null?"":"&alt="+flatten(alt))+(fields==null?"":"&fields="+flatten(fields))+(key==null?"":"&key="+flatten(key))+(oauth_token==null?"":"&oauth_token="+flatten(oauth_token))+(prettyPrint==null?"":"&prettyPrint="+flatten(prettyPrint))+(quotaUser==null?"":"&quotaUser="+flatten(quotaUser))+(userIp==null?"":"&userIp="+flatten(userIp))+(channelId==null?"":"&channelId="+flatten(channelId))+(onBehalfOfContentOwner==null?"":"&onBehalfOfContentOwner="+flatten(onBehalfOfContentOwner)));
                requestPost(url, null, null, Void.class);
            }
        }
    }
}
