package www.googleapis.com.definitions;

import www.googleapis.com.structures.Framerate;
import www.googleapis.com.structures.Ingestiontype;
import www.googleapis.com.structures.Resolution;

public class CdnSettings {
    /**
     * The format of the video stream that you are sending to Youtube.
     */
    public String format;
    /**
     * The frame rate of the inbound video data.
     */
    public Framerate frameRate;
    /**
     * The ingestionInfo object contains information that YouTube provides that you need to transmit your RTMP or HTTP stream to YouTube.
     */
    public IngestionInfo ingestionInfo;
    /**
     * The method or protocol used to transmit the video stream.
     */
    public Ingestiontype ingestionType;
    /**
     * The resolution of the inbound video data.
     */
    public Resolution resolution;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        CdnSettings othersame = ((CdnSettings) other);
        if ((format!= othersame.format)&&((format == null)||(!format.equals(othersame.format)))) {
            return false;
        }
        if ((frameRate!= othersame.frameRate)&&((frameRate == null)||(!frameRate.equals(othersame.frameRate)))) {
            return false;
        }
        if ((ingestionInfo!= othersame.ingestionInfo)&&((ingestionInfo == null)||(!ingestionInfo.equals(othersame.ingestionInfo)))) {
            return false;
        }
        if ((ingestionType!= othersame.ingestionType)&&((ingestionType == null)||(!ingestionType.equals(othersame.ingestionType)))) {
            return false;
        }
        if ((resolution!= othersame.resolution)&&((resolution == null)||(!resolution.equals(othersame.resolution)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((format == null)? 0 :format.hashCode())+((frameRate == null)? 0 :frameRate.hashCode()))+((ingestionInfo == null)? 0 :ingestionInfo.hashCode()))+((ingestionType == null)? 0 :ingestionType.hashCode()))+((resolution == null)? 0 :resolution.hashCode()));
    }
}
