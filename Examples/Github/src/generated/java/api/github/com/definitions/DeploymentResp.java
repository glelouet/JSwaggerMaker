package api.github.com.definitions;

public class DeploymentResp {
    public String created_at;
    public User creator;
    public String description;
    public long id;
    public String payload;
    public String sha;
    public String statuses_url;
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
        DeploymentResp othersame = ((DeploymentResp) other);
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if ((creator!= othersame.creator)&&((creator == null)||(!creator.equals(othersame.creator)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((payload!= othersame.payload)&&((payload == null)||(!payload.equals(othersame.payload)))) {
            return false;
        }
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        if ((statuses_url!= othersame.statuses_url)&&((statuses_url == null)||(!statuses_url.equals(othersame.statuses_url)))) {
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
        return ((((((((((created_at == null)? 0 :created_at.hashCode())+((creator == null)? 0 :creator.hashCode()))+((description == null)? 0 :description.hashCode()))+ Long.hashCode(id))+((payload == null)? 0 :payload.hashCode()))+((sha == null)? 0 :sha.hashCode()))+((statuses_url == null)? 0 :statuses_url.hashCode()))+((updated_at == null)? 0 :updated_at.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
