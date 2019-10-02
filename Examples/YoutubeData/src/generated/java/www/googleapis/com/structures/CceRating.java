package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CceRating {
    @JsonProperty("cceM12")
    cceM12("cceM12"),
    @JsonProperty("cceM14")
    cceM14("cceM14"),
    @JsonProperty("cceM16")
    cceM16("cceM16"),
    @JsonProperty("cceM18")
    cceM18("cceM18"),
    @JsonProperty("cceM4")
    cceM4("cceM4"),
    @JsonProperty("cceM6")
    cceM6("cceM6"),
    @JsonProperty("cceUnrated")
    cceUnrated("cceUnrated");
    public final String toString;

    CceRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
