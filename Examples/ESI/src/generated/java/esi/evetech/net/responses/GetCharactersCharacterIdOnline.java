package esi.evetech.net.responses;

public class GetCharactersCharacterIdOnline {
    /**
     * Timestamp of the last login
     */
    public String last_login;
    /**
     * Timestamp of the last logout
     */
    public String last_logout;
    /**
     * Total number of times the character has logged in
     */
    public int logins;
    /**
     * If the character is online
     */
    public boolean online;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCharactersCharacterIdOnline othersame = ((GetCharactersCharacterIdOnline) other);
        if ((last_login!= othersame.last_login)&&((last_login == null)||(!last_login.equals(othersame.last_login)))) {
            return false;
        }
        if ((last_logout!= othersame.last_logout)&&((last_logout == null)||(!last_logout.equals(othersame.last_logout)))) {
            return false;
        }
        if (logins!= othersame.logins) {
            return false;
        }
        if (online!= othersame.online) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((last_login == null)? 0 :last_login.hashCode())+((last_logout == null)? 0 :last_logout.hashCode()))+ logins)+ Boolean.hashCode(online));
    }
}
