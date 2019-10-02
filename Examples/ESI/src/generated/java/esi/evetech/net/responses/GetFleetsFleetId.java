package esi.evetech.net.responses;

public class GetFleetsFleetId {
    /**
     * Is free-move enabled
     */
    public boolean is_free_move;
    /**
     * Does the fleet have an active fleet advertisement
     */
    public boolean is_registered;
    /**
     * Is EVE Voice enabled
     */
    public boolean is_voice_enabled;
    /**
     * Fleet MOTD in CCP flavoured HTML
     */
    public String motd;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetFleetsFleetId othersame = ((GetFleetsFleetId) other);
        if (is_free_move!= othersame.is_free_move) {
            return false;
        }
        if (is_registered!= othersame.is_registered) {
            return false;
        }
        if (is_voice_enabled!= othersame.is_voice_enabled) {
            return false;
        }
        if ((motd!= othersame.motd)&&((motd == null)||(!motd.equals(othersame.motd)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(is_free_move)+ Boolean.hashCode(is_registered))+ Boolean.hashCode(is_voice_enabled))+((motd == null)? 0 :motd.hashCode()));
    }
}
