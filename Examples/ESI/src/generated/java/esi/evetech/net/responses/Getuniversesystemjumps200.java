package esi.evetech.net.responses;

public class Getuniversesystemjumps200 {
    /**
     * ship_jumps integer
     */
    public int ship_jumps;
    /**
     * system_id integer
     */
    public int system_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getuniversesystemjumps200 othersame = ((Getuniversesystemjumps200) other);
        if (ship_jumps!= othersame.ship_jumps) {
            return false;
        }
        if (system_id!= othersame.system_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (ship_jumps + system_id);
    }
}
