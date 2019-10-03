package www.googleapis.com.oauth2;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import www.googleapis.com.Oauth2;
import www.googleapis.com.definitions.Caption;
import www.googleapis.com.definitions.CaptionListResponse;

public class Captions
    extends DelegateTransfer<Oauth2>
{

    public Captions(Oauth2 delegate) {
        super(delegate);
    }

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
        content.put("body", (body));
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
