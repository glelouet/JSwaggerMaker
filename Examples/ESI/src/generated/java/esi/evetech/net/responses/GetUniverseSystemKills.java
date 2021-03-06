package esi.evetech.net.responses;

public class GetUniverseSystemKills {
    /**
     * Number of NPC ships killed in this system
     */
    public int npc_kills;
    /**
     * Number of pods killed in this system
     */
    public int pod_kills;
    /**
     * Number of player ships killed in this system
     */
    public int ship_kills;
    /**
     * system_id integer
     */
    public int system_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetUniverseSystemKills othersame = ((GetUniverseSystemKills) other);
        if (npc_kills!= othersame.npc_kills) {
            return false;
        }
        if (pod_kills!= othersame.pod_kills) {
            return false;
        }
        if (ship_kills!= othersame.ship_kills) {
            return false;
        }
        if (system_id!= othersame.system_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((npc_kills + pod_kills)+ ship_kills)+ system_id);
    }
}
