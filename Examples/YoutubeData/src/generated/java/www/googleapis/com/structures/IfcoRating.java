package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum IfcoRating {
    @JsonProperty("ifco12")
    ifco12("ifco12"),
    @JsonProperty("ifco12a")
    ifco12a("ifco12a"),
    @JsonProperty("ifco15")
    ifco15("ifco15"),
    @JsonProperty("ifco15a")
    ifco15a("ifco15a"),
    @JsonProperty("ifco16")
    ifco16("ifco16"),
    @JsonProperty("ifco18")
    ifco18("ifco18"),
    @JsonProperty("ifcoG")
    ifcoG("ifcoG"),
    @JsonProperty("ifcoPg")
    ifcoPg("ifcoPg"),
    @JsonProperty("ifcoUnrated")
    ifcoUnrated("ifcoUnrated");
    public final String toString;

    IfcoRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
