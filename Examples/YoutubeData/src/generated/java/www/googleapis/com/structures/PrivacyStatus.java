package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PrivacyStatus {
    @JsonProperty("private")
    private_("private"),
    @JsonProperty("public")
    public_("public"),
    @JsonProperty("unlisted")
    unlisted("unlisted");
    public final String toString;

    PrivacyStatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
