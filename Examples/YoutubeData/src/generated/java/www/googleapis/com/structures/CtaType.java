package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CtaType {
    @JsonProperty("unspecified")
    unspecified("unspecified"),
    @JsonProperty("visitAdvertiserSite")
    visitAdvertiserSite("visitAdvertiserSite");
    public final String toString;

    CtaType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
