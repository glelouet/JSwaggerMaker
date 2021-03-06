package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ProcessingFailureReason {
    @JsonProperty("other")
    other("other"),
    @JsonProperty("streamingFailed")
    streamingFailed("streamingFailed"),
    @JsonProperty("transcodeFailed")
    transcodeFailed("transcodeFailed"),
    @JsonProperty("uploadFailed")
    uploadFailed("uploadFailed");
    public final String toString;

    ProcessingFailureReason(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
