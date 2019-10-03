package esi.evetech.net.evesso.characters.calendar;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCharactersCharacterIdCalendarEventIdAttendees;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Attendees
    extends DelegateTransfer<Evesso>
{

    public Attendees(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get attendees
     * 
     * <p>
     * Get all invited attendees for a given event<br />
     * This route is cached for up to 600 seconds
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param event_id
     *     The id of the event requested
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCharactersCharacterIdCalendarEventIdAttendees[]> getByCharacterIdEventId(int character_id, int event_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/calendar/{event_id}/attendees/".replace("{character_id}", ""+character_id).replace("{event_id}", ""+event_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdCalendarEventIdAttendees[].class);
    }
}
