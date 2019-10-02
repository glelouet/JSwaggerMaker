package esi.evetech.net.responses;

import esi.evetech.net.responses.getcorporationscorporationidbookmarks.GetCorporationsCorporationIdBookmarksCoordinates;
import esi.evetech.net.responses.getuniversestargatesstargateid.GetUniverseStargatesStargateIdDestination;

public class GetUniverseStargatesStargateId {
    /**
     * destination object
     */
    public GetUniverseStargatesStargateIdDestination destination;
    /**
     * name string
     */
    public String name;
    /**
     * position object
     */
    public GetCorporationsCorporationIdBookmarksCoordinates position;
    /**
     * stargate_id integer
     */
    public int stargate_id;
    /**
     * The solar system this stargate is in
     */
    public int system_id;
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
        GetUniverseStargatesStargateId othersame = ((GetUniverseStargatesStargateId) other);
        if ((destination!= othersame.destination)&&((destination == null)||(!destination.equals(othersame.destination)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((position!= othersame.position)&&((position == null)||(!position.equals(othersame.position)))) {
            return false;
        }
        if (stargate_id!= othersame.stargate_id) {
            return false;
        }
        if (system_id!= othersame.system_id) {
            return false;
        }
        if (type_id!= othersame.type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((destination == null)? 0 :destination.hashCode())+((name == null)? 0 :name.hashCode()))+((position == null)? 0 :position.hashCode()))+ stargate_id)+ system_id)+ type_id);
    }
}
