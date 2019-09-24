package api.github.com.definitions.notifications;

import api.github.com.definitions.Actor;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Repository {
    public String description;
    public boolean fork;
    public String full_name;
    public String html_url;
    public long id;
    public String name;
    public Actor owner;
    @JsonProperty("private")
    public boolean _private;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Repository othersame = ((Repository) other);
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if (fork!= othersame.fork) {
            return false;
        }
        if ((full_name!= othersame.full_name)&&((full_name == null)||(!full_name.equals(othersame.full_name)))) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((owner!= othersame.owner)&&((owner == null)||(!owner.equals(othersame.owner)))) {
            return false;
        }
        if (_private!= othersame._private) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((description == null)? 0 :description.hashCode())+ Boolean.hashCode(fork))+((full_name == null)? 0 :full_name.hashCode()))+((html_url == null)? 0 :html_url.hashCode()))+ Long.hashCode(id))+((name == null)? 0 :name.hashCode()))+((owner == null)? 0 :owner.hashCode()))+ Boolean.hashCode(_private))+((url == null)? 0 :url.hashCode()));
    }
}
