package api.github.com.definitions.postgist.files;

public class File1txt {
    public String content;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        File1txt othersame = ((File1txt) other);
        if ((content!= othersame.content)&&((content == null)||(!content.equals(othersame.content)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((content == null)? 0 :content.hashCode());
    }
}
