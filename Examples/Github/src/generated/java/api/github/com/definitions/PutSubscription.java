package api.github.com.definitions;

public class PutSubscription {
    public String created_at;
    public boolean ignored;
    public Object reason;
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
        PutSubscription othersame = ((PutSubscription) other);
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if (ignored!= othersame.ignored) {
            return false;
        }
        if ((reason!= othersame.reason)&&((reason == null)||(!reason.equals(othersame.reason)))) {
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
        return (((((((created_at == null)? 0 :created_at.hashCode())+ Boolean.hashCode(ignored))+((reason == null)? 0 :reason.hashCode()))+ Boolean.hashCode(subscribed))+((thread_url == null)? 0 :thread_url.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
