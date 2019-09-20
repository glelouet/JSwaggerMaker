package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum REASON {
    @JsonProperty("unspecified")
    unspecified("unspecified"),
    @JsonProperty("videoFavorited")
    videoFavorited("videoFavorited"),
    @JsonProperty("videoLiked")
    videoLiked("videoLiked"),
    @JsonProperty("videoWatched")
    videoWatched("videoWatched");
    public final String toString;

    REASON(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
