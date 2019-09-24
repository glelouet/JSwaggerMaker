package api.github.com.definitions.gists.files;

public class Ringerl {
    public String filename;
    public String raw_url;
    public long size;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Ringerl othersame = ((Ringerl) other);
        if ((filename!= othersame.filename)&&((filename == null)||(!filename.equals(othersame.filename)))) {
            return false;
        }
        if ((raw_url!= othersame.raw_url)&&((raw_url == null)||(!raw_url.equals(othersame.raw_url)))) {
            return false;
        }
        if (size!= othersame.size) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((filename == null)? 0 :filename.hashCode())+((raw_url == null)? 0 :raw_url.hashCode()))+ Long.hashCode(size));
    }
}
