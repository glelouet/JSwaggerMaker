package esi.evetech.net.responses.getcharacterscharacteridplanetsplanetid;

public class GetCharactersCharacterIdPlanetsPlanetIdRoutes {
    /**
     * content_type_id integer
     */
    public int content_type_id;
    /**
     * destination_pin_id integer
     */
    public long destination_pin_id;
    /**
     * quantity number
     */
    public float quantity;
    /**
     * route_id integer
     */
    public long route_id;
    /**
     * source_pin_id integer
     */
    public long source_pin_id;
    /**
     * list of pin ID waypoints
     */
    public long[] waypoints;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCharactersCharacterIdPlanetsPlanetIdRoutes othersame = ((GetCharactersCharacterIdPlanetsPlanetIdRoutes) other);
        if (content_type_id!= othersame.content_type_id) {
            return false;
        }
        if (destination_pin_id!= othersame.destination_pin_id) {
            return false;
        }
        if (quantity!= othersame.quantity) {
            return false;
        }
        if (route_id!= othersame.route_id) {
            return false;
        }
        if (source_pin_id!= othersame.source_pin_id) {
            return false;
        }
        if ((waypoints!= othersame.waypoints)&&((waypoints == null)||(!waypoints.equals(othersame.waypoints)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((content_type_id + Long.hashCode(destination_pin_id))+ Double.hashCode(quantity))+ Long.hashCode(route_id))+ Long.hashCode(source_pin_id))+((waypoints == null)? 0 :waypoints.hashCode()));
    }
}
