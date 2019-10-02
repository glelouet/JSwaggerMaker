package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FcoRating {
    @JsonProperty("fcoI")
    fcoI("fcoI"),
    @JsonProperty("fcoIi")
    fcoIi("fcoIi"),
    @JsonProperty("fcoIia")
    fcoIia("fcoIia"),
    @JsonProperty("fcoIib")
    fcoIib("fcoIib"),
    @JsonProperty("fcoIii")
    fcoIii("fcoIii"),
    @JsonProperty("fcoUnrated")
    fcoUnrated("fcoUnrated");
    public final String toString;

    FcoRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
