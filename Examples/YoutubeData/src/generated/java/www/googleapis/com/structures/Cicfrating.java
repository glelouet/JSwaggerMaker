package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Cicfrating {
    @JsonProperty("cicfE")
    cicfE("cicfE"),
    @JsonProperty("cicfKntEna")
    cicfKntEna("cicfKntEna"),
    @JsonProperty("cicfKtEa")
    cicfKtEa("cicfKtEa"),
    @JsonProperty("cicfUnrated")
    cicfUnrated("cicfUnrated");
    public final String toString;

    Cicfrating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
