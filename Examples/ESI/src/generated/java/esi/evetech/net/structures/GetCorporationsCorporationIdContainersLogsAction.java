package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCorporationsCorporationIdContainersLogsAction {
    @JsonProperty("add")
    add("add"),
    @JsonProperty("assemble")
    assemble("assemble"),
    @JsonProperty("configure")
    configure("configure"),
    @JsonProperty("enter_password")
    enter_password("enter_password"),
    @JsonProperty("lock")
    lock("lock"),
    @JsonProperty("move")
    move("move"),
    @JsonProperty("repackage")
    repackage("repackage"),
    @JsonProperty("set_name")
    set_name("set_name"),
    @JsonProperty("set_password")
    set_password("set_password"),
    @JsonProperty("unlock")
    unlock("unlock");
    public final String toString;

    GetCorporationsCorporationIdContainersLogsAction(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
