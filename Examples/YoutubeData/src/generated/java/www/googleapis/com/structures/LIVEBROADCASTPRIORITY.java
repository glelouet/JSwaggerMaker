package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum LIVEBROADCASTPRIORITY {
    @JsonProperty("high")
    high("high"),
    @JsonProperty("low")
    low("low"),
    @JsonProperty("normal")
    normal("normal");
    public final String toString;

    LIVEBROADCASTPRIORITY(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
