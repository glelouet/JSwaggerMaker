package www.googleapis.com.definitions;

public class MembershipsDetails {
    /**
     * All levels that the user has access to. This includes the purchased level and all other levels that are included because of a higher purchase.
     */
    public String[] accessibleLevels;
    /**
     * The date and time when the user became a continuous member across all levels.
     */
    public String memberSince;
    /**
     * The date and time when the user started to continuously have access to the currently highest level.
     */
    public String memberSinceCurrentLevel;
    /**
     * The cumulative time the user has been a member across all levels in complete months (the time is rounded down to the nearest integer).
     */
    public int memberTotalDuration;
    /**
     * The cumulative time the user has had access to the currently highest level in complete months (the time is rounded down to the nearest integer).
     */
    public int memberTotalDurationCurrentLevel;
    /**
     * The highest level the user has access to at the moment.
     */
    public String purchasedLevel;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        MembershipsDetails othersame = ((MembershipsDetails) other);
        if ((accessibleLevels!= othersame.accessibleLevels)&&((accessibleLevels == null)||(!accessibleLevels.equals(othersame.accessibleLevels)))) {
            return false;
        }
        if ((memberSince!= othersame.memberSince)&&((memberSince == null)||(!memberSince.equals(othersame.memberSince)))) {
            return false;
        }
        if ((memberSinceCurrentLevel!= othersame.memberSinceCurrentLevel)&&((memberSinceCurrentLevel == null)||(!memberSinceCurrentLevel.equals(othersame.memberSinceCurrentLevel)))) {
            return false;
        }
        if (memberTotalDuration!= othersame.memberTotalDuration) {
            return false;
        }
        if (memberTotalDurationCurrentLevel!= othersame.memberTotalDurationCurrentLevel) {
            return false;
        }
        if ((purchasedLevel!= othersame.purchasedLevel)&&((purchasedLevel == null)||(!purchasedLevel.equals(othersame.purchasedLevel)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((accessibleLevels == null)? 0 :accessibleLevels.hashCode())+((memberSince == null)? 0 :memberSince.hashCode()))+((memberSinceCurrentLevel == null)? 0 :memberSinceCurrentLevel.hashCode()))+ memberTotalDuration)+ memberTotalDurationCurrentLevel)+((purchasedLevel == null)? 0 :purchasedLevel.hashCode()));
    }
}
