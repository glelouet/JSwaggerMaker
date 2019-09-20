package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PEFILMRATING {
    @JsonProperty("pefilm14")
    pefilm14("pefilm14"),
    @JsonProperty("pefilm18")
    pefilm18("pefilm18"),
    @JsonProperty("pefilmPg")
    pefilmPg("pefilmPg"),
    @JsonProperty("pefilmPt")
    pefilmPt("pefilmPt"),
    @JsonProperty("pefilmUnrated")
    pefilmUnrated("pefilmUnrated");
    public final String toString;

    PEFILMRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
