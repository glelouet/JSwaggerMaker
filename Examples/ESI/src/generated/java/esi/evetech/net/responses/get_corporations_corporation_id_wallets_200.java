package esi.evetech.net.responses;

public class get_corporations_corporation_id_wallets_200 {
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
        get_corporations_corporation_id_wallets_200 othersame = ((get_corporations_corporation_id_wallets_200) other);
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
