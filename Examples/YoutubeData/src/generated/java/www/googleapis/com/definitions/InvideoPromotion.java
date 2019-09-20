package www.googleapis.com.definitions;

public class InvideoPromotion {
    /**
     * The default temporal position within the video where the promoted item will be displayed. Can be overriden by more specific timing in the item.
     */
    public InvideoTiming defaultTiming;
    /**
     * List of promoted items in decreasing priority.
     */
    public PromotedItem[] items;
    /**
     * The spatial position within the video where the promoted item will be displayed.
     */
    public InvideoPosition position;
    /**
     * Indicates whether the channel's promotional campaign uses "smart timing." This feature attempts to show promotions at a point in the video when they are more likely to be clicked and less likely to disrupt the viewing experience. This feature also picks up a single promotion to show on each video.
     */
    public boolean useSmartTiming;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        InvideoPromotion othersame = ((InvideoPromotion) other);
        if ((defaultTiming!= othersame.defaultTiming)&&((defaultTiming == null)||(!defaultTiming.equals(othersame.defaultTiming)))) {
            return false;
        }
        if ((items!= othersame.items)&&((items == null)||(!items.equals(othersame.items)))) {
            return false;
        }
        if ((position!= othersame.position)&&((position == null)||(!position.equals(othersame.position)))) {
            return false;
        }
        if (useSmartTiming!= othersame.useSmartTiming) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((defaultTiming == null)? 0 :defaultTiming.hashCode())+((items == null)? 0 :items.hashCode()))+((position == null)? 0 :position.hashCode()))+ Boolean.hashCode(useSmartTiming));
    }
}
