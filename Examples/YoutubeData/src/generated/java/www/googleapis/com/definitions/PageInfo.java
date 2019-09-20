package www.googleapis.com.definitions;

public class PageInfo {
    /**
     * The number of results included in the API response.
     */
    public int resultsPerPage;
    /**
     * The total number of results in the result set.
     */
    public int totalResults;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PageInfo othersame = ((PageInfo) other);
        if (resultsPerPage!= othersame.resultsPerPage) {
            return false;
        }
        if (totalResults!= othersame.totalResults) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (resultsPerPage + totalResults);
    }
}
