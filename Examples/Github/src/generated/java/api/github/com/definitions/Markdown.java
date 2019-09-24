package api.github.com.definitions;

public class Markdown {
    public String context;
    public String mode;
    public String text;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Markdown othersame = ((Markdown) other);
        if ((context!= othersame.context)&&((context == null)||(!context.equals(othersame.context)))) {
            return false;
        }
        if ((mode!= othersame.mode)&&((mode == null)||(!mode.equals(othersame.mode)))) {
            return false;
        }
        if ((text!= othersame.text)&&((text == null)||(!text.equals(othersame.text)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((context == null)? 0 :context.hashCode())+((mode == null)? 0 :mode.hashCode()))+((text == null)? 0 :text.hashCode()));
    }
}
