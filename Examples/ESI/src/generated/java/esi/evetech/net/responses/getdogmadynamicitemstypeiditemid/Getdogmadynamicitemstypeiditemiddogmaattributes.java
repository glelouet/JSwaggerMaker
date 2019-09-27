package esi.evetech.net.responses.getdogmadynamicitemstypeiditemid;

public class Getdogmadynamicitemstypeiditemiddogmaattributes {
    /**
     * attribute_id integer
     */
    public int attribute_id;
    /**
     * value number
     */
    public float value;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getdogmadynamicitemstypeiditemiddogmaattributes othersame = ((Getdogmadynamicitemstypeiditemiddogmaattributes) other);
        if (attribute_id!= othersame.attribute_id) {
            return false;
        }
        if (value!= othersame.value) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (attribute_id + Double.hashCode(value));
    }
}
