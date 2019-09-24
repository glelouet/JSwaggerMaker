package api.github.com.definitions.issues;

import api.github.com.definitions.User;

public class Milestone {
    public long closed_issues;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String created_at;
    public User creator;
    public String description;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String due_on;
    public long number;
    public long open_issues;
    public Object state;
    public String title;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Milestone othersame = ((Milestone) other);
        if (closed_issues!= othersame.closed_issues) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if ((creator!= othersame.creator)&&((creator == null)||(!creator.equals(othersame.creator)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((due_on!= othersame.due_on)&&((due_on == null)||(!due_on.equals(othersame.due_on)))) {
            return false;
        }
        if (number!= othersame.number) {
            return false;
        }
        if (open_issues!= othersame.open_issues) {
            return false;
        }
        if ((state!= othersame.state)&&((state == null)||(!state.equals(othersame.state)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(closed_issues)+((created_at == null)? 0 :created_at.hashCode()))+((creator == null)? 0 :creator.hashCode()))+((description == null)? 0 :description.hashCode()))+((due_on == null)? 0 :due_on.hashCode()))+ Long.hashCode(number))+ Long.hashCode(open_issues))+((state == null)? 0 :state.hashCode()))+((title == null)? 0 :title.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
