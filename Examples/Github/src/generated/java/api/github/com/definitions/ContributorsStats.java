package api.github.com.definitions;

import api.github.com.definitions.contributorsstats.Weeks;
import api.github.com.definitions.pulls.base.User;

public class ContributorsStats {
    public User author;
    /**
     * The Total number of commits authored by the contributor.
     */
    public long total;
    public Weeks[] weeks;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ContributorsStats othersame = ((ContributorsStats) other);
        if ((author!= othersame.author)&&((author == null)||(!author.equals(othersame.author)))) {
            return false;
        }
        if (total!= othersame.total) {
            return false;
        }
        if ((weeks!= othersame.weeks)&&((weeks == null)||(!weeks.equals(othersame.weeks)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((author == null)? 0 :author.hashCode())+ Long.hashCode(total))+((weeks == null)? 0 :weeks.hashCode()));
    }
}
