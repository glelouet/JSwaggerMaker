package www.googleapis.com.definitions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocalizedProperty {
    @JsonProperty("default")
    public String _default;
    /**
     * The language of the default property.
     */
    public LanguageTag defaultLanguage;
    public LocalizedString[] localized;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LocalizedProperty othersame = ((LocalizedProperty) other);
        if ((_default!= othersame._default)&&((_default == null)||(!_default.equals(othersame._default)))) {
            return false;
        }
        if ((defaultLanguage!= othersame.defaultLanguage)&&((defaultLanguage == null)||(!defaultLanguage.equals(othersame.defaultLanguage)))) {
            return false;
        }
        if ((localized!= othersame.localized)&&((localized == null)||(!localized.equals(othersame.localized)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((_default == null)? 0 :_default.hashCode())+((defaultLanguage == null)? 0 :defaultLanguage.hashCode()))+((localized == null)? 0 :localized.hashCode()));
    }
}
