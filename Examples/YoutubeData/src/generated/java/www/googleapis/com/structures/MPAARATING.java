package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MPAARATING {
    @JsonProperty("mpaaG")
    mpaaG("mpaaG"),
    @JsonProperty("mpaaNc17")
    mpaaNc17("mpaaNc17"),
    @JsonProperty("mpaaPg")
    mpaaPg("mpaaPg"),
    @JsonProperty("mpaaPg13")
    mpaaPg13("mpaaPg13"),
    @JsonProperty("mpaaR")
    mpaaR("mpaaR"),
    @JsonProperty("mpaaUnrated")
    mpaaUnrated("mpaaUnrated"),
    @JsonProperty("mpaaX")
    mpaaX("mpaaX");
    public final String toString;

    MPAARATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
