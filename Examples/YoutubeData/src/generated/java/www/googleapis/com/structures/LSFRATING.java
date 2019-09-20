package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum LSFRATING {
    @JsonProperty("lsf13")
    lsf13("lsf13"),
    @JsonProperty("lsf17")
    lsf17("lsf17"),
    @JsonProperty("lsf21")
    lsf21("lsf21"),
    @JsonProperty("lsfA")
    lsfA("lsfA"),
    @JsonProperty("lsfBo")
    lsfBo("lsfBo"),
    @JsonProperty("lsfD")
    lsfD("lsfD"),
    @JsonProperty("lsfR")
    lsfR("lsfR"),
    @JsonProperty("lsfSu")
    lsfSu("lsfSu"),
    @JsonProperty("lsfUnrated")
    lsfUnrated("lsfUnrated");
    public final String toString;

    LSFRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
