package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum KfcbRating {
    @JsonProperty("kfcb16plus")
    kfcb16plus("kfcb16plus"),
    @JsonProperty("kfcbG")
    kfcbG("kfcbG"),
    @JsonProperty("kfcbPg")
    kfcbPg("kfcbPg"),
    @JsonProperty("kfcbR")
    kfcbR("kfcbR"),
    @JsonProperty("kfcbUnrated")
    kfcbUnrated("kfcbUnrated");
    public final String toString;

    KfcbRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
