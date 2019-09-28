package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum order {
    @JsonProperty("likes_received")
    likes_received("likes_received"),
    @JsonProperty("likes_given")
    likes_given("likes_given"),
    @JsonProperty("topic_count")
    topic_count("topic_count"),
    @JsonProperty("post_count")
    post_count("post_count"),
    @JsonProperty("topics_entered")
    topics_entered("topics_entered"),
    @JsonProperty("posts_read")
    posts_read("posts_read"),
    @JsonProperty("days_visited")
    days_visited("days_visited");
    public final String toString;

    order(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
