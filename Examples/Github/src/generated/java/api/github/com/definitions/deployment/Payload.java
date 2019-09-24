package api.github.com.definitions.deployment;

public class Payload {
    public String deploy_user;
    public String environment;
    public double room_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Payload othersame = ((Payload) other);
        if ((deploy_user!= othersame.deploy_user)&&((deploy_user == null)||(!deploy_user.equals(othersame.deploy_user)))) {
            return false;
        }
        if ((environment!= othersame.environment)&&((environment == null)||(!environment.equals(othersame.environment)))) {
            return false;
        }
        if (room_id!= othersame.room_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((deploy_user == null)? 0 :deploy_user.hashCode())+((environment == null)? 0 :environment.hashCode()))+ Double.hashCode(room_id));
    }
}
