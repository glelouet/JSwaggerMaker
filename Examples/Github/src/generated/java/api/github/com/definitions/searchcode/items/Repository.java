package api.github.com.definitions.searchcode.items;

import api.github.com.definitions.Actor;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Repository {
    public String archive_url;
    public String assignees_url;
    public String blobs_url;
    public String branches_url;
    public String collaborators_url;
    public String comments_url;
    public String commits_url;
    public String compare_url;
    public String contents_url;
    public String contributors_url;
    public String description;
    public String downloads_url;
    public String events_url;
    public boolean fork;
    public String forks_url;
    public String full_name;
    public String git_commits_url;
    public String git_refs_url;
    public String git_tags_url;
    public String hooks_url;
    public String html_url;
    public long id;
    public String issue_comment_url;
    public String issue_events_url;
    public String issues_url;
    public String keys_url;
    public String labels_url;
    public String languages_url;
    public String merges_url;
    public String milestones_url;
    public String name;
    public String notifications_url;
    public Actor owner;
    @JsonProperty("private")
    public boolean _private;
    public String pulls_url;
    public String stargazers_url;
    public String statuses_url;
    public String subscribers_url;
    public String subscription_url;
    public String tags_url;
    public String teams_url;
    public String trees_url;
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
        if ((archive_url!= othersame.archive_url)&&((archive_url == null)||(!archive_url.equals(othersame.archive_url)))) {
            return false;
        }
        if ((assignees_url!= othersame.assignees_url)&&((assignees_url == null)||(!assignees_url.equals(othersame.assignees_url)))) {
            return false;
        }
        if ((blobs_url!= othersame.blobs_url)&&((blobs_url == null)||(!blobs_url.equals(othersame.blobs_url)))) {
            return false;
        }
        if ((branches_url!= othersame.branches_url)&&((branches_url == null)||(!branches_url.equals(othersame.branches_url)))) {
            return false;
        }
        if ((collaborators_url!= othersame.collaborators_url)&&((collaborators_url == null)||(!collaborators_url.equals(othersame.collaborators_url)))) {
            return false;
        }
        if ((comments_url!= othersame.comments_url)&&((comments_url == null)||(!comments_url.equals(othersame.comments_url)))) {
            return false;
        }
        if ((commits_url!= othersame.commits_url)&&((commits_url == null)||(!commits_url.equals(othersame.commits_url)))) {
            return false;
        }
        if ((compare_url!= othersame.compare_url)&&((compare_url == null)||(!compare_url.equals(othersame.compare_url)))) {
            return false;
        }
        if ((contents_url!= othersame.contents_url)&&((contents_url == null)||(!contents_url.equals(othersame.contents_url)))) {
            return false;
        }
        if ((contributors_url!= othersame.contributors_url)&&((contributors_url == null)||(!contributors_url.equals(othersame.contributors_url)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((downloads_url!= othersame.downloads_url)&&((downloads_url == null)||(!downloads_url.equals(othersame.downloads_url)))) {
            return false;
        }
        if ((events_url!= othersame.events_url)&&((events_url == null)||(!events_url.equals(othersame.events_url)))) {
            return false;
        }
        if (fork!= othersame.fork) {
            return false;
        }
        if ((forks_url!= othersame.forks_url)&&((forks_url == null)||(!forks_url.equals(othersame.forks_url)))) {
            return false;
        }
        if ((full_name!= othersame.full_name)&&((full_name == null)||(!full_name.equals(othersame.full_name)))) {
            return false;
        }
        if ((git_commits_url!= othersame.git_commits_url)&&((git_commits_url == null)||(!git_commits_url.equals(othersame.git_commits_url)))) {
            return false;
        }
        if ((git_refs_url!= othersame.git_refs_url)&&((git_refs_url == null)||(!git_refs_url.equals(othersame.git_refs_url)))) {
            return false;
        }
        if ((git_tags_url!= othersame.git_tags_url)&&((git_tags_url == null)||(!git_tags_url.equals(othersame.git_tags_url)))) {
            return false;
        }
        if ((hooks_url!= othersame.hooks_url)&&((hooks_url == null)||(!hooks_url.equals(othersame.hooks_url)))) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((issue_comment_url!= othersame.issue_comment_url)&&((issue_comment_url == null)||(!issue_comment_url.equals(othersame.issue_comment_url)))) {
            return false;
        }
        if ((issue_events_url!= othersame.issue_events_url)&&((issue_events_url == null)||(!issue_events_url.equals(othersame.issue_events_url)))) {
            return false;
        }
        if ((issues_url!= othersame.issues_url)&&((issues_url == null)||(!issues_url.equals(othersame.issues_url)))) {
            return false;
        }
        if ((keys_url!= othersame.keys_url)&&((keys_url == null)||(!keys_url.equals(othersame.keys_url)))) {
            return false;
        }
        if ((labels_url!= othersame.labels_url)&&((labels_url == null)||(!labels_url.equals(othersame.labels_url)))) {
            return false;
        }
        if ((languages_url!= othersame.languages_url)&&((languages_url == null)||(!languages_url.equals(othersame.languages_url)))) {
            return false;
        }
        if ((merges_url!= othersame.merges_url)&&((merges_url == null)||(!merges_url.equals(othersame.merges_url)))) {
            return false;
        }
        if ((milestones_url!= othersame.milestones_url)&&((milestones_url == null)||(!milestones_url.equals(othersame.milestones_url)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((notifications_url!= othersame.notifications_url)&&((notifications_url == null)||(!notifications_url.equals(othersame.notifications_url)))) {
            return false;
        }
        if ((owner!= othersame.owner)&&((owner == null)||(!owner.equals(othersame.owner)))) {
            return false;
        }
        if (_private!= othersame._private) {
            return false;
        }
        if ((pulls_url!= othersame.pulls_url)&&((pulls_url == null)||(!pulls_url.equals(othersame.pulls_url)))) {
            return false;
        }
        if ((stargazers_url!= othersame.stargazers_url)&&((stargazers_url == null)||(!stargazers_url.equals(othersame.stargazers_url)))) {
            return false;
        }
        if ((statuses_url!= othersame.statuses_url)&&((statuses_url == null)||(!statuses_url.equals(othersame.statuses_url)))) {
            return false;
        }
        if ((subscribers_url!= othersame.subscribers_url)&&((subscribers_url == null)||(!subscribers_url.equals(othersame.subscribers_url)))) {
            return false;
        }
        if ((subscription_url!= othersame.subscription_url)&&((subscription_url == null)||(!subscription_url.equals(othersame.subscription_url)))) {
            return false;
        }
        if ((tags_url!= othersame.tags_url)&&((tags_url == null)||(!tags_url.equals(othersame.tags_url)))) {
            return false;
        }
        if ((teams_url!= othersame.teams_url)&&((teams_url == null)||(!teams_url.equals(othersame.teams_url)))) {
            return false;
        }
        if ((trees_url!= othersame.trees_url)&&((trees_url == null)||(!trees_url.equals(othersame.trees_url)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((archive_url == null)? 0 :archive_url.hashCode())+((assignees_url == null)? 0 :assignees_url.hashCode()))+((blobs_url == null)? 0 :blobs_url.hashCode()))+((branches_url == null)? 0 :branches_url.hashCode()))+((collaborators_url == null)? 0 :collaborators_url.hashCode()))+((comments_url == null)? 0 :comments_url.hashCode()))+((commits_url == null)? 0 :commits_url.hashCode()))+((compare_url == null)? 0 :compare_url.hashCode()))+((contents_url == null)? 0 :contents_url.hashCode()))+((contributors_url == null)? 0 :contributors_url.hashCode()))+((description == null)? 0 :description.hashCode()))+((downloads_url == null)? 0 :downloads_url.hashCode()))+((events_url == null)? 0 :events_url.hashCode()))+ Boolean.hashCode(fork))+((forks_url == null)? 0 :forks_url.hashCode()))+((full_name == null)? 0 :full_name.hashCode()))+((git_commits_url == null)? 0 :git_commits_url.hashCode()))+((git_refs_url == null)? 0 :git_refs_url.hashCode()))+((git_tags_url == null)? 0 :git_tags_url.hashCode()))+((hooks_url == null)? 0 :hooks_url.hashCode()))+((html_url == null)? 0 :html_url.hashCode()))+ Long.hashCode(id))+((issue_comment_url == null)? 0 :issue_comment_url.hashCode()))+((issue_events_url == null)? 0 :issue_events_url.hashCode()))+((issues_url == null)? 0 :issues_url.hashCode()))+((keys_url == null)? 0 :keys_url.hashCode()))+((labels_url == null)? 0 :labels_url.hashCode()))+((languages_url == null)? 0 :languages_url.hashCode()))+((merges_url == null)? 0 :merges_url.hashCode()))+((milestones_url == null)? 0 :milestones_url.hashCode()))+((name == null)? 0 :name.hashCode()))+((notifications_url == null)? 0 :notifications_url.hashCode()))+((owner == null)? 0 :owner.hashCode()))+ Boolean.hashCode(_private))+((pulls_url == null)? 0 :pulls_url.hashCode()))+((stargazers_url == null)? 0 :stargazers_url.hashCode()))+((statuses_url == null)? 0 :statuses_url.hashCode()))+((subscribers_url == null)? 0 :subscribers_url.hashCode()))+((subscription_url == null)? 0 :subscription_url.hashCode()))+((tags_url == null)? 0 :tags_url.hashCode()))+((teams_url == null)? 0 :teams_url.hashCode()))+((trees_url == null)? 0 :trees_url.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
