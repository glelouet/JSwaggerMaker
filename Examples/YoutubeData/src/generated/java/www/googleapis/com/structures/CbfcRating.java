package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CbfcRating {
    @JsonProperty("cbfcA")
    cbfcA("cbfcA"),
    @JsonProperty("cbfcS")
    cbfcS("cbfcS"),
    @JsonProperty("cbfcU")
    cbfcU("cbfcU"),
    @JsonProperty("cbfcUA")
    cbfcUA("cbfcUA"),
    @JsonProperty("cbfcUnrated")
    cbfcUnrated("cbfcUnrated");
    public final String toString;

    CbfcRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
