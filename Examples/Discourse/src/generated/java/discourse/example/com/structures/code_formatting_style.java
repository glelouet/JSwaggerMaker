package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum code_formatting_style {
    @JsonProperty("4-spaces-indent")
    _4_spaces_indent("4-spaces-indent"),
    @JsonProperty("code-fences")
    code_fences("code-fences");
    public final String toString;

    code_formatting_style(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
