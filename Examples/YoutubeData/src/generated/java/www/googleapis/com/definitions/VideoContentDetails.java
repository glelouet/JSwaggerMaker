package www.googleapis.com.definitions;

import www.googleapis.com.structures.Caption;
import www.googleapis.com.structures.Definition;
import www.googleapis.com.structures.Projection;

public class VideoContentDetails {
    /**
     * The value of captions indicates whether the video has captions or not.
     */
    public Caption caption;
    /**
     * Specifies the ratings that the video received under various rating schemes.
     */
    public ContentRating contentRating;
    /**
     * The countryRestriction object contains information about the countries where a video is (or is not) viewable.
     */
    public AccessPolicy countryRestriction;
    /**
     * The value of definition indicates whether the video is available in high definition or only in standard definition.
     */
    public Definition definition;
    /**
     * The value of dimension indicates whether the video is available in 3D or in 2D.
     */
    public String dimension;
    /**
     * The length of the video. The tag value is an ISO 8601 duration in the format PT#M#S, in which the letters PT indicate that the value specifies a period of time, and the letters M and S refer to length in minutes and seconds, respectively. The # characters preceding the M and S letters are both integers that specify the number of minutes (or seconds) of the video. For example, a value of PT15M51S indicates that the video is 15 minutes and 51 seconds long.
     */
    public String duration;
    /**
     * Indicates whether the video uploader has provided a custom thumbnail image for the video. This property is only visible to the video uploader.
     */
    public boolean hasCustomThumbnail;
    /**
     * The value of is_license_content indicates whether the video is licensed content.
     */
    public boolean licensedContent;
    /**
     * Specifies the projection format of the video.
     */
    public Projection projection;
    /**
     * The regionRestriction object contains information about the countries where a video is (or is not) viewable. The object will contain either the contentDetails.regionRestriction.allowed property or the contentDetails.regionRestriction.blocked property.
     */
    public VideoContentDetailsRegionRestriction regionRestriction;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoContentDetails othersame = ((VideoContentDetails) other);
        if ((caption!= othersame.caption)&&((caption == null)||(!caption.equals(othersame.caption)))) {
            return false;
        }
        if ((contentRating!= othersame.contentRating)&&((contentRating == null)||(!contentRating.equals(othersame.contentRating)))) {
            return false;
        }
        if ((countryRestriction!= othersame.countryRestriction)&&((countryRestriction == null)||(!countryRestriction.equals(othersame.countryRestriction)))) {
            return false;
        }
        if ((definition!= othersame.definition)&&((definition == null)||(!definition.equals(othersame.definition)))) {
            return false;
        }
        if ((dimension!= othersame.dimension)&&((dimension == null)||(!dimension.equals(othersame.dimension)))) {
            return false;
        }
        if ((duration!= othersame.duration)&&((duration == null)||(!duration.equals(othersame.duration)))) {
            return false;
        }
        if (hasCustomThumbnail!= othersame.hasCustomThumbnail) {
            return false;
        }
        if (licensedContent!= othersame.licensedContent) {
            return false;
        }
        if ((projection!= othersame.projection)&&((projection == null)||(!projection.equals(othersame.projection)))) {
            return false;
        }
        if ((regionRestriction!= othersame.regionRestriction)&&((regionRestriction == null)||(!regionRestriction.equals(othersame.regionRestriction)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((caption == null)? 0 :caption.hashCode())+((contentRating == null)? 0 :contentRating.hashCode()))+((countryRestriction == null)? 0 :countryRestriction.hashCode()))+((definition == null)? 0 :definition.hashCode()))+((dimension == null)? 0 :dimension.hashCode()))+((duration == null)? 0 :duration.hashCode()))+ Boolean.hashCode(hasCustomThumbnail))+ Boolean.hashCode(licensedContent))+((projection == null)? 0 :projection.hashCode()))+((regionRestriction == null)? 0 :regionRestriction.hashCode()));
    }
}
