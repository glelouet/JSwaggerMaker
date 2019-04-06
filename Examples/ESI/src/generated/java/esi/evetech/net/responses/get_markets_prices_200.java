package esi.evetech.net.responses;

public class get_markets_prices_200 {
    /**
     * adjusted_price number
     */
    public double adjusted_price;
    /**
     * average_price number
     */
    public double average_price;
    /**
     * type_id integer
     */
    public int type_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        get_markets_prices_200 othersame = ((get_markets_prices_200) other);
        if (adjusted_price!= othersame.adjusted_price) {
            return false;
        }
        if (average_price!= othersame.average_price) {
            return false;
        }
        if (type_id!= othersame.type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Double.hashCode(adjusted_price)+ Double.hashCode(average_price))+ type_id);
    }
}
