package api.github.com.definitions;

public class CommitActivityStats {
    public long[] days;
    public long total;
    public long week;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        CommitActivityStats othersame = ((CommitActivityStats) other);
        if ((days!= othersame.days)&&((days == null)||(!days.equals(othersame.days)))) {
            return false;
        }
        if (total!= othersame.total) {
            return false;
        }
        if (week!= othersame.week) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((days == null)? 0 :days.hashCode())+ Long.hashCode(total))+ Long.hashCode(week));
    }
}
