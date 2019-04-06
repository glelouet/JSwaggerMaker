package esi.evetech.net.responses;

public class get_status {
    /**
     * Current online player count
     */
    public long players;
    /**
     * Running version as string
     */
    public String server_version;
    /**
     * Server start timestamp
     */
    public String start_time;
    /**
     * If the server is in VIP mode
     */
    public boolean vip;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        get_status othersame = ((get_status) other);
        if (players!= othersame.players) {
            return false;
        }
        if ((server_version!= othersame.server_version)&&((server_version == null)||(!server_version.equals(othersame.server_version)))) {
            return false;
        }
        if ((start_time!= othersame.start_time)&&((start_time == null)||(!start_time.equals(othersame.start_time)))) {
            return false;
        }
        if (vip!= othersame.vip) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Long.hashCode(players)+((server_version == null)? 0 :server_version.hashCode()))+((start_time == null)? 0 :start_time.hashCode()))+ Boolean.hashCode(vip));
    }
}
