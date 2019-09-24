package api.github.com.definitions;

public class UserKeysKeyId {
    public long id;
    public String key;
    public String title;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        UserKeysKeyId othersame = ((UserKeysKeyId) other);
        if (id!= othersame.id) {
            return false;
        }
        if ((key!= othersame.key)&&((key == null)||(!key.equals(othersame.key)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Long.hashCode(id)+((key == null)? 0 :key.hashCode()))+((title == null)? 0 :title.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
