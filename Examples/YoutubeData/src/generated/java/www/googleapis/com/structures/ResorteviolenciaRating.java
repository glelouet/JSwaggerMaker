package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ResorteviolenciaRating {
    @JsonProperty("resorteviolenciaA")
    resorteviolenciaA("resorteviolenciaA"),
    @JsonProperty("resorteviolenciaB")
    resorteviolenciaB("resorteviolenciaB"),
    @JsonProperty("resorteviolenciaC")
    resorteviolenciaC("resorteviolenciaC"),
    @JsonProperty("resorteviolenciaD")
    resorteviolenciaD("resorteviolenciaD"),
    @JsonProperty("resorteviolenciaE")
    resorteviolenciaE("resorteviolenciaE"),
    @JsonProperty("resorteviolenciaUnrated")
    resorteviolenciaUnrated("resorteviolenciaUnrated");
    public final String toString;

    ResorteviolenciaRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
