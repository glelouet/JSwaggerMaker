package esi.evetech.net.responses;

public class Getalliancesallianceidicons {
    /**
     * px128x128 string
     */
    public String px128x128;
    /**
     * px64x64 string
     */
    public String px64x64;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getalliancesallianceidicons othersame = ((Getalliancesallianceidicons) other);
        if ((px128x128 != othersame.px128x128)&&((px128x128 == null)||(!px128x128 .equals(othersame.px128x128)))) {
            return false;
        }
        if ((px64x64 != othersame.px64x64)&&((px64x64 == null)||(!px64x64 .equals(othersame.px64x64)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((px128x128 == null)? 0 :px128x128 .hashCode())+((px64x64 == null)? 0 :px64x64 .hashCode()));
    }
}
