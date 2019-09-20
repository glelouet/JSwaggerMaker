package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RECORDINGSTATUS {
    @JsonProperty("notRecording")
    notRecording("notRecording"),
    @JsonProperty("recorded")
    recorded("recorded"),
    @JsonProperty("recording")
    recording("recording");
    public final String toString;

    RECORDINGSTATUS(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
