package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Agcomrating {
    @JsonProperty("agcomT")
    agcomT("agcomT"),
    @JsonProperty("agcomUnrated")
    agcomUnrated("agcomUnrated"),
    @JsonProperty("agcomVm14")
    agcomVm14("agcomVm14"),
    @JsonProperty("agcomVm18")
    agcomVm18("agcomVm18");
    public final String toString;

    Agcomrating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
