package api.github.com.definitions.tree;

import api.github.com.structures.Mode;
import api.github.com.structures.Type;

public class Tree {
    /**
     * One of 100644 for file (blob), 100755 for executable (blob), 040000 for subdirectory (tree), 160000 for submodule (commit) or 120000 for a blob that specifies the path of a symlink.
     */
    public Mode mode;
    public String path;
    /**
     * SHA1 checksum ID of the object in the tree.
     */
    public String sha;
    public long size;
    public Type type;
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
        if ((mode!= othersame.mode)&&((mode == null)||(!mode.equals(othersame.mode)))) {
            return false;
        }
        if ((path!= othersame.path)&&((path == null)||(!path.equals(othersame.path)))) {
            return false;
        }
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        if (size!= othersame.size) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((mode == null)? 0 :mode.hashCode())+((path == null)? 0 :path.hashCode()))+((sha == null)? 0 :sha.hashCode()))+ Long.hashCode(size))+((type == null)? 0 :type.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
