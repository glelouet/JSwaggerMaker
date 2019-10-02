package api.github.com.definitions.gists;

import api.github.com.definitions.gists.files.RingErl;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Files {
    @JsonProperty("ring.erl")
    public RingErl ring_erl;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Files othersame = ((Files) other);
        if ((ring_erl!= othersame.ring_erl)&&((ring_erl == null)||(!ring_erl.equals(othersame.ring_erl)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((ring_erl == null)? 0 :ring_erl.hashCode());
    }
}
