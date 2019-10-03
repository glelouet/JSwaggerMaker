package esi.evetech.net.evesso.characters;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.characters.mail.Labels;
import esi.evetech.net.evesso.characters.mail.Lists;
import esi.evetech.net.responses.GetCharactersCharacterIdMail;
import esi.evetech.net.responses.GetCharactersCharacterIdMailMailId;
import esi.evetech.net.responses.getcharacterscharacteridmail.GetCharactersCharacterIdMailRecipients;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Mail
    extends DelegateTransfer<Evesso>
{
    public final Labels labels;
    public final Lists lists;

    public Mail(Evesso delegate) {
        super(delegate);
        labels = new Labels((delegate));
        lists = new Lists((delegate));
    }

    /**
     * Return mail headers
     * 
     * <p>
     * Return the 50 most recent mail headers belonging to the character that match the query criteria. Queries can be filtered by label, and last_mail_id can be used to paginate backwards<br />
     * This route is cached for up to 30 seconds
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param labels
     *     Fetch only mails that match one or more of the given labels
     * @param last_mail_id
     *     List only mail with an ID lower than the given ID, if present
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCharactersCharacterIdMail[]> getByCharacterId(int character_id,
        String If_None_Match,
        int[] labels,
        Integer last_mail_id) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(labels==null?"":"&labels="+flatten(labels))+(last_mail_id==null?"":"&last_mail_id="+flatten(last_mail_id))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdMail[].class);
    }

    /**
     * Send a new mail
     * 
     * <p>
     * Create and send a new mail
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param approved_cost
     *     approved_cost integer
     * @param body
     *     body string
     * @param recipients
     *     recipients array
     * @param subject
     *     subject string
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<Integer> postByCharacterId(int character_id,
        long approved_cost,
        String body,
        GetCharactersCharacterIdMailRecipients[] recipients,
        String subject) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        Map<String, Object> content = new HashMap<>();
        content.put("approved_cost", approved_cost);
        content.put("body", body);
        content.put("recipients", recipients);
        content.put("subject", subject);
        return requestPost(url, null, content, Integer.class);
    }

    /**
     * Return a mail
     * 
     * <p>
     * Return the contents of an EVE mail<br />
     * This route is cached for up to 30 seconds
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param mail_id
     *     An EVE mail ID
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCharactersCharacterIdMailMailId> getByCharacterIdMailId(int character_id, String If_None_Match, int mail_id) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/{mail_id}/".replace("{character_id}", ""+character_id).replace("{mail_id}", ""+mail_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdMailMailId.class);
    }

    /**
     * Update metadata about a mail
     * 
     * <p>
     * Update metadata about a mail
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param labels
     *     Labels to assign to the mail. Pre-existing labels are unassigned.
     * @param read
     *     Whether the mail is flagged as read
     * @param datasource
     *     The server name you would like data from
     * @param mail_id
     *     An EVE mail ID
     * @param token
     *     Access token to use if unable to set a header
     */
    public void putByCharacterIdMailId(int character_id,
        int[] labels,
        boolean read,
        int mail_id) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/{mail_id}/".replace("{character_id}", ""+character_id).replace("{mail_id}", ""+mail_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        Map<String, Object> content = new HashMap<>();
        content.put("labels", (labels));
        content.put("read", (read));
        requestPut(url, null, content, Void.class);
    }

    /**
     * Delete a mail
     * 
     * <p>
     * Delete a mail
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param mail_id
     *     An EVE mail ID
     * @param token
     *     Access token to use if unable to set a header
     */
    public void deleteByCharacterIdMailId(int character_id, int mail_id) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/{mail_id}/".replace("{character_id}", ""+character_id).replace("{mail_id}", ""+mail_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        requestDel(url, null, Void.class);
    }
}
