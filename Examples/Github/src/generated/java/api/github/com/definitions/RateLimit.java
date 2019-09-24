package api.github.com.definitions;

import api.github.com.definitions.ratelimit.Rate;

public class RateLimit {
    public Rate rate;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        RateLimit othersame = ((RateLimit) other);
        if ((rate!= othersame.rate)&&((rate == null)||(!rate.equals(othersame.rate)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((rate == null)? 0 :rate.hashCode());
    }
}
