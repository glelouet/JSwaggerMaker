package api.github.com.definitions;

import api.github.com.definitions.refstatus.Statuses;

public class RefStatus {
    public String commit_url;
    public String name;
    public String repository_url;
    public String sha;
    public String state;
    public Statuses[] statuses;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        RefStatus othersame = ((RefStatus) other);
        if ((commit_url!= othersame.commit_url)&&((commit_url == null)||(!commit_url.equals(othersame.commit_url)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((repository_url!= othersame.repository_url)&&((repository_url == null)||(!repository_url.equals(othersame.repository_url)))) {
            return false;
        }
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        if ((state!= othersame.state)&&((state == null)||(!state.equals(othersame.state)))) {
            return false;
        }
        if ((statuses!= othersame.statuses)&&((statuses == null)||(!statuses.equals(othersame.statuses)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((commit_url == null)? 0 :commit_url.hashCode())+((name == null)? 0 :name.hashCode()))+((repository_url == null)? 0 :repository_url.hashCode()))+((sha == null)? 0 :sha.hashCode()))+((state == null)? 0 :state.hashCode()))+((statuses == null)? 0 :statuses.hashCode()));
    }
}
