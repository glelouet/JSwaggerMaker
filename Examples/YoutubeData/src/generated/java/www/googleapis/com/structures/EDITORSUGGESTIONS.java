package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum EDITORSUGGESTIONS {
    @JsonProperty("audioQuietAudioSwap")
    audioQuietAudioSwap("audioQuietAudioSwap"),
    @JsonProperty("videoAutoLevels")
    videoAutoLevels("videoAutoLevels"),
    @JsonProperty("videoCrop")
    videoCrop("videoCrop"),
    @JsonProperty("videoStabilize")
    videoStabilize("videoStabilize");
    public final String toString;

    EDITORSUGGESTIONS(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
