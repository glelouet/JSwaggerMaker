package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TVPGRATING {
    @JsonProperty("pg14")
    pg14("pg14"),
    @JsonProperty("tvpgG")
    tvpgG("tvpgG"),
    @JsonProperty("tvpgMa")
    tvpgMa("tvpgMa"),
    @JsonProperty("tvpgPg")
    tvpgPg("tvpgPg"),
    @JsonProperty("tvpgUnrated")
    tvpgUnrated("tvpgUnrated"),
    @JsonProperty("tvpgY")
    tvpgY("tvpgY"),
    @JsonProperty("tvpgY7")
    tvpgY7("tvpgY7"),
    @JsonProperty("tvpgY7Fv")
    tvpgY7Fv("tvpgY7Fv");
    public final String toString;

    TVPGRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
