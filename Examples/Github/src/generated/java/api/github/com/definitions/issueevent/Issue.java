package api.github.com.definitions.issueevent;

import api.github.com.definitions.User;
import api.github.com.definitions.issues.Labels;
import api.github.com.definitions.issues.Milestone;
import api.github.com.definitions.issues.PullRequest;

public class Issue {
    public User assignee;
    public String body;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String closed_at;
    public long comments;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String created_at;
    public String html_url;
    public Labels[] labels;
    public Milestone milestone;
    public long number;
    public PullRequest pull_request;
    public Object state;
    public String title;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String updated_at;
    public String url;
    public User user;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Issue othersame = ((Issue) other);
        if ((assignee!= othersame.assignee)&&((assignee == null)||(!assignee.equals(othersame.assignee)))) {
            return false;
        }
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        if ((closed_at!= othersame.closed_at)&&((closed_at == null)||(!closed_at.equals(othersame.closed_at)))) {
            return false;
        }
        if (comments!= othersame.comments) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if ((labels!= othersame.labels)&&((labels == null)||(!labels.equals(othersame.labels)))) {
            return false;
        }
        if ((milestone!= othersame.milestone)&&((milestone == null)||(!milestone.equals(othersame.milestone)))) {
            return false;
        }
        if (number!= othersame.number) {
            return false;
        }
        if ((pull_request!= othersame.pull_request)&&((pull_request == null)||(!pull_request.equals(othersame.pull_request)))) {
            return false;
        }
        if ((state!= othersame.state)&&((state == null)||(!state.equals(othersame.state)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        if ((updated_at!= othersame.updated_at)&&((updated_at == null)||(!updated_at.equals(othersame.updated_at)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        if ((user!= othersame.user)&&((user == null)||(!user.equals(othersame.user)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((assignee == null)? 0 :assignee.hashCode())+((body == null)? 0 :body.hashCode()))+((closed_at == null)? 0 :closed_at.hashCode()))+ Long.hashCode(comments))+((created_at == null)? 0 :created_at.hashCode()))+((html_url == null)? 0 :html_url.hashCode()))+((labels == null)? 0 :labels.hashCode()))+((milestone == null)? 0 :milestone.hashCode()))+ Long.hashCode(number))+((pull_request == null)? 0 :pull_request.hashCode()))+((state == null)? 0 :state.hashCode()))+((title == null)? 0 :title.hashCode()))+((updated_at == null)? 0 :updated_at.hashCode()))+((url == null)? 0 :url.hashCode()))+((user == null)? 0 :user.hashCode()));
    }
}
