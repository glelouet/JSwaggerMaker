package www.googleapis.com.oauth2c.comments;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import www.googleapis.com.Oauth2c;

public class Setmoderationstatus
    extends DelegateTransfer<Oauth2c>
{

    public Setmoderationstatus(Oauth2c delegate) {
        super(delegate);
    }

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
