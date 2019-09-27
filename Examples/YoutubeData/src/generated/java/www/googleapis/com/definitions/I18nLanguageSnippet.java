package www.googleapis.com.definitions;

public class I18nLanguageSnippet {
    /**
     * A short BCP-47 code that uniquely identifies a language.
     */
    public String hl;
    /**
     * The human-readable name of the language in the language itself.
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
        I18nLanguageSnippet othersame = ((I18nLanguageSnippet) other);
        if ((hl!= othersame.hl)&&((hl == null)||(!hl.equals(othersame.hl)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((hl == null)? 0 :hl.hashCode())+((name == null)? 0 :name.hashCode()));
    }
}
