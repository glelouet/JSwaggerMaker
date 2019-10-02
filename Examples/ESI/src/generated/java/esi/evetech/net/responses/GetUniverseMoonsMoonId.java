package esi.evetech.net.responses;

import esi.evetech.net.responses.getcorporationscorporationidbookmarks.GetCorporationsCorporationIdBookmarksCoordinates;

public class GetUniverseMoonsMoonId {
    /**
     * moon_id integer
     */
    public int moon_id;
    /**
     * name string
     */
    public String name;
    /**
     * position object
     */
    public GetCorporationsCorporationIdBookmarksCoordinates position;
    /**
     * The solar system this moon is in
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
        GetUniverseMoonsMoonId othersame = ((GetUniverseMoonsMoonId) other);
        if (moon_id!= othersame.moon_id) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((position!= othersame.position)&&((position == null)||(!position.equals(othersame.position)))) {
            return false;
        }
        if (system_id!= othersame.system_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((moon_id +((name == null)? 0 :name.hashCode()))+((position == null)? 0 :position.hashCode()))+ system_id);
    }
}
