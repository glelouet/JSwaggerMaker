package api.github.com.definitions;

import api.github.com.definitions.createfile.Commit;
import api.github.com.definitions.createfile.Content;

public class CreateFile {
    public Commit commit;
    public Content content;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        CreateFile othersame = ((CreateFile) other);
        if ((commit!= othersame.commit)&&((commit == null)||(!commit.equals(othersame.commit)))) {
            return false;
        }
        if ((content!= othersame.content)&&((content == null)||(!content.equals(othersame.content)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((commit == null)? 0 :commit.hashCode())+((content == null)? 0 :content.hashCode()));
    }
}
