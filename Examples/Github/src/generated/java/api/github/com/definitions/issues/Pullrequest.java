package api.github.com.definitions.issues;

public class Pullrequest {
    public String diff_url;
    public String html_url;
    public String patch_url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Pullrequest othersame = ((Pullrequest) other);
        if ((diff_url!= othersame.diff_url)&&((diff_url == null)||(!diff_url.equals(othersame.diff_url)))) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if ((patch_url!= othersame.patch_url)&&((patch_url == null)||(!patch_url.equals(othersame.patch_url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((diff_url == null)? 0 :diff_url.hashCode())+((html_url == null)? 0 :html_url.hashCode()))+((patch_url == null)? 0 :patch_url.hashCode()));
    }
}
