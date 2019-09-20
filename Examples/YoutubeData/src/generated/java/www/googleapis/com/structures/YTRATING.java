package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum YTRATING {
    @JsonProperty("ytAgeRestricted")
    ytAgeRestricted("ytAgeRestricted");
    public final String toString;

    YTRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
