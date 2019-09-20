package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum OFLCRATING {
    @JsonProperty("oflcG")
    oflcG("oflcG"),
    @JsonProperty("oflcM")
    oflcM("oflcM"),
    @JsonProperty("oflcPg")
    oflcPg("oflcPg"),
    @JsonProperty("oflcR13")
    oflcR13("oflcR13"),
    @JsonProperty("oflcR15")
    oflcR15("oflcR15"),
    @JsonProperty("oflcR16")
    oflcR16("oflcR16"),
    @JsonProperty("oflcR18")
    oflcR18("oflcR18"),
    @JsonProperty("oflcRp13")
    oflcRp13("oflcRp13"),
    @JsonProperty("oflcRp16")
    oflcRp16("oflcRp16"),
    @JsonProperty("oflcRp18")
    oflcRp18("oflcRp18"),
    @JsonProperty("oflcUnrated")
    oflcUnrated("oflcUnrated");
    public final String toString;

    OFLCRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
