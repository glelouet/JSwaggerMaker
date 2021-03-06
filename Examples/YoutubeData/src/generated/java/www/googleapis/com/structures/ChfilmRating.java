package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ChfilmRating {
    @JsonProperty("chfilm0")
    chfilm0("chfilm0"),
    @JsonProperty("chfilm12")
    chfilm12("chfilm12"),
    @JsonProperty("chfilm16")
    chfilm16("chfilm16"),
    @JsonProperty("chfilm18")
    chfilm18("chfilm18"),
    @JsonProperty("chfilm6")
    chfilm6("chfilm6"),
    @JsonProperty("chfilmUnrated")
    chfilmUnrated("chfilmUnrated");
    public final String toString;

    ChfilmRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
