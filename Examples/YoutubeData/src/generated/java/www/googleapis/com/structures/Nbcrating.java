package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Nbcrating {
    @JsonProperty("nbc12plus")
    nbc12plus("nbc12plus"),
    @JsonProperty("nbc15plus")
    nbc15plus("nbc15plus"),
    @JsonProperty("nbc18plus")
    nbc18plus("nbc18plus"),
    @JsonProperty("nbc18plusr")
    nbc18plusr("nbc18plusr"),
    @JsonProperty("nbcG")
    nbcG("nbcG"),
    @JsonProperty("nbcPg")
    nbcPg("nbcPg"),
    @JsonProperty("nbcPu")
    nbcPu("nbcPu"),
    @JsonProperty("nbcUnrated")
    nbcUnrated("nbcUnrated");
    public final String toString;

    Nbcrating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
