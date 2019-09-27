package esi.evetech.net.responses;

import esi.evetech.net.responses.getcharacterscharacteridmaillabels.Getcharacterscharacteridmaillabelslabels;

public class Getcharacterscharacteridmaillabels {
    /**
     * labels array
     */
    public Getcharacterscharacteridmaillabelslabels[] labels;
    /**
     * total_unread_count integer
     */
    public int total_unread_count;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcharacterscharacteridmaillabels othersame = ((Getcharacterscharacteridmaillabels) other);
        if ((labels!= othersame.labels)&&((labels == null)||(!labels.equals(othersame.labels)))) {
            return false;
        }
        if (total_unread_count!= othersame.total_unread_count) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((labels == null)? 0 :labels.hashCode())+ total_unread_count);
    }
}
