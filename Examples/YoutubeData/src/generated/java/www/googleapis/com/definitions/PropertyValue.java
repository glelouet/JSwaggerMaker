package www.googleapis.com.definitions;

public class PropertyValue {
    /**
     * A property.
     */
    public String property;
    /**
     * The property's value.
     */
    public String value;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PropertyValue othersame = ((PropertyValue) other);
        if ((property!= othersame.property)&&((property == null)||(!property.equals(othersame.property)))) {
            return false;
        }
        if ((value!= othersame.value)&&((value == null)||(!value.equals(othersame.value)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((property == null)? 0 :property.hashCode())+((value == null)? 0 :value.hashCode()));
    }
}
