package esi.evetech.net.responses;

public class PostFleetsFleetIdWingsWingIdSquadsCreated {
    /**
     * The squad_id of the newly created squad
     */
    public long squad_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PostFleetsFleetIdWingsWingIdSquadsCreated othersame = ((PostFleetsFleetIdWingsWingIdSquadsCreated) other);
        if (squad_id!= othersame.squad_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Long.hashCode(squad_id);
    }
}
