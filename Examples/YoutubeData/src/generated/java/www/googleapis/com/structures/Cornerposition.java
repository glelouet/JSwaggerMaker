package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Cornerposition {
    @JsonProperty("bottomLeft")
    bottomLeft("bottomLeft"),
    @JsonProperty("bottomRight")
    bottomRight("bottomRight"),
    @JsonProperty("topLeft")
    topLeft("topLeft"),
    @JsonProperty("topRight")
    topRight("topRight");
    public final String toString;

    Cornerposition(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
