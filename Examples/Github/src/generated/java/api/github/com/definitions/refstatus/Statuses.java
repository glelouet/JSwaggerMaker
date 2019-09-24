package api.github.com.definitions.refstatus;

public class Statuses {
    public String context;
    public String created_at;
    public String description;
    public double id;
    public String state;
    public String target_url;
    public String updated_at;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Statuses othersame = ((Statuses) other);
        if ((context!= othersame.context)&&((context == null)||(!context.equals(othersame.context)))) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((state!= othersame.state)&&((state == null)||(!state.equals(othersame.state)))) {
            return false;
        }
        if ((target_url!= othersame.target_url)&&((target_url == null)||(!target_url.equals(othersame.target_url)))) {
            return false;
        }
        if ((updated_at!= othersame.updated_at)&&((updated_at == null)||(!updated_at.equals(othersame.updated_at)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((context == null)? 0 :context.hashCode())+((created_at == null)? 0 :created_at.hashCode()))+((description == null)? 0 :description.hashCode()))+ Double.hashCode(id))+((state == null)? 0 :state.hashCode()))+((target_url == null)? 0 :target_url.hashCode()))+((updated_at == null)? 0 :updated_at.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
