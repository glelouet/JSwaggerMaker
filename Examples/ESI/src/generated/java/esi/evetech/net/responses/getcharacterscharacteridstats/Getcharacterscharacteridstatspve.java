package esi.evetech.net.responses.getcharacterscharacteridstats;

public class Getcharacterscharacteridstatspve {
    /**
     * dungeons_completed_agent integer
     */
    public long dungeons_completed_agent;
    /**
     * dungeons_completed_distribution integer
     */
    public long dungeons_completed_distribution;
    /**
     * missions_succeeded integer
     */
    public long missions_succeeded;
    /**
     * missions_succeeded_epic_arc integer
     */
    public long missions_succeeded_epic_arc;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcharacterscharacteridstatspve othersame = ((Getcharacterscharacteridstatspve) other);
        if (dungeons_completed_agent!= othersame.dungeons_completed_agent) {
            return false;
        }
        if (dungeons_completed_distribution!= othersame.dungeons_completed_distribution) {
            return false;
        }
        if (missions_succeeded!= othersame.missions_succeeded) {
            return false;
        }
        if (missions_succeeded_epic_arc!= othersame.missions_succeeded_epic_arc) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Long.hashCode(dungeons_completed_agent)+ Long.hashCode(dungeons_completed_distribution))+ Long.hashCode(missions_succeeded))+ Long.hashCode(missions_succeeded_epic_arc));
    }
}
