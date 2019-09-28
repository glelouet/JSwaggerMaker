package wft_geo_db.p.mashape.com.definitions;

public class DateTimeResponse {
    /**
     * The date-time in ISO-6801 format: yyyyMMdd'T'HHmmssZ
     */
    public String data;
    public WftError[] errors;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        DateTimeResponse othersame = ((DateTimeResponse) other);
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
