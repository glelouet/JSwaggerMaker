package esi.evetech.net.responses;

public class get_corporations_corporation_id_bookmarks_coordinates {
    /**
     * x number
     */
    public double x;
    /**
     * y number
     */
    public double y;
    /**
     * z number
     */
    public double z;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        get_corporations_corporation_id_bookmarks_coordinates othersame = ((get_corporations_corporation_id_bookmarks_coordinates) other);
        if (x!= othersame.x) {
            return false;
        }
        if (y!= othersame.y) {
            return false;
        }
        if (z!= othersame.z) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Double.hashCode(x)+ Double.hashCode(y))+ Double.hashCode(z));
    }
}
