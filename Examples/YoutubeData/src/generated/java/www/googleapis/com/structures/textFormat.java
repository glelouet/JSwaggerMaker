package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum textFormat {
    @JsonProperty("html")
    html("html"),
    @JsonProperty("plainText")
    plainText("plainText");
    public final String toString;

    textFormat(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
