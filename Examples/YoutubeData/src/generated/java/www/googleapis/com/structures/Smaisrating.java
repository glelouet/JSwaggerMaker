package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Smaisrating {
    @JsonProperty("smais12")
    smais12("smais12"),
    @JsonProperty("smais14")
    smais14("smais14"),
    @JsonProperty("smais16")
    smais16("smais16"),
    @JsonProperty("smais18")
    smais18("smais18"),
    @JsonProperty("smais7")
    smais7("smais7"),
    @JsonProperty("smaisL")
    smaisL("smaisL"),
    @JsonProperty("smaisUnrated")
    smaisUnrated("smaisUnrated");
    public final String toString;

    Smaisrating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
