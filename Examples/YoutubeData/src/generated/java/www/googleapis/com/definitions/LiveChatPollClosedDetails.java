package www.googleapis.com.definitions;

public class LiveChatPollClosedDetails {
    /**
     * The id of the poll that was closed.
     */
    public String pollId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveChatPollClosedDetails othersame = ((LiveChatPollClosedDetails) other);
        if ((pollId!= othersame.pollId)&&((pollId == null)||(!pollId.equals(othersame.pollId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((pollId == null)? 0 :pollId.hashCode());
    }
}
