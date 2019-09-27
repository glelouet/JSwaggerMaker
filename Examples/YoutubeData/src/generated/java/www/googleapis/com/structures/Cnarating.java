package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Cnarating {
    @JsonProperty("cna12")
    cna12("cna12"),
    @JsonProperty("cna15")
    cna15("cna15"),
    @JsonProperty("cna18")
    cna18("cna18"),
    @JsonProperty("cna18plus")
    cna18plus("cna18plus"),
    @JsonProperty("cnaAp")
    cnaAp("cnaAp"),
    @JsonProperty("cnaUnrated")
    cnaUnrated("cnaUnrated");
    public final String toString;

    Cnarating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
