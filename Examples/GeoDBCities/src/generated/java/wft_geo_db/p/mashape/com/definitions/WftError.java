package wft_geo_db.p.mashape.com.definitions;

public class WftError {
    public String code;
    public String message;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        WftError othersame = ((WftError) other);
        if ((code!= othersame.code)&&((code == null)||(!code.equals(othersame.code)))) {
            return false;
        }
        if ((message!= othersame.message)&&((message == null)||(!message.equals(othersame.message)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((code == null)? 0 :code.hashCode())+((message == null)? 0 :message.hashCode()));
    }
}
