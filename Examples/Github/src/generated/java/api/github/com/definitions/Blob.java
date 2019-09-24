package api.github.com.definitions;

import api.github.com.structures.Encoding;

public class Blob {
    public String content;
    public Encoding encoding;
    public String sha;
    public long size;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Blob othersame = ((Blob) other);
        if ((content!= othersame.content)&&((content == null)||(!content.equals(othersame.content)))) {
            return false;
        }
        if ((encoding!= othersame.encoding)&&((encoding == null)||(!encoding.equals(othersame.encoding)))) {
            return false;
        }
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        if (size!= othersame.size) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((content == null)? 0 :content.hashCode())+((encoding == null)? 0 :encoding.hashCode()))+((sha == null)? 0 :sha.hashCode()))+ Long.hashCode(size));
    }
}
