package www.googleapis.com.definitions;

public class LiveChatSuperStickerDetails {
    /**
     * A rendered string that displays the fund amount and currency to the user.
     */
    public String amountDisplayString;
    /**
     * The amount purchased by the user, in micros (1,750,000 micros = 1.75).
     */
    public String amountMicros;
    /**
     * The currency in which the purchase was made.
     */
    public String currency;
    /**
     * Information about the Super Sticker.
     */
    public SuperStickerMetadata superStickerMetadata;
    /**
     * The tier in which the amount belongs. Lower amounts belong to lower tiers. The lowest tier is 1.
     */
    public long tier;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveChatSuperStickerDetails othersame = ((LiveChatSuperStickerDetails) other);
        if ((amountDisplayString!= othersame.amountDisplayString)&&((amountDisplayString == null)||(!amountDisplayString.equals(othersame.amountDisplayString)))) {
            return false;
        }
        if ((amountMicros!= othersame.amountMicros)&&((amountMicros == null)||(!amountMicros.equals(othersame.amountMicros)))) {
            return false;
        }
        if ((currency!= othersame.currency)&&((currency == null)||(!currency.equals(othersame.currency)))) {
            return false;
        }
        if ((superStickerMetadata!= othersame.superStickerMetadata)&&((superStickerMetadata == null)||(!superStickerMetadata.equals(othersame.superStickerMetadata)))) {
            return false;
        }
        if (tier!= othersame.tier) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((amountDisplayString == null)? 0 :amountDisplayString.hashCode())+((amountMicros == null)? 0 :amountMicros.hashCode()))+((currency == null)? 0 :currency.hashCode()))+((superStickerMetadata == null)? 0 :superStickerMetadata.hashCode()))+ Long.hashCode(tier));
    }
}
