package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FpbRating {
    @JsonProperty("fpb10")
    fpb10("fpb10"),
    @JsonProperty("fpb1012Pg")
    fpb1012Pg("fpb1012Pg"),
    @JsonProperty("fpb13")
    fpb13("fpb13"),
    @JsonProperty("fpb16")
    fpb16("fpb16"),
    @JsonProperty("fpb18")
    fpb18("fpb18"),
    @JsonProperty("fpb79Pg")
    fpb79Pg("fpb79Pg"),
    @JsonProperty("fpbA")
    fpbA("fpbA"),
    @JsonProperty("fpbPg")
    fpbPg("fpbPg"),
    @JsonProperty("fpbUnrated")
    fpbUnrated("fpbUnrated"),
    @JsonProperty("fpbX18")
    fpbX18("fpbX18"),
    @JsonProperty("fpbXx")
    fpbXx("fpbXx");
    public final String toString;

    FpbRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
