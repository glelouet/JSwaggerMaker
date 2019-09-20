package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum tfmt {
    @JsonProperty("sbv")
    sbv("sbv"),
    @JsonProperty("scc")
    scc("scc"),
    @JsonProperty("srt")
    srt("srt"),
    @JsonProperty("ttml")
    ttml("ttml"),
    @JsonProperty("vtt")
    vtt("vtt");
    public final String toString;

    tfmt(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
