package api.github.com.definitions;

public class Issue {
    public String assignee;
    public String body;
    public String[] labels;
    public double milestone;
    public String title;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Issue othersame = ((Issue) other);
        if ((assignee!= othersame.assignee)&&((assignee == null)||(!assignee.equals(othersame.assignee)))) {
            return false;
        }
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        if ((labels!= othersame.labels)&&((labels == null)||(!labels.equals(othersame.labels)))) {
            return false;
        }
        if (milestone!= othersame.milestone) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((assignee == null)? 0 :assignee.hashCode())+((body == null)? 0 :body.hashCode()))+((labels == null)? 0 :labels.hashCode()))+ Double.hashCode(milestone))+((title == null)? 0 :title.hashCode()));
    }
}
