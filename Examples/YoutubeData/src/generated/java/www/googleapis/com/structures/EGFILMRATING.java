package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum EGFILMRATING {
    @JsonProperty("egfilm18")
    egfilm18("egfilm18"),
    @JsonProperty("egfilmBn")
    egfilmBn("egfilmBn"),
    @JsonProperty("egfilmGn")
    egfilmGn("egfilmGn"),
    @JsonProperty("egfilmUnrated")
    egfilmUnrated("egfilmUnrated");
    public final String toString;

    EGFILMRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
