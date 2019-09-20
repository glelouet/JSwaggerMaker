package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AUDIOTRACKTYPE {
    @JsonProperty("commentary")
    commentary("commentary"),
    @JsonProperty("descriptive")
    descriptive("descriptive"),
    @JsonProperty("primary")
    primary("primary"),
    @JsonProperty("unknown")
    unknown("unknown");
    public final String toString;

    AUDIOTRACKTYPE(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
