package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PROCESSINGFAILUREREASON {
    @JsonProperty("other")
    other("other"),
    @JsonProperty("streamingFailed")
    streamingFailed("streamingFailed"),
    @JsonProperty("transcodeFailed")
    transcodeFailed("transcodeFailed"),
    @JsonProperty("uploadFailed")
    uploadFailed("uploadFailed");
    public final String toString;

    PROCESSINGFAILUREREASON(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
