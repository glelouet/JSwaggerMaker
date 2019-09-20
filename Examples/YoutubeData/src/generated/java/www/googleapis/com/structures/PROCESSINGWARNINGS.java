package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PROCESSINGWARNINGS {
    @JsonProperty("hasEditlist")
    hasEditlist("hasEditlist"),
    @JsonProperty("inconsistentResolution")
    inconsistentResolution("inconsistentResolution"),
    @JsonProperty("problematicAudioCodec")
    problematicAudioCodec("problematicAudioCodec"),
    @JsonProperty("problematicHdrLookupTable")
    problematicHdrLookupTable("problematicHdrLookupTable"),
    @JsonProperty("problematicVideoCodec")
    problematicVideoCodec("problematicVideoCodec"),
    @JsonProperty("unknownAudioCodec")
    unknownAudioCodec("unknownAudioCodec"),
    @JsonProperty("unknownContainer")
    unknownContainer("unknownContainer"),
    @JsonProperty("unknownVideoCodec")
    unknownVideoCodec("unknownVideoCodec"),
    @JsonProperty("unsupportedHdrColorMetadata")
    unsupportedHdrColorMetadata("unsupportedHdrColorMetadata"),
    @JsonProperty("unsupportedHdrPixelFormat")
    unsupportedHdrPixelFormat("unsupportedHdrPixelFormat"),
    @JsonProperty("unsupportedSphericalProjectionType")
    unsupportedSphericalProjectionType("unsupportedSphericalProjectionType"),
    @JsonProperty("unsupportedVrStereoMode")
    unsupportedVrStereoMode("unsupportedVrStereoMode");
    public final String toString;

    PROCESSINGWARNINGS(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
