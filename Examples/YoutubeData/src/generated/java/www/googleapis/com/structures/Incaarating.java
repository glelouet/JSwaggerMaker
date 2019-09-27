package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Incaarating {
    @JsonProperty("incaaAtp")
    incaaAtp("incaaAtp"),
    @JsonProperty("incaaC")
    incaaC("incaaC"),
    @JsonProperty("incaaSam13")
    incaaSam13("incaaSam13"),
    @JsonProperty("incaaSam16")
    incaaSam16("incaaSam16"),
    @JsonProperty("incaaSam18")
    incaaSam18("incaaSam18"),
    @JsonProperty("incaaUnrated")
    incaaUnrated("incaaUnrated");
    public final String toString;

    Incaarating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
