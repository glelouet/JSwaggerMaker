package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AudioTrackType {
    @JsonProperty("commentary")
    commentary("commentary"),
    @JsonProperty("descriptive")
    descriptive("descriptive"),
    @JsonProperty("primary")
    primary("primary"),
    @JsonProperty("unknown")
    unknown("unknown");
    public final String toString;

    AudioTrackType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
