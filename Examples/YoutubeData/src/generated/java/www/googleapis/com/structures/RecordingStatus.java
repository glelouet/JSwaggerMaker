package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RecordingStatus {
    @JsonProperty("notRecording")
    notRecording("notRecording"),
    @JsonProperty("recorded")
    recorded("recorded"),
    @JsonProperty("recording")
    recording("recording");
    public final String toString;

    RecordingStatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
