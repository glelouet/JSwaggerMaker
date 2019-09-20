package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum NFVCBRATING {
    @JsonProperty("nfvcb12")
    nfvcb12("nfvcb12"),
    @JsonProperty("nfvcb12a")
    nfvcb12a("nfvcb12a"),
    @JsonProperty("nfvcb15")
    nfvcb15("nfvcb15"),
    @JsonProperty("nfvcb18")
    nfvcb18("nfvcb18"),
    @JsonProperty("nfvcbG")
    nfvcbG("nfvcbG"),
    @JsonProperty("nfvcbPg")
    nfvcbPg("nfvcbPg"),
    @JsonProperty("nfvcbRe")
    nfvcbRe("nfvcbRe"),
    @JsonProperty("nfvcbUnrated")
    nfvcbUnrated("nfvcbUnrated");
    public final String toString;

    NFVCBRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
