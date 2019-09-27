package www.googleapis.com.definitions;

import www.googleapis.com.structures.Context;

public class ChannelConversionPing {
    /**
     * Defines the context of the ping.
     */
    public Context context;
    /**
     * The url (without the schema) that the player shall send the ping to. It's at caller's descretion to decide which schema to use (http vs https) Example of a returned url: //googleads.g.doubleclick.net/pagead/ viewthroughconversion/962985656/?data=path%3DtHe_path%3Btype%3D cview%3Butuid%3DGISQtTNGYqaYl4sKxoVvKA&labe=default The caller must append biscotti authentication (ms param in case of mobile, for example) to this ping.
     */
    public String conversionUrl;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelConversionPing othersame = ((ChannelConversionPing) other);
        if ((context!= othersame.context)&&((context == null)||(!context.equals(othersame.context)))) {
            return false;
        }
        if ((conversionUrl!= othersame.conversionUrl)&&((conversionUrl == null)||(!conversionUrl.equals(othersame.conversionUrl)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((context == null)? 0 :context.hashCode())+((conversionUrl == null)? 0 :conversionUrl.hashCode()));
    }
}
