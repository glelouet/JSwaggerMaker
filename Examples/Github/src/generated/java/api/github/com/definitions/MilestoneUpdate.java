package api.github.com.definitions;

public class MilestoneUpdate {
    public String description;
    public String due_on;
    public String state;
    public String title;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        MilestoneUpdate othersame = ((MilestoneUpdate) other);
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((due_on!= othersame.due_on)&&((due_on == null)||(!due_on.equals(othersame.due_on)))) {
            return false;
        }
        if ((state!= othersame.state)&&((state == null)||(!state.equals(othersame.state)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((description == null)? 0 :description.hashCode())+((due_on == null)? 0 :due_on.hashCode()))+((state == null)? 0 :state.hashCode()))+((title == null)? 0 :title.hashCode()));
    }
}
