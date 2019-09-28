package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum category_style {
    @JsonProperty("bar")
    bar("bar"),
    @JsonProperty("box")
    box("box"),
    @JsonProperty("bullet")
    bullet("bullet");
    public final String toString;

    category_style(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
