package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RejectionReason {
    @JsonProperty("claim")
    claim("claim"),
    @JsonProperty("copyright")
    copyright("copyright"),
    @JsonProperty("duplicate")
    duplicate("duplicate"),
    @JsonProperty("inappropriate")
    inappropriate("inappropriate"),
    @JsonProperty("legal")
    legal("legal"),
    @JsonProperty("length")
    length("length"),
    @JsonProperty("termsOfUse")
    termsOfUse("termsOfUse"),
    @JsonProperty("trademark")
    trademark("trademark"),
    @JsonProperty("uploaderAccountClosed")
    uploaderAccountClosed("uploaderAccountClosed"),
    @JsonProperty("uploaderAccountSuspended")
    uploaderAccountSuspended("uploaderAccountSuspended");
    public final String toString;

    RejectionReason(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
