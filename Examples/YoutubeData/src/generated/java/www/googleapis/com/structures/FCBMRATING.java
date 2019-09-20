package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FCBMRATING {
    @JsonProperty("fcbm18")
    fcbm18("fcbm18"),
    @JsonProperty("fcbm18pa")
    fcbm18pa("fcbm18pa"),
    @JsonProperty("fcbm18pl")
    fcbm18pl("fcbm18pl"),
    @JsonProperty("fcbm18sg")
    fcbm18sg("fcbm18sg"),
    @JsonProperty("fcbm18sx")
    fcbm18sx("fcbm18sx"),
    @JsonProperty("fcbmP13")
    fcbmP13("fcbmP13"),
    @JsonProperty("fcbmPg13")
    fcbmPg13("fcbmPg13"),
    @JsonProperty("fcbmU")
    fcbmU("fcbmU"),
    @JsonProperty("fcbmUnrated")
    fcbmUnrated("fcbmUnrated");
    public final String toString;

    FCBMRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
