package esi.evetech.net.responses;

import esi.evetech.net.structures.GetCharactersCharacterIdNotificationsSenderType;
import esi.evetech.net.structures.GetCharactersCharacterIdNotificationsType;

public class GetCharactersCharacterIdNotifications {
    /**
     * is_read boolean
     */
    public boolean is_read;
    /**
     * notification_id integer
     */
    public long notification_id;
    /**
     * sender_id integer
     */
    public int sender_id;
    /**
     * sender_type string
     */
    public GetCharactersCharacterIdNotificationsSenderType sender_type;
    /**
     * text string
     */
    public String text;
    /**
     * timestamp string
     */
    public String timestamp;
    /**
     * type string
     */
    public GetCharactersCharacterIdNotificationsType type;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCharactersCharacterIdNotifications othersame = ((GetCharactersCharacterIdNotifications) other);
        if (is_read!= othersame.is_read) {
            return false;
        }
        if (notification_id!= othersame.notification_id) {
            return false;
        }
        if (sender_id!= othersame.sender_id) {
            return false;
        }
        if ((sender_type!= othersame.sender_type)&&((sender_type == null)||(!sender_type.equals(othersame.sender_type)))) {
            return false;
        }
        if ((text!= othersame.text)&&((text == null)||(!text.equals(othersame.text)))) {
            return false;
        }
        if ((timestamp!= othersame.timestamp)&&((timestamp == null)||(!timestamp.equals(othersame.timestamp)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((Boolean.hashCode(is_read)+ Long.hashCode(notification_id))+ sender_id)+((sender_type == null)? 0 :sender_type.hashCode()))+((text == null)? 0 :text.hashCode()))+((timestamp == null)? 0 :timestamp.hashCode()))+((type == null)? 0 :type.hashCode()));
    }
}
