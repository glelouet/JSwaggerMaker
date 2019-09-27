package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Cncrating {
    @JsonProperty("cnc10")
    cnc10("cnc10"),
    @JsonProperty("cnc12")
    cnc12("cnc12"),
    @JsonProperty("cnc16")
    cnc16("cnc16"),
    @JsonProperty("cnc18")
    cnc18("cnc18"),
    @JsonProperty("cncE")
    cncE("cncE"),
    @JsonProperty("cncInterdiction")
    cncInterdiction("cncInterdiction"),
    @JsonProperty("cncT")
    cncT("cncT"),
    @JsonProperty("cncUnrated")
    cncUnrated("cncUnrated");
    public final String toString;

    Cncrating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
