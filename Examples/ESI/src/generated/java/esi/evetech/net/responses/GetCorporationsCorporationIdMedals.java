package esi.evetech.net.responses;

public class GetCorporationsCorporationIdMedals {
    /**
     * created_at string
     */
    public String created_at;
    /**
     * ID of the character who created this medal
     */
    public int creator_id;
    /**
     * description string
     */
    public String description;
    /**
     * medal_id integer
     */
    public int medal_id;
    /**
     * title string
     */
    public String title;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCorporationsCorporationIdMedals othersame = ((GetCorporationsCorporationIdMedals) other);
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if (creator_id!= othersame.creator_id) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if (medal_id!= othersame.medal_id) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((created_at == null)? 0 :created_at.hashCode())+ creator_id)+((description == null)? 0 :description.hashCode()))+ medal_id)+((title == null)? 0 :title.hashCode()));
    }
}
