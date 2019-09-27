package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Djctqratingreasons {
    @JsonProperty("djctqCriminalActs")
    djctqCriminalActs("djctqCriminalActs"),
    @JsonProperty("djctqDrugs")
    djctqDrugs("djctqDrugs"),
    @JsonProperty("djctqExplicitSex")
    djctqExplicitSex("djctqExplicitSex"),
    @JsonProperty("djctqExtremeViolence")
    djctqExtremeViolence("djctqExtremeViolence"),
    @JsonProperty("djctqIllegalDrugs")
    djctqIllegalDrugs("djctqIllegalDrugs"),
    @JsonProperty("djctqImpactingContent")
    djctqImpactingContent("djctqImpactingContent"),
    @JsonProperty("djctqInappropriateLanguage")
    djctqInappropriateLanguage("djctqInappropriateLanguage"),
    @JsonProperty("djctqLegalDrugs")
    djctqLegalDrugs("djctqLegalDrugs"),
    @JsonProperty("djctqNudity")
    djctqNudity("djctqNudity"),
    @JsonProperty("djctqSex")
    djctqSex("djctqSex"),
    @JsonProperty("djctqSexualContent")
    djctqSexualContent("djctqSexualContent"),
    @JsonProperty("djctqViolence")
    djctqViolence("djctqViolence");
    public final String toString;

    Djctqratingreasons(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
