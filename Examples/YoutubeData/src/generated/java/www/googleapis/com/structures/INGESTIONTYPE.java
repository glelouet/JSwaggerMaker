package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum INGESTIONTYPE {
    @JsonProperty("dash")
    dash("dash"),
    @JsonProperty("hls")
    hls("hls"),
    @JsonProperty("rtmp")
    rtmp("rtmp"),
    @JsonProperty("webrtc")
    webrtc("webrtc");
    public final String toString;

    INGESTIONTYPE(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
