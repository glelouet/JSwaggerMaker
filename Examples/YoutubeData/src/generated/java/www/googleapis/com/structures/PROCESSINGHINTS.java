package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PROCESSINGHINTS {
    @JsonProperty("hdrVideo")
    hdrVideo("hdrVideo"),
    @JsonProperty("nonStreamableMov")
    nonStreamableMov("nonStreamableMov"),
    @JsonProperty("sendBestQualityVideo")
    sendBestQualityVideo("sendBestQualityVideo"),
    @JsonProperty("spatialAudio")
    spatialAudio("spatialAudio"),
    @JsonProperty("sphericalVideo")
    sphericalVideo("sphericalVideo"),
    @JsonProperty("vrVideo")
    vrVideo("vrVideo");
    public final String toString;

    PROCESSINGHINTS(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
