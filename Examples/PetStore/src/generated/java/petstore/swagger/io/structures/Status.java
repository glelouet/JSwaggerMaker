package petstore.swagger.io.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Status {
    @JsonProperty("available")
    available("available"),
    @JsonProperty("pending")
    pending("pending"),
    @JsonProperty("sold")
    sold("sold");
    public final String toString;

    Status(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
