package esi.evetech.net.responses.getuniversesystemssystemid;

public class Getuniversesystemssystemidplanets {
    /**
     * asteroid_belts array
     */
    public int[] asteroid_belts;
    /**
     * moons array
     */
    public int[] moons;
    /**
     * planet_id integer
     */
    public int planet_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getuniversesystemssystemidplanets othersame = ((Getuniversesystemssystemidplanets) other);
        if ((asteroid_belts!= othersame.asteroid_belts)&&((asteroid_belts == null)||(!asteroid_belts.equals(othersame.asteroid_belts)))) {
            return false;
        }
        if ((moons!= othersame.moons)&&((moons == null)||(!moons.equals(othersame.moons)))) {
            return false;
        }
        if (planet_id!= othersame.planet_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((asteroid_belts == null)? 0 :asteroid_belts.hashCode())+((moons == null)? 0 :moons.hashCode()))+ planet_id);
    }
}
