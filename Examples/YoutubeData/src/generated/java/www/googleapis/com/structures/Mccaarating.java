package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Mccaarating {
    @JsonProperty("mccaa12")
    mccaa12("mccaa12"),
    @JsonProperty("mccaa12a")
    mccaa12a("mccaa12a"),
    @JsonProperty("mccaa14")
    mccaa14("mccaa14"),
    @JsonProperty("mccaa15")
    mccaa15("mccaa15"),
    @JsonProperty("mccaa16")
    mccaa16("mccaa16"),
    @JsonProperty("mccaa18")
    mccaa18("mccaa18"),
    @JsonProperty("mccaaPg")
    mccaaPg("mccaaPg"),
    @JsonProperty("mccaaU")
    mccaaU("mccaaU"),
    @JsonProperty("mccaaUnrated")
    mccaaUnrated("mccaaUnrated");
    public final String toString;

    Mccaarating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
