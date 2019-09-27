package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Ctatype {
    @JsonProperty("unspecified")
    unspecified("unspecified"),
    @JsonProperty("visitAdvertiserSite")
    visitAdvertiserSite("visitAdvertiserSite");
    public final String toString;

    Ctatype(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
