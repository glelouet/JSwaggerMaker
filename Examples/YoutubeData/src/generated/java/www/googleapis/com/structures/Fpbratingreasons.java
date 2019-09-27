package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Fpbratingreasons {
    @JsonProperty("fpbBlasphemy")
    fpbBlasphemy("fpbBlasphemy"),
    @JsonProperty("fpbCriminalTechniques")
    fpbCriminalTechniques("fpbCriminalTechniques"),
    @JsonProperty("fpbDrugs")
    fpbDrugs("fpbDrugs"),
    @JsonProperty("fpbHorror")
    fpbHorror("fpbHorror"),
    @JsonProperty("fpbImitativeActsTechniques")
    fpbImitativeActsTechniques("fpbImitativeActsTechniques"),
    @JsonProperty("fpbLanguage")
    fpbLanguage("fpbLanguage"),
    @JsonProperty("fpbNudity")
    fpbNudity("fpbNudity"),
    @JsonProperty("fpbPrejudice")
    fpbPrejudice("fpbPrejudice"),
    @JsonProperty("fpbSex")
    fpbSex("fpbSex"),
    @JsonProperty("fpbSexualViolence")
    fpbSexualViolence("fpbSexualViolence"),
    @JsonProperty("fpbViolence")
    fpbViolence("fpbViolence");
    public final String toString;

    Fpbratingreasons(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
