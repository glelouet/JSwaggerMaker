package esi.evetech.net.responses;

public class Getcharacterscharacteridbookmarksfolders200 {
    /**
     * folder_id integer
     */
    public int folder_id;
    /**
     * name string
     */
    public String name;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcharacterscharacteridbookmarksfolders200 othersame = ((Getcharacterscharacteridbookmarksfolders200) other);
        if (folder_id!= othersame.folder_id) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (folder_id +((name == null)? 0 :name.hashCode()));
    }
}
