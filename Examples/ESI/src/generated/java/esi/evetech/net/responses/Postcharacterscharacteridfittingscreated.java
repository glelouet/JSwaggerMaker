package esi.evetech.net.responses;

public class Postcharacterscharacteridfittingscreated {
    /**
     * fitting_id integer
     */
    public int fitting_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Postcharacterscharacteridfittingscreated othersame = ((Postcharacterscharacteridfittingscreated) other);
        if (fitting_id!= othersame.fitting_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return fitting_id;
    }
}
