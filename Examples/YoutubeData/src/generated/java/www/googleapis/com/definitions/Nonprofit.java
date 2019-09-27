package www.googleapis.com.definitions;

public class Nonprofit {
    /**
     * Id of the nonprofit.
     */
    public NonprofitId nonprofitId;
    /**
     * Legal name of the nonprofit.
     */
    public String nonprofitLegalName;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Nonprofit othersame = ((Nonprofit) other);
        if ((nonprofitId!= othersame.nonprofitId)&&((nonprofitId == null)||(!nonprofitId.equals(othersame.nonprofitId)))) {
            return false;
        }
        if ((nonprofitLegalName!= othersame.nonprofitLegalName)&&((nonprofitLegalName == null)||(!nonprofitLegalName.equals(othersame.nonprofitLegalName)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((nonprofitId == null)? 0 :nonprofitId.hashCode())+((nonprofitLegalName == null)? 0 :nonprofitLegalName.hashCode()));
    }
}
