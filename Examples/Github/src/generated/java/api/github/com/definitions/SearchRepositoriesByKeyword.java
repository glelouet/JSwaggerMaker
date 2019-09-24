package api.github.com.definitions;

public class SearchRepositoriesByKeyword {
    public Repo[] repositories;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        SearchRepositoriesByKeyword othersame = ((SearchRepositoriesByKeyword) other);
        if ((repositories!= othersame.repositories)&&((repositories == null)||(!repositories.equals(othersame.repositories)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((repositories == null)? 0 :repositories.hashCode());
    }
}
