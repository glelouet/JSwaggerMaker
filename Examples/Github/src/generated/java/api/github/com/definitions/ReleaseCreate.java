package api.github.com.definitions;

public class ReleaseCreate {
    public String body;
    public boolean draft;
    public String name;
    public boolean prerelease;
    public String tag_name;
    public String target_commitish;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ReleaseCreate othersame = ((ReleaseCreate) other);
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        if (draft!= othersame.draft) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (prerelease!= othersame.prerelease) {
            return false;
        }
        if ((tag_name!= othersame.tag_name)&&((tag_name == null)||(!tag_name.equals(othersame.tag_name)))) {
            return false;
        }
        if ((target_commitish!= othersame.target_commitish)&&((target_commitish == null)||(!target_commitish.equals(othersame.target_commitish)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((body == null)? 0 :body.hashCode())+ Boolean.hashCode(draft))+((name == null)? 0 :name.hashCode()))+ Boolean.hashCode(prerelease))+((tag_name == null)? 0 :tag_name.hashCode()))+((target_commitish == null)? 0 :target_commitish.hashCode()));
    }
}
