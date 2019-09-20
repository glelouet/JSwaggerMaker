package www.googleapis.com.definitions;

import www.googleapis.com.structures.ACTIVITYTYPE;

public class SubscriptionContentDetails {
    /**
     * The type of activity this subscription is for (only uploads, everything).
     */
    public ACTIVITYTYPE activityType;
    /**
     * The number of new items in the subscription since its content was last read.
     */
    public long newItemCount;
    /**
     * The approximate number of items that the subscription points to.
     */
    public long totalItemCount;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        SubscriptionContentDetails othersame = ((SubscriptionContentDetails) other);
        if ((activityType!= othersame.activityType)&&((activityType == null)||(!activityType.equals(othersame.activityType)))) {
            return false;
        }
        if (newItemCount!= othersame.newItemCount) {
            return false;
        }
        if (totalItemCount!= othersame.totalItemCount) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((activityType == null)? 0 :activityType.hashCode())+ Long.hashCode(newItemCount))+ Long.hashCode(totalItemCount));
    }
}
