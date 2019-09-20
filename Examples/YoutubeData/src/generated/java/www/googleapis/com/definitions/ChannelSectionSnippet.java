package www.googleapis.com.definitions;

import www.googleapis.com.structures.STYLE;
import www.googleapis.com.structures.TYPE;

public class ChannelSectionSnippet {
    /**
     * The ID that YouTube uses to uniquely identify the channel that published the channel section.
     */
    public String channelId;
    /**
     * The language of the channel section's default title and description.
     */
    public String defaultLanguage;
    /**
     * Localized title, read-only.
     */
    public ChannelSectionLocalization localized;
    /**
     * The position of the channel section in the channel.
     */
    public long position;
    /**
     * The style of the channel section.
     */
    public STYLE style;
    /**
     * The channel section's title for multiple_playlists and multiple_channels.
     */
    public String title;
    /**
     * The type of the channel section.
     */
    public TYPE type;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelSectionSnippet othersame = ((ChannelSectionSnippet) other);
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((defaultLanguage!= othersame.defaultLanguage)&&((defaultLanguage == null)||(!defaultLanguage.equals(othersame.defaultLanguage)))) {
            return false;
        }
        if ((localized!= othersame.localized)&&((localized == null)||(!localized.equals(othersame.localized)))) {
            return false;
        }
        if (position!= othersame.position) {
            return false;
        }
        if ((style!= othersame.style)&&((style == null)||(!style.equals(othersame.style)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((channelId == null)? 0 :channelId.hashCode())+((defaultLanguage == null)? 0 :defaultLanguage.hashCode()))+((localized == null)? 0 :localized.hashCode()))+ Long.hashCode(position))+((style == null)? 0 :style.hashCode()))+((title == null)? 0 :title.hashCode()))+((type == null)? 0 :type.hashCode()));
    }
}
