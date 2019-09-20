package www.googleapis.com.definitions;

public class LocalizedString {
    public String language;
    public String value;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LocalizedString othersame = ((LocalizedString) other);
        if ((language!= othersame.language)&&((language == null)||(!language.equals(othersame.language)))) {
            return false;
        }
        if ((value!= othersame.value)&&((value == null)||(!value.equals(othersame.value)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((language == null)? 0 :language.hashCode())+((value == null)? 0 :value.hashCode()));
    }
}
