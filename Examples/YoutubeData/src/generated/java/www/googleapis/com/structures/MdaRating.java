package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MdaRating {
    @JsonProperty("mdaG")
    mdaG("mdaG"),
    @JsonProperty("mdaM18")
    mdaM18("mdaM18"),
    @JsonProperty("mdaNc16")
    mdaNc16("mdaNc16"),
    @JsonProperty("mdaPg")
    mdaPg("mdaPg"),
    @JsonProperty("mdaPg13")
    mdaPg13("mdaPg13"),
    @JsonProperty("mdaR21")
    mdaR21("mdaR21"),
    @JsonProperty("mdaUnrated")
    mdaUnrated("mdaUnrated");
    public final String toString;

    MdaRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
