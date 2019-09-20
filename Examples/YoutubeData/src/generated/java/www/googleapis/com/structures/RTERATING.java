package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RTERATING {
    @JsonProperty("rteCh")
    rteCh("rteCh"),
    @JsonProperty("rteGa")
    rteGa("rteGa"),
    @JsonProperty("rteMa")
    rteMa("rteMa"),
    @JsonProperty("rtePs")
    rtePs("rtePs"),
    @JsonProperty("rteUnrated")
    rteUnrated("rteUnrated");
    public final String toString;

    RTERATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
