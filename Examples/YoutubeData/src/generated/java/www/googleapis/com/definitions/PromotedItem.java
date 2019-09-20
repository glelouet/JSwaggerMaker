package www.googleapis.com.definitions;

public class PromotedItem {
    /**
     * A custom message to display for this promotion. This field is currently ignored unless the promoted item is a website.
     */
    public String customMessage;
    /**
     * Identifies the promoted item.
     */
    public PromotedItemId id;
    /**
     * If true, the content owner's name will be used when displaying the promotion. This field can only be set when the update is made on behalf of the content owner.
     */
    public boolean promotedByContentOwner;
    /**
     * The temporal position within the video where the promoted item will be displayed. If present, it overrides the default timing.
     */
    public InvideoTiming timing;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PromotedItem othersame = ((PromotedItem) other);
        if ((customMessage!= othersame.customMessage)&&((customMessage == null)||(!customMessage.equals(othersame.customMessage)))) {
            return false;
        }
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if (promotedByContentOwner!= othersame.promotedByContentOwner) {
            return false;
        }
        if ((timing!= othersame.timing)&&((timing == null)||(!timing.equals(othersame.timing)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((customMessage == null)? 0 :customMessage.hashCode())+((id == null)? 0 :id.hashCode()))+ Boolean.hashCode(promotedByContentOwner))+((timing == null)? 0 :timing.hashCode()));
    }
}
