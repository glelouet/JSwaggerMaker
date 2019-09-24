package api.github.com.definitions;

public class GitignoreLang {
    public String name;
    public String source;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GitignoreLang othersame = ((GitignoreLang) other);
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((source!= othersame.source)&&((source == null)||(!source.equals(othersame.source)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((name == null)? 0 :name.hashCode())+((source == null)? 0 :source.hashCode()));
    }
}
