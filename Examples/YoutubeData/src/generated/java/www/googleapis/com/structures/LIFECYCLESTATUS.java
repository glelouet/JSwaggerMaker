package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum LIFECYCLESTATUS {
    @JsonProperty("complete")
    complete("complete"),
    @JsonProperty("created")
    created("created"),
    @JsonProperty("live")
    live("live"),
    @JsonProperty("liveStarting")
    liveStarting("liveStarting"),
    @JsonProperty("ready")
    ready("ready"),
    @JsonProperty("revoked")
    revoked("revoked"),
    @JsonProperty("testStarting")
    testStarting("testStarting"),
    @JsonProperty("testing")
    testing("testing");
    public final String toString;

    LIFECYCLESTATUS(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
