package esi.evetech.net.responses;

import esi.evetech.net.responses.getfleetsfleetidwings200.Getfleetsfleetidwingssquads;

public class Getfleetsfleetidwings200 {
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
    public Getfleetsfleetidwingssquads[] squads;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getfleetsfleetidwings200 othersame = ((Getfleetsfleetidwings200) other);
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
