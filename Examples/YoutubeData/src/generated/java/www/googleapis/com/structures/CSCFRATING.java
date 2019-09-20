package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CSCFRATING {
    @JsonProperty("cscf12")
    cscf12("cscf12"),
    @JsonProperty("cscf16")
    cscf16("cscf16"),
    @JsonProperty("cscf18")
    cscf18("cscf18"),
    @JsonProperty("cscf6")
    cscf6("cscf6"),
    @JsonProperty("cscf9")
    cscf9("cscf9"),
    @JsonProperty("cscfA")
    cscfA("cscfA"),
    @JsonProperty("cscfAl")
    cscfAl("cscfAl"),
    @JsonProperty("cscfUnrated")
    cscfUnrated("cscfUnrated");
    public final String toString;

    CSCFRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
