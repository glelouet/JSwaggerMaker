package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum NbcplRating {
    @JsonProperty("nbcpl18plus")
    nbcpl18plus("nbcpl18plus"),
    @JsonProperty("nbcplI")
    nbcplI("nbcplI"),
    @JsonProperty("nbcplIi")
    nbcplIi("nbcplIi"),
    @JsonProperty("nbcplIii")
    nbcplIii("nbcplIii"),
    @JsonProperty("nbcplIv")
    nbcplIv("nbcplIv"),
    @JsonProperty("nbcplUnrated")
    nbcplUnrated("nbcplUnrated");
    public final String toString;

    NbcplRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
