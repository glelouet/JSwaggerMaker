package esi.evetech.net.responses;

public class GetUniverseCategoriesCategoryId {
    /**
     * category_id integer
     */
    public int category_id;
    /**
     * groups array
     */
    public int[] groups;
    /**
     * name string
     */
    public String name;
    /**
     * published boolean
     */
    public boolean published;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetUniverseCategoriesCategoryId othersame = ((GetUniverseCategoriesCategoryId) other);
        if (category_id!= othersame.category_id) {
            return false;
        }
        if ((groups!= othersame.groups)&&((groups == null)||(!groups.equals(othersame.groups)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (published!= othersame.published) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((category_id +((groups == null)? 0 :groups.hashCode()))+((name == null)? 0 :name.hashCode()))+ Boolean.hashCode(published));
    }
}
