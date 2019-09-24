package api.github.com.definitions;

import api.github.com.definitions.hook.Config;

public class Hook {
    public boolean active;
    public Config config;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String created_at;
    public Object[] events;
    public long id;
    public String name;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
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
        Hook othersame = ((Hook) other);
        if (active!= othersame.active) {
            return false;
        }
        if ((config!= othersame.config)&&((config == null)||(!config.equals(othersame.config)))) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if ((events!= othersame.events)&&((events == null)||(!events.equals(othersame.events)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
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
        return (((((((Boolean.hashCode(active)+((config == null)? 0 :config.hashCode()))+((created_at == null)? 0 :created_at.hashCode()))+((events == null)? 0 :events.hashCode()))+ Long.hashCode(id))+((name == null)? 0 :name.hashCode()))+((updated_at == null)? 0 :updated_at.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
