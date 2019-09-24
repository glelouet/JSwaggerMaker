package api.github.com.definitions.gist;

import api.github.com.definitions.User;
import api.github.com.definitions.gist.history.Changestatus;

public class History {
    public Changestatus change_status;
    /**
     * Timestamp in ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
     */
    public String committed_at;
    public String url;
    public User user;
    public String version;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        History othersame = ((History) other);
        if ((change_status!= othersame.change_status)&&((change_status == null)||(!change_status.equals(othersame.change_status)))) {
            return false;
        }
        if ((committed_at!= othersame.committed_at)&&((committed_at == null)||(!committed_at.equals(othersame.committed_at)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        if ((user!= othersame.user)&&((user == null)||(!user.equals(othersame.user)))) {
            return false;
        }
        if ((version!= othersame.version)&&((version == null)||(!version.equals(othersame.version)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((change_status == null)? 0 :change_status.hashCode())+((committed_at == null)? 0 :committed_at.hashCode()))+((url == null)? 0 :url.hashCode()))+((user == null)? 0 :user.hashCode()))+((version == null)? 0 :version.hashCode()));
    }
}
