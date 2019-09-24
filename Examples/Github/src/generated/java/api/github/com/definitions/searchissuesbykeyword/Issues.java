package api.github.com.definitions.searchissuesbykeyword;

public class Issues {
    public String body;
    public long comments;
    public String created_at;
    public String gravatar_id;
    public String html_url;
    public String[] labels;
    public long number;
    public long position;
    public String state;
    public String title;
    public String updated_at;
    public String user;
    public long votes;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Issues othersame = ((Issues) other);
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        if (comments!= othersame.comments) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if ((gravatar_id!= othersame.gravatar_id)&&((gravatar_id == null)||(!gravatar_id.equals(othersame.gravatar_id)))) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if ((labels!= othersame.labels)&&((labels == null)||(!labels.equals(othersame.labels)))) {
            return false;
        }
        if (number!= othersame.number) {
            return false;
        }
        if (position!= othersame.position) {
            return false;
        }
        if ((state!= othersame.state)&&((state == null)||(!state.equals(othersame.state)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        if ((updated_at!= othersame.updated_at)&&((updated_at == null)||(!updated_at.equals(othersame.updated_at)))) {
            return false;
        }
        if ((user!= othersame.user)&&((user == null)||(!user.equals(othersame.user)))) {
            return false;
        }
        if (votes!= othersame.votes) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((body == null)? 0 :body.hashCode())+ Long.hashCode(comments))+((created_at == null)? 0 :created_at.hashCode()))+((gravatar_id == null)? 0 :gravatar_id.hashCode()))+((html_url == null)? 0 :html_url.hashCode()))+((labels == null)? 0 :labels.hashCode()))+ Long.hashCode(number))+ Long.hashCode(position))+((state == null)? 0 :state.hashCode()))+((title == null)? 0 :title.hashCode()))+((updated_at == null)? 0 :updated_at.hashCode()))+((user == null)? 0 :user.hashCode()))+ Long.hashCode(votes));
    }
}
