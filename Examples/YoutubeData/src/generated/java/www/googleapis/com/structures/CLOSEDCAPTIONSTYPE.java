package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CLOSEDCAPTIONSTYPE {
    @JsonProperty("closedCaptionsDisabled")
    closedCaptionsDisabled("closedCaptionsDisabled"),
    @JsonProperty("closedCaptionsEmbedded")
    closedCaptionsEmbedded("closedCaptionsEmbedded"),
    @JsonProperty("closedCaptionsHttpPost")
    closedCaptionsHttpPost("closedCaptionsHttpPost");
    public final String toString;

    CLOSEDCAPTIONSTYPE(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
