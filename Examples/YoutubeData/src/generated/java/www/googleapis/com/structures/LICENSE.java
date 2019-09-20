package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum LICENSE {
    @JsonProperty("creativeCommon")
    creativeCommon("creativeCommon"),
    @JsonProperty("youtube")
    youtube("youtube");
    public final String toString;

    LICENSE(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
