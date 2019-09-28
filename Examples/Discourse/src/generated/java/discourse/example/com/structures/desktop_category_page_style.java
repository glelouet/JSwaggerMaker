package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum desktop_category_page_style {
    @JsonProperty("categories_only")
    categories_only("categories_only"),
    @JsonProperty("categories_with_featured_topics")
    categories_with_featured_topics("categories_with_featured_topics"),
    @JsonProperty("categories_and_latest_topics")
    categories_and_latest_topics("categories_and_latest_topics");
    public final String toString;

    desktop_category_page_style(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
