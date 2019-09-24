package api.github.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum archive_format {
    @JsonProperty("tarball")
    tarball("tarball"),
    @JsonProperty("zipball")
    zipball("zipball");
    public final String toString;

    archive_format(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
