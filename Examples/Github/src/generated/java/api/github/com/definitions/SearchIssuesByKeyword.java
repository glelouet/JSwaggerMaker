package api.github.com.definitions;

import api.github.com.definitions.searchissuesbykeyword.Issues;

public class SearchIssuesByKeyword {
    public Issues[] issues;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        SearchIssuesByKeyword othersame = ((SearchIssuesByKeyword) other);
        if ((issues!= othersame.issues)&&((issues == null)||(!issues.equals(othersame.issues)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((issues == null)? 0 :issues.hashCode());
    }
}
