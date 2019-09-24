package api.github.com.definitions.searchissues;

import api.github.com.definitions.User;
import api.github.com.definitions.issues.Labels;

public class Items {
    public String body;
    public long comments;
    public String comments_url;
    public String created_at;
    public String events_url;
    public String html_url;
    public long id;
    public Labels[] labels;
    public String labels_url;
    public long number;
    public Object pull_request;
    public double score;
    public String state;
    public String title;
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
        Items othersame = ((Items) other);
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        if (comments!= othersame.comments) {
            return false;
        }
        if ((comments_url!= othersame.comments_url)&&((comments_url == null)||(!comments_url.equals(othersame.comments_url)))) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if ((events_url!= othersame.events_url)&&((events_url == null)||(!events_url.equals(othersame.events_url)))) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((labels!= othersame.labels)&&((labels == null)||(!labels.equals(othersame.labels)))) {
            return false;
        }
        if ((labels_url!= othersame.labels_url)&&((labels_url == null)||(!labels_url.equals(othersame.labels_url)))) {
            return false;
        }
        if (number!= othersame.number) {
            return false;
        }
        if ((pull_request!= othersame.pull_request)&&((pull_request == null)||(!pull_request.equals(othersame.pull_request)))) {
            return false;
        }
        if (score!= othersame.score) {
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
        return ((((((((((((((((((body == null)? 0 :body.hashCode())+ Long.hashCode(comments))+((comments_url == null)? 0 :comments_url.hashCode()))+((created_at == null)? 0 :created_at.hashCode()))+((events_url == null)? 0 :events_url.hashCode()))+((html_url == null)? 0 :html_url.hashCode()))+ Long.hashCode(id))+((labels == null)? 0 :labels.hashCode()))+((labels_url == null)? 0 :labels_url.hashCode()))+ Long.hashCode(number))+((pull_request == null)? 0 :pull_request.hashCode()))+ Double.hashCode(score))+((state == null)? 0 :state.hashCode()))+((title == null)? 0 :title.hashCode()))+((updated_at == null)? 0 :updated_at.hashCode()))+((url == null)? 0 :url.hashCode()))+((user == null)? 0 :user.hashCode()));
    }
}
