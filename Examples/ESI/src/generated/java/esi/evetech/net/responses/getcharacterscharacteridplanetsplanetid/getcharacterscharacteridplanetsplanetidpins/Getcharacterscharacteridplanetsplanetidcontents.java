package esi.evetech.net.responses.getcharacterscharacteridplanetsplanetid.getcharacterscharacteridplanetsplanetidpins;

public class Getcharacterscharacteridplanetsplanetidcontents {
    /**
     * amount integer
     */
    public long amount;
    /**
     * type_id integer
     */
    public int type_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcharacterscharacteridplanetsplanetidcontents othersame = ((Getcharacterscharacteridplanetsplanetidcontents) other);
        if (amount!= othersame.amount) {
            return false;
        }
        if (type_id!= othersame.type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(amount)+ type_id);
    }
}
