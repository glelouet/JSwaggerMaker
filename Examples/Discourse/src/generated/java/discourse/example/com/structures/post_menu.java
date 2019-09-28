package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum post_menu {
    @JsonProperty("like-count")
    like_count("like-count"),
    @JsonProperty("like")
    like("like"),
    @JsonProperty("share")
    share("share"),
    @JsonProperty("flag")
    flag("flag"),
    @JsonProperty("edit")
    edit("edit"),
    @JsonProperty("bookmark")
    bookmark("bookmark"),
    @JsonProperty("delete")
    delete("delete"),
    @JsonProperty("admin")
    admin("admin"),
    @JsonProperty("reply")
    reply("reply");
    public final String toString;

    post_menu(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
