package esi.evetech.net.responses;

public class GetOpportunitiesTasksTaskId {
    /**
     * description string
     */
    public String description;
    /**
     * name string
     */
    public String name;
    /**
     * notification string
     */
    public String notification;
    /**
     * task_id integer
     */
    public int task_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetOpportunitiesTasksTaskId othersame = ((GetOpportunitiesTasksTaskId) other);
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((notification!= othersame.notification)&&((notification == null)||(!notification.equals(othersame.notification)))) {
            return false;
        }
        if (task_id!= othersame.task_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((description == null)? 0 :description.hashCode())+((name == null)? 0 :name.hashCode()))+((notification == null)? 0 :notification.hashCode()))+ task_id);
    }
}
