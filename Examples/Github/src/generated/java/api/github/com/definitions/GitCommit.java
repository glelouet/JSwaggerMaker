package api.github.com.definitions;

import api.github.com.definitions.branch.commit.commit.Author;

public class GitCommit {
    public Author author;
    public String message;
    public String parents;
    public String tree;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GitCommit othersame = ((GitCommit) other);
        if ((author!= othersame.author)&&((author == null)||(!author.equals(othersame.author)))) {
            return false;
        }
        if ((message!= othersame.message)&&((message == null)||(!message.equals(othersame.message)))) {
            return false;
        }
        if ((parents!= othersame.parents)&&((parents == null)||(!parents.equals(othersame.parents)))) {
            return false;
        }
        if ((tree!= othersame.tree)&&((tree == null)||(!tree.equals(othersame.tree)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((author == null)? 0 :author.hashCode())+((message == null)? 0 :message.hashCode()))+((parents == null)? 0 :parents.hashCode()))+((tree == null)? 0 :tree.hashCode()));
    }
}
