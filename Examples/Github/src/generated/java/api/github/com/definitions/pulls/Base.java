package api.github.com.definitions.pulls;

import api.github.com.definitions.Repo;
import api.github.com.definitions.pulls.base.User;

public class Base {
    public String label;
    public String ref;
    public Repo repo;
    public String sha;
    public User user;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Base othersame = ((Base) other);
        if ((label!= othersame.label)&&((label == null)||(!label.equals(othersame.label)))) {
            return false;
        }
        if ((ref!= othersame.ref)&&((ref == null)||(!ref.equals(othersame.ref)))) {
            return false;
        }
        if ((repo!= othersame.repo)&&((repo == null)||(!repo.equals(othersame.repo)))) {
            return false;
        }
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        if ((user!= othersame.user)&&((user == null)||(!user.equals(othersame.user)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((label == null)? 0 :label.hashCode())+((ref == null)? 0 :ref.hashCode()))+((repo == null)? 0 :repo.hashCode()))+((sha == null)? 0 :sha.hashCode()))+((user == null)? 0 :user.hashCode()));
    }
}
