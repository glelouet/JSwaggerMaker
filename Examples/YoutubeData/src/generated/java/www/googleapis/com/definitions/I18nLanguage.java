package www.googleapis.com.definitions;

public class I18nLanguage {
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * The ID that YouTube uses to uniquely identify the i18n language.
     */
    public String id;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#i18nLanguage".
     */
    public String kind;
    /**
     * The snippet object contains basic details about the i18n language, such as language code and human-readable name.
     */
    public I18nLanguageSnippet snippet;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        I18nLanguage othersame = ((I18nLanguage) other);
        if ((etag!= othersame.etag)&&((etag == null)||(!etag.equals(othersame.etag)))) {
            return false;
        }
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if ((kind!= othersame.kind)&&((kind == null)||(!kind.equals(othersame.kind)))) {
            return false;
        }
        if ((snippet!= othersame.snippet)&&((snippet == null)||(!snippet.equals(othersame.snippet)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((etag == null)? 0 :etag.hashCode())+((id == null)? 0 :id.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((snippet == null)? 0 :snippet.hashCode()));
    }
}
