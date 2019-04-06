package esi.evetech.net.responses;

public class get_fleets_fleet_id_wings_200 {
    /**
     * id integer
     */
    public long id;
    /**
     * name string
     */
    public String name;
    /**
     * squads array
     */
    public get_fleets_fleet_id_wings_squads[] squads;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        get_fleets_fleet_id_wings_200 othersame = ((get_fleets_fleet_id_wings_200) other);
        if (id!= othersame.id) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((squads!= othersame.squads)&&((squads == null)||(!squads.equals(othersame.squads)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Long.hashCode(id)+((name == null)? 0 :name.hashCode()))+((squads == null)? 0 :squads.hashCode()));
    }
}
