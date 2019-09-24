package api.github.com.definitions.hook;

public class Config {
    public String content_type;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Config othersame = ((Config) other);
        if ((content_type!= othersame.content_type)&&((content_type == null)||(!content_type.equals(othersame.content_type)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((content_type == null)? 0 :content_type.hashCode())+((url == null)? 0 :url.hashCode()));
    }
}
