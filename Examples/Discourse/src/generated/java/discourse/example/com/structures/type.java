package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum type {
    @JsonProperty("avatar")
    avatar("avatar"),
    @JsonProperty("profile_background")
    profile_background("profile_background"),
    @JsonProperty("card_background")
    card_background("card_background"),
    @JsonProperty("custom_emoji")
    custom_emoji("custom_emoji"),
    @JsonProperty("composer")
    composer("composer");
    public final String toString;

    type(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
