package wft_geo_db.p.mashape.com.definitions;

public class Metadata {
    /**
     * The zero-ary offset into the results (0 is the first result)
     */
    public long currentOffset;
    /**
     * The total number of results across pages
     */
    public long totalCount;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Metadata othersame = ((Metadata) other);
        if (currentOffset!= othersame.currentOffset) {
            return false;
        }
        if (totalCount!= othersame.totalCount) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(currentOffset)+ Long.hashCode(totalCount));
    }
}
