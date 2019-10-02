package api.github.com.definitions.postgist;

import api.github.com.definitions.postgist.files.File1Txt;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Files {
    @JsonProperty("file1.txt")
    public File1Txt file1_txt;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Files othersame = ((Files) other);
        if ((file1_txt!= othersame.file1_txt)&&((file1_txt == null)||(!file1_txt.equals(othersame.file1_txt)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((file1_txt == null)? 0 :file1_txt.hashCode());
    }
}
