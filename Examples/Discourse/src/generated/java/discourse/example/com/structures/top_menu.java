package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum top_menu {
    @JsonProperty("latest")
    latest("latest"),
    @JsonProperty("new")
    _new("new"),
    @JsonProperty("unread")
    unread("unread"),
    @JsonProperty("top")
    top("top"),
    @JsonProperty("categories")
    categories("categories"),
    @JsonProperty("read")
    read("read"),
    @JsonProperty("posted")
    posted("posted"),
    @JsonProperty("bookmarks")
    bookmarks("bookmarks");
    public final String toString;

    top_menu(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
