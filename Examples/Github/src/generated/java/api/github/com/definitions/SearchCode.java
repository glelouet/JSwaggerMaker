package api.github.com.definitions;

import api.github.com.definitions.searchcode.Items;

public class SearchCode {
    public Items[] items;
    public long total_count;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        SearchCode othersame = ((SearchCode) other);
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
