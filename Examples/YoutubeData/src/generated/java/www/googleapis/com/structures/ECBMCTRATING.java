package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ECBMCTRATING {
    @JsonProperty("ecbmct13a")
    ecbmct13a("ecbmct13a"),
    @JsonProperty("ecbmct13plus")
    ecbmct13plus("ecbmct13plus"),
    @JsonProperty("ecbmct15a")
    ecbmct15a("ecbmct15a"),
    @JsonProperty("ecbmct15plus")
    ecbmct15plus("ecbmct15plus"),
    @JsonProperty("ecbmct18plus")
    ecbmct18plus("ecbmct18plus"),
    @JsonProperty("ecbmct7a")
    ecbmct7a("ecbmct7a"),
    @JsonProperty("ecbmct7plus")
    ecbmct7plus("ecbmct7plus"),
    @JsonProperty("ecbmctG")
    ecbmctG("ecbmctG"),
    @JsonProperty("ecbmctUnrated")
    ecbmctUnrated("ecbmctUnrated");
    public final String toString;

    ECBMCTRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
