package api.github.com.definitions;

public class PullsPost {
    public String base;
    public String body;
    public String head;
    public String title;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PullsPost othersame = ((PullsPost) other);
        if ((base!= othersame.base)&&((base == null)||(!base.equals(othersame.base)))) {
            return false;
        }
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        if ((head!= othersame.head)&&((head == null)||(!head.equals(othersame.head)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((base == null)? 0 :base.hashCode())+((body == null)? 0 :body.hashCode()))+((head == null)? 0 :head.hashCode()))+((title == null)? 0 :title.hashCode()));
    }
}
