package esi.evetech.net.responses;

import esi.evetech.net.responses.getcorporationscorporationidbookmarks.GetCorporationsCorporationIdBookmarksCoordinates;

public class PostCharactersCharacterIdAssetsLocations {
    /**
     * item_id integer
     */
    public long item_id;
    /**
     * position object
     */
    public GetCorporationsCorporationIdBookmarksCoordinates position;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PostCharactersCharacterIdAssetsLocations othersame = ((PostCharactersCharacterIdAssetsLocations) other);
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
