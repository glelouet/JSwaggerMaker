package www.googleapis.com.definitions;

public class LanguageTag {
    public String value;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LanguageTag othersame = ((LanguageTag) other);
        if ((value!= othersame.value)&&((value == null)||(!value.equals(othersame.value)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((value == null)? 0 :value.hashCode());
    }
}
