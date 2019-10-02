package esi.evetech.net.responses;

import esi.evetech.net.structures.GetUniverseStarsStarIdSpectralClass;

public class GetUniverseStarsStarId {
    /**
     * Age of star in years
     */
    public long age;
    /**
     * luminosity number
     */
    public float luminosity;
    /**
     * name string
     */
    public String name;
    /**
     * radius integer
     */
    public long radius;
    /**
     * solar_system_id integer
     */
    public int solar_system_id;
    /**
     * spectral_class string
     */
    public GetUniverseStarsStarIdSpectralClass spectral_class;
    /**
     * temperature integer
     */
    public int temperature;
    /**
     * type_id integer
     */
    public int type_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetUniverseStarsStarId othersame = ((GetUniverseStarsStarId) other);
        if (age!= othersame.age) {
            return false;
        }
        if (luminosity!= othersame.luminosity) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (radius!= othersame.radius) {
            return false;
        }
        if (solar_system_id!= othersame.solar_system_id) {
            return false;
        }
        if ((spectral_class!= othersame.spectral_class)&&((spectral_class == null)||(!spectral_class.equals(othersame.spectral_class)))) {
            return false;
        }
        if (temperature!= othersame.temperature) {
            return false;
        }
        if (type_id!= othersame.type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((Long.hashCode(age)+ Double.hashCode(luminosity))+((name == null)? 0 :name.hashCode()))+ Long.hashCode(radius))+ solar_system_id)+((spectral_class == null)? 0 :spectral_class.hashCode()))+ temperature)+ type_id);
    }
}
