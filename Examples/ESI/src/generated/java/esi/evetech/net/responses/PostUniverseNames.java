package esi.evetech.net.responses;

import esi.evetech.net.structures.PostUniverseNamesCategory;

public class PostUniverseNames {
    /**
     * category string
     */
    public PostUniverseNamesCategory category;
    /**
     * id integer
     */
    public int id;
    /**
     * name string
     */
    public String name;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PostUniverseNames othersame = ((PostUniverseNames) other);
        if ((category!= othersame.category)&&((category == null)||(!category.equals(othersame.category)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((category == null)? 0 :category.hashCode())+ id)+((name == null)? 0 :name.hashCode()));
    }
}
