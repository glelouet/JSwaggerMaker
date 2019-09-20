package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FSKRATING {
    @JsonProperty("fsk0")
    fsk0("fsk0"),
    @JsonProperty("fsk12")
    fsk12("fsk12"),
    @JsonProperty("fsk16")
    fsk16("fsk16"),
    @JsonProperty("fsk18")
    fsk18("fsk18"),
    @JsonProperty("fsk6")
    fsk6("fsk6"),
    @JsonProperty("fskUnrated")
    fskUnrated("fskUnrated");
    public final String toString;

    FSKRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
