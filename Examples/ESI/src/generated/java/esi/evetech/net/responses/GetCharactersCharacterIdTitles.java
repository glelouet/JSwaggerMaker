package esi.evetech.net.responses;

public class GetCharactersCharacterIdTitles {
    /**
     * name string
     */
    public String name;
    /**
     * title_id integer
     */
    public int title_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCharactersCharacterIdTitles othersame = ((GetCharactersCharacterIdTitles) other);
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (title_id!= othersame.title_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((name == null)? 0 :name.hashCode())+ title_id);
    }
}
