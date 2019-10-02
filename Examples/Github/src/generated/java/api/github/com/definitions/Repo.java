package api.github.com.definitions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Repo {
    public String clone_url;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String created_at;
    public String description;
    public boolean fork;
    public long forks;
    public long forks_count;
    public String full_name;
    public String git_url;
    public boolean has_downloads;
    public boolean has_issues;
    public boolean has_wiki;
    public String homepage;
    public String html_url;
    public long id;
    public String language;
    public String master_branch;
    public String mirror_url;
    public String name;
    public long open_issues;
    public long open_issues_count;
    public Organization organization;
    public Actor owner;
    public Repo parent;
    @JsonProperty("private")
    public boolean private_;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String pushed_at;
    public long size;
    public Repo source;
    public String ssh_url;
    public String svn_url;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String updated_at;
    public String url;
    public long watchers;
    public long watchers_count;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Repo othersame = ((Repo) other);
        if ((clone_url!= othersame.clone_url)&&((clone_url == null)||(!clone_url.equals(othersame.clone_url)))) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if (fork!= othersame.fork) {
            return false;
        }
        if (forks!= othersame.forks) {
            return false;
        }
        if (forks_count!= othersame.forks_count) {
            return false;
        }
        if ((full_name!= othersame.full_name)&&((full_name == null)||(!full_name.equals(othersame.full_name)))) {
            return false;
        }
        if ((git_url!= othersame.git_url)&&((git_url == null)||(!git_url.equals(othersame.git_url)))) {
            return false;
        }
        if (has_downloads!= othersame.has_downloads) {
            return false;
        }
        if (has_issues!= othersame.has_issues) {
            return false;
        }
        if (has_wiki!= othersame.has_wiki) {
            return false;
        }
        if ((homepage!= othersame.homepage)&&((homepage == null)||(!homepage.equals(othersame.homepage)))) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((language!= othersame.language)&&((language == null)||(!language.equals(othersame.language)))) {
            return false;
        }
        if ((master_branch!= othersame.master_branch)&&((master_branch == null)||(!master_branch.equals(othersame.master_branch)))) {
            return false;
        }
        if ((mirror_url!= othersame.mirror_url)&&((mirror_url == null)||(!mirror_url.equals(othersame.mirror_url)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (open_issues!= othersame.open_issues) {
            return false;
        }
        if (open_issues_count!= othersame.open_issues_count) {
            return false;
        }
        if ((organization!= othersame.organization)&&((organization == null)||(!organization.equals(othersame.organization)))) {
            return false;
        }
        if ((owner!= othersame.owner)&&((owner == null)||(!owner.equals(othersame.owner)))) {
            return false;
        }
        if ((parent!= othersame.parent)&&((parent == null)||(!parent.equals(othersame.parent)))) {
            return false;
        }
        if (private_!= othersame.private_) {
            return false;
        }
        if ((pushed_at!= othersame.pushed_at)&&((pushed_at == null)||(!pushed_at.equals(othersame.pushed_at)))) {
            return false;
        }
        if (size!= othersame.size) {
            return false;
        }
        if ((source!= othersame.source)&&((source == null)||(!source.equals(othersame.source)))) {
            return false;
        }
        if ((ssh_url!= othersame.ssh_url)&&((ssh_url == null)||(!ssh_url.equals(othersame.ssh_url)))) {
            return false;
        }
        if ((svn_url!= othersame.svn_url)&&((svn_url == null)||(!svn_url.equals(othersame.svn_url)))) {
            return false;
        }
        if ((updated_at!= othersame.updated_at)&&((updated_at == null)||(!updated_at.equals(othersame.updated_at)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        if (watchers!= othersame.watchers) {
            return false;
        }
        if (watchers_count!= othersame.watchers_count) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((clone_url == null)? 0 :clone_url.hashCode())+((created_at == null)? 0 :created_at.hashCode()))+((description == null)? 0 :description.hashCode()))+ Boolean.hashCode(fork))+ Long.hashCode(forks))+ Long.hashCode(forks_count))+((full_name == null)? 0 :full_name.hashCode()))+((git_url == null)? 0 :git_url.hashCode()))+ Boolean.hashCode(has_downloads))+ Boolean.hashCode(has_issues))+ Boolean.hashCode(has_wiki))+((homepage == null)? 0 :homepage.hashCode()))+((html_url == null)? 0 :html_url.hashCode()))+ Long.hashCode(id))+((language == null)? 0 :language.hashCode()))+((master_branch == null)? 0 :master_branch.hashCode()))+((mirror_url == null)? 0 :mirror_url.hashCode()))+((name == null)? 0 :name.hashCode()))+ Long.hashCode(open_issues))+ Long.hashCode(open_issues_count))+((organization == null)? 0 :organization.hashCode()))+((owner == null)? 0 :owner.hashCode()))+((parent == null)? 0 :parent.hashCode()))+ Boolean.hashCode(private_))+((pushed_at == null)? 0 :pushed_at.hashCode()))+ Long.hashCode(size))+((source == null)? 0 :source.hashCode()))+((ssh_url == null)? 0 :ssh_url.hashCode()))+((svn_url == null)? 0 :svn_url.hashCode()))+((updated_at == null)? 0 :updated_at.hashCode()))+((url == null)? 0 :url.hashCode()))+ Long.hashCode(watchers))+ Long.hashCode(watchers_count));
    }
}
