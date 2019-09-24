package api.github.com.definitions;

import api.github.com.definitions.issuescomments.Links;

public class IssuesComments {
    public Links _links;
    public String body;
    public String commit_id;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String created_at;
    public long id;
    public String path;
    public long position;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String updated_at;
    public String url;
    public User user;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        IssuesComments othersame = ((IssuesComments) other);
        if ((_links!= othersame._links)&&((_links == null)||(!_links.equals(othersame._links)))) {
            return false;
        }
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        if ((commit_id!= othersame.commit_id)&&((commit_id == null)||(!commit_id.equals(othersame.commit_id)))) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((path!= othersame.path)&&((path == null)||(!path.equals(othersame.path)))) {
            return false;
        }
        if (position!= othersame.position) {
            return false;
        }
        if ((updated_at!= othersame.updated_at)&&((updated_at == null)||(!updated_at.equals(othersame.updated_at)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        if ((user!= othersame.user)&&((user == null)||(!user.equals(othersame.user)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((_links == null)? 0 :_links.hashCode())+((body == null)? 0 :body.hashCode()))+((commit_id == null)? 0 :commit_id.hashCode()))+((created_at == null)? 0 :created_at.hashCode()))+ Long.hashCode(id))+((path == null)? 0 :path.hashCode()))+ Long.hashCode(position))+((updated_at == null)? 0 :updated_at.hashCode()))+((url == null)? 0 :url.hashCode()))+((user == null)? 0 :user.hashCode()));
    }
}
