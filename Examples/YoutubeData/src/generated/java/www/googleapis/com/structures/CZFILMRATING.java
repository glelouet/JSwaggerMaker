package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CZFILMRATING {
    @JsonProperty("czfilm12")
    czfilm12("czfilm12"),
    @JsonProperty("czfilm14")
    czfilm14("czfilm14"),
    @JsonProperty("czfilm18")
    czfilm18("czfilm18"),
    @JsonProperty("czfilmU")
    czfilmU("czfilmU"),
    @JsonProperty("czfilmUnrated")
    czfilmUnrated("czfilmUnrated");
    public final String toString;

    CZFILMRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
