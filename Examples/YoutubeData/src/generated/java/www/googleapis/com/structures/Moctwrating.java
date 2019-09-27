package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Moctwrating {
    @JsonProperty("moctwG")
    moctwG("moctwG"),
    @JsonProperty("moctwP")
    moctwP("moctwP"),
    @JsonProperty("moctwPg")
    moctwPg("moctwPg"),
    @JsonProperty("moctwR")
    moctwR("moctwR"),
    @JsonProperty("moctwR12")
    moctwR12("moctwR12"),
    @JsonProperty("moctwR15")
    moctwR15("moctwR15"),
    @JsonProperty("moctwUnrated")
    moctwUnrated("moctwUnrated");
    public final String toString;

    Moctwrating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
