package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum filter {
    @JsonProperty("all")
    all("all"),
    @JsonProperty("newest")
    newest("newest");
    public final String toString;

    filter(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
