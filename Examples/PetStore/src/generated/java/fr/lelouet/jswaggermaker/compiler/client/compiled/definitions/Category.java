package fr.lelouet.jswaggermaker.compiler.client.compiled.definitions;

public class Category {
    public long id;
    public String name;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Category othersame = ((Category) other);
        if (id!= othersame.id) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(id)+((name == null)? 0 :name.hashCode()));
    }
}
