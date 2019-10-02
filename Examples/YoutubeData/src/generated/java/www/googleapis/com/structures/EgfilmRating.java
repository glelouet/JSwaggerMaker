package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum EgfilmRating {
    @JsonProperty("egfilm18")
    egfilm18("egfilm18"),
    @JsonProperty("egfilmBn")
    egfilmBn("egfilmBn"),
    @JsonProperty("egfilmGn")
    egfilmGn("egfilmGn"),
    @JsonProperty("egfilmUnrated")
    egfilmUnrated("egfilmUnrated");
    public final String toString;

    EgfilmRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
