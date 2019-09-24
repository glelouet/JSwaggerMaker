package api.github.com.definitions;

public class Label {
    public String color;
    public String name;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Label othersame = ((Label) other);
        if ((color!= othersame.color)&&((color == null)||(!color.equals(othersame.color)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((color == null)? 0 :color.hashCode())+((name == null)? 0 :name.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
