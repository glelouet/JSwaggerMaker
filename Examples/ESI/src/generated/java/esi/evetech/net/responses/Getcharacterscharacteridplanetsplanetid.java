package esi.evetech.net.responses;

import esi.evetech.net.responses.getcharacterscharacteridplanetsplanetid.Getcharacterscharacteridplanetsplanetidlinks;
import esi.evetech.net.responses.getcharacterscharacteridplanetsplanetid.Getcharacterscharacteridplanetsplanetidpins;
import esi.evetech.net.responses.getcharacterscharacteridplanetsplanetid.Getcharacterscharacteridplanetsplanetidroutes;

public class Getcharacterscharacteridplanetsplanetid {
    /**
     * links array
     */
    public Getcharacterscharacteridplanetsplanetidlinks[] links;
    /**
     * pins array
     */
    public Getcharacterscharacteridplanetsplanetidpins[] pins;
    /**
     * routes array
     */
    public Getcharacterscharacteridplanetsplanetidroutes[] routes;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcharacterscharacteridplanetsplanetid othersame = ((Getcharacterscharacteridplanetsplanetid) other);
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
