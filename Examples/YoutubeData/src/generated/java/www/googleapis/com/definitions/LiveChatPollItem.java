package www.googleapis.com.definitions;

public class LiveChatPollItem {
    /**
     * Plain text description of the item.
     */
    public String description;
    public String itemId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveChatPollItem othersame = ((LiveChatPollItem) other);
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((itemId!= othersame.itemId)&&((itemId == null)||(!itemId.equals(othersame.itemId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((description == null)? 0 :description.hashCode())+((itemId == null)? 0 :itemId.hashCode()));
    }
}
