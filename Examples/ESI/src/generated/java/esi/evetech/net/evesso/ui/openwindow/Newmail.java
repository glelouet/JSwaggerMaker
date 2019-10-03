package esi.evetech.net.evesso.ui.openwindow;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Evesso;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Newmail
    extends DelegateTransfer<Evesso>
{

    public Newmail(Evesso delegate) {
        super(delegate);
    }

    /**
     * Open New Mail Window
     * 
     * <p>
     * Open the New Mail window, according to settings from the request if applicable
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param body
     *     body string
     * @param recipients
     *     recipients array
     * @param subject
     *     subject string
     * @param to_corp_or_alliance_id
     *     to_corp_or_alliance_id integer
     * @param to_mailing_list_id
     *     Corporations, alliances and mailing lists are all types of mailing groups. You may only send to one mailing group, at a time, so you may fill out either this field or the to_corp_or_alliance_ids field
     * @param token
     *     Access token to use if unable to set a header
     */
    public void post(String body,
        int[] recipients,
        String subject,
        int to_corp_or_alliance_id,
        int to_mailing_list_id) {
        String url = ("https://esi.evetech.net/v1/ui/openwindow/newmail/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        content.put("recipients", recipients);
        content.put("subject", subject);
        content.put("to_corp_or_alliance_id", to_corp_or_alliance_id);
        content.put("to_mailing_list_id", to_mailing_list_id);
        requestPost(url, null, content, Void.class);
    }
}
