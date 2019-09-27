package www.googleapis.com.definitions;

public class MemberListResponse {
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * Serialized EventId of the request which produced this response.
     */
    public String eventId;
    /**
     * A list of members that match the request criteria.
     */
    public Member[] items;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#memberListResponse".
     */
    public String kind;
    /**
     * The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set.
     */
    public String nextPageToken;
    public PageInfo pageInfo;
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
        MemberListResponse othersame = ((MemberListResponse) other);
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
        if ((pageInfo!= othersame.pageInfo)&&((pageInfo == null)||(!pageInfo.equals(othersame.pageInfo)))) {
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
        return (((((((((etag == null)? 0 :etag.hashCode())+((eventId == null)? 0 :eventId.hashCode()))+((items == null)? 0 :items.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((nextPageToken == null)? 0 :nextPageToken.hashCode()))+((pageInfo == null)? 0 :pageInfo.hashCode()))+((tokenPagination == null)? 0 :tokenPagination.hashCode()))+((visitorId == null)? 0 :visitorId.hashCode()));
    }
}
