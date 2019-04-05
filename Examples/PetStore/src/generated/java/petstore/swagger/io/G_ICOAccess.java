package petstore.swagger.io;

import fr.lelouet.jswaggermaker.client.common.interfaces.ITransfer;


/**
 * interface to access the ESI with a connected account.<br />This typically gives access to the character information, corporation, etc.
 */
interface G_ICOAccess
    extends ITransfer
{
    public static final String[] SCOPES = new String[] {"write:pets", "read:pets"};
}
