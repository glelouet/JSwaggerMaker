package api.github.com.definitions;

public class Comments {
    public String body;
    /**
     * ISO 8601.
     */
    public String created_at;
    public long id;
    public String url;
    public User user;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Comments othersame = ((Comments) other);
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        if ((user!= othersame.user)&&((user == null)||(!user.equals(othersame.user)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((body == null)? 0 :body.hashCode())+((created_at == null)? 0 :created_at.hashCode()))+ Long.hashCode(id))+((url == null)? 0 :url.hashCode()))+((user == null)? 0 :user.hashCode()));
    }
}
