package www.googleapis.com.definitions;

public class LiveChatPollEditedDetails {
    public String id;
    public LiveChatPollItem[] items;
    public String prompt;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveChatPollEditedDetails othersame = ((LiveChatPollEditedDetails) other);
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if ((items!= othersame.items)&&((items == null)||(!items.equals(othersame.items)))) {
            return false;
        }
        if ((prompt!= othersame.prompt)&&((prompt == null)||(!prompt.equals(othersame.prompt)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((id == null)? 0 :id.hashCode())+((items == null)? 0 :items.hashCode()))+((prompt == null)? 0 :prompt.hashCode()));
    }
}
