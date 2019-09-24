package api.github.com.definitions;

import api.github.com.definitions.contentspath.Links;

public class ContentsPath {
    public Links _links;
    public String content;
    public String encoding;
    public String git_url;
    public String html_url;
    public String name;
    public String path;
    public String sha;
    public long size;
    public String type;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ContentsPath othersame = ((ContentsPath) other);
        if ((_links!= othersame._links)&&((_links == null)||(!_links.equals(othersame._links)))) {
            return false;
        }
        if ((content!= othersame.content)&&((content == null)||(!content.equals(othersame.content)))) {
            return false;
        }
        if ((encoding!= othersame.encoding)&&((encoding == null)||(!encoding.equals(othersame.encoding)))) {
            return false;
        }
        if ((git_url!= othersame.git_url)&&((git_url == null)||(!git_url.equals(othersame.git_url)))) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((path!= othersame.path)&&((path == null)||(!path.equals(othersame.path)))) {
            return false;
        }
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        if (size!= othersame.size) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((_links == null)? 0 :_links.hashCode())+((content == null)? 0 :content.hashCode()))+((encoding == null)? 0 :encoding.hashCode()))+((git_url == null)? 0 :git_url.hashCode()))+((html_url == null)? 0 :html_url.hashCode()))+((name == null)? 0 :name.hashCode()))+((path == null)? 0 :path.hashCode()))+((sha == null)? 0 :sha.hashCode()))+ Long.hashCode(size))+((type == null)? 0 :type.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
