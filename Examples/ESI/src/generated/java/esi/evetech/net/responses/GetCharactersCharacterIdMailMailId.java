package esi.evetech.net.responses;

import esi.evetech.net.responses.getcharacterscharacteridmail.GetCharactersCharacterIdMailRecipients;

public class GetCharactersCharacterIdMailMailId {
    /**
     * Mail's body
     */
    public String body;
    /**
     * From whom the mail was sent
     */
    public int from;
    /**
     * Labels attached to the mail
     */
    public int[] labels;
    /**
     * Whether the mail is flagged as read
     */
    public boolean read;
    /**
     * Recipients of the mail
     */
    public GetCharactersCharacterIdMailRecipients[] recipients;
    /**
     * Mail subject
     */
    public String subject;
    /**
     * When the mail was sent
     */
    public String timestamp;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCharactersCharacterIdMailMailId othersame = ((GetCharactersCharacterIdMailMailId) other);
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        if (from!= othersame.from) {
            return false;
        }
        if ((labels!= othersame.labels)&&((labels == null)||(!labels.equals(othersame.labels)))) {
            return false;
        }
        if (read!= othersame.read) {
            return false;
        }
        if ((recipients!= othersame.recipients)&&((recipients == null)||(!recipients.equals(othersame.recipients)))) {
            return false;
        }
        if ((subject!= othersame.subject)&&((subject == null)||(!subject.equals(othersame.subject)))) {
            return false;
        }
        if ((timestamp!= othersame.timestamp)&&((timestamp == null)||(!timestamp.equals(othersame.timestamp)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((body == null)? 0 :body.hashCode())+ from)+((labels == null)? 0 :labels.hashCode()))+ Boolean.hashCode(read))+((recipients == null)? 0 :recipients.hashCode()))+((subject == null)? 0 :subject.hashCode()))+((timestamp == null)? 0 :timestamp.hashCode()));
    }
}
