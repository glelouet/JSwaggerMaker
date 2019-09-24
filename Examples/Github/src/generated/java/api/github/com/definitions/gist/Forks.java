package api.github.com.definitions.gist;

import api.github.com.definitions.User;

public class Forks {
    /**
     * Timestamp in ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
     */
    public String created_at;
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
        Forks othersame = ((Forks) other);
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
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
        return ((((created_at == null)? 0 :created_at.hashCode())+((url == null)? 0 :url.hashCode()))+((user == null)? 0 :user.hashCode()));
    }
}
