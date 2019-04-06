package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum language {
    @JsonProperty("de")
    de("de"),
    @JsonProperty("en-us")
    en_us("en-us"),
    @JsonProperty("fr")
    fr("fr"),
    @JsonProperty("ja")
    ja("ja"),
    @JsonProperty("ru")
    ru("ru"),
    @JsonProperty("zh")
    zh("zh");
    public final String toString;

    language(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
