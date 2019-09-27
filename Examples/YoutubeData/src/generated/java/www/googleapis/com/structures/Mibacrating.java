package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Mibacrating {
    @JsonProperty("mibacT")
    mibacT("mibacT"),
    @JsonProperty("mibacUnrated")
    mibacUnrated("mibacUnrated"),
    @JsonProperty("mibacVap")
    mibacVap("mibacVap"),
    @JsonProperty("mibacVm12")
    mibacVm12("mibacVm12"),
    @JsonProperty("mibacVm14")
    mibacVm14("mibacVm14"),
    @JsonProperty("mibacVm18")
    mibacVm18("mibacVm18");
    public final String toString;

    Mibacrating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
