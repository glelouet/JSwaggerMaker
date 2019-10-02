package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdContractsType {
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

    GetCharactersCharacterIdContractsType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
