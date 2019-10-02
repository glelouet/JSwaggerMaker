package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SkfilmRating {
    @JsonProperty("skfilmG")
    skfilmG("skfilmG"),
    @JsonProperty("skfilmP2")
    skfilmP2("skfilmP2"),
    @JsonProperty("skfilmP5")
    skfilmP5("skfilmP5"),
    @JsonProperty("skfilmP8")
    skfilmP8("skfilmP8"),
    @JsonProperty("skfilmUnrated")
    skfilmUnrated("skfilmUnrated");
    public final String toString;

    SkfilmRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
