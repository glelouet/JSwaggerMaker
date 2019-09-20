package www.googleapis.com.definitions;

public class LiveChatMessageDeletedDetails {
    public String deletedMessageId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveChatMessageDeletedDetails othersame = ((LiveChatMessageDeletedDetails) other);
        if ((deletedMessageId!= othersame.deletedMessageId)&&((deletedMessageId == null)||(!deletedMessageId.equals(othersame.deletedMessageId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((deletedMessageId == null)? 0 :deletedMessageId.hashCode());
    }
}
