package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdPlanetsPlanetType {
    @JsonProperty("temperate")
    temperate("temperate"),
    @JsonProperty("barren")
    barren("barren"),
    @JsonProperty("oceanic")
    oceanic("oceanic"),
    @JsonProperty("ice")
    ice("ice"),
    @JsonProperty("gas")
    gas("gas"),
    @JsonProperty("lava")
    lava("lava"),
    @JsonProperty("storm")
    storm("storm"),
    @JsonProperty("plasma")
    plasma("plasma");
    public final String toString;

    GetCharactersCharacterIdPlanetsPlanetType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
