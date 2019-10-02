package api.github.com.definitions;

import api.github.com.definitions.gists.Files;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Gists {
    public long comments;
    public String comments_url;
    public String created_at;
    public String description;
    public Files files;
    public String git_pull_url;
    public String git_push_url;
    public String html_url;
    public String id;
    @JsonProperty("public")
    public boolean public_;
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
        Gists othersame = ((Gists) other);
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
        if ((git_pull_url!= othersame.git_pull_url)&&((git_pull_url == null)||(!git_pull_url.equals(othersame.git_pull_url)))) {
            return false;
        }
        if ((git_push_url!= othersame.git_push_url)&&((git_push_url == null)||(!git_push_url.equals(othersame.git_push_url)))) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if (public_!= othersame.public_) {
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
        return (((((((((((Long.hashCode(comments)+((comments_url == null)? 0 :comments_url.hashCode()))+((created_at == null)? 0 :created_at.hashCode()))+((description == null)? 0 :description.hashCode()))+((files == null)? 0 :files.hashCode()))+((git_pull_url == null)? 0 :git_pull_url.hashCode()))+((git_push_url == null)? 0 :git_push_url.hashCode()))+((html_url == null)? 0 :html_url.hashCode()))+((id == null)? 0 :id.hashCode()))+ Boolean.hashCode(public_))+((url == null)? 0 :url.hashCode()))+((user == null)? 0 :user.hashCode()));
    }
}
