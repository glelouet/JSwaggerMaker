package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Broadcasttype {
    @JsonProperty("fludd")
    fludd("fludd"),
    @JsonProperty("fluddArchive")
    fluddArchive("fluddArchive"),
    @JsonProperty("gplusHoa")
    gplusHoa("gplusHoa"),
    @JsonProperty("lcrEncoder")
    lcrEncoder("lcrEncoder"),
    @JsonProperty("mobile")
    mobile("mobile"),
    @JsonProperty("persistent")
    persistent("persistent"),
    @JsonProperty("premiere")
    premiere("premiere"),
    @JsonProperty("unspecified")
    unspecified("unspecified"),
    @JsonProperty("webcam")
    webcam("webcam"),
    @JsonProperty("ytHoa")
    ytHoa("ytHoa");
    public final String toString;

    Broadcasttype(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
