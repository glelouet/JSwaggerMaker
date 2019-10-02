package esi.evetech.net.responses;

import esi.evetech.net.responses.getcharacterscharacteridplanetsplanetid.GetCharactersCharacterIdPlanetsPlanetIdLinks;
import esi.evetech.net.responses.getcharacterscharacteridplanetsplanetid.GetCharactersCharacterIdPlanetsPlanetIdPins;
import esi.evetech.net.responses.getcharacterscharacteridplanetsplanetid.GetCharactersCharacterIdPlanetsPlanetIdRoutes;

public class GetCharactersCharacterIdPlanetsPlanetId {
    /**
     * links array
     */
    public GetCharactersCharacterIdPlanetsPlanetIdLinks[] links;
    /**
     * pins array
     */
    public GetCharactersCharacterIdPlanetsPlanetIdPins[] pins;
    /**
     * routes array
     */
    public GetCharactersCharacterIdPlanetsPlanetIdRoutes[] routes;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCharactersCharacterIdPlanetsPlanetId othersame = ((GetCharactersCharacterIdPlanetsPlanetId) other);
        if ((links!= othersame.links)&&((links == null)||(!links.equals(othersame.links)))) {
            return false;
        }
        if ((pins!= othersame.pins)&&((pins == null)||(!pins.equals(othersame.pins)))) {
            return false;
        }
        if ((routes!= othersame.routes)&&((routes == null)||(!routes.equals(othersame.routes)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((links == null)? 0 :links.hashCode())+((pins == null)? 0 :pins.hashCode()))+((routes == null)? 0 :routes.hashCode()));
    }
}
