package esi.evetech.net.responses;

import esi.evetech.net.responses.getcharacterscharacteridskills.Getcharacterscharacteridskillsskills;

public class Getcharacterscharacteridskills {
    /**
     * skills array
     */
    public Getcharacterscharacteridskillsskills[] skills;
    /**
     * total_sp integer
     */
    public long total_sp;
    /**
     * Skill points available to be assigned
     */
    public int unallocated_sp;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcharacterscharacteridskills othersame = ((Getcharacterscharacteridskills) other);
        if ((skills!= othersame.skills)&&((skills == null)||(!skills.equals(othersame.skills)))) {
            return false;
        }
        if (total_sp!= othersame.total_sp) {
            return false;
        }
        if (unallocated_sp!= othersame.unallocated_sp) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((skills == null)? 0 :skills.hashCode())+ Long.hashCode(total_sp))+ unallocated_sp);
    }
}
