package fr.lelouet.jswaggermaker.compiler.client.compiled.definitions;

import fr.lelouet.jswaggermaker.compiler.client.compiled.structures.STATUS;

public class Order {
    public long id;
    public long petId;
    public int quantity;
    public String shipDate;
    /**
     * Order Status
     */
    public STATUS status;
    public boolean complete;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Order othersame = ((Order) other);
        if (id!= othersame.id) {
            return false;
        }
        if (petId!= othersame.petId) {
            return false;
        }
        if (quantity!= othersame.quantity) {
            return false;
        }
        if ((shipDate!= othersame.shipDate)&&((shipDate == null)||(!shipDate.equals(othersame.shipDate)))) {
            return false;
        }
        if ((status!= othersame.status)&&((status == null)||(!status.equals(othersame.status)))) {
            return false;
        }
        if (complete!= othersame.complete) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Long.hashCode(id)+ Long.hashCode(petId))+ quantity)+((shipDate == null)? 0 :shipDate.hashCode()))+((status == null)? 0 :status.hashCode()))+ Boolean.hashCode(complete));
    }
}
