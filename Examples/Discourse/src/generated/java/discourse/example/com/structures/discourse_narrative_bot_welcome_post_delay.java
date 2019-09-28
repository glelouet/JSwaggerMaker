package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum discourse_narrative_bot_welcome_post_delay {
    @JsonProperty("new_user_track")
    new_user_track("new_user_track"),
    @JsonProperty("welcome_message")
    welcome_message("welcome_message");
    public final String toString;

    discourse_narrative_bot_welcome_post_delay(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
