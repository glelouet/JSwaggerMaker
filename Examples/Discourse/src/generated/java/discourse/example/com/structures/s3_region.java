package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum s3_region {
    @JsonProperty("ap-northeast-1")
    ap_northeast_1("ap-northeast-1"),
    @JsonProperty("ap-northeast-2")
    ap_northeast_2("ap-northeast-2"),
    @JsonProperty("ap-south-1")
    ap_south_1("ap-south-1"),
    @JsonProperty("ap-southeast-1")
    ap_southeast_1("ap-southeast-1"),
    @JsonProperty("ap-southeast-2")
    ap_southeast_2("ap-southeast-2"),
    @JsonProperty("cn-north-1")
    cn_north_1("cn-north-1"),
    @JsonProperty("eu-central-1")
    eu_central_1("eu-central-1"),
    @JsonProperty("eu-west-1")
    eu_west_1("eu-west-1"),
    @JsonProperty("sa-east-1")
    sa_east_1("sa-east-1"),
    @JsonProperty("us-east-1")
    us_east_1("us-east-1"),
    @JsonProperty("us-gov-west-1")
    us_gov_west_1("us-gov-west-1"),
    @JsonProperty("us-west-1")
    us_west_1("us-west-1"),
    @JsonProperty("us-west-2")
    us_west_2("us-west-2");
    public final String toString;

    s3_region(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
