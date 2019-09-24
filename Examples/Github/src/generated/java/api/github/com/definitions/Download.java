package api.github.com.definitions;

public class Download {
    public String content_type;
    public String description;
    public long download_count;
    public String html_url;
    public long id;
    public String name;
    public long size;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Download othersame = ((Download) other);
        if ((content_type!= othersame.content_type)&&((content_type == null)||(!content_type.equals(othersame.content_type)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if (download_count!= othersame.download_count) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (size!= othersame.size) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((content_type == null)? 0 :content_type.hashCode())+((description == null)? 0 :description.hashCode()))+ Long.hashCode(download_count))+((html_url == null)? 0 :html_url.hashCode()))+ Long.hashCode(id))+((name == null)? 0 :name.hashCode()))+ Long.hashCode(size))+((url == null)? 0 :url.hashCode()));
    }
}
