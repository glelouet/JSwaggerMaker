package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum KMRBRATING {
    @JsonProperty("kmrb12plus")
    kmrb12plus("kmrb12plus"),
    @JsonProperty("kmrb15plus")
    kmrb15plus("kmrb15plus"),
    @JsonProperty("kmrbAll")
    kmrbAll("kmrbAll"),
    @JsonProperty("kmrbR")
    kmrbR("kmrbR"),
    @JsonProperty("kmrbTeenr")
    kmrbTeenr("kmrbTeenr"),
    @JsonProperty("kmrbUnrated")
    kmrbUnrated("kmrbUnrated");
    public final String toString;

    KMRBRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
