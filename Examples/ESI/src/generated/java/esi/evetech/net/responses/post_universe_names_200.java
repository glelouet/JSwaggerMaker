package esi.evetech.net.responses;

import esi.evetech.net.structures.post_universe_names_category;

public class post_universe_names_200 {
    /**
     * category string
     */
    public post_universe_names_category category;
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
        post_universe_names_200 othersame = ((post_universe_names_200) other);
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
