package api.github.com.definitions.releases;

import api.github.com.definitions.User;

public class Assets {
    public String content_type;
    public String created_at;
    public long download_count;
    public long id;
    public String label;
    public String name;
    public long size;
    public String state;
    public String updated_at;
    public User uploader;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Assets othersame = ((Assets) other);
        if ((content_type!= othersame.content_type)&&((content_type == null)||(!content_type.equals(othersame.content_type)))) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if (download_count!= othersame.download_count) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((label!= othersame.label)&&((label == null)||(!label.equals(othersame.label)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (size!= othersame.size) {
            return false;
        }
        if ((state!= othersame.state)&&((state == null)||(!state.equals(othersame.state)))) {
            return false;
        }
        if ((updated_at!= othersame.updated_at)&&((updated_at == null)||(!updated_at.equals(othersame.updated_at)))) {
            return false;
        }
        if ((uploader!= othersame.uploader)&&((uploader == null)||(!uploader.equals(othersame.uploader)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((content_type == null)? 0 :content_type.hashCode())+((created_at == null)? 0 :created_at.hashCode()))+ Long.hashCode(download_count))+ Long.hashCode(id))+((label == null)? 0 :label.hashCode()))+((name == null)? 0 :name.hashCode()))+ Long.hashCode(size))+((state == null)? 0 :state.hashCode()))+((updated_at == null)? 0 :updated_at.hashCode()))+((uploader == null)? 0 :uploader.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
