package www.googleapis.com.definitions;

public class SuperStickerMetadata {
    /**
     * Internationalized alt text that describes the sticker image and any animation associated with it.
     */
    public String altText;
    /**
     * Specifies the localization language in which the alt text is returned.
     */
    public String altTextLanguage;
    /**
     * Unique identifier of the Super Sticker. This is a shorter form of the alt_text that includes pack name and a recognizable characteristic of the sticker.
     */
    public String stickerId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        SuperStickerMetadata othersame = ((SuperStickerMetadata) other);
        if ((altText!= othersame.altText)&&((altText == null)||(!altText.equals(othersame.altText)))) {
            return false;
        }
        if ((altTextLanguage!= othersame.altTextLanguage)&&((altTextLanguage == null)||(!altTextLanguage.equals(othersame.altTextLanguage)))) {
            return false;
        }
        if ((stickerId!= othersame.stickerId)&&((stickerId == null)||(!stickerId.equals(othersame.stickerId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((altText == null)? 0 :altText.hashCode())+((altTextLanguage == null)? 0 :altTextLanguage.hashCode()))+((stickerId == null)? 0 :stickerId.hashCode()));
    }
}
