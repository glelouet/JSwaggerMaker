package www.googleapis.com.oauth2c.channelbanners;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import www.googleapis.com.Oauth2c;
import www.googleapis.com.definitions.ChannelBannerResource;

public class Insert
    extends DelegateTransfer<Oauth2c>
{

    public Insert(Oauth2c delegate) {
        super(delegate);
    }

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
