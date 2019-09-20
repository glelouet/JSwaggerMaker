package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RCNOFRATING {
    @JsonProperty("rcnofI")
    rcnofI("rcnofI"),
    @JsonProperty("rcnofIi")
    rcnofIi("rcnofIi"),
    @JsonProperty("rcnofIii")
    rcnofIii("rcnofIii"),
    @JsonProperty("rcnofIv")
    rcnofIv("rcnofIv"),
    @JsonProperty("rcnofUnrated")
    rcnofUnrated("rcnofUnrated"),
    @JsonProperty("rcnofV")
    rcnofV("rcnofV"),
    @JsonProperty("rcnofVi")
    rcnofVi("rcnofVi");
    public final String toString;

    RCNOFRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
