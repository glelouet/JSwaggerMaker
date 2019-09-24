package api.github.com.definitions;

import api.github.com.definitions.notifications.Repository;
import api.github.com.definitions.notifications.Subject;

public class Notifications {
    public long id;
    public String last_read_at;
    public String reason;
    public Repository repository;
    public Subject subject;
    public boolean unread;
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
        Notifications othersame = ((Notifications) other);
        if (id!= othersame.id) {
            return false;
        }
        if ((last_read_at!= othersame.last_read_at)&&((last_read_at == null)||(!last_read_at.equals(othersame.last_read_at)))) {
            return false;
        }
        if ((reason!= othersame.reason)&&((reason == null)||(!reason.equals(othersame.reason)))) {
            return false;
        }
        if ((repository!= othersame.repository)&&((repository == null)||(!repository.equals(othersame.repository)))) {
            return false;
        }
        if ((subject!= othersame.subject)&&((subject == null)||(!subject.equals(othersame.subject)))) {
            return false;
        }
        if (unread!= othersame.unread) {
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
        return (((((((Long.hashCode(id)+((last_read_at == null)? 0 :last_read_at.hashCode()))+((reason == null)? 0 :reason.hashCode()))+((repository == null)? 0 :repository.hashCode()))+((subject == null)? 0 :subject.hashCode()))+ Boolean.hashCode(unread))+((updated_at == null)? 0 :updated_at.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
