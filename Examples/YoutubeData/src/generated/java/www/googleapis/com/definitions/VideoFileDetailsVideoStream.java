package www.googleapis.com.definitions;

import www.googleapis.com.structures.ROTATION;

public class VideoFileDetailsVideoStream {
    /**
     * The video content's display aspect ratio, which specifies the aspect ratio in which the video should be displayed.
     */
    public double aspectRatio;
    /**
     * The video stream's bitrate, in bits per second.
     */
    public String bitrateBps;
    /**
     * The video codec that the stream uses.
     */
    public String codec;
    /**
     * The video stream's frame rate, in frames per second.
     */
    public double frameRateFps;
    /**
     * The encoded video content's height in pixels.
     */
    public long heightPixels;
    /**
     * The amount that YouTube needs to rotate the original source content to properly display the video.
     */
    public ROTATION rotation;
    /**
     * A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code.
     */
    public String vendor;
    /**
     * The encoded video content's width in pixels. You can calculate the video's encoding aspect ratio as width_pixels / height_pixels.
     */
    public long widthPixels;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoFileDetailsVideoStream othersame = ((VideoFileDetailsVideoStream) other);
        if (aspectRatio!= othersame.aspectRatio) {
            return false;
        }
        if ((bitrateBps!= othersame.bitrateBps)&&((bitrateBps == null)||(!bitrateBps.equals(othersame.bitrateBps)))) {
            return false;
        }
        if ((codec!= othersame.codec)&&((codec == null)||(!codec.equals(othersame.codec)))) {
            return false;
        }
        if (frameRateFps!= othersame.frameRateFps) {
            return false;
        }
        if (heightPixels!= othersame.heightPixels) {
            return false;
        }
        if ((rotation!= othersame.rotation)&&((rotation == null)||(!rotation.equals(othersame.rotation)))) {
            return false;
        }
        if ((vendor!= othersame.vendor)&&((vendor == null)||(!vendor.equals(othersame.vendor)))) {
            return false;
        }
        if (widthPixels!= othersame.widthPixels) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((Double.hashCode(aspectRatio)+((bitrateBps == null)? 0 :bitrateBps.hashCode()))+((codec == null)? 0 :codec.hashCode()))+ Double.hashCode(frameRateFps))+ Long.hashCode(heightPixels))+((rotation == null)? 0 :rotation.hashCode()))+((vendor == null)? 0 :vendor.hashCode()))+ Long.hashCode(widthPixels));
    }
}
