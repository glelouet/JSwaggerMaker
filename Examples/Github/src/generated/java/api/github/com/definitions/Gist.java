package api.github.com.definitions;

import api.github.com.definitions.gist.Forks;
import api.github.com.definitions.gist.History;
import api.github.com.definitions.gists.Files;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Gist {
    public long comments;
    public String comments_url;
    /**
     * Timestamp in ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
     */
    public String created_at;
    public String description;
    public Files files;
    public Forks[] forks;
    public String git_pull_url;
    public String git_push_url;
    public History[] history;
    public String html_url;
    public String id;
    @JsonProperty("public")
    public boolean _public;
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
        Gist othersame = ((Gist) other);
        if (comments!= othersame.comments) {
            return false;
        }
        if ((comments_url!= othersame.comments_url)&&((comments_url == null)||(!comments_url.equals(othersame.comments_url)))) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((files!= othersame.files)&&((files == null)||(!files.equals(othersame.files)))) {
            return false;
        }
        if ((forks!= othersame.forks)&&((forks == null)||(!forks.equals(othersame.forks)))) {
            return false;
        }
        if ((git_pull_url!= othersame.git_pull_url)&&((git_pull_url == null)||(!git_pull_url.equals(othersame.git_pull_url)))) {
            return false;
        }
        if ((git_push_url!= othersame.git_push_url)&&((git_push_url == null)||(!git_push_url.equals(othersame.git_push_url)))) {
            return false;
        }
        if ((history!= othersame.history)&&((history == null)||(!history.equals(othersame.history)))) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if (_public!= othersame._public) {
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
        return (((((((((((((Long.hashCode(comments)+((comments_url == null)? 0 :comments_url.hashCode()))+((created_at == null)? 0 :created_at.hashCode()))+((description == null)? 0 :description.hashCode()))+((files == null)? 0 :files.hashCode()))+((forks == null)? 0 :forks.hashCode()))+((git_pull_url == null)? 0 :git_pull_url.hashCode()))+((git_push_url == null)? 0 :git_push_url.hashCode()))+((history == null)? 0 :history.hashCode()))+((html_url == null)? 0 :html_url.hashCode()))+((id == null)? 0 :id.hashCode()))+ Boolean.hashCode(_public))+((url == null)? 0 :url.hashCode()))+((user == null)? 0 :user.hashCode()));
    }
}
