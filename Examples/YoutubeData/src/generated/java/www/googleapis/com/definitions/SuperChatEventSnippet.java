package www.googleapis.com.definitions;

public class SuperChatEventSnippet {
    /**
     * The purchase amount, in micros of the purchase currency. e.g., 1 is represented as 1000000.
     */
    public String amountMicros;
    /**
     * Channel id where the event occurred.
     */
    public String channelId;
    /**
     * The text contents of the comment left by the user.
     */
    public String commentText;
    /**
     * The date and time when the event occurred. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String createdAt;
    /**
     * The currency in which the purchase was made. ISO 4217.
     */
    public String currency;
    /**
     * A rendered string that displays the purchase amount and currency (e.g., "$1.00"). The string is rendered for the given language.
     */
    public String displayString;
    /**
     * True if this event is a Super Chat for Good purchase.
     */
    public boolean isSuperChatForGood;
    /**
     * True if this event is a Super Sticker event.
     */
    public boolean isSuperStickerEvent;
    /**
     * The tier for the paid message, which is based on the amount of money spent to purchase the message.
     */
    public long messageType;
    /**
     * If this event is a Super Chat for Good purchase, this field will contain information about the charity the purchase is donated to.
     */
    public Nonprofit nonprofit;
    /**
     * If this event is a Super Sticker event, this field will contain metadata about the Super Sticker.
     */
    public SuperStickerMetadata superStickerMetadata;
    /**
     * Details about the supporter.
     */
    public ChannelProfileDetails supporterDetails;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        SuperChatEventSnippet othersame = ((SuperChatEventSnippet) other);
        if ((amountMicros!= othersame.amountMicros)&&((amountMicros == null)||(!amountMicros.equals(othersame.amountMicros)))) {
            return false;
        }
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((commentText!= othersame.commentText)&&((commentText == null)||(!commentText.equals(othersame.commentText)))) {
            return false;
        }
        if ((createdAt!= othersame.createdAt)&&((createdAt == null)||(!createdAt.equals(othersame.createdAt)))) {
            return false;
        }
        if ((currency!= othersame.currency)&&((currency == null)||(!currency.equals(othersame.currency)))) {
            return false;
        }
        if ((displayString!= othersame.displayString)&&((displayString == null)||(!displayString.equals(othersame.displayString)))) {
            return false;
        }
        if (isSuperChatForGood!= othersame.isSuperChatForGood) {
            return false;
        }
        if (isSuperStickerEvent!= othersame.isSuperStickerEvent) {
            return false;
        }
        if (messageType!= othersame.messageType) {
            return false;
        }
        if ((nonprofit!= othersame.nonprofit)&&((nonprofit == null)||(!nonprofit.equals(othersame.nonprofit)))) {
            return false;
        }
        if ((superStickerMetadata!= othersame.superStickerMetadata)&&((superStickerMetadata == null)||(!superStickerMetadata.equals(othersame.superStickerMetadata)))) {
            return false;
        }
        if ((supporterDetails!= othersame.supporterDetails)&&((supporterDetails == null)||(!supporterDetails.equals(othersame.supporterDetails)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((amountMicros == null)? 0 :amountMicros.hashCode())+((channelId == null)? 0 :channelId.hashCode()))+((commentText == null)? 0 :commentText.hashCode()))+((createdAt == null)? 0 :createdAt.hashCode()))+((currency == null)? 0 :currency.hashCode()))+((displayString == null)? 0 :displayString.hashCode()))+ Boolean.hashCode(isSuperChatForGood))+ Boolean.hashCode(isSuperStickerEvent))+ Long.hashCode(messageType))+((nonprofit == null)? 0 :nonprofit.hashCode()))+((superStickerMetadata == null)? 0 :superStickerMetadata.hashCode()))+((supporterDetails == null)? 0 :supporterDetails.hashCode()));
    }
}
