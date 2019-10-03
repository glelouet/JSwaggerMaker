package esi.evetech.net.anonymous;

import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.universe.Ancestries;
import esi.evetech.net.anonymous.universe.AsteroidBelts;
import esi.evetech.net.anonymous.universe.Bloodlines;
import esi.evetech.net.anonymous.universe.Categories;
import esi.evetech.net.anonymous.universe.Constellations;
import esi.evetech.net.anonymous.universe.Factions;
import esi.evetech.net.anonymous.universe.Graphics;
import esi.evetech.net.anonymous.universe.Groups;
import esi.evetech.net.anonymous.universe.Ids;
import esi.evetech.net.anonymous.universe.Moons;
import esi.evetech.net.anonymous.universe.Names;
import esi.evetech.net.anonymous.universe.Planets;
import esi.evetech.net.anonymous.universe.Races;
import esi.evetech.net.anonymous.universe.Regions;
import esi.evetech.net.anonymous.universe.Schematics;
import esi.evetech.net.anonymous.universe.Stargates;
import esi.evetech.net.anonymous.universe.Stars;
import esi.evetech.net.anonymous.universe.Stations;
import esi.evetech.net.anonymous.universe.Structures;
import esi.evetech.net.anonymous.universe.SystemJumps;
import esi.evetech.net.anonymous.universe.SystemKills;
import esi.evetech.net.anonymous.universe.Systems;
import esi.evetech.net.anonymous.universe.Types;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Universe
    extends DelegateTransfer<Anonymous>
{
    public final Ancestries ancestries;
    public final AsteroidBelts asteroid_belts;
    public final Bloodlines bloodlines;
    public final Categories categories;
    public final Constellations constellations;
    public final Graphics graphics;
    public final Groups groups;
    public final Ids ids;
    public final Moons moons;
    public final Planets planets;
    public final Races races;
    public final Regions regions;
    public final Schematics schematics;
    public final Stargates stargates;
    public final Stars stars;
    public final Structures structures;
    public final SystemJumps system_jumps;
    public final Systems systems;
    public final Types types;
    public final Factions factions;
    public final Stations stations;
    public final SystemKills system_kills;
    public final Names names;

    public Universe(Anonymous delegate) {
        super(delegate);
        ancestries = new Ancestries((delegate));
        asteroid_belts = new AsteroidBelts((delegate));
        bloodlines = new Bloodlines((delegate));
        categories = new Categories((delegate));
        constellations = new Constellations((delegate));
        graphics = new Graphics((delegate));
        groups = new Groups((delegate));
        ids = new Ids((delegate));
        moons = new Moons((delegate));
        planets = new Planets((delegate));
        races = new Races((delegate));
        regions = new Regions((delegate));
        schematics = new Schematics((delegate));
        stargates = new Stargates((delegate));
        stars = new Stars((delegate));
        structures = new Structures((delegate));
        system_jumps = new SystemJumps((delegate));
        systems = new Systems((delegate));
        types = new Types((delegate));
        factions = new Factions((delegate));
        stations = new Stations((delegate));
        system_kills = new SystemKills((delegate));
        names = new Names((delegate));
    }
}
