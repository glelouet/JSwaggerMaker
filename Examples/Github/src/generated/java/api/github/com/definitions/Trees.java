package api.github.com.definitions;

public class Trees {
    public String base_tree;
    /**
     * SHA1 checksum ID of the object in the tree.
     */
    public String sha;
    public Tree[] tree;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Trees othersame = ((Trees) other);
        if ((base_tree!= othersame.base_tree)&&((base_tree == null)||(!base_tree.equals(othersame.base_tree)))) {
            return false;
        }
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
        return (((((base_tree == null)? 0 :base_tree.hashCode())+((sha == null)? 0 :sha.hashCode()))+((tree == null)? 0 :tree.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
