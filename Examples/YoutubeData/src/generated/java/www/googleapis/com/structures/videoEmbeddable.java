package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum videoEmbeddable {
    @JsonProperty("any")
    any("any"),
    @JsonProperty("true")
    true_("true");
    public final String toString;

    videoEmbeddable(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
