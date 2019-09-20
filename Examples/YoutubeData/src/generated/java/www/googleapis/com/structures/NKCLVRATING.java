package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum NKCLVRATING {
    @JsonProperty("nkclv12plus")
    nkclv12plus("nkclv12plus"),
    @JsonProperty("nkclv16plus")
    nkclv16plus("nkclv16plus"),
    @JsonProperty("nkclv18plus")
    nkclv18plus("nkclv18plus"),
    @JsonProperty("nkclv7plus")
    nkclv7plus("nkclv7plus"),
    @JsonProperty("nkclvU")
    nkclvU("nkclvU"),
    @JsonProperty("nkclvUnrated")
    nkclvUnrated("nkclvUnrated");
    public final String toString;

    NKCLVRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
