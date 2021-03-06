package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetContractsPublicRegionIdType {
    @JsonProperty("unknown")
    unknown("unknown"),
    @JsonProperty("item_exchange")
    item_exchange("item_exchange"),
    @JsonProperty("auction")
    auction("auction"),
    @JsonProperty("courier")
    courier("courier"),
    @JsonProperty("loan")
    loan("loan");
    public final String toString;

    GetContractsPublicRegionIdType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
