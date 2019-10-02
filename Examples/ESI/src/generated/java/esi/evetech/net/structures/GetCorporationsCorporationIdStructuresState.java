package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCorporationsCorporationIdStructuresState {
    @JsonProperty("anchor_vulnerable")
    anchor_vulnerable("anchor_vulnerable"),
    @JsonProperty("anchoring")
    anchoring("anchoring"),
    @JsonProperty("armor_reinforce")
    armor_reinforce("armor_reinforce"),
    @JsonProperty("armor_vulnerable")
    armor_vulnerable("armor_vulnerable"),
    @JsonProperty("deploy_vulnerable")
    deploy_vulnerable("deploy_vulnerable"),
    @JsonProperty("fitting_invulnerable")
    fitting_invulnerable("fitting_invulnerable"),
    @JsonProperty("hull_reinforce")
    hull_reinforce("hull_reinforce"),
    @JsonProperty("hull_vulnerable")
    hull_vulnerable("hull_vulnerable"),
    @JsonProperty("online_deprecated")
    online_deprecated("online_deprecated"),
    @JsonProperty("onlining_vulnerable")
    onlining_vulnerable("onlining_vulnerable"),
    @JsonProperty("shield_vulnerable")
    shield_vulnerable("shield_vulnerable"),
    @JsonProperty("unanchored")
    unanchored("unanchored"),
    @JsonProperty("unknown")
    unknown("unknown");
    public final String toString;

    GetCorporationsCorporationIdStructuresState(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
