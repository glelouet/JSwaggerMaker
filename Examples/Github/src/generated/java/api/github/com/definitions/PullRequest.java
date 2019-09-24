package api.github.com.definitions;

import api.github.com.definitions.pulls.Base;
import api.github.com.definitions.pulls.Links;
import api.github.com.definitions.pulls.base.User;

public class PullRequest {
    public Links _links;
    public long additions;
    public Base base;
    public String body;
    public long changed_files;
    public String closed_at;
    public long comments;
    public long commits;
    public String created_at;
    public long deletions;
    public String diff_url;
    public Base head;
    public String html_url;
    public String issue_url;
    public String merge_commit_sha;
    public boolean mergeable;
    public boolean merged;
    public String merged_at;
    public User merged_by;
    public long number;
    public String patch_url;
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
        PullRequest othersame = ((PullRequest) other);
        if ((_links!= othersame._links)&&((_links == null)||(!_links.equals(othersame._links)))) {
            return false;
        }
        if (additions!= othersame.additions) {
            return false;
        }
        if ((base!= othersame.base)&&((base == null)||(!base.equals(othersame.base)))) {
            return false;
        }
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        if (changed_files!= othersame.changed_files) {
            return false;
        }
        if ((closed_at!= othersame.closed_at)&&((closed_at == null)||(!closed_at.equals(othersame.closed_at)))) {
            return false;
        }
        if (comments!= othersame.comments) {
            return false;
        }
        if (commits!= othersame.commits) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if (deletions!= othersame.deletions) {
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
        if ((merge_commit_sha!= othersame.merge_commit_sha)&&((merge_commit_sha == null)||(!merge_commit_sha.equals(othersame.merge_commit_sha)))) {
            return false;
        }
        if (mergeable!= othersame.mergeable) {
            return false;
        }
        if (merged!= othersame.merged) {
            return false;
        }
        if ((merged_at!= othersame.merged_at)&&((merged_at == null)||(!merged_at.equals(othersame.merged_at)))) {
            return false;
        }
        if ((merged_by!= othersame.merged_by)&&((merged_by == null)||(!merged_by.equals(othersame.merged_by)))) {
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
        return (((((((((((((((((((((((((((_links == null)? 0 :_links.hashCode())+ Long.hashCode(additions))+((base == null)? 0 :base.hashCode()))+((body == null)? 0 :body.hashCode()))+ Long.hashCode(changed_files))+((closed_at == null)? 0 :closed_at.hashCode()))+ Long.hashCode(comments))+ Long.hashCode(commits))+((created_at == null)? 0 :created_at.hashCode()))+ Long.hashCode(deletions))+((diff_url == null)? 0 :diff_url.hashCode()))+((head == null)? 0 :head.hashCode()))+((html_url == null)? 0 :html_url.hashCode()))+((issue_url == null)? 0 :issue_url.hashCode()))+((merge_commit_sha == null)? 0 :merge_commit_sha.hashCode()))+ Boolean.hashCode(mergeable))+ Boolean.hashCode(merged))+((merged_at == null)? 0 :merged_at.hashCode()))+((merged_by == null)? 0 :merged_by.hashCode()))+ Long.hashCode(number))+((patch_url == null)? 0 :patch_url.hashCode()))+((state == null)? 0 :state.hashCode()))+((title == null)? 0 :title.hashCode()))+((updated_at == null)? 0 :updated_at.hashCode()))+((url == null)? 0 :url.hashCode()))+((user == null)? 0 :user.hashCode()));
    }
}
