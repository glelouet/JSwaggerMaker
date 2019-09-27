package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Closedcaptionstype {
    @JsonProperty("closedCaptionsDisabled")
    closedCaptionsDisabled("closedCaptionsDisabled"),
    @JsonProperty("closedCaptionsEmbedded")
    closedCaptionsEmbedded("closedCaptionsEmbedded"),
    @JsonProperty("closedCaptionsHttpPost")
    closedCaptionsHttpPost("closedCaptionsHttpPost");
    public final String toString;

    Closedcaptionstype(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
