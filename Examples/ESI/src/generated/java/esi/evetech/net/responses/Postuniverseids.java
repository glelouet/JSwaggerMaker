package esi.evetech.net.responses;

import esi.evetech.net.responses.getfleetsfleetidwings.Getfleetsfleetidwingssquads;

public class Postuniverseids {
    /**
     * agents array
     */
    public Getfleetsfleetidwingssquads[] agents;
    /**
     * alliances array
     */
    public Getfleetsfleetidwingssquads[] alliances;
    /**
     * characters array
     */
    public Getfleetsfleetidwingssquads[] characters;
    /**
     * constellations array
     */
    public Getfleetsfleetidwingssquads[] constellations;
    /**
     * corporations array
     */
    public Getfleetsfleetidwingssquads[] corporations;
    /**
     * factions array
     */
    public Getfleetsfleetidwingssquads[] factions;
    /**
     * inventory_types array
     */
    public Getfleetsfleetidwingssquads[] inventory_types;
    /**
     * regions array
     */
    public Getfleetsfleetidwingssquads[] regions;
    /**
     * stations array
     */
    public Getfleetsfleetidwingssquads[] stations;
    /**
     * systems array
     */
    public Getfleetsfleetidwingssquads[] systems;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Postuniverseids othersame = ((Postuniverseids) other);
        if ((agents!= othersame.agents)&&((agents == null)||(!agents.equals(othersame.agents)))) {
            return false;
        }
        if ((alliances!= othersame.alliances)&&((alliances == null)||(!alliances.equals(othersame.alliances)))) {
            return false;
        }
        if ((characters!= othersame.characters)&&((characters == null)||(!characters.equals(othersame.characters)))) {
            return false;
        }
        if ((constellations!= othersame.constellations)&&((constellations == null)||(!constellations.equals(othersame.constellations)))) {
            return false;
        }
        if ((corporations!= othersame.corporations)&&((corporations == null)||(!corporations.equals(othersame.corporations)))) {
            return false;
        }
        if ((factions!= othersame.factions)&&((factions == null)||(!factions.equals(othersame.factions)))) {
            return false;
        }
        if ((inventory_types!= othersame.inventory_types)&&((inventory_types == null)||(!inventory_types.equals(othersame.inventory_types)))) {
            return false;
        }
        if ((regions!= othersame.regions)&&((regions == null)||(!regions.equals(othersame.regions)))) {
            return false;
        }
        if ((stations!= othersame.stations)&&((stations == null)||(!stations.equals(othersame.stations)))) {
            return false;
        }
        if ((systems!= othersame.systems)&&((systems == null)||(!systems.equals(othersame.systems)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((agents == null)? 0 :agents.hashCode())+((alliances == null)? 0 :alliances.hashCode()))+((characters == null)? 0 :characters.hashCode()))+((constellations == null)? 0 :constellations.hashCode()))+((corporations == null)? 0 :corporations.hashCode()))+((factions == null)? 0 :factions.hashCode()))+((inventory_types == null)? 0 :inventory_types.hashCode()))+((regions == null)? 0 :regions.hashCode()))+((stations == null)? 0 :stations.hashCode()))+((systems == null)? 0 :systems.hashCode()));
    }
}
