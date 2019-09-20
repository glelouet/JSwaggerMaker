package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CSARATING {
    @JsonProperty("csa10")
    csa10("csa10"),
    @JsonProperty("csa12")
    csa12("csa12"),
    @JsonProperty("csa16")
    csa16("csa16"),
    @JsonProperty("csa18")
    csa18("csa18"),
    @JsonProperty("csaInterdiction")
    csaInterdiction("csaInterdiction"),
    @JsonProperty("csaT")
    csaT("csaT"),
    @JsonProperty("csaUnrated")
    csaUnrated("csaUnrated");
    public final String toString;

    CSARATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
