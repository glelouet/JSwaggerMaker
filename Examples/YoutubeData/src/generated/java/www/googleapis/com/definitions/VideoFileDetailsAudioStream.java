package www.googleapis.com.definitions;

public class VideoFileDetailsAudioStream {
    /**
     * The audio stream's bitrate, in bits per second.
     */
    public String bitrateBps;
    /**
     * The number of audio channels that the stream contains.
     */
    public long channelCount;
    /**
     * The audio codec that the stream uses.
     */
    public String codec;
    /**
     * A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code.
     */
    public String vendor;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoFileDetailsAudioStream othersame = ((VideoFileDetailsAudioStream) other);
        if ((bitrateBps!= othersame.bitrateBps)&&((bitrateBps == null)||(!bitrateBps.equals(othersame.bitrateBps)))) {
            return false;
        }
        if (channelCount!= othersame.channelCount) {
            return false;
        }
        if ((codec!= othersame.codec)&&((codec == null)||(!codec.equals(othersame.codec)))) {
            return false;
        }
        if ((vendor!= othersame.vendor)&&((vendor == null)||(!vendor.equals(othersame.vendor)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((bitrateBps == null)? 0 :bitrateBps.hashCode())+ Long.hashCode(channelCount))+((codec == null)? 0 :codec.hashCode()))+((vendor == null)? 0 :vendor.hashCode()));
    }
}
