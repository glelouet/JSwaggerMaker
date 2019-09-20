package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ICAARATING {
    @JsonProperty("icaa12")
    icaa12("icaa12"),
    @JsonProperty("icaa13")
    icaa13("icaa13"),
    @JsonProperty("icaa16")
    icaa16("icaa16"),
    @JsonProperty("icaa18")
    icaa18("icaa18"),
    @JsonProperty("icaa7")
    icaa7("icaa7"),
    @JsonProperty("icaaApta")
    icaaApta("icaaApta"),
    @JsonProperty("icaaUnrated")
    icaaUnrated("icaaUnrated"),
    @JsonProperty("icaaX")
    icaaX("icaaX");
    public final String toString;

    ICAARATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
