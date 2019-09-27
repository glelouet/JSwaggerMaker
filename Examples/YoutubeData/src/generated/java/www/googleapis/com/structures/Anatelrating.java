package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Anatelrating {
    @JsonProperty("anatelA")
    anatelA("anatelA"),
    @JsonProperty("anatelF")
    anatelF("anatelF"),
    @JsonProperty("anatelI")
    anatelI("anatelI"),
    @JsonProperty("anatelI10")
    anatelI10("anatelI10"),
    @JsonProperty("anatelI12")
    anatelI12("anatelI12"),
    @JsonProperty("anatelI7")
    anatelI7("anatelI7"),
    @JsonProperty("anatelR")
    anatelR("anatelR"),
    @JsonProperty("anatelUnrated")
    anatelUnrated("anatelUnrated");
    public final String toString;

    Anatelrating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
