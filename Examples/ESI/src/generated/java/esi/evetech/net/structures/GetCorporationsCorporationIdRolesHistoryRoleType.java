package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCorporationsCorporationIdRolesHistoryRoleType {
    @JsonProperty("grantable_roles")
    grantable_roles("grantable_roles"),
    @JsonProperty("grantable_roles_at_base")
    grantable_roles_at_base("grantable_roles_at_base"),
    @JsonProperty("grantable_roles_at_hq")
    grantable_roles_at_hq("grantable_roles_at_hq"),
    @JsonProperty("grantable_roles_at_other")
    grantable_roles_at_other("grantable_roles_at_other"),
    @JsonProperty("roles")
    roles("roles"),
    @JsonProperty("roles_at_base")
    roles_at_base("roles_at_base"),
    @JsonProperty("roles_at_hq")
    roles_at_hq("roles_at_hq"),
    @JsonProperty("roles_at_other")
    roles_at_other("roles_at_other");
    public final String toString;

    GetCorporationsCorporationIdRolesHistoryRoleType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
