package api.github.com.definitions;

import api.github.com.definitions.event.Repo;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {
    public Actor actor;
    public Object created_at;
    public long id;
    public Organization org;
    public Object payload;
    @JsonProperty("public")
    public boolean public_;
    public Repo repo;
    public String type;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Event othersame = ((Event) other);
        if ((actor!= othersame.actor)&&((actor == null)||(!actor.equals(othersame.actor)))) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((org!= othersame.org)&&((org == null)||(!org.equals(othersame.org)))) {
            return false;
        }
        if ((payload!= othersame.payload)&&((payload == null)||(!payload.equals(othersame.payload)))) {
            return false;
        }
        if (public_!= othersame.public_) {
            return false;
        }
        if ((repo!= othersame.repo)&&((repo == null)||(!repo.equals(othersame.repo)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((actor == null)? 0 :actor.hashCode())+((created_at == null)? 0 :created_at.hashCode()))+ Long.hashCode(id))+((org == null)? 0 :org.hashCode()))+((payload == null)? 0 :payload.hashCode()))+ Boolean.hashCode(public_))+((repo == null)? 0 :repo.hashCode()))+((type == null)? 0 :type.hashCode()));
    }
}
