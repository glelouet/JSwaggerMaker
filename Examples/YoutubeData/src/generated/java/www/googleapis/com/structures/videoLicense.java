package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum videoLicense {
    @JsonProperty("any")
    any("any"),
    @JsonProperty("creativeCommon")
    creativeCommon("creativeCommon"),
    @JsonProperty("youtube")
    youtube("youtube");
    public final String toString;

    videoLicense(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
