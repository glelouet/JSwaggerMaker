package esi.evetech.net.responses;

import esi.evetech.net.responses.getcorporationscorporationidbookmarks.Getcorporationscorporationidbookmarkscoordinates;

public class Getuniverseplanetsplanetid {
    /**
     * name string
     */
    public String name;
    /**
     * planet_id integer
     */
    public int planet_id;
    /**
     * position object
     */
    public Getcorporationscorporationidbookmarkscoordinates position;
    /**
     * The solar system this planet is in
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
        Getuniverseplanetsplanetid othersame = ((Getuniverseplanetsplanetid) other);
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (planet_id!= othersame.planet_id) {
            return false;
        }
        if ((position!= othersame.position)&&((position == null)||(!position.equals(othersame.position)))) {
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
        return ((((((name == null)? 0 :name.hashCode())+ planet_id)+((position == null)? 0 :position.hashCode()))+ system_id)+ type_id);
    }
}
