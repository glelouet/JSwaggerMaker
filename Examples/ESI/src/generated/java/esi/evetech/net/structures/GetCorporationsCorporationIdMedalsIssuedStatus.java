package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCorporationsCorporationIdMedalsIssuedStatus {
    @JsonProperty("private")
    private_("private"),
    @JsonProperty("public")
    public_("public");
    public final String toString;

    GetCorporationsCorporationIdMedalsIssuedStatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
