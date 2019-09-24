package api.github.com.definitions.pulls.base;

public class User {
    public String avatar_url;
    public String gravatar_id;
    public long id;
    public String login;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        User othersame = ((User) other);
        if ((avatar_url!= othersame.avatar_url)&&((avatar_url == null)||(!avatar_url.equals(othersame.avatar_url)))) {
            return false;
        }
        if ((gravatar_id!= othersame.gravatar_id)&&((gravatar_id == null)||(!gravatar_id.equals(othersame.gravatar_id)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((login!= othersame.login)&&((login == null)||(!login.equals(othersame.login)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((avatar_url == null)? 0 :avatar_url.hashCode())+((gravatar_id == null)? 0 :gravatar_id.hashCode()))+ Long.hashCode(id))+((login == null)? 0 :login.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
