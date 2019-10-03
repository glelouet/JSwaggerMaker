package www.googleapis.com;

import www.googleapis.com.oauth2.Activities;
import www.googleapis.com.oauth2.Captions;
import www.googleapis.com.oauth2.Channelbanners;
import www.googleapis.com.oauth2.Channels;
import www.googleapis.com.oauth2.Channelsections;
import www.googleapis.com.oauth2.Comments;
import www.googleapis.com.oauth2.Commentthreads;
import www.googleapis.com.oauth2.Guidecategories;
import www.googleapis.com.oauth2.I18nlanguages;
import www.googleapis.com.oauth2.I18nregions;
import www.googleapis.com.oauth2.Livebroadcasts;
import www.googleapis.com.oauth2.Livechat;
import www.googleapis.com.oauth2.Livestreams;
import www.googleapis.com.oauth2.Members;
import www.googleapis.com.oauth2.Membershipslevels;
import www.googleapis.com.oauth2.Playlistitems;
import www.googleapis.com.oauth2.Playlists;
import www.googleapis.com.oauth2.Search;
import www.googleapis.com.oauth2.Sponsors;
import www.googleapis.com.oauth2.Subscriptions;
import www.googleapis.com.oauth2.Superchatevents;
import www.googleapis.com.oauth2.Thumbnails;
import www.googleapis.com.oauth2.Videoabusereportreasons;
import www.googleapis.com.oauth2.Videocategories;
import www.googleapis.com.oauth2.Videos;
import www.googleapis.com.oauth2.Watermarks;


/**
 * access www.googleapis.com with authorization type oauth2.
 */
public class Oauth2
    extends fr.lelouet.jswaggermaker.client.common.impl.securities.Oauth2
{
    public static final String[] SCOPES = new String[] {"https://www.googleapis.com/auth/youtube.force-ssl", "https://www.googleapis.com/auth/youtube.readonly", "https://www.googleapis.com/auth/youtube", "https://www.googleapis.com/auth/youtubepartner-channel-audit", "https://www.googleapis.com/auth/youtubepartner", "https://www.googleapis.com/auth/youtube.upload"};
    public final Activities activities = new Activities(this);
    public final Captions captions = new Captions(this);
    public final Channelbanners channelbanners = new Channelbanners(this);
    public final Channelsections channelsections = new Channelsections(this);
    public final Channels channels = new Channels(this);
    public final Commentthreads commentthreads = new Commentthreads(this);
    public final Comments comments = new Comments(this);
    public final Guidecategories guidecategories = new Guidecategories(this);
    public final I18nlanguages i18nlanguages = new I18nlanguages(this);
    public final I18nregions i18nregions = new I18nregions(this);
    public final Livebroadcasts livebroadcasts = new Livebroadcasts(this);
    public final Livechat livechat = new Livechat(this);
    public final Livestreams livestreams = new Livestreams(this);
    public final Members members = new Members(this);
    public final Membershipslevels membershipslevels = new Membershipslevels(this);
    public final Playlistitems playlistitems = new Playlistitems(this);
    public final Playlists playlists = new Playlists(this);
    public final Search search = new Search(this);
    public final Sponsors sponsors = new Sponsors(this);
    public final Subscriptions subscriptions = new Subscriptions(this);
    public final Superchatevents superchatevents = new Superchatevents(this);
    public final Thumbnails thumbnails = new Thumbnails(this);
    public final Videoabusereportreasons videoabusereportreasons = new Videoabusereportreasons(this);
    public final Videocategories videocategories = new Videocategories(this);
    public final Videos videos = new Videos(this);
    public final Watermarks watermarks = new Watermarks(this);

    public Oauth2(String refreshToken, String basicAuth) {
        super(refreshToken, basicAuth, "https://accounts.google.com/o/oauth2/auth");
    }
}
