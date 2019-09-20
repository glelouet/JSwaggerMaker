package www.googleapis.com.definitions;

import java.util.HashMap;

public class ChannelSection {
    /**
     * The contentDetails object contains details about the channel section content, such as a list of playlists or channels featured in the section.
     */
    public ChannelSectionContentDetails contentDetails;
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * The ID that YouTube uses to uniquely identify the channel section.
     */
    public String id;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#channelSection".
     */
    public String kind;
    /**
     * Localizations for different languages
     */
    public HashMap<String, ChannelSectionLocalization> localizations;
    /**
     * The snippet object contains basic details about the channel section, such as its type, style and title.
     */
    public ChannelSectionSnippet snippet;
    /**
     * The targeting object contains basic targeting settings about the channel section.
     */
    public ChannelSectionTargeting targeting;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelSection othersame = ((ChannelSection) other);
        if ((contentDetails!= othersame.contentDetails)&&((contentDetails == null)||(!contentDetails.equals(othersame.contentDetails)))) {
            return false;
        }
        if ((etag!= othersame.etag)&&((etag == null)||(!etag.equals(othersame.etag)))) {
            return false;
        }
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if ((kind!= othersame.kind)&&((kind == null)||(!kind.equals(othersame.kind)))) {
            return false;
        }
        if ((localizations!= othersame.localizations)&&((localizations == null)||(!localizations.equals(othersame.localizations)))) {
            return false;
        }
        if ((snippet!= othersame.snippet)&&((snippet == null)||(!snippet.equals(othersame.snippet)))) {
            return false;
        }
        if ((targeting!= othersame.targeting)&&((targeting == null)||(!targeting.equals(othersame.targeting)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((contentDetails == null)? 0 :contentDetails.hashCode())+((etag == null)? 0 :etag.hashCode()))+((id == null)? 0 :id.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((localizations == null)? 0 :localizations.hashCode()))+((snippet == null)? 0 :snippet.hashCode()))+((targeting == null)? 0 :targeting.hashCode()));
    }
}
