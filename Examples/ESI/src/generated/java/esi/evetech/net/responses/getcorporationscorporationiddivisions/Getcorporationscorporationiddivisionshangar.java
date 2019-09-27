package esi.evetech.net.responses.getcorporationscorporationiddivisions;

public class Getcorporationscorporationiddivisionshangar {
    /**
     * division integer
     */
    public int division;
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
        Getcorporationscorporationiddivisionshangar othersame = ((Getcorporationscorporationiddivisionshangar) other);
        if (division!= othersame.division) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (division +((name == null)? 0 :name.hashCode()));
    }
}
