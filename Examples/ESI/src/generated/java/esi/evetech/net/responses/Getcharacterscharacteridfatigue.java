package esi.evetech.net.responses;

public class Getcharacterscharacteridfatigue {
    /**
     * Character's jump fatigue expiry
     */
    public String jump_fatigue_expire_date;
    /**
     * Character's last jump activation
     */
    public String last_jump_date;
    /**
     * Character's last jump update
     */
    public String last_update_date;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcharacterscharacteridfatigue othersame = ((Getcharacterscharacteridfatigue) other);
        if ((jump_fatigue_expire_date!= othersame.jump_fatigue_expire_date)&&((jump_fatigue_expire_date == null)||(!jump_fatigue_expire_date.equals(othersame.jump_fatigue_expire_date)))) {
            return false;
        }
        if ((last_jump_date!= othersame.last_jump_date)&&((last_jump_date == null)||(!last_jump_date.equals(othersame.last_jump_date)))) {
            return false;
        }
        if ((last_update_date!= othersame.last_update_date)&&((last_update_date == null)||(!last_update_date.equals(othersame.last_update_date)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((jump_fatigue_expire_date == null)? 0 :jump_fatigue_expire_date.hashCode())+((last_jump_date == null)? 0 :last_jump_date.hashCode()))+((last_update_date == null)? 0 :last_update_date.hashCode()));
    }
}
