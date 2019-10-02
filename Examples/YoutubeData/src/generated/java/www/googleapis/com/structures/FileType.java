package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FileType {
    @JsonProperty("archive")
    archive("archive"),
    @JsonProperty("audio")
    audio("audio"),
    @JsonProperty("document")
    document("document"),
    @JsonProperty("image")
    image("image"),
    @JsonProperty("other")
    other("other"),
    @JsonProperty("project")
    project("project"),
    @JsonProperty("video")
    video("video");
    public final String toString;

    FileType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
