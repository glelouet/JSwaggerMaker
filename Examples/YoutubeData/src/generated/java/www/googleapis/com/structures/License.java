package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum License {
    @JsonProperty("creativeCommon")
    creativeCommon("creativeCommon"),
    @JsonProperty("youtube")
    youtube("youtube");
    public final String toString;

    License(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
