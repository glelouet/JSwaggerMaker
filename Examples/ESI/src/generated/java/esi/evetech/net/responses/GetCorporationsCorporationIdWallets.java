package esi.evetech.net.responses;

public class GetCorporationsCorporationIdWallets {
    /**
     * balance number
     */
    public double balance;
    /**
     * division integer
     */
    public int division;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCorporationsCorporationIdWallets othersame = ((GetCorporationsCorporationIdWallets) other);
        if (balance!= othersame.balance) {
            return false;
        }
        if (division!= othersame.division) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(balance)+ division);
    }
}
