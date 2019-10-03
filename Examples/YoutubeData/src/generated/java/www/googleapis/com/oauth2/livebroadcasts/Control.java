package www.googleapis.com.oauth2.livebroadcasts;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import www.googleapis.com.Oauth2;
import www.googleapis.com.definitions.LiveBroadcast;

public class Control
    extends DelegateTransfer<Oauth2>
{

    public Control(Oauth2 delegate) {
        super(delegate);
    }

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
