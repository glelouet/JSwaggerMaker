package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdContractsStatus {
    @JsonProperty("outstanding")
    outstanding("outstanding"),
    @JsonProperty("in_progress")
    in_progress("in_progress"),
    @JsonProperty("finished_issuer")
    finished_issuer("finished_issuer"),
    @JsonProperty("finished_contractor")
    finished_contractor("finished_contractor"),
    @JsonProperty("finished")
    finished("finished"),
    @JsonProperty("cancelled")
    cancelled("cancelled"),
    @JsonProperty("rejected")
    rejected("rejected"),
    @JsonProperty("failed")
    failed("failed"),
    @JsonProperty("deleted")
    deleted("deleted"),
    @JsonProperty("reversed")
    reversed("reversed");
    public final String toString;

    GetCharactersCharacterIdContractsStatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
