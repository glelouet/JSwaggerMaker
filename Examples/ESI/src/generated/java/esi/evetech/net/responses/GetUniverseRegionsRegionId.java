package esi.evetech.net.responses;

public class GetUniverseRegionsRegionId {
    /**
     * constellations array
     */
    public int[] constellations;
    /**
     * description string
     */
    public String description;
    /**
     * name string
     */
    public String name;
    /**
     * region_id integer
     */
    public int region_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetUniverseRegionsRegionId othersame = ((GetUniverseRegionsRegionId) other);
        if ((constellations!= othersame.constellations)&&((constellations == null)||(!constellations.equals(othersame.constellations)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (region_id!= othersame.region_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((constellations == null)? 0 :constellations.hashCode())+((description == null)? 0 :description.hashCode()))+((name == null)? 0 :name.hashCode()))+ region_id);
    }
}
