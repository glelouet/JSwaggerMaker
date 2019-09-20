package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum DJCTQRATING {
    @JsonProperty("djctq10")
    djctq10("djctq10"),
    @JsonProperty("djctq1012")
    djctq1012("djctq1012"),
    @JsonProperty("djctq1014")
    djctq1014("djctq1014"),
    @JsonProperty("djctq1016")
    djctq1016("djctq1016"),
    @JsonProperty("djctq1018")
    djctq1018("djctq1018"),
    @JsonProperty("djctq12")
    djctq12("djctq12"),
    @JsonProperty("djctq1214")
    djctq1214("djctq1214"),
    @JsonProperty("djctq1216")
    djctq1216("djctq1216"),
    @JsonProperty("djctq1218")
    djctq1218("djctq1218"),
    @JsonProperty("djctq14")
    djctq14("djctq14"),
    @JsonProperty("djctq1416")
    djctq1416("djctq1416"),
    @JsonProperty("djctq1418")
    djctq1418("djctq1418"),
    @JsonProperty("djctq16")
    djctq16("djctq16"),
    @JsonProperty("djctq1618")
    djctq1618("djctq1618"),
    @JsonProperty("djctq18")
    djctq18("djctq18"),
    @JsonProperty("djctqEr")
    djctqEr("djctqEr"),
    @JsonProperty("djctqL")
    djctqL("djctqL"),
    @JsonProperty("djctqL10")
    djctqL10("djctqL10"),
    @JsonProperty("djctqL12")
    djctqL12("djctqL12"),
    @JsonProperty("djctqL14")
    djctqL14("djctqL14"),
    @JsonProperty("djctqL16")
    djctqL16("djctqL16"),
    @JsonProperty("djctqL18")
    djctqL18("djctqL18"),
    @JsonProperty("djctqUnrated")
    djctqUnrated("djctqUnrated");
    public final String toString;

    DJCTQRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
