package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PROCESSINGERRORS {
    @JsonProperty("archiveFile")
    archiveFile("archiveFile"),
    @JsonProperty("audioFile")
    audioFile("audioFile"),
    @JsonProperty("docFile")
    docFile("docFile"),
    @JsonProperty("imageFile")
    imageFile("imageFile"),
    @JsonProperty("notAVideoFile")
    notAVideoFile("notAVideoFile"),
    @JsonProperty("projectFile")
    projectFile("projectFile"),
    @JsonProperty("unsupportedSpatialAudioLayout")
    unsupportedSpatialAudioLayout("unsupportedSpatialAudioLayout");
    public final String toString;

    PROCESSINGERRORS(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
