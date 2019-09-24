package api.github.com.definitions.createfile.commit;

public class Parents {
    public String html_url;
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
        Parents othersame = ((Parents) other);
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
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
        return ((((html_url == null)? 0 :html_url.hashCode())+((sha == null)? 0 :sha.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
