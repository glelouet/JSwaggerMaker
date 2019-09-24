package api.github.com.definitions.notifications;

public class Subject {
    public String latest_comment_url;
    public String title;
    public String type;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Subject othersame = ((Subject) other);
        if ((latest_comment_url!= othersame.latest_comment_url)&&((latest_comment_url == null)||(!latest_comment_url.equals(othersame.latest_comment_url)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
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
        return (((((latest_comment_url == null)? 0 :latest_comment_url.hashCode())+((title == null)? 0 :title.hashCode()))+((type == null)? 0 :type.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
