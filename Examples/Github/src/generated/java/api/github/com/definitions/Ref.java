package api.github.com.definitions;

import api.github.com.definitions.pulls.base.User;

public class Ref {
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String created_at;
    public User creator;
    public String description;
    public long id;
    public String state;
    public String target_url;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String updated_at;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Ref othersame = ((Ref) other);
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if ((creator!= othersame.creator)&&((creator == null)||(!creator.equals(othersame.creator)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((state!= othersame.state)&&((state == null)||(!state.equals(othersame.state)))) {
            return false;
        }
        if ((target_url!= othersame.target_url)&&((target_url == null)||(!target_url.equals(othersame.target_url)))) {
            return false;
        }
        if ((updated_at!= othersame.updated_at)&&((updated_at == null)||(!updated_at.equals(othersame.updated_at)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((created_at == null)? 0 :created_at.hashCode())+((creator == null)? 0 :creator.hashCode()))+((description == null)? 0 :description.hashCode()))+ Long.hashCode(id))+((state == null)? 0 :state.hashCode()))+((target_url == null)? 0 :target_url.hashCode()))+((updated_at == null)? 0 :updated_at.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
