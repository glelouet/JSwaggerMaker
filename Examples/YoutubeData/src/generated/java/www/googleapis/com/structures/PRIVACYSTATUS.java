package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PRIVACYSTATUS {
    @JsonProperty("private")
    _private("private"),
    @JsonProperty("public")
    _public("public"),
    @JsonProperty("unlisted")
    unlisted("unlisted");
    public final String toString;

    PRIVACYSTATUS(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
