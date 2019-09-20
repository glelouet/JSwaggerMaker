package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum rating {
    @JsonProperty("dislike")
    dislike("dislike"),
    @JsonProperty("like")
    like("like"),
    @JsonProperty("none")
    none("none");
    public final String toString;

    rating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
