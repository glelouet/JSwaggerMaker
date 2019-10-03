package esi.evetech.net.evesso.characters;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.characters.calendar.Attendees;
import esi.evetech.net.responses.GetCharactersCharacterIdCalendar;
import esi.evetech.net.responses.GetCharactersCharacterIdCalendarEventId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Calendar
    extends DelegateTransfer<Evesso>
{
    public final Attendees attendees;

    public Calendar(Evesso delegate) {
        super(delegate);
        attendees = new Attendees((delegate));
    }

    /**
     * List calendar event summaries
     * 
     * <p>
     * Get 50 event summaries from the calendar. If no from_event ID is given, the resource will return the next 50 chronological event summaries from now. If a from_event ID is specified, it will return the next 50 chronological event summaries from after that event<br />
     * This route is cached for up to 5 seconds
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param from_event
     *     The event ID to retrieve events from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCharactersCharacterIdCalendar[]> getByCharacterId(int character_id, Integer from_event, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/calendar/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(from_event==null?"":"&from_event="+flatten(from_event))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdCalendar[].class);
    }

    /**
     * Get an event
     * 
     * <p>
     * Get all the information for a specific event<br />
     * This route is cached for up to 5 seconds
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
    public Requested<GetCharactersCharacterIdCalendarEventId> getByCharacterIdEventId(int character_id, int event_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v3/characters/{character_id}/calendar/{event_id}/".replace("{character_id}", ""+character_id).replace("{event_id}", ""+event_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdCalendarEventId.class);
    }

    /**
     * Respond to an event
     * 
     * <p>
     * Set your response status to an event
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param event_id
     *     The ID of the event requested
     * @param response
     *     response string
     * @param token
     *     Access token to use if unable to set a header
     */
    public void putByCharacterIdEventId(int character_id, int event_id, esi.evetech.net.structures.response response) {
        String url = ("https://esi.evetech.net/v3/characters/{character_id}/calendar/{event_id}/".replace("{character_id}", ""+character_id).replace("{event_id}", ""+event_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        Map<String, Object> content = new HashMap<>();
        content.put("response", (response));
        requestPut(url, null, content, Void.class);
    }
}
