package www.googleapis.com.definitions;

public class InvideoBranding {
    public String imageBytes;
    public String imageUrl;
    public InvideoPosition position;
    public String targetChannelId;
    public InvideoTiming timing;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        InvideoBranding othersame = ((InvideoBranding) other);
        if ((imageBytes!= othersame.imageBytes)&&((imageBytes == null)||(!imageBytes.equals(othersame.imageBytes)))) {
            return false;
        }
        if ((imageUrl!= othersame.imageUrl)&&((imageUrl == null)||(!imageUrl.equals(othersame.imageUrl)))) {
            return false;
        }
        if ((position!= othersame.position)&&((position == null)||(!position.equals(othersame.position)))) {
            return false;
        }
        if ((targetChannelId!= othersame.targetChannelId)&&((targetChannelId == null)||(!targetChannelId.equals(othersame.targetChannelId)))) {
            return false;
        }
        if ((timing!= othersame.timing)&&((timing == null)||(!timing.equals(othersame.timing)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((imageBytes == null)? 0 :imageBytes.hashCode())+((imageUrl == null)? 0 :imageUrl.hashCode()))+((position == null)? 0 :position.hashCode()))+((targetChannelId == null)? 0 :targetChannelId.hashCode()))+((timing == null)? 0 :timing.hashCode()));
    }
}
