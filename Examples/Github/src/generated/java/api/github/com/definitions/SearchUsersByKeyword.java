package api.github.com.definitions;

public class SearchUsersByKeyword {
    public User[] users;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        SearchUsersByKeyword othersame = ((SearchUsersByKeyword) other);
        if ((users!= othersame.users)&&((users == null)||(!users.equals(othersame.users)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((users == null)? 0 :users.hashCode());
    }
}
