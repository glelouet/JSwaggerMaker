package api.github.com.definitions.searchcode;

import api.github.com.definitions.searchcode.items.Repository;

public class Items {
    public String git_url;
    public String html_url;
    public String name;
    public String path;
    public Repository repository;
    public double score;
    public String sha;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Items othersame = ((Items) other);
        if ((git_url!= othersame.git_url)&&((git_url == null)||(!git_url.equals(othersame.git_url)))) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((path!= othersame.path)&&((path == null)||(!path.equals(othersame.path)))) {
            return false;
        }
        if ((repository!= othersame.repository)&&((repository == null)||(!repository.equals(othersame.repository)))) {
            return false;
        }
        if (score!= othersame.score) {
            return false;
        }
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((git_url == null)? 0 :git_url.hashCode())+((html_url == null)? 0 :html_url.hashCode()))+((name == null)? 0 :name.hashCode()))+((path == null)? 0 :path.hashCode()))+((repository == null)? 0 :repository.hashCode()))+ Double.hashCode(score))+((sha == null)? 0 :sha.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
