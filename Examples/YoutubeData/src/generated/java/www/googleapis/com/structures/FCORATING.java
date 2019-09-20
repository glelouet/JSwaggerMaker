package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FCORATING {
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

    FCORATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
