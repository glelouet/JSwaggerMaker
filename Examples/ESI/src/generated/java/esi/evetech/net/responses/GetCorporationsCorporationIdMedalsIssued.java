package esi.evetech.net.responses;

import esi.evetech.net.structures.GetCorporationsCorporationIdMedalsIssuedStatus;

public class GetCorporationsCorporationIdMedalsIssued {
    /**
     * ID of the character who was rewarded this medal
     */
    public int character_id;
    /**
     * issued_at string
     */
    public String issued_at;
    /**
     * ID of the character who issued the medal
     */
    public int issuer_id;
    /**
     * medal_id integer
     */
    public int medal_id;
    /**
     * reason string
     */
    public String reason;
    /**
     * status string
     */
    public GetCorporationsCorporationIdMedalsIssuedStatus status;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCorporationsCorporationIdMedalsIssued othersame = ((GetCorporationsCorporationIdMedalsIssued) other);
        if (character_id!= othersame.character_id) {
            return false;
        }
        if ((issued_at!= othersame.issued_at)&&((issued_at == null)||(!issued_at.equals(othersame.issued_at)))) {
            return false;
        }
        if (issuer_id!= othersame.issuer_id) {
            return false;
        }
        if (medal_id!= othersame.medal_id) {
            return false;
        }
        if ((reason!= othersame.reason)&&((reason == null)||(!reason.equals(othersame.reason)))) {
            return false;
        }
        if ((status!= othersame.status)&&((status == null)||(!status.equals(othersame.status)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((character_id +((issued_at == null)? 0 :issued_at.hashCode()))+ issuer_id)+ medal_id)+((reason == null)? 0 :reason.hashCode()))+((status == null)? 0 :status.hashCode()));
    }
}
