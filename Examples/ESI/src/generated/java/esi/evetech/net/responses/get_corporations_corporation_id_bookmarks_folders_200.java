package esi.evetech.net.responses;

public class get_corporations_corporation_id_bookmarks_folders_200 {
    /**
     * creator_id integer
     */
    public int creator_id;
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
        get_corporations_corporation_id_bookmarks_folders_200 othersame = ((get_corporations_corporation_id_bookmarks_folders_200) other);
        if (creator_id!= othersame.creator_id) {
            return false;
        }
        if (folder_id!= othersame.folder_id) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((creator_id + folder_id)+((name == null)? 0 :name.hashCode()));
    }
}
