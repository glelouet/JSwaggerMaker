package api.github.com.definitions;

import api.github.com.definitions.pulls.Base;
import api.github.com.definitions.pulls.Links;
import api.github.com.definitions.pulls.base.User;

public class Pulls {
    public Links _links;
    public Base base;
    public String body;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String closed_at;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String created_at;
    public String diff_url;
    public Base head;
    public String html_url;
    public String issue_url;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String merged_at;
    public long number;
    public String patch_url;
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
        Pulls othersame = ((Pulls) other);
        if ((_links!= othersame._links)&&((_links == null)||(!_links.equals(othersame._links)))) {
            return false;
        }
        if ((base!= othersame.base)&&((base == null)||(!base.equals(othersame.base)))) {
            return false;
        }
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        if ((closed_at!= othersame.closed_at)&&((closed_at == null)||(!closed_at.equals(othersame.closed_at)))) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if ((diff_url!= othersame.diff_url)&&((diff_url == null)||(!diff_url.equals(othersame.diff_url)))) {
            return false;
        }
        if ((head!= othersame.head)&&((head == null)||(!head.equals(othersame.head)))) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if ((issue_url!= othersame.issue_url)&&((issue_url == null)||(!issue_url.equals(othersame.issue_url)))) {
            return false;
        }
        if ((merged_at!= othersame.merged_at)&&((merged_at == null)||(!merged_at.equals(othersame.merged_at)))) {
            return false;
        }
        if (number!= othersame.number) {
            return false;
        }
        if ((patch_url!= othersame.patch_url)&&((patch_url == null)||(!patch_url.equals(othersame.patch_url)))) {
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
        return ((((((((((((((((((_links == null)? 0 :_links.hashCode())+((base == null)? 0 :base.hashCode()))+((body == null)? 0 :body.hashCode()))+((closed_at == null)? 0 :closed_at.hashCode()))+((created_at == null)? 0 :created_at.hashCode()))+((diff_url == null)? 0 :diff_url.hashCode()))+((head == null)? 0 :head.hashCode()))+((html_url == null)? 0 :html_url.hashCode()))+((issue_url == null)? 0 :issue_url.hashCode()))+((merged_at == null)? 0 :merged_at.hashCode()))+ Long.hashCode(number))+((patch_url == null)? 0 :patch_url.hashCode()))+((state == null)? 0 :state.hashCode()))+((title == null)? 0 :title.hashCode()))+((updated_at == null)? 0 :updated_at.hashCode()))+((url == null)? 0 :url.hashCode()))+((user == null)? 0 :user.hashCode()));
    }
}
