package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PROJECTION {
    @JsonProperty("360")
    _360("360"),
    @JsonProperty("mesh")
    mesh("mesh"),
    @JsonProperty("rectangular")
    rectangular("rectangular");
    public final String toString;

    PROJECTION(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
