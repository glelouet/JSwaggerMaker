package www.googleapis.com.definitions;

public class LiveChatMessageListResponse {
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * Serialized EventId of the request which produced this response.
     */
    public String eventId;
    /**
     * A list of live chat messages.
     */
    public LiveChatMessage[] items;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#liveChatMessageListResponse".
     */
    public String kind;
    /**
     * The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set.
     */
    public String nextPageToken;
    /**
     * The date and time when the underlying stream went offline. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String offlineAt;
    public PageInfo pageInfo;
    /**
     * The amount of time the client should wait before polling again.
     */
    public long pollingIntervalMillis;
    public TokenPagination tokenPagination;
    /**
     * The visitorId identifies the visitor.
     */
    public String visitorId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveChatMessageListResponse othersame = ((LiveChatMessageListResponse) other);
        if ((etag!= othersame.etag)&&((etag == null)||(!etag.equals(othersame.etag)))) {
            return false;
        }
        if ((eventId!= othersame.eventId)&&((eventId == null)||(!eventId.equals(othersame.eventId)))) {
            return false;
        }
        if ((items!= othersame.items)&&((items == null)||(!items.equals(othersame.items)))) {
            return false;
        }
        if ((kind!= othersame.kind)&&((kind == null)||(!kind.equals(othersame.kind)))) {
            return false;
        }
        if ((nextPageToken!= othersame.nextPageToken)&&((nextPageToken == null)||(!nextPageToken.equals(othersame.nextPageToken)))) {
            return false;
        }
        if ((offlineAt!= othersame.offlineAt)&&((offlineAt == null)||(!offlineAt.equals(othersame.offlineAt)))) {
            return false;
        }
        if ((pageInfo!= othersame.pageInfo)&&((pageInfo == null)||(!pageInfo.equals(othersame.pageInfo)))) {
            return false;
        }
        if (pollingIntervalMillis!= othersame.pollingIntervalMillis) {
            return false;
        }
        if ((tokenPagination!= othersame.tokenPagination)&&((tokenPagination == null)||(!tokenPagination.equals(othersame.tokenPagination)))) {
            return false;
        }
        if ((visitorId!= othersame.visitorId)&&((visitorId == null)||(!visitorId.equals(othersame.visitorId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((etag == null)? 0 :etag.hashCode())+((eventId == null)? 0 :eventId.hashCode()))+((items == null)? 0 :items.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((nextPageToken == null)? 0 :nextPageToken.hashCode()))+((offlineAt == null)? 0 :offlineAt.hashCode()))+((pageInfo == null)? 0 :pageInfo.hashCode()))+ Long.hashCode(pollingIntervalMillis))+((tokenPagination == null)? 0 :tokenPagination.hashCode()))+((visitorId == null)? 0 :visitorId.hashCode()));
    }
}
