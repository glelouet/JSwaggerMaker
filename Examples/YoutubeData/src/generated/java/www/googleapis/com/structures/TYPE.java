package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TYPE {
    @JsonProperty("facebook")
    facebook("facebook"),
    @JsonProperty("googlePlus")
    googlePlus("googlePlus"),
    @JsonProperty("twitter")
    twitter("twitter"),
    @JsonProperty("unspecified")
    unspecified("unspecified");
    public final String toString;

    TYPE(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
