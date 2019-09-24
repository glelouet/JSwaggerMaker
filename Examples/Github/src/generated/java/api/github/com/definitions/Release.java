package api.github.com.definitions;

import api.github.com.definitions.releases.Assets;

public class Release {
    public Assets[] assets;
    public String assets_url;
    public User author;
    public String body;
    public String created_at;
    public boolean draft;
    public String html_url;
    public long id;
    public String name;
    public boolean prerelease;
    public String published_at;
    public String tag_name;
    public String tarball_url;
    public String target_commitish;
    public String upload_url;
    public String url;
    public String zipball_url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Release othersame = ((Release) other);
        if ((assets!= othersame.assets)&&((assets == null)||(!assets.equals(othersame.assets)))) {
            return false;
        }
        if ((assets_url!= othersame.assets_url)&&((assets_url == null)||(!assets_url.equals(othersame.assets_url)))) {
            return false;
        }
        if ((author!= othersame.author)&&((author == null)||(!author.equals(othersame.author)))) {
            return false;
        }
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if (draft!= othersame.draft) {
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
        if (prerelease!= othersame.prerelease) {
            return false;
        }
        if ((published_at!= othersame.published_at)&&((published_at == null)||(!published_at.equals(othersame.published_at)))) {
            return false;
        }
        if ((tag_name!= othersame.tag_name)&&((tag_name == null)||(!tag_name.equals(othersame.tag_name)))) {
            return false;
        }
        if ((tarball_url!= othersame.tarball_url)&&((tarball_url == null)||(!tarball_url.equals(othersame.tarball_url)))) {
            return false;
        }
        if ((target_commitish!= othersame.target_commitish)&&((target_commitish == null)||(!target_commitish.equals(othersame.target_commitish)))) {
            return false;
        }
        if ((upload_url!= othersame.upload_url)&&((upload_url == null)||(!upload_url.equals(othersame.upload_url)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        if ((zipball_url!= othersame.zipball_url)&&((zipball_url == null)||(!zipball_url.equals(othersame.zipball_url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((assets == null)? 0 :assets.hashCode())+((assets_url == null)? 0 :assets_url.hashCode()))+((author == null)? 0 :author.hashCode()))+((body == null)? 0 :body.hashCode()))+((created_at == null)? 0 :created_at.hashCode()))+ Boolean.hashCode(draft))+((html_url == null)? 0 :html_url.hashCode()))+ Long.hashCode(id))+((name == null)? 0 :name.hashCode()))+ Boolean.hashCode(prerelease))+((published_at == null)? 0 :published_at.hashCode()))+((tag_name == null)? 0 :tag_name.hashCode()))+((tarball_url == null)? 0 :tarball_url.hashCode()))+((target_commitish == null)? 0 :target_commitish.hashCode()))+((upload_url == null)? 0 :upload_url.hashCode()))+((url == null)? 0 :url.hashCode()))+((zipball_url == null)? 0 :zipball_url.hashCode()));
    }
}
