package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MedietilsynetRating {
    @JsonProperty("medietilsynet11")
    medietilsynet11("medietilsynet11"),
    @JsonProperty("medietilsynet12")
    medietilsynet12("medietilsynet12"),
    @JsonProperty("medietilsynet15")
    medietilsynet15("medietilsynet15"),
    @JsonProperty("medietilsynet18")
    medietilsynet18("medietilsynet18"),
    @JsonProperty("medietilsynet6")
    medietilsynet6("medietilsynet6"),
    @JsonProperty("medietilsynet7")
    medietilsynet7("medietilsynet7"),
    @JsonProperty("medietilsynet9")
    medietilsynet9("medietilsynet9"),
    @JsonProperty("medietilsynetA")
    medietilsynetA("medietilsynetA"),
    @JsonProperty("medietilsynetUnrated")
    medietilsynetUnrated("medietilsynetUnrated");
    public final String toString;

    MedietilsynetRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
