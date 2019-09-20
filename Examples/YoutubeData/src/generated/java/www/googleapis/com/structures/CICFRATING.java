package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CICFRATING {
    @JsonProperty("cicfE")
    cicfE("cicfE"),
    @JsonProperty("cicfKntEna")
    cicfKntEna("cicfKntEna"),
    @JsonProperty("cicfKtEa")
    cicfKtEa("cicfKtEa"),
    @JsonProperty("cicfUnrated")
    cicfUnrated("cicfUnrated");
    public final String toString;

    CICFRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
