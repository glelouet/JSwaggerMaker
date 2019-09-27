package www.googleapis.com.definitions;

import www.googleapis.com.structures.Reason;

public class ActivityContentDetailsRecommendation {
    /**
     * The reason that the resource is recommended to the user.
     */
    public Reason reason;
    /**
     * The resourceId object contains information that identifies the recommended resource.
     */
    public ResourceId resourceId;
    /**
     * The seedResourceId object contains information about the resource that caused the recommendation.
     */
    public ResourceId seedResourceId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ActivityContentDetailsRecommendation othersame = ((ActivityContentDetailsRecommendation) other);
        if ((reason!= othersame.reason)&&((reason == null)||(!reason.equals(othersame.reason)))) {
            return false;
        }
        if ((resourceId!= othersame.resourceId)&&((resourceId == null)||(!resourceId.equals(othersame.resourceId)))) {
            return false;
        }
        if ((seedResourceId!= othersame.seedResourceId)&&((seedResourceId == null)||(!seedResourceId.equals(othersame.seedResourceId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((reason == null)? 0 :reason.hashCode())+((resourceId == null)? 0 :resourceId.hashCode()))+((seedResourceId == null)? 0 :seedResourceId.hashCode()));
    }
}
