package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum chart {
    @JsonProperty("mostPopular")
    mostPopular("mostPopular");
    public final String toString;

    chart(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
