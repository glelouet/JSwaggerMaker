package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Catvrating {
    @JsonProperty("catv14plus")
    catv14plus("catv14plus"),
    @JsonProperty("catv18plus")
    catv18plus("catv18plus"),
    @JsonProperty("catvC")
    catvC("catvC"),
    @JsonProperty("catvC8")
    catvC8("catvC8"),
    @JsonProperty("catvG")
    catvG("catvG"),
    @JsonProperty("catvPg")
    catvPg("catvPg"),
    @JsonProperty("catvUnrated")
    catvUnrated("catvUnrated");
    public final String toString;

    Catvrating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
