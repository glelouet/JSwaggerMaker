package esi.evetech.net.responses;

public class GetUniverseSchematicsSchematicId {
    /**
     * Time in seconds to process a run
     */
    public int cycle_time;
    /**
     * schematic_name string
     */
    public String schematic_name;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetUniverseSchematicsSchematicId othersame = ((GetUniverseSchematicsSchematicId) other);
        if (cycle_time!= othersame.cycle_time) {
            return false;
        }
        if ((schematic_name!= othersame.schematic_name)&&((schematic_name == null)||(!schematic_name.equals(othersame.schematic_name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (cycle_time +((schematic_name == null)? 0 :schematic_name.hashCode()));
    }
}
