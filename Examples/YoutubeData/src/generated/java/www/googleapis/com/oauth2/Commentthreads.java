package www.googleapis.com.oauth2;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import www.googleapis.com.Oauth2;
import www.googleapis.com.definitions.CommentThread;
import www.googleapis.com.definitions.CommentThreadListResponse;

public class Commentthreads
    extends DelegateTransfer<Oauth2>
{

    public Commentthreads(Oauth2 delegate) {
        super(delegate);
    }

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
        content.put("body", (body));
        return requestPut(url, null, content, CommentThread.class);
    }
}
