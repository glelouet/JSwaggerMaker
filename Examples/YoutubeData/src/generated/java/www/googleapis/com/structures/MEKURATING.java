package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MEKURATING {
    @JsonProperty("meku12")
    meku12("meku12"),
    @JsonProperty("meku16")
    meku16("meku16"),
    @JsonProperty("meku18")
    meku18("meku18"),
    @JsonProperty("meku7")
    meku7("meku7"),
    @JsonProperty("mekuS")
    mekuS("mekuS"),
    @JsonProperty("mekuUnrated")
    mekuUnrated("mekuUnrated");
    public final String toString;

    MEKURATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
