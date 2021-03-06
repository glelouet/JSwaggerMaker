package esi.evetech.net.responses.getfleetsfleetidwings;

public class GetFleetsFleetIdWingsSquads {
    /**
     * id integer
     */
    public long id;
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
        GetFleetsFleetIdWingsSquads othersame = ((GetFleetsFleetIdWingsSquads) other);
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
