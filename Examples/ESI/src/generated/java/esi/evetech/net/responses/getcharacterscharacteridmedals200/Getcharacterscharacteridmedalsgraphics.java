package esi.evetech.net.responses.getcharacterscharacteridmedals200;

public class Getcharacterscharacteridmedalsgraphics {
    /**
     * color integer
     */
    public int color;
    /**
     * graphic string
     */
    public String graphic;
    /**
     * layer integer
     */
    public int layer;
    /**
     * part integer
     */
    public int part;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcharacterscharacteridmedalsgraphics othersame = ((Getcharacterscharacteridmedalsgraphics) other);
        if (color!= othersame.color) {
            return false;
        }
        if ((graphic!= othersame.graphic)&&((graphic == null)||(!graphic.equals(othersame.graphic)))) {
            return false;
        }
        if (layer!= othersame.layer) {
            return false;
        }
        if (part!= othersame.part) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((color +((graphic == null)? 0 :graphic.hashCode()))+ layer)+ part);
    }
}
