package wft_geo_db.p.mashape.com.definitions;

import wft_geo_db.p.mashape.com.structures.Code;

public class LanguageDescriptor {
    public Code code;
    public String name;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LanguageDescriptor othersame = ((LanguageDescriptor) other);
        if ((code!= othersame.code)&&((code == null)||(!code.equals(othersame.code)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((code == null)? 0 :code.hashCode())+((name == null)? 0 :name.hashCode()));
    }
}
