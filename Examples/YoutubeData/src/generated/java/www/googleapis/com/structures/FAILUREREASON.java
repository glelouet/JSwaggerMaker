package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FAILUREREASON {
    @JsonProperty("processingFailed")
    processingFailed("processingFailed"),
    @JsonProperty("unknownFormat")
    unknownFormat("unknownFormat"),
    @JsonProperty("unsupportedFormat")
    unsupportedFormat("unsupportedFormat");
    public final String toString;

    FAILUREREASON(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
