package api.github.com.definitions;

public class Subscription {
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String created_at;
    public boolean ignored;
    public String reason;
    public String repository_url;
    public boolean subscribed;
    public String thread_url;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Subscription othersame = ((Subscription) other);
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if (ignored!= othersame.ignored) {
            return false;
        }
        if ((reason!= othersame.reason)&&((reason == null)||(!reason.equals(othersame.reason)))) {
            return false;
        }
        if ((repository_url!= othersame.repository_url)&&((repository_url == null)||(!repository_url.equals(othersame.repository_url)))) {
            return false;
        }
        if (subscribed!= othersame.subscribed) {
            return false;
        }
        if ((thread_url!= othersame.thread_url)&&((thread_url == null)||(!thread_url.equals(othersame.thread_url)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((created_at == null)? 0 :created_at.hashCode())+ Boolean.hashCode(ignored))+((reason == null)? 0 :reason.hashCode()))+((repository_url == null)? 0 :repository_url.hashCode()))+ Boolean.hashCode(subscribed))+((thread_url == null)? 0 :thread_url.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
