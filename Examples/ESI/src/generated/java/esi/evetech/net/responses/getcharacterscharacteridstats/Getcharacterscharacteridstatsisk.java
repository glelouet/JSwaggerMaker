package esi.evetech.net.responses.getcharacterscharacteridstats;

public class Getcharacterscharacteridstatsisk {
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
        Getcharacterscharacteridstatsisk othersame = ((Getcharacterscharacteridstatsisk) other);
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
