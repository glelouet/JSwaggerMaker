package esi.evetech.net.responses;

public class GetCharactersCharacterIdLocation {
    /**
     * solar_system_id integer
     */
    public int solar_system_id;
    /**
     * station_id integer
     */
    public int station_id;
    /**
     * structure_id integer
     */
    public long structure_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCharactersCharacterIdLocation othersame = ((GetCharactersCharacterIdLocation) other);
        if (solar_system_id!= othersame.solar_system_id) {
            return false;
        }
        if (station_id!= othersame.station_id) {
            return false;
        }
        if (structure_id!= othersame.structure_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((solar_system_id + station_id)+ Long.hashCode(structure_id));
    }
}
