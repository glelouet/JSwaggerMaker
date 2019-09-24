package api.github.com.definitions;

import api.github.com.definitions.issueevent.Issue;

public class IssueEvent {
    public Actor actor;
    public String commit_id;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String created_at;
    public String event;
    public Issue issue;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        IssueEvent othersame = ((IssueEvent) other);
        if ((actor!= othersame.actor)&&((actor == null)||(!actor.equals(othersame.actor)))) {
            return false;
        }
        if ((commit_id!= othersame.commit_id)&&((commit_id == null)||(!commit_id.equals(othersame.commit_id)))) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if ((event!= othersame.event)&&((event == null)||(!event.equals(othersame.event)))) {
            return false;
        }
        if ((issue!= othersame.issue)&&((issue == null)||(!issue.equals(othersame.issue)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((actor == null)? 0 :actor.hashCode())+((commit_id == null)? 0 :commit_id.hashCode()))+((created_at == null)? 0 :created_at.hashCode()))+((event == null)? 0 :event.hashCode()))+((issue == null)? 0 :issue.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
