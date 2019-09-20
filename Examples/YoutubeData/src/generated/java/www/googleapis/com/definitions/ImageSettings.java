package www.googleapis.com.definitions;

public class ImageSettings {
    /**
     * The URL for the background image shown on the video watch page. The image should be 1200px by 615px, with a maximum file size of 128k.
     */
    public LocalizedProperty backgroundImageUrl;
    /**
     * This is used only in update requests; if it's set, we use this URL to generate all of the above banner URLs.
     */
    public String bannerExternalUrl;
    /**
     * Banner image. Desktop size (1060x175).
     */
    public String bannerImageUrl;
    /**
     * Banner image. Mobile size high resolution (1440x395).
     */
    public String bannerMobileExtraHdImageUrl;
    /**
     * Banner image. Mobile size high resolution (1280x360).
     */
    public String bannerMobileHdImageUrl;
    /**
     * Banner image. Mobile size (640x175).
     */
    public String bannerMobileImageUrl;
    /**
     * Banner image. Mobile size low resolution (320x88).
     */
    public String bannerMobileLowImageUrl;
    /**
     * Banner image. Mobile size medium/high resolution (960x263).
     */
    public String bannerMobileMediumHdImageUrl;
    /**
     * Banner image. Tablet size extra high resolution (2560x424).
     */
    public String bannerTabletExtraHdImageUrl;
    /**
     * Banner image. Tablet size high resolution (2276x377).
     */
    public String bannerTabletHdImageUrl;
    /**
     * Banner image. Tablet size (1707x283).
     */
    public String bannerTabletImageUrl;
    /**
     * Banner image. Tablet size low resolution (1138x188).
     */
    public String bannerTabletLowImageUrl;
    /**
     * Banner image. TV size high resolution (1920x1080).
     */
    public String bannerTvHighImageUrl;
    /**
     * Banner image. TV size extra high resolution (2120x1192).
     */
    public String bannerTvImageUrl;
    /**
     * Banner image. TV size low resolution (854x480).
     */
    public String bannerTvLowImageUrl;
    /**
     * Banner image. TV size medium resolution (1280x720).
     */
    public String bannerTvMediumImageUrl;
    /**
     * The image map script for the large banner image.
     */
    public LocalizedProperty largeBrandedBannerImageImapScript;
    /**
     * The URL for the 854px by 70px image that appears below the video player in the expanded video view of the video watch page.
     */
    public LocalizedProperty largeBrandedBannerImageUrl;
    /**
     * The image map script for the small banner image.
     */
    public LocalizedProperty smallBrandedBannerImageImapScript;
    /**
     * The URL for the 640px by 70px banner image that appears below the video player in the default view of the video watch page.
     */
    public LocalizedProperty smallBrandedBannerImageUrl;
    /**
     * The URL for a 1px by 1px tracking pixel that can be used to collect statistics for views of the channel or video pages.
     */
    public String trackingImageUrl;
    /**
     * The URL for the image that appears above the top-left corner of the video player. This is a 25-pixel-high image with a flexible width that cannot exceed 170 pixels.
     */
    public String watchIconImageUrl;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ImageSettings othersame = ((ImageSettings) other);
        if ((backgroundImageUrl!= othersame.backgroundImageUrl)&&((backgroundImageUrl == null)||(!backgroundImageUrl.equals(othersame.backgroundImageUrl)))) {
            return false;
        }
        if ((bannerExternalUrl!= othersame.bannerExternalUrl)&&((bannerExternalUrl == null)||(!bannerExternalUrl.equals(othersame.bannerExternalUrl)))) {
            return false;
        }
        if ((bannerImageUrl!= othersame.bannerImageUrl)&&((bannerImageUrl == null)||(!bannerImageUrl.equals(othersame.bannerImageUrl)))) {
            return false;
        }
        if ((bannerMobileExtraHdImageUrl!= othersame.bannerMobileExtraHdImageUrl)&&((bannerMobileExtraHdImageUrl == null)||(!bannerMobileExtraHdImageUrl.equals(othersame.bannerMobileExtraHdImageUrl)))) {
            return false;
        }
        if ((bannerMobileHdImageUrl!= othersame.bannerMobileHdImageUrl)&&((bannerMobileHdImageUrl == null)||(!bannerMobileHdImageUrl.equals(othersame.bannerMobileHdImageUrl)))) {
            return false;
        }
        if ((bannerMobileImageUrl!= othersame.bannerMobileImageUrl)&&((bannerMobileImageUrl == null)||(!bannerMobileImageUrl.equals(othersame.bannerMobileImageUrl)))) {
            return false;
        }
        if ((bannerMobileLowImageUrl!= othersame.bannerMobileLowImageUrl)&&((bannerMobileLowImageUrl == null)||(!bannerMobileLowImageUrl.equals(othersame.bannerMobileLowImageUrl)))) {
            return false;
        }
        if ((bannerMobileMediumHdImageUrl!= othersame.bannerMobileMediumHdImageUrl)&&((bannerMobileMediumHdImageUrl == null)||(!bannerMobileMediumHdImageUrl.equals(othersame.bannerMobileMediumHdImageUrl)))) {
            return false;
        }
        if ((bannerTabletExtraHdImageUrl!= othersame.bannerTabletExtraHdImageUrl)&&((bannerTabletExtraHdImageUrl == null)||(!bannerTabletExtraHdImageUrl.equals(othersame.bannerTabletExtraHdImageUrl)))) {
            return false;
        }
        if ((bannerTabletHdImageUrl!= othersame.bannerTabletHdImageUrl)&&((bannerTabletHdImageUrl == null)||(!bannerTabletHdImageUrl.equals(othersame.bannerTabletHdImageUrl)))) {
            return false;
        }
        if ((bannerTabletImageUrl!= othersame.bannerTabletImageUrl)&&((bannerTabletImageUrl == null)||(!bannerTabletImageUrl.equals(othersame.bannerTabletImageUrl)))) {
            return false;
        }
        if ((bannerTabletLowImageUrl!= othersame.bannerTabletLowImageUrl)&&((bannerTabletLowImageUrl == null)||(!bannerTabletLowImageUrl.equals(othersame.bannerTabletLowImageUrl)))) {
            return false;
        }
        if ((bannerTvHighImageUrl!= othersame.bannerTvHighImageUrl)&&((bannerTvHighImageUrl == null)||(!bannerTvHighImageUrl.equals(othersame.bannerTvHighImageUrl)))) {
            return false;
        }
        if ((bannerTvImageUrl!= othersame.bannerTvImageUrl)&&((bannerTvImageUrl == null)||(!bannerTvImageUrl.equals(othersame.bannerTvImageUrl)))) {
            return false;
        }
        if ((bannerTvLowImageUrl!= othersame.bannerTvLowImageUrl)&&((bannerTvLowImageUrl == null)||(!bannerTvLowImageUrl.equals(othersame.bannerTvLowImageUrl)))) {
            return false;
        }
        if ((bannerTvMediumImageUrl!= othersame.bannerTvMediumImageUrl)&&((bannerTvMediumImageUrl == null)||(!bannerTvMediumImageUrl.equals(othersame.bannerTvMediumImageUrl)))) {
            return false;
        }
        if ((largeBrandedBannerImageImapScript!= othersame.largeBrandedBannerImageImapScript)&&((largeBrandedBannerImageImapScript == null)||(!largeBrandedBannerImageImapScript.equals(othersame.largeBrandedBannerImageImapScript)))) {
            return false;
        }
        if ((largeBrandedBannerImageUrl!= othersame.largeBrandedBannerImageUrl)&&((largeBrandedBannerImageUrl == null)||(!largeBrandedBannerImageUrl.equals(othersame.largeBrandedBannerImageUrl)))) {
            return false;
        }
        if ((smallBrandedBannerImageImapScript!= othersame.smallBrandedBannerImageImapScript)&&((smallBrandedBannerImageImapScript == null)||(!smallBrandedBannerImageImapScript.equals(othersame.smallBrandedBannerImageImapScript)))) {
            return false;
        }
        if ((smallBrandedBannerImageUrl!= othersame.smallBrandedBannerImageUrl)&&((smallBrandedBannerImageUrl == null)||(!smallBrandedBannerImageUrl.equals(othersame.smallBrandedBannerImageUrl)))) {
            return false;
        }
        if ((trackingImageUrl!= othersame.trackingImageUrl)&&((trackingImageUrl == null)||(!trackingImageUrl.equals(othersame.trackingImageUrl)))) {
            return false;
        }
        if ((watchIconImageUrl!= othersame.watchIconImageUrl)&&((watchIconImageUrl == null)||(!watchIconImageUrl.equals(othersame.watchIconImageUrl)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((((backgroundImageUrl == null)? 0 :backgroundImageUrl.hashCode())+((bannerExternalUrl == null)? 0 :bannerExternalUrl.hashCode()))+((bannerImageUrl == null)? 0 :bannerImageUrl.hashCode()))+((bannerMobileExtraHdImageUrl == null)? 0 :bannerMobileExtraHdImageUrl.hashCode()))+((bannerMobileHdImageUrl == null)? 0 :bannerMobileHdImageUrl.hashCode()))+((bannerMobileImageUrl == null)? 0 :bannerMobileImageUrl.hashCode()))+((bannerMobileLowImageUrl == null)? 0 :bannerMobileLowImageUrl.hashCode()))+((bannerMobileMediumHdImageUrl == null)? 0 :bannerMobileMediumHdImageUrl.hashCode()))+((bannerTabletExtraHdImageUrl == null)? 0 :bannerTabletExtraHdImageUrl.hashCode()))+((bannerTabletHdImageUrl == null)? 0 :bannerTabletHdImageUrl.hashCode()))+((bannerTabletImageUrl == null)? 0 :bannerTabletImageUrl.hashCode()))+((bannerTabletLowImageUrl == null)? 0 :bannerTabletLowImageUrl.hashCode()))+((bannerTvHighImageUrl == null)? 0 :bannerTvHighImageUrl.hashCode()))+((bannerTvImageUrl == null)? 0 :bannerTvImageUrl.hashCode()))+((bannerTvLowImageUrl == null)? 0 :bannerTvLowImageUrl.hashCode()))+((bannerTvMediumImageUrl == null)? 0 :bannerTvMediumImageUrl.hashCode()))+((largeBrandedBannerImageImapScript == null)? 0 :largeBrandedBannerImageImapScript.hashCode()))+((largeBrandedBannerImageUrl == null)? 0 :largeBrandedBannerImageUrl.hashCode()))+((smallBrandedBannerImageImapScript == null)? 0 :smallBrandedBannerImageImapScript.hashCode()))+((smallBrandedBannerImageUrl == null)? 0 :smallBrandedBannerImageUrl.hashCode()))+((trackingImageUrl == null)? 0 :trackingImageUrl.hashCode()))+((watchIconImageUrl == null)? 0 :watchIconImageUrl.hashCode()));
    }
}
