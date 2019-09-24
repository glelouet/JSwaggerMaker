package api.github.com.definitions;

public class Tree {
    public String sha;
    public api.github.com.definitions.tree.Tree[] tree;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Tree othersame = ((Tree) other);
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
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
        return ((((sha == null)? 0 :sha.hashCode())+((tree == null)? 0 :tree.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
