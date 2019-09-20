package www.googleapis.com.definitions;

public class LiveChatMessageRetractedDetails {
    public String retractedMessageId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveChatMessageRetractedDetails othersame = ((LiveChatMessageRetractedDetails) other);
        if ((retractedMessageId!= othersame.retractedMessageId)&&((retractedMessageId == null)||(!retractedMessageId.equals(othersame.retractedMessageId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((retractedMessageId == null)? 0 :retractedMessageId.hashCode());
    }
}
