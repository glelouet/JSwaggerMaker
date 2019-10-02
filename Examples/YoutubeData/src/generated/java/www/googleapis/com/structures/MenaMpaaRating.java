package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MenaMpaaRating {
    @JsonProperty("menaMpaaG")
    menaMpaaG("menaMpaaG"),
    @JsonProperty("menaMpaaPg")
    menaMpaaPg("menaMpaaPg"),
    @JsonProperty("menaMpaaPg13")
    menaMpaaPg13("menaMpaaPg13"),
    @JsonProperty("menaMpaaR")
    menaMpaaR("menaMpaaR"),
    @JsonProperty("menaMpaaUnrated")
    menaMpaaUnrated("menaMpaaUnrated");
    public final String toString;

    MenaMpaaRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
