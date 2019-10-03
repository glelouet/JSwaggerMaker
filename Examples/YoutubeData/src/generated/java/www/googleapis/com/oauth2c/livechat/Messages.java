package www.googleapis.com.oauth2c.livechat;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import www.googleapis.com.Oauth2c;
import www.googleapis.com.definitions.LiveChatMessage;
import www.googleapis.com.definitions.LiveChatMessageListResponse;

public class Messages
    extends DelegateTransfer<Oauth2c>
{

    public Messages(Oauth2c delegate) {
        super(delegate);
    }

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
