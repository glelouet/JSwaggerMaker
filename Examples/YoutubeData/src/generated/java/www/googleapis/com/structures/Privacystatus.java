package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Privacystatus {
    @JsonProperty("private")
    _private("private"),
    @JsonProperty("public")
    _public("public"),
    @JsonProperty("unlisted")
    unlisted("unlisted");
    public final String toString;

    Privacystatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
