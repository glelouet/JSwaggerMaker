package api.github.com.definitions;

public class UserKeysPost {
    public String key;
    public String title;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        UserKeysPost othersame = ((UserKeysPost) other);
        if ((key!= othersame.key)&&((key == null)||(!key.equals(othersame.key)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((key == null)? 0 :key.hashCode())+((title == null)? 0 :title.hashCode()));
    }
}
