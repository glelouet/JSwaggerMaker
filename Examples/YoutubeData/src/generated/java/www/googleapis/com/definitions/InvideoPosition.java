package www.googleapis.com.definitions;

import www.googleapis.com.structures.CornerPosition;
import www.googleapis.com.structures.Type;

public class InvideoPosition {
    /**
     * Describes in which corner of the video the visual widget will appear.
     */
    public CornerPosition cornerPosition;
    /**
     * Defines the position type.
     */
    public Type type;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        InvideoPosition othersame = ((InvideoPosition) other);
        if ((cornerPosition!= othersame.cornerPosition)&&((cornerPosition == null)||(!cornerPosition.equals(othersame.cornerPosition)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((cornerPosition == null)? 0 :cornerPosition.hashCode())+((type == null)? 0 :type.hashCode()));
    }
}
