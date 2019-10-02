package www.googleapis.com.definitions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocalizedProperty {
    @JsonProperty("default")
    public String default_;
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
        if ((default_!= othersame.default_)&&((default_ == null)||(!default_.equals(othersame.default_)))) {
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
        return ((((default_ == null)? 0 :default_.hashCode())+((defaultLanguage == null)? 0 :defaultLanguage.hashCode()))+((localized == null)? 0 :localized.hashCode()));
    }
}
