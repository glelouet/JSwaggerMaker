package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum archetype {
    @JsonProperty("private_message")
    private_message("private_message");
    public final String toString;

    archetype(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
