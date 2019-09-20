package www.googleapis.com.definitions;

public class LiveStreamSnippet {
    /**
     * The ID that YouTube uses to uniquely identify the channel that is transmitting the stream.
     */
    public String channelId;
    /**
     * The stream's description. The value cannot be longer than 10000 characters.
     */
    public String description;
    public boolean isDefaultStream;
    /**
     * The date and time that the stream was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String publishedAt;
    /**
     * The stream's title. The value must be between 1 and 128 characters long.
     */
    public String title;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveStreamSnippet othersame = ((LiveStreamSnippet) other);
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if (isDefaultStream!= othersame.isDefaultStream) {
            return false;
        }
        if ((publishedAt!= othersame.publishedAt)&&((publishedAt == null)||(!publishedAt.equals(othersame.publishedAt)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((channelId == null)? 0 :channelId.hashCode())+((description == null)? 0 :description.hashCode()))+ Boolean.hashCode(isDefaultStream))+((publishedAt == null)? 0 :publishedAt.hashCode()))+((title == null)? 0 :title.hashCode()));
    }
}
