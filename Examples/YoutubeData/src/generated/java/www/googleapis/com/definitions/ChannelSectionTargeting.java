package www.googleapis.com.definitions;

public class ChannelSectionTargeting {
    /**
     * The country the channel section is targeting.
     */
    public String[] countries;
    /**
     * The language the channel section is targeting.
     */
    public String[] languages;
    /**
     * The region the channel section is targeting.
     */
    public String[] regions;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelSectionTargeting othersame = ((ChannelSectionTargeting) other);
        if ((countries!= othersame.countries)&&((countries == null)||(!countries.equals(othersame.countries)))) {
            return false;
        }
        if ((languages!= othersame.languages)&&((languages == null)||(!languages.equals(othersame.languages)))) {
            return false;
        }
        if ((regions!= othersame.regions)&&((regions == null)||(!regions.equals(othersame.regions)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((countries == null)? 0 :countries.hashCode())+((languages == null)? 0 :languages.hashCode()))+((regions == null)? 0 :regions.hashCode()));
    }
}
