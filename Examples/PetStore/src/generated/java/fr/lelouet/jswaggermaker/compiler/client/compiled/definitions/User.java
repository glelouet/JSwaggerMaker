package fr.lelouet.jswaggermaker.compiler.client.compiled.definitions;

public class User {
    public long id;
    public String username;
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    public String phone;
    /**
     * User Status
     */
    public int userStatus;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        User othersame = ((User) other);
        if (id!= othersame.id) {
            return false;
        }
        if ((username!= othersame.username)&&((username == null)||(!username.equals(othersame.username)))) {
            return false;
        }
        if ((firstName!= othersame.firstName)&&((firstName == null)||(!firstName.equals(othersame.firstName)))) {
            return false;
        }
        if ((lastName!= othersame.lastName)&&((lastName == null)||(!lastName.equals(othersame.lastName)))) {
            return false;
        }
        if ((email!= othersame.email)&&((email == null)||(!email.equals(othersame.email)))) {
            return false;
        }
        if ((password!= othersame.password)&&((password == null)||(!password.equals(othersame.password)))) {
            return false;
        }
        if ((phone!= othersame.phone)&&((phone == null)||(!phone.equals(othersame.phone)))) {
            return false;
        }
        if (userStatus!= othersame.userStatus) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((Long.hashCode(id)+((username == null)? 0 :username.hashCode()))+((firstName == null)? 0 :firstName.hashCode()))+((lastName == null)? 0 :lastName.hashCode()))+((email == null)? 0 :email.hashCode()))+((password == null)? 0 :password.hashCode()))+((phone == null)? 0 :phone.hashCode()))+ userStatus);
    }
}
