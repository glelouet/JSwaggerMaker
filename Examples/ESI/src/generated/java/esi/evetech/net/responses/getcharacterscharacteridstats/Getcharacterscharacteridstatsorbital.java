package esi.evetech.net.responses.getcharacterscharacteridstats;

public class Getcharacterscharacteridstatsorbital {
    /**
     * strike_characters_killed integer
     */
    public long strike_characters_killed;
    /**
     * strike_damage_to_players_armor_amount integer
     */
    public long strike_damage_to_players_armor_amount;
    /**
     * strike_damage_to_players_shield_amount integer
     */
    public long strike_damage_to_players_shield_amount;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcharacterscharacteridstatsorbital othersame = ((Getcharacterscharacteridstatsorbital) other);
        if (strike_characters_killed!= othersame.strike_characters_killed) {
            return false;
        }
        if (strike_damage_to_players_armor_amount!= othersame.strike_damage_to_players_armor_amount) {
            return false;
        }
        if (strike_damage_to_players_shield_amount!= othersame.strike_damage_to_players_shield_amount) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Long.hashCode(strike_characters_killed)+ Long.hashCode(strike_damage_to_players_armor_amount))+ Long.hashCode(strike_damage_to_players_shield_amount));
    }
}
