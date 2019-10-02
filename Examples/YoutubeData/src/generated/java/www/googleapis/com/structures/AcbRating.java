package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AcbRating {
    @JsonProperty("acbC")
    acbC("acbC"),
    @JsonProperty("acbE")
    acbE("acbE"),
    @JsonProperty("acbG")
    acbG("acbG"),
    @JsonProperty("acbM")
    acbM("acbM"),
    @JsonProperty("acbMa15plus")
    acbMa15plus("acbMa15plus"),
    @JsonProperty("acbP")
    acbP("acbP"),
    @JsonProperty("acbPg")
    acbPg("acbPg"),
    @JsonProperty("acbR18plus")
    acbR18plus("acbR18plus"),
    @JsonProperty("acbUnrated")
    acbUnrated("acbUnrated");
    public final String toString;

    AcbRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
