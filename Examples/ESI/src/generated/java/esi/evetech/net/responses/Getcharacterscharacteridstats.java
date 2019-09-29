package esi.evetech.net.responses;

import esi.evetech.net.responses.getcharacterscharacteridstats.Getcharacterscharacteridstatscharacter;
import esi.evetech.net.responses.getcharacterscharacteridstats.Getcharacterscharacteridstatscombat;
import esi.evetech.net.responses.getcharacterscharacteridstats.Getcharacterscharacteridstatsindustry;
import esi.evetech.net.responses.getcharacterscharacteridstats.Getcharacterscharacteridstatsinventory;
import esi.evetech.net.responses.getcharacterscharacteridstats.Getcharacterscharacteridstatsisk;
import esi.evetech.net.responses.getcharacterscharacteridstats.Getcharacterscharacteridstatsmarket;
import esi.evetech.net.responses.getcharacterscharacteridstats.Getcharacterscharacteridstatsmining;
import esi.evetech.net.responses.getcharacterscharacteridstats.Getcharacterscharacteridstatsmodule;
import esi.evetech.net.responses.getcharacterscharacteridstats.Getcharacterscharacteridstatsorbital;
import esi.evetech.net.responses.getcharacterscharacteridstats.Getcharacterscharacteridstatspve;
import esi.evetech.net.responses.getcharacterscharacteridstats.Getcharacterscharacteridstatssocial;
import esi.evetech.net.responses.getcharacterscharacteridstats.Getcharacterscharacteridstatstravel;

public class Getcharacterscharacteridstats {
    /**
     * character object
     */
    public Getcharacterscharacteridstatscharacter character;
    /**
     * combat object
     */
    public Getcharacterscharacteridstatscombat combat;
    /**
     * industry object
     */
    public Getcharacterscharacteridstatsindustry industry;
    /**
     * inventory object
     */
    public Getcharacterscharacteridstatsinventory inventory;
    /**
     * isk object
     */
    public Getcharacterscharacteridstatsisk isk;
    /**
     * market object
     */
    public Getcharacterscharacteridstatsmarket market;
    /**
     * mining object
     */
    public Getcharacterscharacteridstatsmining mining;
    /**
     * module object
     */
    public Getcharacterscharacteridstatsmodule module;
    /**
     * orbital object
     */
    public Getcharacterscharacteridstatsorbital orbital;
    /**
     * pve object
     */
    public Getcharacterscharacteridstatspve pve;
    /**
     * social object
     */
    public Getcharacterscharacteridstatssocial social;
    /**
     * travel object
     */
    public Getcharacterscharacteridstatstravel travel;
    /**
     * Gregorian year for this set of aggregates
     */
    public int year;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcharacterscharacteridstats othersame = ((Getcharacterscharacteridstats) other);
        if ((character!= othersame.character)&&((character == null)||(!character.equals(othersame.character)))) {
            return false;
        }
        if ((combat!= othersame.combat)&&((combat == null)||(!combat.equals(othersame.combat)))) {
            return false;
        }
        if ((industry!= othersame.industry)&&((industry == null)||(!industry.equals(othersame.industry)))) {
            return false;
        }
        if ((inventory!= othersame.inventory)&&((inventory == null)||(!inventory.equals(othersame.inventory)))) {
            return false;
        }
        if ((isk!= othersame.isk)&&((isk == null)||(!isk.equals(othersame.isk)))) {
            return false;
        }
        if ((market!= othersame.market)&&((market == null)||(!market.equals(othersame.market)))) {
            return false;
        }
        if ((mining!= othersame.mining)&&((mining == null)||(!mining.equals(othersame.mining)))) {
            return false;
        }
        if ((module!= othersame.module)&&((module == null)||(!module.equals(othersame.module)))) {
            return false;
        }
        if ((orbital!= othersame.orbital)&&((orbital == null)||(!orbital.equals(othersame.orbital)))) {
            return false;
        }
        if ((pve!= othersame.pve)&&((pve == null)||(!pve.equals(othersame.pve)))) {
            return false;
        }
        if ((social!= othersame.social)&&((social == null)||(!social.equals(othersame.social)))) {
            return false;
        }
        if ((travel!= othersame.travel)&&((travel == null)||(!travel.equals(othersame.travel)))) {
            return false;
        }
        if (year!= othersame.year) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((character == null)? 0 :character.hashCode())+((combat == null)? 0 :combat.hashCode()))+((industry == null)? 0 :industry.hashCode()))+((inventory == null)? 0 :inventory.hashCode()))+((isk == null)? 0 :isk.hashCode()))+((market == null)? 0 :market.hashCode()))+((mining == null)? 0 :mining.hashCode()))+((module == null)? 0 :module.hashCode()))+((orbital == null)? 0 :orbital.hashCode()))+((pve == null)? 0 :pve.hashCode()))+((social == null)? 0 :social.hashCode()))+((travel == null)? 0 :travel.hashCode()))+ year);
    }
}
