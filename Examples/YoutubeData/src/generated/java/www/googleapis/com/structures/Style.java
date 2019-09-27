package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Style {
    @JsonProperty("channelsectionStyleUndefined")
    channelsectionStyleUndefined("channelsectionStyleUndefined"),
    @JsonProperty("horizontalRow")
    horizontalRow("horizontalRow"),
    @JsonProperty("verticalList")
    verticalList("verticalList");
    public final String toString;

    Style(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
