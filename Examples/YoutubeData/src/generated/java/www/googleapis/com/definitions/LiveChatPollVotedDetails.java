package www.googleapis.com.definitions;

public class LiveChatPollVotedDetails {
    /**
     * The poll item the user chose.
     */
    public String itemId;
    /**
     * The poll the user voted on.
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
        LiveChatPollVotedDetails othersame = ((LiveChatPollVotedDetails) other);
        if ((itemId!= othersame.itemId)&&((itemId == null)||(!itemId.equals(othersame.itemId)))) {
            return false;
        }
        if ((pollId!= othersame.pollId)&&((pollId == null)||(!pollId.equals(othersame.pollId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((itemId == null)? 0 :itemId.hashCode())+((pollId == null)? 0 :pollId.hashCode()));
    }
}
