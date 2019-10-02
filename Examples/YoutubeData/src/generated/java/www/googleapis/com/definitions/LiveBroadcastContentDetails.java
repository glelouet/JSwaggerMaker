package www.googleapis.com.definitions;

import www.googleapis.com.structures.ClosedCaptionsType;
import www.googleapis.com.structures.LatencyPreference;
import www.googleapis.com.structures.Projection;
import www.googleapis.com.structures.StereoLayout;

public class LiveBroadcastContentDetails {
    /**
     * This value uniquely identifies the live stream bound to the broadcast.
     */
    public String boundStreamId;
    /**
     * The date and time that the live stream referenced by boundStreamId was last updated.
     */
    public String boundStreamLastUpdateTimeMs;
    public ClosedCaptionsType closedCaptionsType;
    /**
     * This setting indicates whether auto start is enabled for this broadcast.
     */
    public boolean enableAutoStart;
    /**
     * This setting indicates whether HTTP POST closed captioning is enabled for this broadcast. The ingestion URL of the closed captions is returned through the liveStreams API. This is mutually exclusive with using the closed_captions_type property, and is equivalent to setting closed_captions_type to CLOSED_CAPTIONS_HTTP_POST.
     */
    public boolean enableClosedCaptions;
    /**
     * This setting indicates whether YouTube should enable content encryption for the broadcast.
     */
    public boolean enableContentEncryption;
    /**
     * This setting determines whether viewers can access DVR controls while watching the video. DVR controls enable the viewer to control the video playback experience by pausing, rewinding, or fast forwarding content. The default value for this property is true.
     * 
     * 
     * 
     * Important: You must set the value to true and also set the enableArchive property's value to true if you want to make playback available immediately after the broadcast ends.
     */
    public boolean enableDvr;
    /**
     * This setting indicates whether the broadcast video can be played in an embedded player. If you choose to archive the video (using the enableArchive property), this setting will also apply to the archived video.
     */
    public boolean enableEmbed;
    /**
     * Indicates whether this broadcast has low latency enabled.
     */
    public boolean enableLowLatency;
    /**
     * If both this and enable_low_latency are set, they must match. LATENCY_NORMAL should match enable_low_latency=false LATENCY_LOW should match enable_low_latency=true LATENCY_ULTRA_LOW should have enable_low_latency omitted.
     */
    public LatencyPreference latencyPreference;
    public String mesh;
    /**
     * The monitorStream object contains information about the monitor stream, which the broadcaster can use to review the event content before the broadcast stream is shown publicly.
     */
    public MonitorStreamInfo monitorStream;
    /**
     * The projection format of this broadcast. This defaults to rectangular.
     */
    public Projection projection;
    /**
     * Automatically start recording after the event goes live. The default value for this property is true.
     * 
     * 
     * 
     * Important: You must also set the enableDvr property's value to true if you want the playback to be available immediately after the broadcast ends. If you set this property's value to true but do not also set the enableDvr property to true, there may be a delay of around one day before the archived video will be available for playback.
     */
    public boolean recordFromStart;
    /**
     * This setting indicates whether the broadcast should automatically begin with an in-stream slate when you update the broadcast's status to live. After updating the status, you then need to send a liveCuepoints.insert request that sets the cuepoint's eventState to end to remove the in-stream slate and make your broadcast stream visible to viewers.
     */
    public boolean startWithSlate;
    public StereoLayout stereoLayout;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveBroadcastContentDetails othersame = ((LiveBroadcastContentDetails) other);
        if ((boundStreamId!= othersame.boundStreamId)&&((boundStreamId == null)||(!boundStreamId.equals(othersame.boundStreamId)))) {
            return false;
        }
        if ((boundStreamLastUpdateTimeMs!= othersame.boundStreamLastUpdateTimeMs)&&((boundStreamLastUpdateTimeMs == null)||(!boundStreamLastUpdateTimeMs.equals(othersame.boundStreamLastUpdateTimeMs)))) {
            return false;
        }
        if ((closedCaptionsType!= othersame.closedCaptionsType)&&((closedCaptionsType == null)||(!closedCaptionsType.equals(othersame.closedCaptionsType)))) {
            return false;
        }
        if (enableAutoStart!= othersame.enableAutoStart) {
            return false;
        }
        if (enableClosedCaptions!= othersame.enableClosedCaptions) {
            return false;
        }
        if (enableContentEncryption!= othersame.enableContentEncryption) {
            return false;
        }
        if (enableDvr!= othersame.enableDvr) {
            return false;
        }
        if (enableEmbed!= othersame.enableEmbed) {
            return false;
        }
        if (enableLowLatency!= othersame.enableLowLatency) {
            return false;
        }
        if ((latencyPreference!= othersame.latencyPreference)&&((latencyPreference == null)||(!latencyPreference.equals(othersame.latencyPreference)))) {
            return false;
        }
        if ((mesh!= othersame.mesh)&&((mesh == null)||(!mesh.equals(othersame.mesh)))) {
            return false;
        }
        if ((monitorStream!= othersame.monitorStream)&&((monitorStream == null)||(!monitorStream.equals(othersame.monitorStream)))) {
            return false;
        }
        if ((projection!= othersame.projection)&&((projection == null)||(!projection.equals(othersame.projection)))) {
            return false;
        }
        if (recordFromStart!= othersame.recordFromStart) {
            return false;
        }
        if (startWithSlate!= othersame.startWithSlate) {
            return false;
        }
        if ((stereoLayout!= othersame.stereoLayout)&&((stereoLayout == null)||(!stereoLayout.equals(othersame.stereoLayout)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((boundStreamId == null)? 0 :boundStreamId.hashCode())+((boundStreamLastUpdateTimeMs == null)? 0 :boundStreamLastUpdateTimeMs.hashCode()))+((closedCaptionsType == null)? 0 :closedCaptionsType.hashCode()))+ Boolean.hashCode(enableAutoStart))+ Boolean.hashCode(enableClosedCaptions))+ Boolean.hashCode(enableContentEncryption))+ Boolean.hashCode(enableDvr))+ Boolean.hashCode(enableEmbed))+ Boolean.hashCode(enableLowLatency))+((latencyPreference == null)? 0 :latencyPreference.hashCode()))+((mesh == null)? 0 :mesh.hashCode()))+((monitorStream == null)? 0 :monitorStream.hashCode()))+((projection == null)? 0 :projection.hashCode()))+ Boolean.hashCode(recordFromStart))+ Boolean.hashCode(startWithSlate))+((stereoLayout == null)? 0 :stereoLayout.hashCode()));
    }
}
