package www.googleapis.com.definitions;

public class LevelDetails {
    public String displayName;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LevelDetails othersame = ((LevelDetails) other);
        if ((displayName!= othersame.displayName)&&((displayName == null)||(!displayName.equals(othersame.displayName)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((displayName == null)? 0 :displayName.hashCode());
    }
}
