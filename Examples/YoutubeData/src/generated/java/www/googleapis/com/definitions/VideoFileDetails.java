package www.googleapis.com.definitions;

import www.googleapis.com.structures.FileType;

public class VideoFileDetails {
    /**
     * A list of audio streams contained in the uploaded video file. Each item in the list contains detailed metadata about an audio stream.
     */
    public VideoFileDetailsAudioStream[] audioStreams;
    /**
     * The uploaded video file's combined (video and audio) bitrate in bits per second.
     */
    public String bitrateBps;
    /**
     * The uploaded video file's container format.
     */
    public String container;
    /**
     * The date and time when the uploaded video file was created. The value is specified in ISO 8601 format. Currently, the following ISO 8601 formats are supported:  
     * - Date only: YYYY-MM-DD 
     * - Naive time: YYYY-MM-DDTHH:MM:SS 
     * - Time with timezone: YYYY-MM-DDTHH:MM:SS+HH:MM
     */
    public String creationTime;
    /**
     * The length of the uploaded video in milliseconds.
     */
    public String durationMs;
    /**
     * The uploaded file's name. This field is present whether a video file or another type of file was uploaded.
     */
    public String fileName;
    /**
     * The uploaded file's size in bytes. This field is present whether a video file or another type of file was uploaded.
     */
    public String fileSize;
    /**
     * The uploaded file's type as detected by YouTube's video processing engine. Currently, YouTube only processes video files, but this field is present whether a video file or another type of file was uploaded.
     */
    public FileType fileType;
    /**
     * A list of video streams contained in the uploaded video file. Each item in the list contains detailed metadata about a video stream.
     */
    public VideoFileDetailsVideoStream[] videoStreams;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoFileDetails othersame = ((VideoFileDetails) other);
        if ((audioStreams!= othersame.audioStreams)&&((audioStreams == null)||(!audioStreams.equals(othersame.audioStreams)))) {
            return false;
        }
        if ((bitrateBps!= othersame.bitrateBps)&&((bitrateBps == null)||(!bitrateBps.equals(othersame.bitrateBps)))) {
            return false;
        }
        if ((container!= othersame.container)&&((container == null)||(!container.equals(othersame.container)))) {
            return false;
        }
        if ((creationTime!= othersame.creationTime)&&((creationTime == null)||(!creationTime.equals(othersame.creationTime)))) {
            return false;
        }
        if ((durationMs!= othersame.durationMs)&&((durationMs == null)||(!durationMs.equals(othersame.durationMs)))) {
            return false;
        }
        if ((fileName!= othersame.fileName)&&((fileName == null)||(!fileName.equals(othersame.fileName)))) {
            return false;
        }
        if ((fileSize!= othersame.fileSize)&&((fileSize == null)||(!fileSize.equals(othersame.fileSize)))) {
            return false;
        }
        if ((fileType!= othersame.fileType)&&((fileType == null)||(!fileType.equals(othersame.fileType)))) {
            return false;
        }
        if ((videoStreams!= othersame.videoStreams)&&((videoStreams == null)||(!videoStreams.equals(othersame.videoStreams)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((audioStreams == null)? 0 :audioStreams.hashCode())+((bitrateBps == null)? 0 :bitrateBps.hashCode()))+((container == null)? 0 :container.hashCode()))+((creationTime == null)? 0 :creationTime.hashCode()))+((durationMs == null)? 0 :durationMs.hashCode()))+((fileName == null)? 0 :fileName.hashCode()))+((fileSize == null)? 0 :fileSize.hashCode()))+((fileType == null)? 0 :fileType.hashCode()))+((videoStreams == null)? 0 :videoStreams.hashCode()));
    }
}
