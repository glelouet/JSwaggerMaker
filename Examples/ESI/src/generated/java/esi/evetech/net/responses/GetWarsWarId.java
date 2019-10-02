package esi.evetech.net.responses;

import esi.evetech.net.responses.getwarswarid.GetWarsWarIdAggressor;
import esi.evetech.net.responses.getwarswarid.GetWarsWarIdAllies;

public class GetWarsWarId {
    /**
     * The aggressor corporation or alliance that declared this war, only contains either corporation_id or alliance_id
     */
    public GetWarsWarIdAggressor aggressor;
    /**
     * allied corporations or alliances, each object contains either corporation_id or alliance_id
     */
    public GetWarsWarIdAllies[] allies;
    /**
     * Time that the war was declared
     */
    public String declared;
    /**
     * The defending corporation or alliance that declared this war, only contains either corporation_id or alliance_id
     */
    public GetWarsWarIdAggressor defender;
    /**
     * Time the war ended and shooting was no longer allowed
     */
    public String finished;
    /**
     * ID of the specified war
     */
    public int id;
    /**
     * Was the war declared mutual by both parties
     */
    public boolean mutual;
    /**
     * Is the war currently open for allies or not
     */
    public boolean open_for_allies;
    /**
     * Time the war was retracted but both sides could still shoot each other
     */
    public String retracted;
    /**
     * Time when the war started and both sides could shoot each other
     */
    public String started;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetWarsWarId othersame = ((GetWarsWarId) other);
        if ((aggressor!= othersame.aggressor)&&((aggressor == null)||(!aggressor.equals(othersame.aggressor)))) {
            return false;
        }
        if ((allies!= othersame.allies)&&((allies == null)||(!allies.equals(othersame.allies)))) {
            return false;
        }
        if ((declared!= othersame.declared)&&((declared == null)||(!declared.equals(othersame.declared)))) {
            return false;
        }
        if ((defender!= othersame.defender)&&((defender == null)||(!defender.equals(othersame.defender)))) {
            return false;
        }
        if ((finished!= othersame.finished)&&((finished == null)||(!finished.equals(othersame.finished)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if (mutual!= othersame.mutual) {
            return false;
        }
        if (open_for_allies!= othersame.open_for_allies) {
            return false;
        }
        if ((retracted!= othersame.retracted)&&((retracted == null)||(!retracted.equals(othersame.retracted)))) {
            return false;
        }
        if ((started!= othersame.started)&&((started == null)||(!started.equals(othersame.started)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((aggressor == null)? 0 :aggressor.hashCode())+((allies == null)? 0 :allies.hashCode()))+((declared == null)? 0 :declared.hashCode()))+((defender == null)? 0 :defender.hashCode()))+((finished == null)? 0 :finished.hashCode()))+ id)+ Boolean.hashCode(mutual))+ Boolean.hashCode(open_for_allies))+((retracted == null)? 0 :retracted.hashCode()))+((started == null)? 0 :started.hashCode()));
    }
}
