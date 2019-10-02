package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BbfcRating {
    @JsonProperty("bbfc12")
    bbfc12("bbfc12"),
    @JsonProperty("bbfc12a")
    bbfc12a("bbfc12a"),
    @JsonProperty("bbfc15")
    bbfc15("bbfc15"),
    @JsonProperty("bbfc18")
    bbfc18("bbfc18"),
    @JsonProperty("bbfcPg")
    bbfcPg("bbfcPg"),
    @JsonProperty("bbfcR18")
    bbfcR18("bbfcR18"),
    @JsonProperty("bbfcU")
    bbfcU("bbfcU"),
    @JsonProperty("bbfcUnrated")
    bbfcUnrated("bbfcUnrated");
    public final String toString;

    BbfcRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
