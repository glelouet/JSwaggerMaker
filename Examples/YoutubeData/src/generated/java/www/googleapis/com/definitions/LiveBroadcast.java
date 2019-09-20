package www.googleapis.com.definitions;

public class LiveBroadcast {
    /**
     * The contentDetails object contains information about the event's video content, such as whether the content can be shown in an embedded video player or if it will be archived and therefore available for viewing after the event has concluded.
     */
    public LiveBroadcastContentDetails contentDetails;
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * The ID that YouTube assigns to uniquely identify the broadcast.
     */
    public String id;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#liveBroadcast".
     */
    public String kind;
    /**
     * The snippet object contains basic details about the event, including its title, description, start time, and end time.
     */
    public LiveBroadcastSnippet snippet;
    /**
     * The statistics object contains info about the event's current stats. These include concurrent viewers and total chat count. Statistics can change (in either direction) during the lifetime of an event. Statistics are only returned while the event is live.
     */
    public LiveBroadcastStatistics statistics;
    /**
     * The status object contains information about the event's status.
     */
    public LiveBroadcastStatus status;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveBroadcast othersame = ((LiveBroadcast) other);
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
        if ((statistics!= othersame.statistics)&&((statistics == null)||(!statistics.equals(othersame.statistics)))) {
            return false;
        }
        if ((status!= othersame.status)&&((status == null)||(!status.equals(othersame.status)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((contentDetails == null)? 0 :contentDetails.hashCode())+((etag == null)? 0 :etag.hashCode()))+((id == null)? 0 :id.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((snippet == null)? 0 :snippet.hashCode()))+((statistics == null)? 0 :statistics.hashCode()))+((status == null)? 0 :status.hashCode()));
    }
}
