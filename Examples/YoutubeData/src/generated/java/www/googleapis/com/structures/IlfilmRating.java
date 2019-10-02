package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum IlfilmRating {
    @JsonProperty("ilfilm12")
    ilfilm12("ilfilm12"),
    @JsonProperty("ilfilm14")
    ilfilm14("ilfilm14"),
    @JsonProperty("ilfilm16")
    ilfilm16("ilfilm16"),
    @JsonProperty("ilfilm18")
    ilfilm18("ilfilm18"),
    @JsonProperty("ilfilmAa")
    ilfilmAa("ilfilmAa"),
    @JsonProperty("ilfilmUnrated")
    ilfilmUnrated("ilfilmUnrated");
    public final String toString;

    IlfilmRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
