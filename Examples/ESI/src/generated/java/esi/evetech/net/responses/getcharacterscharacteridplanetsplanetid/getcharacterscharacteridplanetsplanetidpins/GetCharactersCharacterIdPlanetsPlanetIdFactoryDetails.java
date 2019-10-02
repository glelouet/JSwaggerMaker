package esi.evetech.net.responses.getcharacterscharacteridplanetsplanetid.getcharacterscharacteridplanetsplanetidpins;

public class GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails {
    /**
     * schematic_id integer
     */
    public int schematic_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails othersame = ((GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails) other);
        if (schematic_id!= othersame.schematic_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return schematic_id;
    }
}
