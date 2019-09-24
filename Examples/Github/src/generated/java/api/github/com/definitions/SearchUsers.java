package api.github.com.definitions;

public class SearchUsers {
    public User[] items;
    public long total_count;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        SearchUsers othersame = ((SearchUsers) other);
        if ((items!= othersame.items)&&((items == null)||(!items.equals(othersame.items)))) {
            return false;
        }
        if (total_count!= othersame.total_count) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((items == null)? 0 :items.hashCode())+ Long.hashCode(total_count));
    }
}
