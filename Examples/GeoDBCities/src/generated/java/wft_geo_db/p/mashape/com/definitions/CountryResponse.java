package wft_geo_db.p.mashape.com.definitions;

public class CountryResponse {
    public CountryDetails data;
    /**
     * A list of WftErrors
     */
    public WftError[] errors;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        CountryResponse othersame = ((CountryResponse) other);
        if ((data!= othersame.data)&&((data == null)||(!data.equals(othersame.data)))) {
            return false;
        }
        if ((errors!= othersame.errors)&&((errors == null)||(!errors.equals(othersame.errors)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((data == null)? 0 :data.hashCode())+((errors == null)? 0 :errors.hashCode()));
    }
}
