package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum EirinRating {
    @JsonProperty("eirinG")
    eirinG("eirinG"),
    @JsonProperty("eirinPg12")
    eirinPg12("eirinPg12"),
    @JsonProperty("eirinR15plus")
    eirinR15plus("eirinR15plus"),
    @JsonProperty("eirinR18plus")
    eirinR18plus("eirinR18plus"),
    @JsonProperty("eirinUnrated")
    eirinUnrated("eirinUnrated");
    public final String toString;

    EirinRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
