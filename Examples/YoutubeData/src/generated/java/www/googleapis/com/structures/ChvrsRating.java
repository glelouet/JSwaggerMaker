package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ChvrsRating {
    @JsonProperty("chvrs14a")
    chvrs14a("chvrs14a"),
    @JsonProperty("chvrs18a")
    chvrs18a("chvrs18a"),
    @JsonProperty("chvrsE")
    chvrsE("chvrsE"),
    @JsonProperty("chvrsG")
    chvrsG("chvrsG"),
    @JsonProperty("chvrsPg")
    chvrsPg("chvrsPg"),
    @JsonProperty("chvrsR")
    chvrsR("chvrsR"),
    @JsonProperty("chvrsUnrated")
    chvrsUnrated("chvrsUnrated");
    public final String toString;

    ChvrsRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
