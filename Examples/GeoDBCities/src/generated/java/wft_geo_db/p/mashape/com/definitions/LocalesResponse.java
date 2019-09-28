package wft_geo_db.p.mashape.com.definitions;

public class LocalesResponse {
    /**
     * A list of LocalDescriptors
     */
    public LocaleDescriptor[] data;
    /**
     * A list of WftErrors
     */
    public WftError[] errors;
    /**
     * A list of Links
     */
    public Link[] links;
    public Metadata metadata;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LocalesResponse othersame = ((LocalesResponse) other);
        if ((data!= othersame.data)&&((data == null)||(!data.equals(othersame.data)))) {
            return false;
        }
        if ((errors!= othersame.errors)&&((errors == null)||(!errors.equals(othersame.errors)))) {
            return false;
        }
        if ((links!= othersame.links)&&((links == null)||(!links.equals(othersame.links)))) {
            return false;
        }
        if ((metadata!= othersame.metadata)&&((metadata == null)||(!metadata.equals(othersame.metadata)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((data == null)? 0 :data.hashCode())+((errors == null)? 0 :errors.hashCode()))+((links == null)? 0 :links.hashCode()))+((metadata == null)? 0 :metadata.hashCode()));
    }
}
