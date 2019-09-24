package api.github.com.definitions.commit;

public class Files {
    public long additions;
    public String blob_url;
    public long changes;
    public long deletions;
    public String filename;
    public String patch;
    public String raw_url;
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
        if ((status!= othersame.status)&&((status == null)||(!status.equals(othersame.status)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((Long.hashCode(additions)+((blob_url == null)? 0 :blob_url.hashCode()))+ Long.hashCode(changes))+ Long.hashCode(deletions))+((filename == null)? 0 :filename.hashCode()))+((patch == null)? 0 :patch.hashCode()))+((raw_url == null)? 0 :raw_url.hashCode()))+((status == null)? 0 :status.hashCode()));
    }
}
