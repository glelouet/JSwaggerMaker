package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum emoji_set {
    @JsonProperty("apple")
    apple("apple"),
    @JsonProperty("google")
    google("google"),
    @JsonProperty("twitter")
    twitter("twitter"),
    @JsonProperty("emoji_one")
    emoji_one("emoji_one"),
    @JsonProperty("win10")
    win10("win10");
    public final String toString;

    emoji_set(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
