package esi.evetech.net.responses.getcharacterscharacteridmail;

import esi.evetech.net.structures.GetCharactersCharacterIdMailRecipientType;

public class GetCharactersCharacterIdMailRecipients {
    /**
     * recipient_id integer
     */
    public int recipient_id;
    /**
     * recipient_type string
     */
    public GetCharactersCharacterIdMailRecipientType recipient_type;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCharactersCharacterIdMailRecipients othersame = ((GetCharactersCharacterIdMailRecipients) other);
        if (recipient_id!= othersame.recipient_id) {
            return false;
        }
        if ((recipient_type!= othersame.recipient_type)&&((recipient_type == null)||(!recipient_type.equals(othersame.recipient_type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (recipient_id +((recipient_type == null)? 0 :recipient_type.hashCode()));
    }
}
