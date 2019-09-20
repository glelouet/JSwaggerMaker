package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CTATYPE {
    @JsonProperty("unspecified")
    unspecified("unspecified"),
    @JsonProperty("visitAdvertiserSite")
    visitAdvertiserSite("visitAdvertiserSite");
    public final String toString;

    CTATYPE(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
