package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum tag_style {
    @JsonProperty("simple")
    simple("simple"),
    @JsonProperty("bullet")
    bullet("bullet"),
    @JsonProperty("box")
    box("box");
    public final String toString;

    tag_style(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
