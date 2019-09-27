package esi.evetech.net.responses;

import esi.evetech.net.responses.getcorporationscorporationidbookmarks200.Getcorporationscorporationidbookmarkscoordinates;

public class Postcharacterscharacteridassetslocations200 {
    /**
     * item_id integer
     */
    public long item_id;
    /**
     * position object
     */
    public Getcorporationscorporationidbookmarkscoordinates position;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Postcharacterscharacteridassetslocations200 othersame = ((Postcharacterscharacteridassetslocations200) other);
        if (item_id!= othersame.item_id) {
            return false;
        }
        if ((position!= othersame.position)&&((position == null)||(!position.equals(othersame.position)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(item_id)+((position == null)? 0 :position.hashCode()));
    }
}
