package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GrfilmRating {
    @JsonProperty("grfilmE")
    grfilmE("grfilmE"),
    @JsonProperty("grfilmK")
    grfilmK("grfilmK"),
    @JsonProperty("grfilmK12")
    grfilmK12("grfilmK12"),
    @JsonProperty("grfilmK13")
    grfilmK13("grfilmK13"),
    @JsonProperty("grfilmK15")
    grfilmK15("grfilmK15"),
    @JsonProperty("grfilmK17")
    grfilmK17("grfilmK17"),
    @JsonProperty("grfilmK18")
    grfilmK18("grfilmK18"),
    @JsonProperty("grfilmUnrated")
    grfilmUnrated("grfilmUnrated");
    public final String toString;

    GrfilmRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
