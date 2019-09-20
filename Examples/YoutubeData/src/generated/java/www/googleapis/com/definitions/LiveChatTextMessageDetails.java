package www.googleapis.com.definitions;

public class LiveChatTextMessageDetails {
    /**
     * The user's message.
     */
    public String messageText;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveChatTextMessageDetails othersame = ((LiveChatTextMessageDetails) other);
        if ((messageText!= othersame.messageText)&&((messageText == null)||(!messageText.equals(othersame.messageText)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((messageText == null)? 0 :messageText.hashCode());
    }
}
