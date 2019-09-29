package esi.evetech.net.responses;

import esi.evetech.net.responses.getcorporationscorporationidbookmarks.Getcorporationscorporationidbookmarkscoordinates;

public class Getuniverseasteroidbeltsasteroidbeltid {
    /**
     * name string
     */
    public String name;
    /**
     * position object
     */
    public Getcorporationscorporationidbookmarkscoordinates position;
    /**
     * The solar system this asteroid belt is in
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
        Getuniverseasteroidbeltsasteroidbeltid othersame = ((Getuniverseasteroidbeltsasteroidbeltid) other);
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
        return ((((name == null)? 0 :name.hashCode())+((position == null)? 0 :position.hashCode()))+ system_id);
    }
}
