package api.github.com.definitions.createfilebody;

public class Committer {
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
        Committer othersame = ((Committer) other);
        if ((email!= othersame.email)&&((email == null)||(!email.equals(othersame.email)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((email == null)? 0 :email.hashCode())+((name == null)? 0 :name.hashCode()));
    }
}
