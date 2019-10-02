package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FmocRating {
    @JsonProperty("fmoc10")
    fmoc10("fmoc10"),
    @JsonProperty("fmoc12")
    fmoc12("fmoc12"),
    @JsonProperty("fmoc16")
    fmoc16("fmoc16"),
    @JsonProperty("fmoc18")
    fmoc18("fmoc18"),
    @JsonProperty("fmocE")
    fmocE("fmocE"),
    @JsonProperty("fmocU")
    fmocU("fmocU"),
    @JsonProperty("fmocUnrated")
    fmocUnrated("fmocUnrated");
    public final String toString;

    FmocRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
