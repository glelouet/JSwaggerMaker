package api.github.com.definitions;

import api.github.com.definitions.feeds.Links;

public class Feeds {
    public Links _links;
    public String current_user_actor_url;
    public String current_user_organization_url;
    public String current_user_public;
    public String current_user_url;
    public String timeline_url;
    public String user_url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Feeds othersame = ((Feeds) other);
        if ((_links!= othersame._links)&&((_links == null)||(!_links.equals(othersame._links)))) {
            return false;
        }
        if ((current_user_actor_url!= othersame.current_user_actor_url)&&((current_user_actor_url == null)||(!current_user_actor_url.equals(othersame.current_user_actor_url)))) {
            return false;
        }
        if ((current_user_organization_url!= othersame.current_user_organization_url)&&((current_user_organization_url == null)||(!current_user_organization_url.equals(othersame.current_user_organization_url)))) {
            return false;
        }
        if ((current_user_public!= othersame.current_user_public)&&((current_user_public == null)||(!current_user_public.equals(othersame.current_user_public)))) {
            return false;
        }
        if ((current_user_url!= othersame.current_user_url)&&((current_user_url == null)||(!current_user_url.equals(othersame.current_user_url)))) {
            return false;
        }
        if ((timeline_url!= othersame.timeline_url)&&((timeline_url == null)||(!timeline_url.equals(othersame.timeline_url)))) {
            return false;
        }
        if ((user_url!= othersame.user_url)&&((user_url == null)||(!user_url.equals(othersame.user_url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((_links == null)? 0 :_links.hashCode())+((current_user_actor_url == null)? 0 :current_user_actor_url.hashCode()))+((current_user_organization_url == null)? 0 :current_user_organization_url.hashCode()))+((current_user_public == null)? 0 :current_user_public.hashCode()))+((current_user_url == null)? 0 :current_user_url.hashCode()))+((timeline_url == null)? 0 :timeline_url.hashCode()))+((user_url == null)? 0 :user_url.hashCode()));
    }
}
