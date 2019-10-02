package esi.evetech.net.responses;

public class PostFleetsFleetIdWingsCreated {
    /**
     * The wing_id of the newly created wing
     */
    public long wing_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PostFleetsFleetIdWingsCreated othersame = ((PostFleetsFleetIdWingsCreated) other);
        if (wing_id!= othersame.wing_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Long.hashCode(wing_id);
    }
}
