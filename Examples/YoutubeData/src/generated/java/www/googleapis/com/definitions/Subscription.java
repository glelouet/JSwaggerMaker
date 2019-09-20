package www.googleapis.com.definitions;

public class Subscription {
    /**
     * The contentDetails object contains basic statistics about the subscription.
     */
    public SubscriptionContentDetails contentDetails;
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * The ID that YouTube uses to uniquely identify the subscription.
     */
    public String id;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#subscription".
     */
    public String kind;
    /**
     * The snippet object contains basic details about the subscription, including its title and the channel that the user subscribed to.
     */
    public SubscriptionSnippet snippet;
    /**
     * The subscriberSnippet object contains basic details about the sbuscriber.
     */
    public SubscriptionSubscriberSnippet subscriberSnippet;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Subscription othersame = ((Subscription) other);
        if ((contentDetails!= othersame.contentDetails)&&((contentDetails == null)||(!contentDetails.equals(othersame.contentDetails)))) {
            return false;
        }
        if ((etag!= othersame.etag)&&((etag == null)||(!etag.equals(othersame.etag)))) {
            return false;
        }
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if ((kind!= othersame.kind)&&((kind == null)||(!kind.equals(othersame.kind)))) {
            return false;
        }
        if ((snippet!= othersame.snippet)&&((snippet == null)||(!snippet.equals(othersame.snippet)))) {
            return false;
        }
        if ((subscriberSnippet!= othersame.subscriberSnippet)&&((subscriberSnippet == null)||(!subscriberSnippet.equals(othersame.subscriberSnippet)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((contentDetails == null)? 0 :contentDetails.hashCode())+((etag == null)? 0 :etag.hashCode()))+((id == null)? 0 :id.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((snippet == null)? 0 :snippet.hashCode()))+((subscriberSnippet == null)? 0 :subscriberSnippet.hashCode()));
    }
}
