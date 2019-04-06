package esi.evetech.net.responses;

public class get_characters_character_id_stats_isk {
    /**
     * in integer
     */
    public long in;
    /**
     * out integer
     */
    public long out;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        get_characters_character_id_stats_isk othersame = ((get_characters_character_id_stats_isk) other);
        if (in!= othersame.in) {
            return false;
        }
        if (out!= othersame.out) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(in)+ Long.hashCode(out));
    }
}
