package www.googleapis.com.definitions;

import www.googleapis.com.structures.Type;

public class LiveChatMessageSnippet {
    /**
     * The ID of the user that authored this message, this field is not always filled. textMessageEvent - the user that wrote the message fanFundingEvent - the user that funded the broadcast newSponsorEvent - the user that just became a sponsor messageDeletedEvent - the moderator that took the action messageRetractedEvent - the author that retracted their message userBannedEvent - the moderator that took the action superChatEvent - the user that made the purchase
     */
    public String authorChannelId;
    /**
     * Contains a string that can be displayed to the user. If this field is not present the message is silent, at the moment only messages of type TOMBSTONE and CHAT_ENDED_EVENT are silent.
     */
    public String displayMessage;
    /**
     * Details about the funding event, this is only set if the type is 'fanFundingEvent'.
     */
    public LiveChatFanFundingEventDetails fanFundingEventDetails;
    /**
     * Whether the message has display content that should be displayed to users.
     */
    public boolean hasDisplayContent;
    public String liveChatId;
    public LiveChatMessageDeletedDetails messageDeletedDetails;
    public LiveChatMessageRetractedDetails messageRetractedDetails;
    public LiveChatPollClosedDetails pollClosedDetails;
    public LiveChatPollEditedDetails pollEditedDetails;
    public LiveChatPollOpenedDetails pollOpenedDetails;
    public LiveChatPollVotedDetails pollVotedDetails;
    /**
     * The date and time when the message was orignally published. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String publishedAt;
    /**
     * Details about the Super Chat event, this is only set if the type is 'superChatEvent'.
     */
    public LiveChatSuperChatDetails superChatDetails;
    /**
     * Details about the Super Sticker event, this is only set if the type is 'superStickerEvent'.
     */
    public LiveChatSuperStickerDetails superStickerDetails;
    /**
     * Details about the text message, this is only set if the type is 'textMessageEvent'.
     */
    public LiveChatTextMessageDetails textMessageDetails;
    /**
     * The type of message, this will always be present, it determines the contents of the message as well as which fields will be present.
     */
    public Type type;
    public LiveChatUserBannedMessageDetails userBannedDetails;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveChatMessageSnippet othersame = ((LiveChatMessageSnippet) other);
        if ((authorChannelId!= othersame.authorChannelId)&&((authorChannelId == null)||(!authorChannelId.equals(othersame.authorChannelId)))) {
            return false;
        }
        if ((displayMessage!= othersame.displayMessage)&&((displayMessage == null)||(!displayMessage.equals(othersame.displayMessage)))) {
            return false;
        }
        if ((fanFundingEventDetails!= othersame.fanFundingEventDetails)&&((fanFundingEventDetails == null)||(!fanFundingEventDetails.equals(othersame.fanFundingEventDetails)))) {
            return false;
        }
        if (hasDisplayContent!= othersame.hasDisplayContent) {
            return false;
        }
        if ((liveChatId!= othersame.liveChatId)&&((liveChatId == null)||(!liveChatId.equals(othersame.liveChatId)))) {
            return false;
        }
        if ((messageDeletedDetails!= othersame.messageDeletedDetails)&&((messageDeletedDetails == null)||(!messageDeletedDetails.equals(othersame.messageDeletedDetails)))) {
            return false;
        }
        if ((messageRetractedDetails!= othersame.messageRetractedDetails)&&((messageRetractedDetails == null)||(!messageRetractedDetails.equals(othersame.messageRetractedDetails)))) {
            return false;
        }
        if ((pollClosedDetails!= othersame.pollClosedDetails)&&((pollClosedDetails == null)||(!pollClosedDetails.equals(othersame.pollClosedDetails)))) {
            return false;
        }
        if ((pollEditedDetails!= othersame.pollEditedDetails)&&((pollEditedDetails == null)||(!pollEditedDetails.equals(othersame.pollEditedDetails)))) {
            return false;
        }
        if ((pollOpenedDetails!= othersame.pollOpenedDetails)&&((pollOpenedDetails == null)||(!pollOpenedDetails.equals(othersame.pollOpenedDetails)))) {
            return false;
        }
        if ((pollVotedDetails!= othersame.pollVotedDetails)&&((pollVotedDetails == null)||(!pollVotedDetails.equals(othersame.pollVotedDetails)))) {
            return false;
        }
        if ((publishedAt!= othersame.publishedAt)&&((publishedAt == null)||(!publishedAt.equals(othersame.publishedAt)))) {
            return false;
        }
        if ((superChatDetails!= othersame.superChatDetails)&&((superChatDetails == null)||(!superChatDetails.equals(othersame.superChatDetails)))) {
            return false;
        }
        if ((superStickerDetails!= othersame.superStickerDetails)&&((superStickerDetails == null)||(!superStickerDetails.equals(othersame.superStickerDetails)))) {
            return false;
        }
        if ((textMessageDetails!= othersame.textMessageDetails)&&((textMessageDetails == null)||(!textMessageDetails.equals(othersame.textMessageDetails)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        if ((userBannedDetails!= othersame.userBannedDetails)&&((userBannedDetails == null)||(!userBannedDetails.equals(othersame.userBannedDetails)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((authorChannelId == null)? 0 :authorChannelId.hashCode())+((displayMessage == null)? 0 :displayMessage.hashCode()))+((fanFundingEventDetails == null)? 0 :fanFundingEventDetails.hashCode()))+ Boolean.hashCode(hasDisplayContent))+((liveChatId == null)? 0 :liveChatId.hashCode()))+((messageDeletedDetails == null)? 0 :messageDeletedDetails.hashCode()))+((messageRetractedDetails == null)? 0 :messageRetractedDetails.hashCode()))+((pollClosedDetails == null)? 0 :pollClosedDetails.hashCode()))+((pollEditedDetails == null)? 0 :pollEditedDetails.hashCode()))+((pollOpenedDetails == null)? 0 :pollOpenedDetails.hashCode()))+((pollVotedDetails == null)? 0 :pollVotedDetails.hashCode()))+((publishedAt == null)? 0 :publishedAt.hashCode()))+((superChatDetails == null)? 0 :superChatDetails.hashCode()))+((superStickerDetails == null)? 0 :superStickerDetails.hashCode()))+((textMessageDetails == null)? 0 :textMessageDetails.hashCode()))+((type == null)? 0 :type.hashCode()))+((userBannedDetails == null)? 0 :userBannedDetails.hashCode()));
    }
}
