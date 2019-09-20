package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum EEFILMRATING {
    @JsonProperty("eefilmK12")
    eefilmK12("eefilmK12"),
    @JsonProperty("eefilmK14")
    eefilmK14("eefilmK14"),
    @JsonProperty("eefilmK16")
    eefilmK16("eefilmK16"),
    @JsonProperty("eefilmK6")
    eefilmK6("eefilmK6"),
    @JsonProperty("eefilmL")
    eefilmL("eefilmL"),
    @JsonProperty("eefilmMs12")
    eefilmMs12("eefilmMs12"),
    @JsonProperty("eefilmMs6")
    eefilmMs6("eefilmMs6"),
    @JsonProperty("eefilmPere")
    eefilmPere("eefilmPere"),
    @JsonProperty("eefilmUnrated")
    eefilmUnrated("eefilmUnrated");
    public final String toString;

    EEFILMRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
