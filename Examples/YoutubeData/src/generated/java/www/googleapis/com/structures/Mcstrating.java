package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Mcstrating {
    @JsonProperty("mcst0")
    mcst0("mcst0"),
    @JsonProperty("mcst16plus")
    mcst16plus("mcst16plus"),
    @JsonProperty("mcstC13")
    mcstC13("mcstC13"),
    @JsonProperty("mcstC16")
    mcstC16("mcstC16"),
    @JsonProperty("mcstC18")
    mcstC18("mcstC18"),
    @JsonProperty("mcstGPg")
    mcstGPg("mcstGPg"),
    @JsonProperty("mcstP")
    mcstP("mcstP"),
    @JsonProperty("mcstUnrated")
    mcstUnrated("mcstUnrated");
    public final String toString;

    Mcstrating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
