package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Mocrating {
    @JsonProperty("moc12")
    moc12("moc12"),
    @JsonProperty("moc15")
    moc15("moc15"),
    @JsonProperty("moc18")
    moc18("moc18"),
    @JsonProperty("moc7")
    moc7("moc7"),
    @JsonProperty("mocBanned")
    mocBanned("mocBanned"),
    @JsonProperty("mocE")
    mocE("mocE"),
    @JsonProperty("mocT")
    mocT("mocT"),
    @JsonProperty("mocUnrated")
    mocUnrated("mocUnrated"),
    @JsonProperty("mocX")
    mocX("mocX");
    public final String toString;

    Mocrating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
