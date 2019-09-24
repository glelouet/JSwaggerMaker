package api.github.com.definitions.contributorsstats;

public class Weeks {
    /**
     * Number of additions.
     */
    public long a;
    /**
     * Number of commits.
     */
    public long c;
    /**
     * Number of deletions.
     */
    public long d;
    /**
     * Start of the week.
     */
    public String w;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Weeks othersame = ((Weeks) other);
        if (a!= othersame.a) {
            return false;
        }
        if (c!= othersame.c) {
            return false;
        }
        if (d!= othersame.d) {
            return false;
        }
        if ((w!= othersame.w)&&((w == null)||(!w.equals(othersame.w)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Long.hashCode(a)+ Long.hashCode(c))+ Long.hashCode(d))+((w == null)? 0 :w.hashCode()));
    }
}
