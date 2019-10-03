package discourse.example.com.anonymous.admin;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.admin.backups.Readonly;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Backups
    extends DelegateTransfer<Anonymous>
{
    public final Readonly readonly;

    public Backups(Anonymous delegate) {
        super(delegate);
        readonly = new Readonly((delegate));
    }

    /**
     * 
     * <p>
     * Download a backup. Sends an email to the account specified by your api_username
     * with a link and token to download the backup.
     * </p>
     * 
     * @param filename
     */
    public void putByFilename(String filename) {
        String url = ("https://discourse.example.com//admin/backups/{filename}".replace("{filename}", ""+filename));
        requestPut(url, null, null, Void.class);
    }
}
