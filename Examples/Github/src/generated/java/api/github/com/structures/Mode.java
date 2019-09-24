package api.github.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Mode {
    @JsonProperty("100644")
    _100644("100644"),
    @JsonProperty("100755")
    _100755("100755"),
    @JsonProperty("040000")
    _040000("040000"),
    @JsonProperty("160000")
    _160000("160000"),
    @JsonProperty("120000")
    _120000("120000");
    public final String toString;

    Mode(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
