package esi.evetech.net.responses;

import esi.evetech.net.responses.getcorporationscorporationidbookmarks.GetCorporationsCorporationIdBookmarksCoordinates;

public class GetUniverseConstellationsConstellationId {
    /**
     * constellation_id integer
     */
    public int constellation_id;
    /**
     * name string
     */
    public String name;
    /**
     * position object
     */
    public GetCorporationsCorporationIdBookmarksCoordinates position;
    /**
     * The region this constellation is in
     */
    public int region_id;
    /**
     * systems array
     */
    public int[] systems;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetUniverseConstellationsConstellationId othersame = ((GetUniverseConstellationsConstellationId) other);
        if (constellation_id!= othersame.constellation_id) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((position!= othersame.position)&&((position == null)||(!position.equals(othersame.position)))) {
            return false;
        }
        if (region_id!= othersame.region_id) {
            return false;
        }
        if ((systems!= othersame.systems)&&((systems == null)||(!systems.equals(othersame.systems)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((constellation_id +((name == null)? 0 :name.hashCode()))+((position == null)? 0 :position.hashCode()))+ region_id)+((systems == null)? 0 :systems.hashCode()));
    }
}
