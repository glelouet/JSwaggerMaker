package api.github.com.definitions.branch.commit;

import api.github.com.definitions.branch.commit.commit.Author;

public class Commit {
    public Author author;
    public Author committer;
    public String message;
    public api.github.com.definitions.branches.Commit tree;
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
        if ((committer!= othersame.committer)&&((committer == null)||(!committer.equals(othersame.committer)))) {
            return false;
        }
        if ((message!= othersame.message)&&((message == null)||(!message.equals(othersame.message)))) {
            return false;
        }
        if ((tree!= othersame.tree)&&((tree == null)||(!tree.equals(othersame.tree)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((author == null)? 0 :author.hashCode())+((committer == null)? 0 :committer.hashCode()))+((message == null)? 0 :message.hashCode()))+((tree == null)? 0 :tree.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
