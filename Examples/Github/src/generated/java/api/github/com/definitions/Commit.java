package api.github.com.definitions;

import api.github.com.definitions.commit.Files;
import api.github.com.definitions.gist.history.ChangeStatus;

public class Commit {
    public User author;
    public api.github.com.definitions.branch.commit.Commit commit;
    public User committer;
    public Files[] files;
    public api.github.com.definitions.branches.Commit[] parents;
    public String sha;
    public ChangeStatus stats;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Commit othersame = ((Commit) other);
        if ((author!= othersame.author)&&((author == null)||(!author.equals(othersame.author)))) {
            return false;
        }
        if ((commit!= othersame.commit)&&((commit == null)||(!commit.equals(othersame.commit)))) {
            return false;
        }
        if ((committer!= othersame.committer)&&((committer == null)||(!committer.equals(othersame.committer)))) {
            return false;
        }
        if ((files!= othersame.files)&&((files == null)||(!files.equals(othersame.files)))) {
            return false;
        }
        if ((parents!= othersame.parents)&&((parents == null)||(!parents.equals(othersame.parents)))) {
            return false;
        }
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        if ((stats!= othersame.stats)&&((stats == null)||(!stats.equals(othersame.stats)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((author == null)? 0 :author.hashCode())+((commit == null)? 0 :commit.hashCode()))+((committer == null)? 0 :committer.hashCode()))+((files == null)? 0 :files.hashCode()))+((parents == null)? 0 :parents.hashCode()))+((sha == null)? 0 :sha.hashCode()))+((stats == null)? 0 :stats.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
