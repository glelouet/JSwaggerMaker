package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BMUKKRATING {
    @JsonProperty("bmukk10")
    bmukk10("bmukk10"),
    @JsonProperty("bmukk12")
    bmukk12("bmukk12"),
    @JsonProperty("bmukk14")
    bmukk14("bmukk14"),
    @JsonProperty("bmukk16")
    bmukk16("bmukk16"),
    @JsonProperty("bmukk6")
    bmukk6("bmukk6"),
    @JsonProperty("bmukk8")
    bmukk8("bmukk8"),
    @JsonProperty("bmukkAa")
    bmukkAa("bmukkAa"),
    @JsonProperty("bmukkUnrated")
    bmukkUnrated("bmukkUnrated");
    public final String toString;

    BMUKKRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
