package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Kijkwijzerrating {
    @JsonProperty("kijkwijzer12")
    kijkwijzer12("kijkwijzer12"),
    @JsonProperty("kijkwijzer16")
    kijkwijzer16("kijkwijzer16"),
    @JsonProperty("kijkwijzer18")
    kijkwijzer18("kijkwijzer18"),
    @JsonProperty("kijkwijzer6")
    kijkwijzer6("kijkwijzer6"),
    @JsonProperty("kijkwijzer9")
    kijkwijzer9("kijkwijzer9"),
    @JsonProperty("kijkwijzerAl")
    kijkwijzerAl("kijkwijzerAl"),
    @JsonProperty("kijkwijzerUnrated")
    kijkwijzerUnrated("kijkwijzerUnrated");
    public final String toString;

    Kijkwijzerrating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
