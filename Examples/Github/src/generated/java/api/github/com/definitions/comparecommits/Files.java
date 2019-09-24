package api.github.com.definitions.comparecommits;

public class Files {
    public long additions;
    public String blob_url;
    public long changes;
    public String contents_url;
    public long deletions;
    public String filename;
    public String patch;
    public String raw_url;
    public String sha;
    public String status;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Files othersame = ((Files) other);
        if (additions!= othersame.additions) {
            return false;
        }
        if ((blob_url!= othersame.blob_url)&&((blob_url == null)||(!blob_url.equals(othersame.blob_url)))) {
            return false;
        }
        if (changes!= othersame.changes) {
            return false;
        }
        if ((contents_url!= othersame.contents_url)&&((contents_url == null)||(!contents_url.equals(othersame.contents_url)))) {
            return false;
        }
        if (deletions!= othersame.deletions) {
            return false;
        }
        if ((filename!= othersame.filename)&&((filename == null)||(!filename.equals(othersame.filename)))) {
            return false;
        }
        if ((patch!= othersame.patch)&&((patch == null)||(!patch.equals(othersame.patch)))) {
            return false;
        }
        if ((raw_url!= othersame.raw_url)&&((raw_url == null)||(!raw_url.equals(othersame.raw_url)))) {
            return false;
        }
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        if ((status!= othersame.status)&&((status == null)||(!status.equals(othersame.status)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(additions)+((blob_url == null)? 0 :blob_url.hashCode()))+ Long.hashCode(changes))+((contents_url == null)? 0 :contents_url.hashCode()))+ Long.hashCode(deletions))+((filename == null)? 0 :filename.hashCode()))+((patch == null)? 0 :patch.hashCode()))+((raw_url == null)? 0 :raw_url.hashCode()))+((sha == null)? 0 :sha.hashCode()))+((status == null)? 0 :status.hashCode()));
    }
}
