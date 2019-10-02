package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RussiaRating {
    @JsonProperty("russia0")
    russia0("russia0"),
    @JsonProperty("russia12")
    russia12("russia12"),
    @JsonProperty("russia16")
    russia16("russia16"),
    @JsonProperty("russia18")
    russia18("russia18"),
    @JsonProperty("russia6")
    russia6("russia6"),
    @JsonProperty("russiaUnrated")
    russiaUnrated("russiaUnrated");
    public final String toString;

    RussiaRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
