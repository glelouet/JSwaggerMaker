package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum period {
    @JsonProperty("daily")
    daily("daily"),
    @JsonProperty("weekly")
    weekly("weekly"),
    @JsonProperty("monthly")
    monthly("monthly"),
    @JsonProperty("quarterly")
    quarterly("quarterly"),
    @JsonProperty("yearly")
    yearly("yearly"),
    @JsonProperty("all")
    all("all");
    public final String toString;

    period(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
