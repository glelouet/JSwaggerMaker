package api.github.com.definitions.branch.commit.commit;

public class Author {
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String date;
    public String email;
    public String name;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Author othersame = ((Author) other);
        if ((date!= othersame.date)&&((date == null)||(!date.equals(othersame.date)))) {
            return false;
        }
        if ((email!= othersame.email)&&((email == null)||(!email.equals(othersame.email)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((date == null)? 0 :date.hashCode())+((email == null)? 0 :email.hashCode()))+((name == null)? 0 :name.hashCode()));
    }
}
