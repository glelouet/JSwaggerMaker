package api.github.com.definitions;

public class DeploymentStatusesCreate {
    public String description;
    public String state;
    public String target_url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        DeploymentStatusesCreate othersame = ((DeploymentStatusesCreate) other);
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((state!= othersame.state)&&((state == null)||(!state.equals(othersame.state)))) {
            return false;
        }
        if ((target_url!= othersame.target_url)&&((target_url == null)||(!target_url.equals(othersame.target_url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((description == null)? 0 :description.hashCode())+((state == null)? 0 :state.hashCode()))+((target_url == null)? 0 :target_url.hashCode()));
    }
}
