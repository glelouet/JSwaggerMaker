package www.googleapis.com.definitions;

public class LiveChatFanFundingEventDetails {
    /**
     * A rendered string that displays the fund amount and currency to the user.
     */
    public String amountDisplayString;
    /**
     * The amount of the fund.
     */
    public String amountMicros;
    /**
     * The currency in which the fund was made.
     */
    public String currency;
    /**
     * The comment added by the user to this fan funding event.
     */
    public String userComment;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveChatFanFundingEventDetails othersame = ((LiveChatFanFundingEventDetails) other);
        if ((amountDisplayString!= othersame.amountDisplayString)&&((amountDisplayString == null)||(!amountDisplayString.equals(othersame.amountDisplayString)))) {
            return false;
        }
        if ((amountMicros!= othersame.amountMicros)&&((amountMicros == null)||(!amountMicros.equals(othersame.amountMicros)))) {
            return false;
        }
        if ((currency!= othersame.currency)&&((currency == null)||(!currency.equals(othersame.currency)))) {
            return false;
        }
        if ((userComment!= othersame.userComment)&&((userComment == null)||(!userComment.equals(othersame.userComment)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((amountDisplayString == null)? 0 :amountDisplayString.hashCode())+((amountMicros == null)? 0 :amountMicros.hashCode()))+((currency == null)? 0 :currency.hashCode()))+((userComment == null)? 0 :userComment.hashCode()));
    }
}
