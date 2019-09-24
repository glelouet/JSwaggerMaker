package api.github.com.definitions.feeds;

import api.github.com.definitions.feeds.links.Currentuser;

public class Links {
    public Currentuser current_user;
    public Currentuser current_user_actor;
    public Currentuser current_user_organization;
    public Currentuser current_user_public;
    public Currentuser timeline;
    public Currentuser user;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Links othersame = ((Links) other);
        if ((current_user!= othersame.current_user)&&((current_user == null)||(!current_user.equals(othersame.current_user)))) {
            return false;
        }
        if ((current_user_actor!= othersame.current_user_actor)&&((current_user_actor == null)||(!current_user_actor.equals(othersame.current_user_actor)))) {
            return false;
        }
        if ((current_user_organization!= othersame.current_user_organization)&&((current_user_organization == null)||(!current_user_organization.equals(othersame.current_user_organization)))) {
            return false;
        }
        if ((current_user_public!= othersame.current_user_public)&&((current_user_public == null)||(!current_user_public.equals(othersame.current_user_public)))) {
            return false;
        }
        if ((timeline!= othersame.timeline)&&((timeline == null)||(!timeline.equals(othersame.timeline)))) {
            return false;
        }
        if ((user!= othersame.user)&&((user == null)||(!user.equals(othersame.user)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((current_user == null)? 0 :current_user.hashCode())+((current_user_actor == null)? 0 :current_user_actor.hashCode()))+((current_user_organization == null)? 0 :current_user_organization.hashCode()))+((current_user_public == null)? 0 :current_user_public.hashCode()))+((timeline == null)? 0 :timeline.hashCode()))+((user == null)? 0 :user.hashCode()));
    }
}
