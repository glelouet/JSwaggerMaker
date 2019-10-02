package esi.evetech.net.responses;

import esi.evetech.net.responses.getkillmailskillmailidkillmailhash.GetKillmailsKillmailIdKillmailHashAttackers;
import esi.evetech.net.responses.getkillmailskillmailidkillmailhash.GetKillmailsKillmailIdKillmailHashVictim;

public class GetKillmailsKillmailIdKillmailHash {
    /**
     * attackers array
     */
    public GetKillmailsKillmailIdKillmailHashAttackers[] attackers;
    /**
     * ID of the killmail
     */
    public int killmail_id;
    /**
     * Time that the victim was killed and the killmail generated
     * 
     */
    public String killmail_time;
    /**
     * Moon if the kill took place at one
     */
    public int moon_id;
    /**
     * Solar system that the kill took place in
     * 
     */
    public int solar_system_id;
    /**
     * victim object
     */
    public GetKillmailsKillmailIdKillmailHashVictim victim;
    /**
     * War if the killmail is generated in relation to an official war
     * 
     */
    public int war_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetKillmailsKillmailIdKillmailHash othersame = ((GetKillmailsKillmailIdKillmailHash) other);
        if ((attackers!= othersame.attackers)&&((attackers == null)||(!attackers.equals(othersame.attackers)))) {
            return false;
        }
        if (killmail_id!= othersame.killmail_id) {
            return false;
        }
        if ((killmail_time!= othersame.killmail_time)&&((killmail_time == null)||(!killmail_time.equals(othersame.killmail_time)))) {
            return false;
        }
        if (moon_id!= othersame.moon_id) {
            return false;
        }
        if (solar_system_id!= othersame.solar_system_id) {
            return false;
        }
        if ((victim!= othersame.victim)&&((victim == null)||(!victim.equals(othersame.victim)))) {
            return false;
        }
        if (war_id!= othersame.war_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((attackers == null)? 0 :attackers.hashCode())+ killmail_id)+((killmail_time == null)? 0 :killmail_time.hashCode()))+ moon_id)+ solar_system_id)+((victim == null)? 0 :victim.hashCode()))+ war_id);
    }
}
