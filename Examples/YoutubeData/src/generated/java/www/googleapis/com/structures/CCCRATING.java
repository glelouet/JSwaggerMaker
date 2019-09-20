package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CCCRATING {
    @JsonProperty("ccc14")
    ccc14("ccc14"),
    @JsonProperty("ccc18")
    ccc18("ccc18"),
    @JsonProperty("ccc18s")
    ccc18s("ccc18s"),
    @JsonProperty("ccc18v")
    ccc18v("ccc18v"),
    @JsonProperty("ccc6")
    ccc6("ccc6"),
    @JsonProperty("cccTe")
    cccTe("cccTe"),
    @JsonProperty("cccUnrated")
    cccUnrated("cccUnrated");
    public final String toString;

    CCCRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
