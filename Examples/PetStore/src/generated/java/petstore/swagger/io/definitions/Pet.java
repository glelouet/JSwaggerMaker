package petstore.swagger.io.definitions;

import petstore.swagger.io.structures.STATUS;

public class Pet {
    public long id;
    public Category category;
    public String name;
    public String[] photoUrls;
    public Category[] tags;
    /**
     * pet status in the store
     */
    public STATUS status;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Pet othersame = ((Pet) other);
        if (id!= othersame.id) {
            return false;
        }
        if ((category!= othersame.category)&&((category == null)||(!category.equals(othersame.category)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((photoUrls!= othersame.photoUrls)&&((photoUrls == null)||(!photoUrls.equals(othersame.photoUrls)))) {
            return false;
        }
        if ((tags!= othersame.tags)&&((tags == null)||(!tags.equals(othersame.tags)))) {
            return false;
        }
        if ((status!= othersame.status)&&((status == null)||(!status.equals(othersame.status)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Long.hashCode(id)+((category == null)? 0 :category.hashCode()))+((name == null)? 0 :name.hashCode()))+((photoUrls == null)? 0 :photoUrls.hashCode()))+((tags == null)? 0 :tags.hashCode()))+((status == null)? 0 :status.hashCode()));
    }
}
