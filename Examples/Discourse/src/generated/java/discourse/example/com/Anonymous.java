package discourse.example.com;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Disconnected;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;


/**
 * access discourse.example.com with no authorization.
 */
public class Anonymous
    extends Disconnected
{
    public final Anonymous.CategoriesJson categories_json = new Anonymous.CategoriesJson();
    public final Anonymous.C c = new Anonymous.C();
    public final Anonymous.Categories categories = new Anonymous.Categories();
    public final Anonymous.PostsJson posts_json = new Anonymous.PostsJson();
    public final Anonymous.Posts posts = new Anonymous.Posts();
    public final Anonymous.PostActions postactions = new Anonymous.PostActions();
    public final Anonymous.T t = new Anonymous.T();
    public final Anonymous.Topics topics = new Anonymous.Topics();
    public final Anonymous.NotificationsJson notifications_json = new Anonymous.NotificationsJson();
    public final Anonymous.Notifications notifications = new Anonymous.Notifications();
    public final Anonymous.Invites invites = new Anonymous.Invites();
    public final Anonymous.TagGroupsJson taggroups_json = new Anonymous.TagGroupsJson();
    public final Anonymous.TagGroups taggroups = new Anonymous.TagGroups();
    public final Anonymous.Users users = new Anonymous.Users();
    public final Anonymous.U u = new Anonymous.U();
    public final Anonymous.UploadsJson uploads_json = new Anonymous.UploadsJson();
    public final Anonymous.DirectoryItemsJson directoryitems_json = new Anonymous.DirectoryItemsJson();
    public final Anonymous.Tags tags = new Anonymous.Tags();
    public final Anonymous.Search search = new Anonymous.Search();
    public final Anonymous.Admin admin = new Anonymous.Admin();
    public final Anonymous.GroupsJson groups_json = new Anonymous.GroupsJson();
    public final Anonymous.Groups groups = new Anonymous.Groups();
    public final Anonymous.LatestJson latest_json = new Anonymous.LatestJson();
    public final Anonymous.TopJson top_json = new Anonymous.TopJson();
    public final Anonymous.Top top = new Anonymous.Top();
    public final Anonymous.Session session = new Anonymous.Session();
    public final Anonymous.UserBadges userbadges = new Anonymous.UserBadges();
    public final Anonymous.UserBadgesJson userbadges_json = new Anonymous.UserBadgesJson();
    public final Anonymous.UserActionsJson useractions_json = new Anonymous.UserActionsJson();
    public final Anonymous.AboutJson about_json = new Anonymous.AboutJson();
    public final Anonymous.Polls polls = new Anonymous.Polls();
    public final Anonymous.PageViewTotalReqs pageviewtotalreqs = new Anonymous.PageViewTotalReqs();
    public final Anonymous.ExportCsv exportcsv = new Anonymous.ExportCsv();
    public final Anonymous.UserAvatar useravatar = new Anonymous.UserAvatar();

    public class AboutJson {

        /**
         * 
         * <p>
         * fetch about page data
         * </p>
         */
        public Requested<Object> get() {
            String url = ("https://discourse.example.com//about.json");
            return requestGet(url, null, Object.class);
        }
    }

    public class Admin {
        public final Anonymous.Admin.EmailJson email_json = new Anonymous.Admin.EmailJson();
        public final Anonymous.Admin.Customize customize = new Anonymous.Admin.Customize();
        public final Anonymous.Admin.Users users = new Anonymous.Admin.Users();
        public final Anonymous.Admin.Groups groups = new Anonymous.Admin.Groups();
        public final Anonymous.Admin.SiteSettingsJson sitesettings_json = new Anonymous.Admin.SiteSettingsJson();
        public final Anonymous.Admin.SiteSettings sitesettings = new Anonymous.Admin.SiteSettings();
        public final Anonymous.Admin.Plugins plugins = new Anonymous.Admin.Plugins();
        public final Anonymous.Admin.BackupsJson backups_json = new Anonymous.Admin.BackupsJson();
        public final Anonymous.Admin.Backups backups = new Anonymous.Admin.Backups();
        public final Anonymous.Admin.Emails emails = new Anonymous.Admin.Emails();
        public final Anonymous.Admin.Flags flags = new Anonymous.Admin.Flags();
        public final Anonymous.Admin.BadgesJson badges_json = new Anonymous.Admin.BadgesJson();
        public final Anonymous.Admin.Api api = new Anonymous.Admin.Api();
        public final Anonymous.Admin.Logs logs = new Anonymous.Admin.Logs();

        public class Api {
            public final Anonymous.Admin.Api.WebHooks webhooks = new Anonymous.Admin.Api.WebHooks();

            public class WebHooks {

                /**
                 * 
                 * <p>
                 * create a web hook
                 * </p>
                 * 
                 * @param payload_url
                 * @param content_type
                 * @param secret
                 * @param wildcard_web_hook
                 * @param verify_certificate
                 * @param active
                 * @param web_hook_event_type_ids
                 * @param category_ids
                 * @param group_ids
                 */
                public Requested<Object> post(String payload_url,
                    long content_type,
                    String secret,
                    boolean wildcard_web_hook,
                    boolean verify_certificate,
                    boolean active,
                    Object[] web_hook_event_type_ids,
                    Object[] category_ids,
                    Object[] group_ids) {
                    String url = ("https://discourse.example.com//admin/api/web_hooks");
                    Map<String, Object> content = new HashMap<>();
                    content.put("payload_url", payload_url);
                    content.put("content_type", content_type);
                    content.put("secret", secret);
                    content.put("wildcard_web_hook", wildcard_web_hook);
                    content.put("verify_certificate", verify_certificate);
                    content.put("active", active);
                    content.put("web_hook_event_type_ids", web_hook_event_type_ids);
                    content.put("category_ids", category_ids);
                    content.put("group_ids", group_ids);
                    return requestPost(url, null, content, Object.class);
                }
            }
        }

        public class Backups {
            public final Anonymous.Admin.Backups.Readonly readonly = new Anonymous.Admin.Backups.Readonly();

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

            public class Readonly {

                /**
                 * 
                 * <p>
                 * update readonly mode
                 * </p>
                 * 
                 * @param enable
                 */
                public void put(boolean enable) {
                    String url = ("https://discourse.example.com//admin/backups/readonly");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable", enable);
                    requestPut(url, null, content, Void.class);
                }
            }
        }

        public class BackupsJson {

            /**
             * 
             * <p>
             * get a list of backups
             * </p>
             */
            public Requested<Object[]> get() {
                String url = ("https://discourse.example.com//admin/backups.json");
                return requestGet(url, null, Object[].class);
            }

            /**
             * 
             * <p>
             * create a backup
             * </p>
             * 
             * @param with_uploads
             */
            public Requested<Object> post(boolean with_uploads) {
                String url = ("https://discourse.example.com//admin/backups.json");
                Map<String, Object> content = new HashMap<>();
                content.put("with_uploads", with_uploads);
                return requestPost(url, null, content, Object.class);
            }
        }

        public class BadgesJson {

            /**
             * 
             * <p>
             * get a list of badges
             * </p>
             */
            public Requested<Object> get() {
                String url = ("https://discourse.example.com//admin/badges.json");
                return requestGet(url, null, Object.class);
            }

            /**
             * 
             * <p>
             * create a badge
             * </p>
             * 
             * @param allow_title
             * @param multiple_grant
             * @param listable
             * @param auto_revoke
             * @param enabled
             * @param show_posts
             * @param target_posts
             * @param name
             * @param description
             * @param long_description
             * @param icon
             * @param image
             * @param badge_grouping_id
             * @param badge_type_id
             */
            public void post(boolean allow_title,
                boolean multiple_grant,
                boolean listable,
                boolean auto_revoke,
                boolean enabled,
                boolean show_posts,
                boolean target_posts,
                String name,
                String description,
                String long_description,
                String icon,
                String image,
                long badge_grouping_id,
                long badge_type_id) {
                String url = ("https://discourse.example.com//admin/badges.json");
                Map<String, Object> content = new HashMap<>();
                content.put("allow_title", allow_title);
                content.put("multiple_grant", multiple_grant);
                content.put("listable", listable);
                content.put("auto_revoke", auto_revoke);
                content.put("enabled", enabled);
                content.put("show_posts", show_posts);
                content.put("target_posts", target_posts);
                content.put("name", name);
                content.put("description", description);
                content.put("long_description", long_description);
                content.put("icon", icon);
                content.put("image", image);
                content.put("badge_grouping_id", badge_grouping_id);
                content.put("badge_type_id", badge_type_id);
                requestPost(url, null, content, Void.class);
            }
        }

        public class Customize {
            public final Anonymous.Admin.Customize.EmailTemplatesJson emailtemplates_json = new Anonymous.Admin.Customize.EmailTemplatesJson();
            public final Anonymous.Admin.Customize.UserFieldsJson userfields_json = new Anonymous.Admin.Customize.UserFieldsJson();
            public final Anonymous.Admin.Customize.UserFields userfields = new Anonymous.Admin.Customize.UserFields();

            public class EmailTemplatesJson {

                /**
                 * 
                 * <p>
                 * Show list of email templates
                 * </p>
                 */
                public Requested<Object> get() {
                    String url = ("https://discourse.example.com//admin/customize/email_templates.json");
                    return requestGet(url, null, Object.class);
                }
            }

            public class UserFields {

                /**
                 * 
                 * <p>
                 * delete a user field
                 * </p>
                 * 
                 * @param id
                 */
                public Requested<Object> deleteById(long id) {
                    String url = ("https://discourse.example.com//admin/customize/user_fields/{id}".replace("{id}", ""+id));
                    return requestDel(url, null, Object.class);
                }
            }

            public class UserFieldsJson {

                /**
                 * 
                 * <p>
                 * list user fields
                 * </p>
                 */
                public void get() {
                    String url = ("https://discourse.example.com//admin/customize/user_fields.json");
                    requestGet(url, null, Void.class);
                }

                /**
                 * 
                 * <p>
                 * create a user fields
                 * </p>
                 * 
                 * @param user_field_name_
                 * @param user_field_description_
                 * @param user_field_field_type
                 * @param user_field_required_
                 */
                public void post(String user_field_name_,
                    String user_field_description_,
                    String user_field_field_type,
                    boolean user_field_required_) {
                    String url = ("https://discourse.example.com//admin/customize/user_fields.json");
                    Map<String, Object> content = new HashMap<>();
                    content.put("user_field_name_", user_field_name_);
                    content.put("user_field_description_", user_field_description_);
                    content.put("user_field_field_type", user_field_field_type);
                    content.put("user_field_required_", user_field_required_);
                    requestPost(url, null, content, Void.class);
                }
            }
        }

        public class EmailJson {

            /**
             * 
             * <p>
             * Show email settings
             * </p>
             */
            public Requested<Object> get() {
                String url = ("https://discourse.example.com//admin/email.json");
                return requestGet(url, null, Object.class);
            }
        }

        public class Emails {

            /**
             * 
             * <p>
             * get a list of emails
             * </p>
             * 
             * @param action
             * @param offset
             */
            public Requested<Object[]> getByActionJson(discourse.example.com.structures.action action, long offset) {
                String url = ("https://discourse.example.com//admin/emails/{action}.json".replace("{action}", ""+action).replace("{offset}", ""+offset));
                return requestGet(url, null, Object[].class);
            }
        }

        public class Flags {

            /**
             * 
             * <p>
             * get a list of flags
             * </p>
             * 
             * @param type
             * @param offset
             */
            public Requested<Object> getByTypeJson(discourse.example.com.structures.type type, long offset) {
                String url = ("https://discourse.example.com//admin/flags/{type}.json".replace("{type}", ""+type).replace("{offset}", ""+offset));
                return requestGet(url, null, Object.class);
            }
        }

        public class Groups {

            /**
             * 
             * <p>
             * Create a group
             * </p>
             * 
             * @param group_name_
             */
            public Requested<Object> post(String group_name_) {
                String url = ("https://discourse.example.com//admin/groups");
                Map<String, Object> content = new HashMap<>();
                content.put("group_name_", group_name_);
                return requestPost(url, null, content, Object.class);
            }

            /**
             * 
             * <p>
             * Delete a group
             * </p>
             */
            public Requested<Object> deleteByGroupIdJson() {
                String url = ("https://discourse.example.com//admin/groups/{group_id}.json");
                return requestDel(url, null, Object.class);
            }
        }

        public class Logs {
            public final Anonymous.Admin.Logs.StaffActionLogsJson staffactionlogs_json = new Anonymous.Admin.Logs.StaffActionLogsJson();

            public class StaffActionLogsJson {

                /**
                 * 
                 * <p>
                 * get staff action logs
                 * </p>
                 * 
                 * @param action_name
                 * @param action_id
                 */
                public Requested<Object> get(String action_name, Long action_id) {
                    String url = ("https://discourse.example.com//admin/logs/staff_action_logs.json"+"?"+(action_name==null?"":"&action_name="+flatten(action_name))+(action_id==null?"":"&action_id="+flatten(action_id)));
                    return requestGet(url, null, Object.class);
                }
            }
        }

        public class Plugins {

            /**
             * 
             * <p>
             * get a list of installed plugins
             * </p>
             */
            public Requested<Object> get() {
                String url = ("https://discourse.example.com//admin/plugins");
                return requestGet(url, null, Object.class);
            }
        }

        public class SiteSettings {
            public final Anonymous.Admin.SiteSettings.Title title = new Anonymous.Admin.SiteSettings.Title();
            public final Anonymous.Admin.SiteSettings.SiteDescription sitedescription = new Anonymous.Admin.SiteSettings.SiteDescription();
            public final Anonymous.Admin.SiteSettings.ContactEmail contactemail = new Anonymous.Admin.SiteSettings.ContactEmail();
            public final Anonymous.Admin.SiteSettings.ContactUrl contacturl = new Anonymous.Admin.SiteSettings.ContactUrl();
            public final Anonymous.Admin.SiteSettings.NotificationEmail notificationemail = new Anonymous.Admin.SiteSettings.NotificationEmail();
            public final Anonymous.Admin.SiteSettings.SiteContactUsername sitecontactusername = new Anonymous.Admin.SiteSettings.SiteContactUsername();
            public final Anonymous.Admin.SiteSettings.LogoUrl logourl = new Anonymous.Admin.SiteSettings.LogoUrl();
            public final Anonymous.Admin.SiteSettings.LogoSmallUrl logosmallurl = new Anonymous.Admin.SiteSettings.LogoSmallUrl();
            public final Anonymous.Admin.SiteSettings.DigestLogoUrl digestlogourl = new Anonymous.Admin.SiteSettings.DigestLogoUrl();
            public final Anonymous.Admin.SiteSettings.MobileLogoUrl mobilelogourl = new Anonymous.Admin.SiteSettings.MobileLogoUrl();
            public final Anonymous.Admin.SiteSettings.FaviconUrl faviconurl = new Anonymous.Admin.SiteSettings.FaviconUrl();
            public final Anonymous.Admin.SiteSettings.AppleTouchIconUrl appletouchiconurl = new Anonymous.Admin.SiteSettings.AppleTouchIconUrl();
            public final Anonymous.Admin.SiteSettings.DefaultOpengraphImageUrl defaultopengraphimageurl = new Anonymous.Admin.SiteSettings.DefaultOpengraphImageUrl();
            public final Anonymous.Admin.SiteSettings.TwitterSummaryLargeImageUrl twittersummarylargeimageurl = new Anonymous.Admin.SiteSettings.TwitterSummaryLargeImageUrl();
            public final Anonymous.Admin.SiteSettings.ExcludeRelNofollowDomains excluderelnofollowdomains = new Anonymous.Admin.SiteSettings.ExcludeRelNofollowDomains();
            public final Anonymous.Admin.SiteSettings.CompanyShortName companyshortname = new Anonymous.Admin.SiteSettings.CompanyShortName();
            public final Anonymous.Admin.SiteSettings.CompanyFullName companyfullname = new Anonymous.Admin.SiteSettings.CompanyFullName();
            public final Anonymous.Admin.SiteSettings.CompanyDomain companydomain = new Anonymous.Admin.SiteSettings.CompanyDomain();
            public final Anonymous.Admin.SiteSettings.DefaultLocale defaultlocale = new Anonymous.Admin.SiteSettings.DefaultLocale();
            public final Anonymous.Admin.SiteSettings.AllowUserLocale allowuserlocale = new Anonymous.Admin.SiteSettings.AllowUserLocale();
            public final Anonymous.Admin.SiteSettings.SetLocaleFromAcceptLanguageHeader setlocalefromacceptlanguageheader = new Anonymous.Admin.SiteSettings.SetLocaleFromAcceptLanguageHeader();
            public final Anonymous.Admin.SiteSettings.CategoriesTopics categoriestopics = new Anonymous.Admin.SiteSettings.CategoriesTopics();
            public final Anonymous.Admin.SiteSettings.SuggestedTopics suggestedtopics = new Anonymous.Admin.SiteSettings.SuggestedTopics();
            public final Anonymous.Admin.SiteSettings.LimitSuggestedToCategory limitsuggestedtocategory = new Anonymous.Admin.SiteSettings.LimitSuggestedToCategory();
            public final Anonymous.Admin.SiteSettings.SuggestedTopicsMaxDaysOld suggestedtopicsmaxdaysold = new Anonymous.Admin.SiteSettings.SuggestedTopicsMaxDaysOld();
            public final Anonymous.Admin.SiteSettings.TrackExternalRightClicks trackexternalrightclicks = new Anonymous.Admin.SiteSettings.TrackExternalRightClicks();
            public final Anonymous.Admin.SiteSettings.GaUniversalTrackingCode gauniversaltrackingcode = new Anonymous.Admin.SiteSettings.GaUniversalTrackingCode();
            public final Anonymous.Admin.SiteSettings.GaUniversalDomainName gauniversaldomainname = new Anonymous.Admin.SiteSettings.GaUniversalDomainName();
            public final Anonymous.Admin.SiteSettings.GaTrackingCode gatrackingcode = new Anonymous.Admin.SiteSettings.GaTrackingCode();
            public final Anonymous.Admin.SiteSettings.GaDomainName gadomainname = new Anonymous.Admin.SiteSettings.GaDomainName();
            public final Anonymous.Admin.SiteSettings.GtmContainerId gtmcontainerid = new Anonymous.Admin.SiteSettings.GtmContainerId();
            public final Anonymous.Admin.SiteSettings.TopMenu topmenu = new Anonymous.Admin.SiteSettings.TopMenu();
            public final Anonymous.Admin.SiteSettings.PostMenu postmenu = new Anonymous.Admin.SiteSettings.PostMenu();
            public final Anonymous.Admin.SiteSettings.PostMenuHiddenItems postmenuhiddenitems = new Anonymous.Admin.SiteSettings.PostMenuHiddenItems();
            public final Anonymous.Admin.SiteSettings.DesktopCategoryPageStyle desktopcategorypagestyle = new Anonymous.Admin.SiteSettings.DesktopCategoryPageStyle();
            public final Anonymous.Admin.SiteSettings.CategoryColors categorycolors = new Anonymous.Admin.SiteSettings.CategoryColors();
            public final Anonymous.Admin.SiteSettings.CategoryStyle categorystyle = new Anonymous.Admin.SiteSettings.CategoryStyle();
            public final Anonymous.Admin.SiteSettings.EnableMobileTheme enablemobiletheme = new Anonymous.Admin.SiteSettings.EnableMobileTheme();
            public final Anonymous.Admin.SiteSettings.RelativeDateDuration relativedateduration = new Anonymous.Admin.SiteSettings.RelativeDateDuration();
            public final Anonymous.Admin.SiteSettings.FixedCategoryPositions fixedcategorypositions = new Anonymous.Admin.SiteSettings.FixedCategoryPositions();
            public final Anonymous.Admin.SiteSettings.FixedCategoryPositionsOnCreate fixedcategorypositionsoncreate = new Anonymous.Admin.SiteSettings.FixedCategoryPositionsOnCreate();
            public final Anonymous.Admin.SiteSettings.ShowSubcategoryList showsubcategorylist = new Anonymous.Admin.SiteSettings.ShowSubcategoryList();
            public final Anonymous.Admin.SiteSettings.EnableBadges enablebadges = new Anonymous.Admin.SiteSettings.EnableBadges();
            public final Anonymous.Admin.SiteSettings.EnableWhispers enablewhispers = new Anonymous.Admin.SiteSettings.EnableWhispers();
            public final Anonymous.Admin.SiteSettings.InviteOnly inviteonly = new Anonymous.Admin.SiteSettings.InviteOnly();
            public final Anonymous.Admin.SiteSettings.LoginRequired loginrequired = new Anonymous.Admin.SiteSettings.LoginRequired();
            public final Anonymous.Admin.SiteSettings.MustApproveUsers mustapproveusers = new Anonymous.Admin.SiteSettings.MustApproveUsers();
            public final Anonymous.Admin.SiteSettings.EnableLocalLogins enablelocallogins = new Anonymous.Admin.SiteSettings.EnableLocalLogins();
            public final Anonymous.Admin.SiteSettings.AllowNewRegistrations allownewregistrations = new Anonymous.Admin.SiteSettings.AllowNewRegistrations();
            public final Anonymous.Admin.SiteSettings.EnableSignupCta enablesignupcta = new Anonymous.Admin.SiteSettings.EnableSignupCta();
            public final Anonymous.Admin.SiteSettings.EnableGoogleOauth2Logins enablegoogleoauth2logins = new Anonymous.Admin.SiteSettings.EnableGoogleOauth2Logins();
            public final Anonymous.Admin.SiteSettings.GoogleOath2ClientId googleoath2clientid = new Anonymous.Admin.SiteSettings.GoogleOath2ClientId();
            public final Anonymous.Admin.SiteSettings.GoogleOath2ClientSecret googleoath2clientsecret = new Anonymous.Admin.SiteSettings.GoogleOath2ClientSecret();
            public final Anonymous.Admin.SiteSettings.EnableYahooLogins enableyahoologins = new Anonymous.Admin.SiteSettings.EnableYahooLogins();
            public final Anonymous.Admin.SiteSettings.EnableTwitterLogins enabletwitterlogins = new Anonymous.Admin.SiteSettings.EnableTwitterLogins();
            public final Anonymous.Admin.SiteSettings.TwitterConsumerKey twitterconsumerkey = new Anonymous.Admin.SiteSettings.TwitterConsumerKey();
            public final Anonymous.Admin.SiteSettings.TwitterConsumerSecret twitterconsumersecret = new Anonymous.Admin.SiteSettings.TwitterConsumerSecret();
            public final Anonymous.Admin.SiteSettings.EnableInstagramLogins enableinstagramlogins = new Anonymous.Admin.SiteSettings.EnableInstagramLogins();
            public final Anonymous.Admin.SiteSettings.InstagramConsumerKey instagramconsumerkey = new Anonymous.Admin.SiteSettings.InstagramConsumerKey();
            public final Anonymous.Admin.SiteSettings.InstagramConsumerSecret instagramconsumersecret = new Anonymous.Admin.SiteSettings.InstagramConsumerSecret();
            public final Anonymous.Admin.SiteSettings.EnableFacebookLogins enablefacebooklogins = new Anonymous.Admin.SiteSettings.EnableFacebookLogins();
            public final Anonymous.Admin.SiteSettings.FacebookAppId facebookappid = new Anonymous.Admin.SiteSettings.FacebookAppId();
            public final Anonymous.Admin.SiteSettings.FacebookAppSecret facebookappsecret = new Anonymous.Admin.SiteSettings.FacebookAppSecret();
            public final Anonymous.Admin.SiteSettings.FacebookRequestExtraProfileDetails facebookrequestextraprofiledetails = new Anonymous.Admin.SiteSettings.FacebookRequestExtraProfileDetails();
            public final Anonymous.Admin.SiteSettings.EnableGithubLogins enablegithublogins = new Anonymous.Admin.SiteSettings.EnableGithubLogins();
            public final Anonymous.Admin.SiteSettings.GithubClientId githubclientid = new Anonymous.Admin.SiteSettings.GithubClientId();
            public final Anonymous.Admin.SiteSettings.GithubClientSecret githubclientsecret = new Anonymous.Admin.SiteSettings.GithubClientSecret();
            public final Anonymous.Admin.SiteSettings.EnableSso enablesso = new Anonymous.Admin.SiteSettings.EnableSso();
            public final Anonymous.Admin.SiteSettings.SsoAllowsAllReturnPaths ssoallowsallreturnpaths = new Anonymous.Admin.SiteSettings.SsoAllowsAllReturnPaths();
            public final Anonymous.Admin.SiteSettings.EnableSsoProvider enablessoprovider = new Anonymous.Admin.SiteSettings.EnableSsoProvider();
            public final Anonymous.Admin.SiteSettings.VerboseSsoLogging verbosessologging = new Anonymous.Admin.SiteSettings.VerboseSsoLogging();
            public final Anonymous.Admin.SiteSettings.SsoUrl ssourl = new Anonymous.Admin.SiteSettings.SsoUrl();
            public final Anonymous.Admin.SiteSettings.SsoSecret ssosecret = new Anonymous.Admin.SiteSettings.SsoSecret();
            public final Anonymous.Admin.SiteSettings.SsoOverridesBio ssooverridesbio = new Anonymous.Admin.SiteSettings.SsoOverridesBio();
            public final Anonymous.Admin.SiteSettings.SsoOverridesEmail ssooverridesemail = new Anonymous.Admin.SiteSettings.SsoOverridesEmail();
            public final Anonymous.Admin.SiteSettings.SsoOverridesUsername ssooverridesusername = new Anonymous.Admin.SiteSettings.SsoOverridesUsername();
            public final Anonymous.Admin.SiteSettings.SsoOverridesName ssooverridesname = new Anonymous.Admin.SiteSettings.SsoOverridesName();
            public final Anonymous.Admin.SiteSettings.SsoOverridesAvatar ssooverridesavatar = new Anonymous.Admin.SiteSettings.SsoOverridesAvatar();
            public final Anonymous.Admin.SiteSettings.SsoNotApprovedUrl ssonotapprovedurl = new Anonymous.Admin.SiteSettings.SsoNotApprovedUrl();
            public final Anonymous.Admin.SiteSettings.EmailDomainsBlacklist emaildomainsblacklist = new Anonymous.Admin.SiteSettings.EmailDomainsBlacklist();
            public final Anonymous.Admin.SiteSettings.EmailDomainsWhitelist emaildomainswhitelist = new Anonymous.Admin.SiteSettings.EmailDomainsWhitelist();
            public final Anonymous.Admin.SiteSettings.ForgotPasswordStrict forgotpasswordstrict = new Anonymous.Admin.SiteSettings.ForgotPasswordStrict();
            public final Anonymous.Admin.SiteSettings.LogOutStrict logoutstrict = new Anonymous.Admin.SiteSettings.LogOutStrict();
            public final Anonymous.Admin.SiteSettings.PendingUsersReminderDelay pendingusersreminderdelay = new Anonymous.Admin.SiteSettings.PendingUsersReminderDelay();
            public final Anonymous.Admin.SiteSettings.MaximumSessionAge maximumsessionage = new Anonymous.Admin.SiteSettings.MaximumSessionAge();
            public final Anonymous.Admin.SiteSettings.MinUsernameLength minusernamelength = new Anonymous.Admin.SiteSettings.MinUsernameLength();
            public final Anonymous.Admin.SiteSettings.MaxUsernameLength maxusernamelength = new Anonymous.Admin.SiteSettings.MaxUsernameLength();
            public final Anonymous.Admin.SiteSettings.ReservedUsernames reservedusernames = new Anonymous.Admin.SiteSettings.ReservedUsernames();
            public final Anonymous.Admin.SiteSettings.MinPasswordLength minpasswordlength = new Anonymous.Admin.SiteSettings.MinPasswordLength();
            public final Anonymous.Admin.SiteSettings.MinAdminPasswordLength minadminpasswordlength = new Anonymous.Admin.SiteSettings.MinAdminPasswordLength();
            public final Anonymous.Admin.SiteSettings.BlockCommonPasswords blockcommonpasswords = new Anonymous.Admin.SiteSettings.BlockCommonPasswords();
            public final Anonymous.Admin.SiteSettings.UsernameChangePeriod usernamechangeperiod = new Anonymous.Admin.SiteSettings.UsernameChangePeriod();
            public final Anonymous.Admin.SiteSettings.EmailEditable emaileditable = new Anonymous.Admin.SiteSettings.EmailEditable();
            public final Anonymous.Admin.SiteSettings.LogoutRedirect logoutredirect = new Anonymous.Admin.SiteSettings.LogoutRedirect();
            public final Anonymous.Admin.SiteSettings.FullNameRequired fullnamerequired = new Anonymous.Admin.SiteSettings.FullNameRequired();
            public final Anonymous.Admin.SiteSettings.EnableNames enablenames = new Anonymous.Admin.SiteSettings.EnableNames();
            public final Anonymous.Admin.SiteSettings.InviteExpiryDays inviteexpirydays = new Anonymous.Admin.SiteSettings.InviteExpiryDays();
            public final Anonymous.Admin.SiteSettings.InvitePassthroughHours invitepassthroughhours = new Anonymous.Admin.SiteSettings.InvitePassthroughHours();
            public final Anonymous.Admin.SiteSettings.InvitesPerPage invitesperpage = new Anonymous.Admin.SiteSettings.InvitesPerPage();
            public final Anonymous.Admin.SiteSettings.DeleteUserMaxPostAge deleteusermaxpostage = new Anonymous.Admin.SiteSettings.DeleteUserMaxPostAge();
            public final Anonymous.Admin.SiteSettings.DeleteAllPostsMax deleteallpostsmax = new Anonymous.Admin.SiteSettings.DeleteAllPostsMax();
            public final Anonymous.Admin.SiteSettings.RedirectUsersToTopPage redirectuserstotoppage = new Anonymous.Admin.SiteSettings.RedirectUsersToTopPage();
            public final Anonymous.Admin.SiteSettings.ShowEmailOnProfile showemailonprofile = new Anonymous.Admin.SiteSettings.ShowEmailOnProfile();
            public final Anonymous.Admin.SiteSettings.PrioritizeUsernameInUx prioritizeusernameinux = new Anonymous.Admin.SiteSettings.PrioritizeUsernameInUx();
            public final Anonymous.Admin.SiteSettings.EmailTokenValidHours emailtokenvalidhours = new Anonymous.Admin.SiteSettings.EmailTokenValidHours();
            public final Anonymous.Admin.SiteSettings.PurgeUnactivatedUsersGracePeriodDays purgeunactivatedusersgraceperioddays = new Anonymous.Admin.SiteSettings.PurgeUnactivatedUsersGracePeriodDays();
            public final Anonymous.Admin.SiteSettings.PublicUserCustomFields publicusercustomfields = new Anonymous.Admin.SiteSettings.PublicUserCustomFields();
            public final Anonymous.Admin.SiteSettings.StaffUsersCustomFields staffuserscustomfields = new Anonymous.Admin.SiteSettings.StaffUsersCustomFields();
            public final Anonymous.Admin.SiteSettings.EnableUserDirectory enableuserdirectory = new Anonymous.Admin.SiteSettings.EnableUserDirectory();
            public final Anonymous.Admin.SiteSettings.AllowAnonymousPosting allowanonymousposting = new Anonymous.Admin.SiteSettings.AllowAnonymousPosting();
            public final Anonymous.Admin.SiteSettings.AnonymousPostingMinTrustLevel anonymouspostingmintrustlevel = new Anonymous.Admin.SiteSettings.AnonymousPostingMinTrustLevel();
            public final Anonymous.Admin.SiteSettings.AnonymousAccountDurationMinutes anonymousaccountdurationminutes = new Anonymous.Admin.SiteSettings.AnonymousAccountDurationMinutes();
            public final Anonymous.Admin.SiteSettings.HideUserProfilesFromPublic hideuserprofilesfrompublic = new Anonymous.Admin.SiteSettings.HideUserProfilesFromPublic();
            public final Anonymous.Admin.SiteSettings.MinPostLength minpostlength = new Anonymous.Admin.SiteSettings.MinPostLength();
            public final Anonymous.Admin.SiteSettings.MinFirstPostLength minfirstpostlength = new Anonymous.Admin.SiteSettings.MinFirstPostLength();
            public final Anonymous.Admin.SiteSettings.MinPrivateMessagePostLength minprivatemessagepostlength = new Anonymous.Admin.SiteSettings.MinPrivateMessagePostLength();
            public final Anonymous.Admin.SiteSettings.MaxPostLength maxpostlength = new Anonymous.Admin.SiteSettings.MaxPostLength();
            public final Anonymous.Admin.SiteSettings.TopicFeaturedLinkEnabled topicfeaturedlinkenabled = new Anonymous.Admin.SiteSettings.TopicFeaturedLinkEnabled();
            public final Anonymous.Admin.SiteSettings.BodyMinEntropy bodyminentropy = new Anonymous.Admin.SiteSettings.BodyMinEntropy();
            public final Anonymous.Admin.SiteSettings.MinTopicTitleLength mintopictitlelength = new Anonymous.Admin.SiteSettings.MinTopicTitleLength();
            public final Anonymous.Admin.SiteSettings.MaxTopicTitleLength maxtopictitlelength = new Anonymous.Admin.SiteSettings.MaxTopicTitleLength();
            public final Anonymous.Admin.SiteSettings.TitleMinEntropy titleminentropy = new Anonymous.Admin.SiteSettings.TitleMinEntropy();
            public final Anonymous.Admin.SiteSettings.AllowUppercasePosts allowuppercaseposts = new Anonymous.Admin.SiteSettings.AllowUppercasePosts();
            public final Anonymous.Admin.SiteSettings.TitlePrettify titleprettify = new Anonymous.Admin.SiteSettings.TitlePrettify();
            public final Anonymous.Admin.SiteSettings.TitleFancyEntities titlefancyentities = new Anonymous.Admin.SiteSettings.TitleFancyEntities();
            public final Anonymous.Admin.SiteSettings.MinPrivateMessageTitleLength minprivatemessagetitlelength = new Anonymous.Admin.SiteSettings.MinPrivateMessageTitleLength();
            public final Anonymous.Admin.SiteSettings.AllowUncategorizedTopics allowuncategorizedtopics = new Anonymous.Admin.SiteSettings.AllowUncategorizedTopics();
            public final Anonymous.Admin.SiteSettings.AllowDuplicateTopicTitles allowduplicatetopictitles = new Anonymous.Admin.SiteSettings.AllowDuplicateTopicTitles();
            public final Anonymous.Admin.SiteSettings.MinTitleSimilarLength mintitlesimilarlength = new Anonymous.Admin.SiteSettings.MinTitleSimilarLength();
            public final Anonymous.Admin.SiteSettings.MinBodyTitleLength minbodytitlelength = new Anonymous.Admin.SiteSettings.MinBodyTitleLength();
            public final Anonymous.Admin.SiteSettings.EnablePrivateMessages enableprivatemessages = new Anonymous.Admin.SiteSettings.EnablePrivateMessages();
            public final Anonymous.Admin.SiteSettings.EditingGracePeriod editinggraceperiod = new Anonymous.Admin.SiteSettings.EditingGracePeriod();
            public final Anonymous.Admin.SiteSettings.PostEditTimeLimit postedittimelimit = new Anonymous.Admin.SiteSettings.PostEditTimeLimit();
            public final Anonymous.Admin.SiteSettings.EditHistoryVisibleToPublic edithistoryvisibletopublic = new Anonymous.Admin.SiteSettings.EditHistoryVisibleToPublic();
            public final Anonymous.Admin.SiteSettings.DeleteRemovedPostsAfter deleteremovedpostsafter = new Anonymous.Admin.SiteSettings.DeleteRemovedPostsAfter();
            public final Anonymous.Admin.SiteSettings.TraditionalMarkdownLinebreaks traditionalmarkdownlinebreaks = new Anonymous.Admin.SiteSettings.TraditionalMarkdownLinebreaks();
            public final Anonymous.Admin.SiteSettings.AllowHtmlTables allowhtmltables = new Anonymous.Admin.SiteSettings.AllowHtmlTables();
            public final Anonymous.Admin.SiteSettings.SuppressReplyDirectlyBelow suppressreplydirectlybelow = new Anonymous.Admin.SiteSettings.SuppressReplyDirectlyBelow();
            public final Anonymous.Admin.SiteSettings.SuppressReplyDirectlyAbove suppressreplydirectlyabove = new Anonymous.Admin.SiteSettings.SuppressReplyDirectlyAbove();
            public final Anonymous.Admin.SiteSettings.SuppressReplyWhenQuoting suppressreplywhenquoting = new Anonymous.Admin.SiteSettings.SuppressReplyWhenQuoting();
            public final Anonymous.Admin.SiteSettings.MaxReplyHistory maxreplyhistory = new Anonymous.Admin.SiteSettings.MaxReplyHistory();
            public final Anonymous.Admin.SiteSettings.PostUndoActionWindowMins postundoactionwindowmins = new Anonymous.Admin.SiteSettings.PostUndoActionWindowMins();
            public final Anonymous.Admin.SiteSettings.MaxMentionsPerPost maxmentionsperpost = new Anonymous.Admin.SiteSettings.MaxMentionsPerPost();
            public final Anonymous.Admin.SiteSettings.MaxUsersNotifiedPerGroupMention maxusersnotifiedpergroupmention = new Anonymous.Admin.SiteSettings.MaxUsersNotifiedPerGroupMention();
            public final Anonymous.Admin.SiteSettings.NewuserMaxRepliesPerTopic newusermaxrepliespertopic = new Anonymous.Admin.SiteSettings.NewuserMaxRepliesPerTopic();
            public final Anonymous.Admin.SiteSettings.NewuserMaxMentionsPerPost newusermaxmentionsperpost = new Anonymous.Admin.SiteSettings.NewuserMaxMentionsPerPost();
            public final Anonymous.Admin.SiteSettings.TitleMaxWordLength titlemaxwordlength = new Anonymous.Admin.SiteSettings.TitleMaxWordLength();
            public final Anonymous.Admin.SiteSettings.NewuserMaxLinks newusermaxlinks = new Anonymous.Admin.SiteSettings.NewuserMaxLinks();
            public final Anonymous.Admin.SiteSettings.NewuserMaxImages newusermaximages = new Anonymous.Admin.SiteSettings.NewuserMaxImages();
            public final Anonymous.Admin.SiteSettings.NewuserMaxAttachments newusermaxattachments = new Anonymous.Admin.SiteSettings.NewuserMaxAttachments();
            public final Anonymous.Admin.SiteSettings.PostExcerptMaxlength postexcerptmaxlength = new Anonymous.Admin.SiteSettings.PostExcerptMaxlength();
            public final Anonymous.Admin.SiteSettings.ShowPinnedExcerptMobile showpinnedexcerptmobile = new Anonymous.Admin.SiteSettings.ShowPinnedExcerptMobile();
            public final Anonymous.Admin.SiteSettings.ShowPinnedExcerptDesktop showpinnedexcerptdesktop = new Anonymous.Admin.SiteSettings.ShowPinnedExcerptDesktop();
            public final Anonymous.Admin.SiteSettings.DisplayNameOnPosts displaynameonposts = new Anonymous.Admin.SiteSettings.DisplayNameOnPosts();
            public final Anonymous.Admin.SiteSettings.ShowTimeGapDays showtimegapdays = new Anonymous.Admin.SiteSettings.ShowTimeGapDays();
            public final Anonymous.Admin.SiteSettings.ShortProgressTextThreshold shortprogresstextthreshold = new Anonymous.Admin.SiteSettings.ShortProgressTextThreshold();
            public final Anonymous.Admin.SiteSettings.DefaultCodeLang defaultcodelang = new Anonymous.Admin.SiteSettings.DefaultCodeLang();
            public final Anonymous.Admin.SiteSettings.WarnRevivingOldTopicAge warnrevivingoldtopicage = new Anonymous.Admin.SiteSettings.WarnRevivingOldTopicAge();
            public final Anonymous.Admin.SiteSettings.AutohighlightAllCode autohighlightallcode = new Anonymous.Admin.SiteSettings.AutohighlightAllCode();
            public final Anonymous.Admin.SiteSettings.HighlightedLanguages highlightedlanguages = new Anonymous.Admin.SiteSettings.HighlightedLanguages();
            public final Anonymous.Admin.SiteSettings.DeleteOldHiddenPosts deleteoldhiddenposts = new Anonymous.Admin.SiteSettings.DeleteOldHiddenPosts();
            public final Anonymous.Admin.SiteSettings.CensoredWords censoredwords = new Anonymous.Admin.SiteSettings.CensoredWords();
            public final Anonymous.Admin.SiteSettings.CensoredPattern censoredpattern = new Anonymous.Admin.SiteSettings.CensoredPattern();
            public final Anonymous.Admin.SiteSettings.EnableEmoji enableemoji = new Anonymous.Admin.SiteSettings.EnableEmoji();
            public final Anonymous.Admin.SiteSettings.EmojiSet emojiset = new Anonymous.Admin.SiteSettings.EmojiSet();
            public final Anonymous.Admin.SiteSettings.EnforceSquareEmoji enforcesquareemoji = new Anonymous.Admin.SiteSettings.EnforceSquareEmoji();
            public final Anonymous.Admin.SiteSettings.ApprovePostCount approvepostcount = new Anonymous.Admin.SiteSettings.ApprovePostCount();
            public final Anonymous.Admin.SiteSettings.ApproveUnlessTrustLevel approveunlesstrustlevel = new Anonymous.Admin.SiteSettings.ApproveUnlessTrustLevel();
            public final Anonymous.Admin.SiteSettings.ApproveNewTopicsUnlessTrustLevel approvenewtopicsunlesstrustlevel = new Anonymous.Admin.SiteSettings.ApproveNewTopicsUnlessTrustLevel();
            public final Anonymous.Admin.SiteSettings.NotifyAboutQueuedPostsAfter notifyaboutqueuedpostsafter = new Anonymous.Admin.SiteSettings.NotifyAboutQueuedPostsAfter();
            public final Anonymous.Admin.SiteSettings.AutoCloseMessagesPostCount autoclosemessagespostcount = new Anonymous.Admin.SiteSettings.AutoCloseMessagesPostCount();
            public final Anonymous.Admin.SiteSettings.AutoCloseTopicsPostCount autoclosetopicspostcount = new Anonymous.Admin.SiteSettings.AutoCloseTopicsPostCount();
            public final Anonymous.Admin.SiteSettings.CodeFormattingStyle codeformattingstyle = new Anonymous.Admin.SiteSettings.CodeFormattingStyle();
            public final Anonymous.Admin.SiteSettings.EmbedTruncate embedtruncate = new Anonymous.Admin.SiteSettings.EmbedTruncate();
            public final Anonymous.Admin.SiteSettings.AllowedHrefSchemes allowedhrefschemes = new Anonymous.Admin.SiteSettings.AllowedHrefSchemes();
            public final Anonymous.Admin.SiteSettings.EmailTimeWindowMins emailtimewindowmins = new Anonymous.Admin.SiteSettings.EmailTimeWindowMins();
            public final Anonymous.Admin.SiteSettings.PrivateEmailTimeWindowSeconds privateemailtimewindowseconds = new Anonymous.Admin.SiteSettings.PrivateEmailTimeWindowSeconds();
            public final Anonymous.Admin.SiteSettings.EmailPostsContext emailpostscontext = new Anonymous.Admin.SiteSettings.EmailPostsContext();
            public final Anonymous.Admin.SiteSettings.DigestMinExcerptLength digestminexcerptlength = new Anonymous.Admin.SiteSettings.DigestMinExcerptLength();
            public final Anonymous.Admin.SiteSettings.DigestTopics digesttopics = new Anonymous.Admin.SiteSettings.DigestTopics();
            public final Anonymous.Admin.SiteSettings.DigestPosts digestposts = new Anonymous.Admin.SiteSettings.DigestPosts();
            public final Anonymous.Admin.SiteSettings.DigestOtherTopics digestothertopics = new Anonymous.Admin.SiteSettings.DigestOtherTopics();
            public final Anonymous.Admin.SiteSettings.DeleteDigestEmailAfterDays deletedigestemailafterdays = new Anonymous.Admin.SiteSettings.DeleteDigestEmailAfterDays();
            public final Anonymous.Admin.SiteSettings.DigestSuppressCategories digestsuppresscategories = new Anonymous.Admin.SiteSettings.DigestSuppressCategories();
            public final Anonymous.Admin.SiteSettings.DisableDigestEmails disabledigestemails = new Anonymous.Admin.SiteSettings.DisableDigestEmails();
            public final Anonymous.Admin.SiteSettings.EmailAccentBgColor emailaccentbgcolor = new Anonymous.Admin.SiteSettings.EmailAccentBgColor();
            public final Anonymous.Admin.SiteSettings.EmailAccentFgColor emailaccentfgcolor = new Anonymous.Admin.SiteSettings.EmailAccentFgColor();
            public final Anonymous.Admin.SiteSettings.EmailLinkColor emaillinkcolor = new Anonymous.Admin.SiteSettings.EmailLinkColor();
            public final Anonymous.Admin.SiteSettings.ShowTopicFeaturedLinkInDigest showtopicfeaturedlinkindigest = new Anonymous.Admin.SiteSettings.ShowTopicFeaturedLinkInDigest();
            public final Anonymous.Admin.SiteSettings.EmailCustomHeaders emailcustomheaders = new Anonymous.Admin.SiteSettings.EmailCustomHeaders();
            public final Anonymous.Admin.SiteSettings.EmailSubject emailsubject = new Anonymous.Admin.SiteSettings.EmailSubject();
            public final Anonymous.Admin.SiteSettings.ReplyByEmailEnabled replybyemailenabled = new Anonymous.Admin.SiteSettings.ReplyByEmailEnabled();
            public final Anonymous.Admin.SiteSettings.ReplyByEmailAddress replybyemailaddress = new Anonymous.Admin.SiteSettings.ReplyByEmailAddress();
            public final Anonymous.Admin.SiteSettings.AlternativeReplyByEmailAddresses alternativereplybyemailaddresses = new Anonymous.Admin.SiteSettings.AlternativeReplyByEmailAddresses();
            public final Anonymous.Admin.SiteSettings.ManualPollingEnabled manualpollingenabled = new Anonymous.Admin.SiteSettings.ManualPollingEnabled();
            public final Anonymous.Admin.SiteSettings.Pop3PollingEnabled pop3pollingenabled = new Anonymous.Admin.SiteSettings.Pop3PollingEnabled();
            public final Anonymous.Admin.SiteSettings.Pop3PollingSsl pop3pollingssl = new Anonymous.Admin.SiteSettings.Pop3PollingSsl();
            public final Anonymous.Admin.SiteSettings.Pop3PollingOpensslVerify pop3pollingopensslverify = new Anonymous.Admin.SiteSettings.Pop3PollingOpensslVerify();
            public final Anonymous.Admin.SiteSettings.Pop3PollingPeriodMins pop3pollingperiodmins = new Anonymous.Admin.SiteSettings.Pop3PollingPeriodMins();
            public final Anonymous.Admin.SiteSettings.Pop3PollingHost pop3pollinghost = new Anonymous.Admin.SiteSettings.Pop3PollingHost();
            public final Anonymous.Admin.SiteSettings.Pop3PollingPort pop3pollingport = new Anonymous.Admin.SiteSettings.Pop3PollingPort();
            public final Anonymous.Admin.SiteSettings.Pop3PollingUsername pop3pollingusername = new Anonymous.Admin.SiteSettings.Pop3PollingUsername();
            public final Anonymous.Admin.SiteSettings.Pop3PollingPassword pop3pollingpassword = new Anonymous.Admin.SiteSettings.Pop3PollingPassword();
            public final Anonymous.Admin.SiteSettings.LogMailProcessingFailures logmailprocessingfailures = new Anonymous.Admin.SiteSettings.LogMailProcessingFailures();
            public final Anonymous.Admin.SiteSettings.IncomingEmailPreferHtml incomingemailpreferhtml = new Anonymous.Admin.SiteSettings.IncomingEmailPreferHtml();
            public final Anonymous.Admin.SiteSettings.EmailIn emailin = new Anonymous.Admin.SiteSettings.EmailIn();
            public final Anonymous.Admin.SiteSettings.EmailInMinTrust emailinmintrust = new Anonymous.Admin.SiteSettings.EmailInMinTrust();
            public final Anonymous.Admin.SiteSettings.EmailPrefix emailprefix = new Anonymous.Admin.SiteSettings.EmailPrefix();
            public final Anonymous.Admin.SiteSettings.EmailSiteTitle emailsitetitle = new Anonymous.Admin.SiteSettings.EmailSiteTitle();
            public final Anonymous.Admin.SiteSettings.DisableEmails disableemails = new Anonymous.Admin.SiteSettings.DisableEmails();
            public final Anonymous.Admin.SiteSettings.StripImagesFromShortEmails stripimagesfromshortemails = new Anonymous.Admin.SiteSettings.StripImagesFromShortEmails();
            public final Anonymous.Admin.SiteSettings.ShortEmailLength shortemaillength = new Anonymous.Admin.SiteSettings.ShortEmailLength();
            public final Anonymous.Admin.SiteSettings.DisplayNameOnEmailFrom displaynameonemailfrom = new Anonymous.Admin.SiteSettings.DisplayNameOnEmailFrom();
            public final Anonymous.Admin.SiteSettings.UnsubscribeViaEmail unsubscribeviaemail = new Anonymous.Admin.SiteSettings.UnsubscribeViaEmail();
            public final Anonymous.Admin.SiteSettings.UnsubscribeViaEmailFooter unsubscribeviaemailfooter = new Anonymous.Admin.SiteSettings.UnsubscribeViaEmailFooter();
            public final Anonymous.Admin.SiteSettings.DeleteEmailLogsAfterDays deleteemaillogsafterdays = new Anonymous.Admin.SiteSettings.DeleteEmailLogsAfterDays();
            public final Anonymous.Admin.SiteSettings.MaxEmailsPerDayPerUser maxemailsperdayperuser = new Anonymous.Admin.SiteSettings.MaxEmailsPerDayPerUser();
            public final Anonymous.Admin.SiteSettings.EnableStagedUsers enablestagedusers = new Anonymous.Admin.SiteSettings.EnableStagedUsers();
            public final Anonymous.Admin.SiteSettings.MaximumStagedUsersPerEmail maximumstagedusersperemail = new Anonymous.Admin.SiteSettings.MaximumStagedUsersPerEmail();
            public final Anonymous.Admin.SiteSettings.AutoGeneratedWhitelist autogeneratedwhitelist = new Anonymous.Admin.SiteSettings.AutoGeneratedWhitelist();
            public final Anonymous.Admin.SiteSettings.BlockAutoGeneratedEmails blockautogeneratedemails = new Anonymous.Admin.SiteSettings.BlockAutoGeneratedEmails();
            public final Anonymous.Admin.SiteSettings.IgnoreByTitle ignorebytitle = new Anonymous.Admin.SiteSettings.IgnoreByTitle();
            public final Anonymous.Admin.SiteSettings.MailgunApiKey mailgunapikey = new Anonymous.Admin.SiteSettings.MailgunApiKey();
            public final Anonymous.Admin.SiteSettings.BounceScoreThreshold bouncescorethreshold = new Anonymous.Admin.SiteSettings.BounceScoreThreshold();
            public final Anonymous.Admin.SiteSettings.BounceScoreThresholdDeactivate bouncescorethresholddeactivate = new Anonymous.Admin.SiteSettings.BounceScoreThresholdDeactivate();
            public final Anonymous.Admin.SiteSettings.SoftBounceScore softbouncescore = new Anonymous.Admin.SiteSettings.SoftBounceScore();
            public final Anonymous.Admin.SiteSettings.HardBounceScore hardbouncescore = new Anonymous.Admin.SiteSettings.HardBounceScore();
            public final Anonymous.Admin.SiteSettings.ResetBounceScoreAfterDays resetbouncescoreafterdays = new Anonymous.Admin.SiteSettings.ResetBounceScoreAfterDays();
            public final Anonymous.Admin.SiteSettings.AttachmentContentTypeBlacklist attachmentcontenttypeblacklist = new Anonymous.Admin.SiteSettings.AttachmentContentTypeBlacklist();
            public final Anonymous.Admin.SiteSettings.AttachmentFilenameBlacklist attachmentfilenameblacklist = new Anonymous.Admin.SiteSettings.AttachmentFilenameBlacklist();
            public final Anonymous.Admin.SiteSettings.EnableForwardedEmails enableforwardedemails = new Anonymous.Admin.SiteSettings.EnableForwardedEmails();
            public final Anonymous.Admin.SiteSettings.AlwaysShowTrimmedContent alwaysshowtrimmedcontent = new Anonymous.Admin.SiteSettings.AlwaysShowTrimmedContent();
            public final Anonymous.Admin.SiteSettings.MaxImageSizeKb maximagesizekb = new Anonymous.Admin.SiteSettings.MaxImageSizeKb();
            public final Anonymous.Admin.SiteSettings.MaxAttachmentSizeKb maxattachmentsizekb = new Anonymous.Admin.SiteSettings.MaxAttachmentSizeKb();
            public final Anonymous.Admin.SiteSettings.MaxImageMegapixels maximagemegapixels = new Anonymous.Admin.SiteSettings.MaxImageMegapixels();
            public final Anonymous.Admin.SiteSettings.AuthorizedExtensions authorizedextensions = new Anonymous.Admin.SiteSettings.AuthorizedExtensions();
            public final Anonymous.Admin.SiteSettings.CrawlImages crawlimages = new Anonymous.Admin.SiteSettings.CrawlImages();
            public final Anonymous.Admin.SiteSettings.MaxImageWidth maximagewidth = new Anonymous.Admin.SiteSettings.MaxImageWidth();
            public final Anonymous.Admin.SiteSettings.MaxImageHeight maximageheight = new Anonymous.Admin.SiteSettings.MaxImageHeight();
            public final Anonymous.Admin.SiteSettings.DownloadRemoteImagesToLocal downloadremoteimagestolocal = new Anonymous.Admin.SiteSettings.DownloadRemoteImagesToLocal();
            public final Anonymous.Admin.SiteSettings.DownloadRemoteImagesThreshold downloadremoteimagesthreshold = new Anonymous.Admin.SiteSettings.DownloadRemoteImagesThreshold();
            public final Anonymous.Admin.SiteSettings.DownloadRemoteImagesMaxDaysOld downloadremoteimagesmaxdaysold = new Anonymous.Admin.SiteSettings.DownloadRemoteImagesMaxDaysOld();
            public final Anonymous.Admin.SiteSettings.DisabledImageDownloadDomains disabledimagedownloaddomains = new Anonymous.Admin.SiteSettings.DisabledImageDownloadDomains();
            public final Anonymous.Admin.SiteSettings.CreateThumbnails createthumbnails = new Anonymous.Admin.SiteSettings.CreateThumbnails();
            public final Anonymous.Admin.SiteSettings.CleanUpUploads cleanupuploads = new Anonymous.Admin.SiteSettings.CleanUpUploads();
            public final Anonymous.Admin.SiteSettings.CleanOrphanUploadsGracePeriodHours cleanorphanuploadsgraceperiodhours = new Anonymous.Admin.SiteSettings.CleanOrphanUploadsGracePeriodHours();
            public final Anonymous.Admin.SiteSettings.PurgeDeletedUploadsGracePeriodDays purgedeleteduploadsgraceperioddays = new Anonymous.Admin.SiteSettings.PurgeDeletedUploadsGracePeriodDays();
            public final Anonymous.Admin.SiteSettings.PreventAnonsFromDownloadingFiles preventanonsfromdownloadingfiles = new Anonymous.Admin.SiteSettings.PreventAnonsFromDownloadingFiles();
            public final Anonymous.Admin.SiteSettings.EnableS3Uploads enables3uploads = new Anonymous.Admin.SiteSettings.EnableS3Uploads();
            public final Anonymous.Admin.SiteSettings.S3UseIamProfile s3useiamprofile = new Anonymous.Admin.SiteSettings.S3UseIamProfile();
            public final Anonymous.Admin.SiteSettings.S3AccessKeyId s3accesskeyid = new Anonymous.Admin.SiteSettings.S3AccessKeyId();
            public final Anonymous.Admin.SiteSettings.S3SecretAccessKey s3secretaccesskey = new Anonymous.Admin.SiteSettings.S3SecretAccessKey();
            public final Anonymous.Admin.SiteSettings.S3Region s3region = new Anonymous.Admin.SiteSettings.S3Region();
            public final Anonymous.Admin.SiteSettings.S3UploadBucket s3uploadbucket = new Anonymous.Admin.SiteSettings.S3UploadBucket();
            public final Anonymous.Admin.SiteSettings.S3CdnUrl s3cdnurl = new Anonymous.Admin.SiteSettings.S3CdnUrl();
            public final Anonymous.Admin.SiteSettings.AllowProfileBackgrounds allowprofilebackgrounds = new Anonymous.Admin.SiteSettings.AllowProfileBackgrounds();
            public final Anonymous.Admin.SiteSettings.AutomaticallyDownloadGravatars automaticallydownloadgravatars = new Anonymous.Admin.SiteSettings.AutomaticallyDownloadGravatars();
            public final Anonymous.Admin.SiteSettings.AllowUploadedAvatars allowuploadedavatars = new Anonymous.Admin.SiteSettings.AllowUploadedAvatars();
            public final Anonymous.Admin.SiteSettings.AllowAnimatedAvatars allowanimatedavatars = new Anonymous.Admin.SiteSettings.AllowAnimatedAvatars();
            public final Anonymous.Admin.SiteSettings.AllowAnimatedThumbnails allowanimatedthumbnails = new Anonymous.Admin.SiteSettings.AllowAnimatedThumbnails();
            public final Anonymous.Admin.SiteSettings.DefaultAvatars defaultavatars = new Anonymous.Admin.SiteSettings.DefaultAvatars();
            public final Anonymous.Admin.SiteSettings.AvatarSizes avatarsizes = new Anonymous.Admin.SiteSettings.AvatarSizes();
            public final Anonymous.Admin.SiteSettings.ExternalSystemAvatarsEnabled externalsystemavatarsenabled = new Anonymous.Admin.SiteSettings.ExternalSystemAvatarsEnabled();
            public final Anonymous.Admin.SiteSettings.ExternalSystemAvatarsUrl externalsystemavatarsurl = new Anonymous.Admin.SiteSettings.ExternalSystemAvatarsUrl();
            public final Anonymous.Admin.SiteSettings.AllowAllAttachmentsForGroupMessages allowallattachmentsforgroupmessages = new Anonymous.Admin.SiteSettings.AllowAllAttachmentsForGroupMessages();
            public final Anonymous.Admin.SiteSettings.ConvertPastedImagesToHqJpg convertpastedimagestohqjpg = new Anonymous.Admin.SiteSettings.ConvertPastedImagesToHqJpg();
            public final Anonymous.Admin.SiteSettings.ConvertPastedImagesQuality convertpastedimagesquality = new Anonymous.Admin.SiteSettings.ConvertPastedImagesQuality();
            public final Anonymous.Admin.SiteSettings.DefaultTrustLevel defaulttrustlevel = new Anonymous.Admin.SiteSettings.DefaultTrustLevel();
            public final Anonymous.Admin.SiteSettings.DefaultInviteeTrustLevel defaultinviteetrustlevel = new Anonymous.Admin.SiteSettings.DefaultInviteeTrustLevel();
            public final Anonymous.Admin.SiteSettings.MinTrustToCreateTopic mintrusttocreatetopic = new Anonymous.Admin.SiteSettings.MinTrustToCreateTopic();
            public final Anonymous.Admin.SiteSettings.MinTrustToEditWikiPost mintrusttoeditwikipost = new Anonymous.Admin.SiteSettings.MinTrustToEditWikiPost();
            public final Anonymous.Admin.SiteSettings.MinTrustToEditPost mintrusttoeditpost = new Anonymous.Admin.SiteSettings.MinTrustToEditPost();
            public final Anonymous.Admin.SiteSettings.MinTrustToAllowSelfWiki mintrusttoallowselfwiki = new Anonymous.Admin.SiteSettings.MinTrustToAllowSelfWiki();
            public final Anonymous.Admin.SiteSettings.MinTrustToSendMessages mintrusttosendmessages = new Anonymous.Admin.SiteSettings.MinTrustToSendMessages();
            public final Anonymous.Admin.SiteSettings.Tl1RequiresTopicsEntered tl1requirestopicsentered = new Anonymous.Admin.SiteSettings.Tl1RequiresTopicsEntered();
            public final Anonymous.Admin.SiteSettings.Tl1RequiresReadPosts tl1requiresreadposts = new Anonymous.Admin.SiteSettings.Tl1RequiresReadPosts();
            public final Anonymous.Admin.SiteSettings.Tl1RequiresTimeSpentMins tl1requirestimespentmins = new Anonymous.Admin.SiteSettings.Tl1RequiresTimeSpentMins();
            public final Anonymous.Admin.SiteSettings.Tl2RequiresTopicsEntered tl2requirestopicsentered = new Anonymous.Admin.SiteSettings.Tl2RequiresTopicsEntered();
            public final Anonymous.Admin.SiteSettings.Tl2RequiresReadPosts tl2requiresreadposts = new Anonymous.Admin.SiteSettings.Tl2RequiresReadPosts();
            public final Anonymous.Admin.SiteSettings.Tl2RequiresTimeSpentMins tl2requirestimespentmins = new Anonymous.Admin.SiteSettings.Tl2RequiresTimeSpentMins();
            public final Anonymous.Admin.SiteSettings.Tl2RequiresDaysVisited tl2requiresdaysvisited = new Anonymous.Admin.SiteSettings.Tl2RequiresDaysVisited();
            public final Anonymous.Admin.SiteSettings.Tl2RequiresLikesReceived tl2requireslikesreceived = new Anonymous.Admin.SiteSettings.Tl2RequiresLikesReceived();
            public final Anonymous.Admin.SiteSettings.Tl2RequiresLikesGiven tl2requireslikesgiven = new Anonymous.Admin.SiteSettings.Tl2RequiresLikesGiven();
            public final Anonymous.Admin.SiteSettings.Tl2RequiresTopicReplyCount tl2requirestopicreplycount = new Anonymous.Admin.SiteSettings.Tl2RequiresTopicReplyCount();
            public final Anonymous.Admin.SiteSettings.Tl3TimePeriod tl3timeperiod = new Anonymous.Admin.SiteSettings.Tl3TimePeriod();
            public final Anonymous.Admin.SiteSettings.Tl3RequiresDaysVisited tl3requiresdaysvisited = new Anonymous.Admin.SiteSettings.Tl3RequiresDaysVisited();
            public final Anonymous.Admin.SiteSettings.Tl3RequiresTopicsRepliedTo tl3requirestopicsrepliedto = new Anonymous.Admin.SiteSettings.Tl3RequiresTopicsRepliedTo();
            public final Anonymous.Admin.SiteSettings.Tl3RequiresTopicsViewed tl3requirestopicsviewed = new Anonymous.Admin.SiteSettings.Tl3RequiresTopicsViewed();
            public final Anonymous.Admin.SiteSettings.Tl3RequiresTopicsViewedCap tl3requirestopicsviewedcap = new Anonymous.Admin.SiteSettings.Tl3RequiresTopicsViewedCap();
            public final Anonymous.Admin.SiteSettings.Tl3RequiresPostsRead tl3requirespostsread = new Anonymous.Admin.SiteSettings.Tl3RequiresPostsRead();
            public final Anonymous.Admin.SiteSettings.Tl3RequiresPostsReadCap tl3requirespostsreadcap = new Anonymous.Admin.SiteSettings.Tl3RequiresPostsReadCap();
            public final Anonymous.Admin.SiteSettings.Tl3RequiresTopicsViewedAllTime tl3requirestopicsviewedalltime = new Anonymous.Admin.SiteSettings.Tl3RequiresTopicsViewedAllTime();
            public final Anonymous.Admin.SiteSettings.Tl3RequiresPostsReadAllTime tl3requirespostsreadalltime = new Anonymous.Admin.SiteSettings.Tl3RequiresPostsReadAllTime();
            public final Anonymous.Admin.SiteSettings.Tl3RequiresMaxFlagged tl3requiresmaxflagged = new Anonymous.Admin.SiteSettings.Tl3RequiresMaxFlagged();
            public final Anonymous.Admin.SiteSettings.Tl3PromotionMinDuration tl3promotionminduration = new Anonymous.Admin.SiteSettings.Tl3PromotionMinDuration();
            public final Anonymous.Admin.SiteSettings.Tl3RequiresLikesGiven tl3requireslikesgiven = new Anonymous.Admin.SiteSettings.Tl3RequiresLikesGiven();
            public final Anonymous.Admin.SiteSettings.Tl3RequiresLikesReceived tl3requireslikesreceived = new Anonymous.Admin.SiteSettings.Tl3RequiresLikesReceived();
            public final Anonymous.Admin.SiteSettings.Tl3LinksNoFollow tl3linksnofollow = new Anonymous.Admin.SiteSettings.Tl3LinksNoFollow();
            public final Anonymous.Admin.SiteSettings.ForceHttps forcehttps = new Anonymous.Admin.SiteSettings.ForceHttps();
            public final Anonymous.Admin.SiteSettings.EnableEscapedFragments enableescapedfragments = new Anonymous.Admin.SiteSettings.EnableEscapedFragments();
            public final Anonymous.Admin.SiteSettings.AllowIndexInRobotsTxt allowindexinrobotstxt = new Anonymous.Admin.SiteSettings.AllowIndexInRobotsTxt();
            public final Anonymous.Admin.SiteSettings.EnableNoscriptSupport enablenoscriptsupport = new Anonymous.Admin.SiteSettings.EnableNoscriptSupport();
            public final Anonymous.Admin.SiteSettings.AllowModeratorsToCreateCategories allowmoderatorstocreatecategories = new Anonymous.Admin.SiteSettings.AllowModeratorsToCreateCategories();
            public final Anonymous.Admin.SiteSettings.CorsOrigins corsorigins = new Anonymous.Admin.SiteSettings.CorsOrigins();
            public final Anonymous.Admin.SiteSettings.UseAdminIpWhitelist useadminipwhitelist = new Anonymous.Admin.SiteSettings.UseAdminIpWhitelist();
            public final Anonymous.Admin.SiteSettings.EnableFlashVideoOnebox enableflashvideoonebox = new Anonymous.Admin.SiteSettings.EnableFlashVideoOnebox();
            public final Anonymous.Admin.SiteSettings.PostOneboxMaxlength postoneboxmaxlength = new Anonymous.Admin.SiteSettings.PostOneboxMaxlength();
            public final Anonymous.Admin.SiteSettings.OneboxDomainsBlacklist oneboxdomainsblacklist = new Anonymous.Admin.SiteSettings.OneboxDomainsBlacklist();
            public final Anonymous.Admin.SiteSettings.MaxOneboxesPerPost maxoneboxesperpost = new Anonymous.Admin.SiteSettings.MaxOneboxesPerPost();
            public final Anonymous.Admin.SiteSettings.AddRelNofollowToUserContent addrelnofollowtousercontent = new Anonymous.Admin.SiteSettings.AddRelNofollowToUserContent();
            public final Anonymous.Admin.SiteSettings.FlagsRequiredToHidePost flagsrequiredtohidepost = new Anonymous.Admin.SiteSettings.FlagsRequiredToHidePost();
            public final Anonymous.Admin.SiteSettings.CooldownMinutesAfterHidingPosts cooldownminutesafterhidingposts = new Anonymous.Admin.SiteSettings.CooldownMinutesAfterHidingPosts();
            public final Anonymous.Admin.SiteSettings.NumSpamFlagsToBlockNewUser numspamflagstoblocknewuser = new Anonymous.Admin.SiteSettings.NumSpamFlagsToBlockNewUser();
            public final Anonymous.Admin.SiteSettings.NumUsersToBlockNewUser numuserstoblocknewuser = new Anonymous.Admin.SiteSettings.NumUsersToBlockNewUser();
            public final Anonymous.Admin.SiteSettings.NumTl3FlagsToBlockNewUser numtl3flagstoblocknewuser = new Anonymous.Admin.SiteSettings.NumTl3FlagsToBlockNewUser();
            public final Anonymous.Admin.SiteSettings.NumTl3UsersToBlockNewUser numtl3userstoblocknewuser = new Anonymous.Admin.SiteSettings.NumTl3UsersToBlockNewUser();
            public final Anonymous.Admin.SiteSettings.NotifyModsWhenUserBlocked notifymodswhenuserblocked = new Anonymous.Admin.SiteSettings.NotifyModsWhenUserBlocked();
            public final Anonymous.Admin.SiteSettings.FlagSockpuppets flagsockpuppets = new Anonymous.Admin.SiteSettings.FlagSockpuppets();
            public final Anonymous.Admin.SiteSettings.NewuserSpamHostThreshold newuserspamhostthreshold = new Anonymous.Admin.SiteSettings.NewuserSpamHostThreshold();
            public final Anonymous.Admin.SiteSettings.WhiteListedSpamHostDomains whitelistedspamhostdomains = new Anonymous.Admin.SiteSettings.WhiteListedSpamHostDomains();
            public final Anonymous.Admin.SiteSettings.LevenshteinDistanceSpammerEmails levenshteindistancespammeremails = new Anonymous.Admin.SiteSettings.LevenshteinDistanceSpammerEmails();
            public final Anonymous.Admin.SiteSettings.MaxNewAccountsPerRegistrationIp maxnewaccountsperregistrationip = new Anonymous.Admin.SiteSettings.MaxNewAccountsPerRegistrationIp();
            public final Anonymous.Admin.SiteSettings.MinBanEntriesForRollUp minbanentriesforrollup = new Anonymous.Admin.SiteSettings.MinBanEntriesForRollUp();
            public final Anonymous.Admin.SiteSettings.MaxAgeUnmatchedEmails maxageunmatchedemails = new Anonymous.Admin.SiteSettings.MaxAgeUnmatchedEmails();
            public final Anonymous.Admin.SiteSettings.MaxAgeUnmatchedIps maxageunmatchedips = new Anonymous.Admin.SiteSettings.MaxAgeUnmatchedIps();
            public final Anonymous.Admin.SiteSettings.NumFlaggersToCloseTopic numflaggerstoclosetopic = new Anonymous.Admin.SiteSettings.NumFlaggersToCloseTopic();
            public final Anonymous.Admin.SiteSettings.NumFlagsToCloseTopic numflagstoclosetopic = new Anonymous.Admin.SiteSettings.NumFlagsToCloseTopic();
            public final Anonymous.Admin.SiteSettings.AutoRespondToFlagActions autorespondtoflagactions = new Anonymous.Admin.SiteSettings.AutoRespondToFlagActions();
            public final Anonymous.Admin.SiteSettings.MinFirstPostTypingTime minfirstposttypingtime = new Anonymous.Admin.SiteSettings.MinFirstPostTypingTime();
            public final Anonymous.Admin.SiteSettings.AutoBlockFastTypersOnFirstPost autoblockfasttypersonfirstpost = new Anonymous.Admin.SiteSettings.AutoBlockFastTypersOnFirstPost();
            public final Anonymous.Admin.SiteSettings.AutoBlockFastTypersMaxTrustLevel autoblockfasttypersmaxtrustlevel = new Anonymous.Admin.SiteSettings.AutoBlockFastTypersMaxTrustLevel();
            public final Anonymous.Admin.SiteSettings.AutoBlockFirstPostRegex autoblockfirstpostregex = new Anonymous.Admin.SiteSettings.AutoBlockFirstPostRegex();
            public final Anonymous.Admin.SiteSettings.UniquePostsMin uniquepostsmin = new Anonymous.Admin.SiteSettings.UniquePostsMin();
            public final Anonymous.Admin.SiteSettings.RateLimitCreateTopic ratelimitcreatetopic = new Anonymous.Admin.SiteSettings.RateLimitCreateTopic();
            public final Anonymous.Admin.SiteSettings.RateLimitCreatePost ratelimitcreatepost = new Anonymous.Admin.SiteSettings.RateLimitCreatePost();
            public final Anonymous.Admin.SiteSettings.RateLimitNewUserCreateTopic ratelimitnewusercreatetopic = new Anonymous.Admin.SiteSettings.RateLimitNewUserCreateTopic();
            public final Anonymous.Admin.SiteSettings.RateLimitNewUserCreatePost ratelimitnewusercreatepost = new Anonymous.Admin.SiteSettings.RateLimitNewUserCreatePost();
            public final Anonymous.Admin.SiteSettings.MaxTopicsPerDay maxtopicsperday = new Anonymous.Admin.SiteSettings.MaxTopicsPerDay();
            public final Anonymous.Admin.SiteSettings.MaxPrivateMessagesPerDay maxprivatemessagesperday = new Anonymous.Admin.SiteSettings.MaxPrivateMessagesPerDay();
            public final Anonymous.Admin.SiteSettings.MaxLikesPerDay maxlikesperday = new Anonymous.Admin.SiteSettings.MaxLikesPerDay();
            public final Anonymous.Admin.SiteSettings.MaxBookmarksPerDay maxbookmarksperday = new Anonymous.Admin.SiteSettings.MaxBookmarksPerDay();
            public final Anonymous.Admin.SiteSettings.MaxFlagsPerDay maxflagsperday = new Anonymous.Admin.SiteSettings.MaxFlagsPerDay();
            public final Anonymous.Admin.SiteSettings.MaxEditsPerDay maxeditsperday = new Anonymous.Admin.SiteSettings.MaxEditsPerDay();
            public final Anonymous.Admin.SiteSettings.MaxInvitesPerDay maxinvitesperday = new Anonymous.Admin.SiteSettings.MaxInvitesPerDay();
            public final Anonymous.Admin.SiteSettings.MaxTopicInvitationsPerDay maxtopicinvitationsperday = new Anonymous.Admin.SiteSettings.MaxTopicInvitationsPerDay();
            public final Anonymous.Admin.SiteSettings.MaxTopicsInFirstDay maxtopicsinfirstday = new Anonymous.Admin.SiteSettings.MaxTopicsInFirstDay();
            public final Anonymous.Admin.SiteSettings.MaxRepliesInFirstDay maxrepliesinfirstday = new Anonymous.Admin.SiteSettings.MaxRepliesInFirstDay();
            public final Anonymous.Admin.SiteSettings.Tl2AdditionalLikesPerDayMultiplier tl2additionallikesperdaymultiplier = new Anonymous.Admin.SiteSettings.Tl2AdditionalLikesPerDayMultiplier();
            public final Anonymous.Admin.SiteSettings.Tl3AdditionalLikesPerDayMultiplier tl3additionallikesperdaymultiplier = new Anonymous.Admin.SiteSettings.Tl3AdditionalLikesPerDayMultiplier();
            public final Anonymous.Admin.SiteSettings.Tl4AdditionalLikesPerDayMultiplier tl4additionallikesperdaymultiplier = new Anonymous.Admin.SiteSettings.Tl4AdditionalLikesPerDayMultiplier();
            public final Anonymous.Admin.SiteSettings.AlertAdminsIfErrorsPerMinute alertadminsiferrorsperminute = new Anonymous.Admin.SiteSettings.AlertAdminsIfErrorsPerMinute();
            public final Anonymous.Admin.SiteSettings.AlertAdminsIfErrorsPerHour alertadminsiferrorsperhour = new Anonymous.Admin.SiteSettings.AlertAdminsIfErrorsPerHour();
            public final Anonymous.Admin.SiteSettings.MaxPrintsPerHourPerUser maxprintsperhourperuser = new Anonymous.Admin.SiteSettings.MaxPrintsPerHourPerUser();
            public final Anonymous.Admin.SiteSettings.ForceHostname forcehostname = new Anonymous.Admin.SiteSettings.ForceHostname();
            public final Anonymous.Admin.SiteSettings.Port port = new Anonymous.Admin.SiteSettings.Port();
            public final Anonymous.Admin.SiteSettings.QueueJobs queuejobs = new Anonymous.Admin.SiteSettings.QueueJobs();
            public final Anonymous.Admin.SiteSettings.EnableLongPolling enablelongpolling = new Anonymous.Admin.SiteSettings.EnableLongPolling();
            public final Anonymous.Admin.SiteSettings.LongPollingInterval longpollinginterval = new Anonymous.Admin.SiteSettings.LongPollingInterval();
            public final Anonymous.Admin.SiteSettings.LongPollingBaseUrl longpollingbaseurl = new Anonymous.Admin.SiteSettings.LongPollingBaseUrl();
            public final Anonymous.Admin.SiteSettings.BackgroundPollingInterval backgroundpollinginterval = new Anonymous.Admin.SiteSettings.BackgroundPollingInterval();
            public final Anonymous.Admin.SiteSettings.PollingInterval pollinginterval = new Anonymous.Admin.SiteSettings.PollingInterval();
            public final Anonymous.Admin.SiteSettings.AnonPollingInterval anonpollinginterval = new Anonymous.Admin.SiteSettings.AnonPollingInterval();
            public final Anonymous.Admin.SiteSettings.FlushTimingsSecs flushtimingssecs = new Anonymous.Admin.SiteSettings.FlushTimingsSecs();
            public final Anonymous.Admin.SiteSettings.ActiveUserRateLimitSecs activeuserratelimitsecs = new Anonymous.Admin.SiteSettings.ActiveUserRateLimitSecs();
            public final Anonymous.Admin.SiteSettings.VerboseLocalization verboselocalization = new Anonymous.Admin.SiteSettings.VerboseLocalization();
            public final Anonymous.Admin.SiteSettings.TopTopicsFormulaLogViewsMultiplier toptopicsformulalogviewsmultiplier = new Anonymous.Admin.SiteSettings.TopTopicsFormulaLogViewsMultiplier();
            public final Anonymous.Admin.SiteSettings.TopTopicsFormulaFirstPostLikesMultiplier toptopicsformulafirstpostlikesmultiplier = new Anonymous.Admin.SiteSettings.TopTopicsFormulaFirstPostLikesMultiplier();
            public final Anonymous.Admin.SiteSettings.RebakeOldPostsCount rebakeoldpostscount = new Anonymous.Admin.SiteSettings.RebakeOldPostsCount();
            public final Anonymous.Admin.SiteSettings.TosUrl tosurl = new Anonymous.Admin.SiteSettings.TosUrl();
            public final Anonymous.Admin.SiteSettings.PrivacyPolicyUrl privacypolicyurl = new Anonymous.Admin.SiteSettings.PrivacyPolicyUrl();
            public final Anonymous.Admin.SiteSettings.FagUrl fagurl = new Anonymous.Admin.SiteSettings.FagUrl();
            public final Anonymous.Admin.SiteSettings.ReadonlyModeDuringBackup readonlymodeduringbackup = new Anonymous.Admin.SiteSettings.ReadonlyModeDuringBackup();
            public final Anonymous.Admin.SiteSettings.AllowRestore allowrestore = new Anonymous.Admin.SiteSettings.AllowRestore();
            public final Anonymous.Admin.SiteSettings.MaximumBackups maximumbackups = new Anonymous.Admin.SiteSettings.MaximumBackups();
            public final Anonymous.Admin.SiteSettings.AutomaticBackupsEnabled automaticbackupsenabled = new Anonymous.Admin.SiteSettings.AutomaticBackupsEnabled();
            public final Anonymous.Admin.SiteSettings.BackupFrequency backupfrequency = new Anonymous.Admin.SiteSettings.BackupFrequency();
            public final Anonymous.Admin.SiteSettings.EnableS3Backups enables3backups = new Anonymous.Admin.SiteSettings.EnableS3Backups();
            public final Anonymous.Admin.SiteSettings.S3BackupBucket s3backupbucket = new Anonymous.Admin.SiteSettings.S3BackupBucket();
            public final Anonymous.Admin.SiteSettings.S3DisableCleanup s3disablecleanup = new Anonymous.Admin.SiteSettings.S3DisableCleanup();
            public final Anonymous.Admin.SiteSettings.BackupTimeOfDay backuptimeofday = new Anonymous.Admin.SiteSettings.BackupTimeOfDay();
            public final Anonymous.Admin.SiteSettings.BackupWithUploads backupwithuploads = new Anonymous.Admin.SiteSettings.BackupWithUploads();
            public final Anonymous.Admin.SiteSettings.MinSearchTermLength minsearchtermlength = new Anonymous.Admin.SiteSettings.MinSearchTermLength();
            public final Anonymous.Admin.SiteSettings.SearchTokenizeChineseJapaneseKorean searchtokenizechinesejapanesekorean = new Anonymous.Admin.SiteSettings.SearchTokenizeChineseJapaneseKorean();
            public final Anonymous.Admin.SiteSettings.SearchPreferRecentPosts searchpreferrecentposts = new Anonymous.Admin.SiteSettings.SearchPreferRecentPosts();
            public final Anonymous.Admin.SiteSettings.SearchRecentPostsSize searchrecentpostssize = new Anonymous.Admin.SiteSettings.SearchRecentPostsSize();
            public final Anonymous.Admin.SiteSettings.VersionChecks versionchecks = new Anonymous.Admin.SiteSettings.VersionChecks();
            public final Anonymous.Admin.SiteSettings.NewVersionEmails newversionemails = new Anonymous.Admin.SiteSettings.NewVersionEmails();
            public final Anonymous.Admin.SiteSettings.SendWelcomeMessage sendwelcomemessage = new Anonymous.Admin.SiteSettings.SendWelcomeMessage();
            public final Anonymous.Admin.SiteSettings.SuppressUncategorizedBadge suppressuncategorizedbadge = new Anonymous.Admin.SiteSettings.SuppressUncategorizedBadge();
            public final Anonymous.Admin.SiteSettings.SlugGenerationMethod sluggenerationmethod = new Anonymous.Admin.SiteSettings.SlugGenerationMethod();
            public final Anonymous.Admin.SiteSettings.PermalinkNormalizations permalinknormalizations = new Anonymous.Admin.SiteSettings.PermalinkNormalizations();
            public final Anonymous.Admin.SiteSettings.MaxSimilarResults maxsimilarresults = new Anonymous.Admin.SiteSettings.MaxSimilarResults();
            public final Anonymous.Admin.SiteSettings.MinimumTopicsSimilar minimumtopicssimilar = new Anonymous.Admin.SiteSettings.MinimumTopicsSimilar();
            public final Anonymous.Admin.SiteSettings.PreviousVisitTimeoutHours previousvisittimeouthours = new Anonymous.Admin.SiteSettings.PreviousVisitTimeoutHours();
            public final Anonymous.Admin.SiteSettings.StaffLikeWeight stafflikeweight = new Anonymous.Admin.SiteSettings.StaffLikeWeight();
            public final Anonymous.Admin.SiteSettings.TopicViewDurationHours topicviewdurationhours = new Anonymous.Admin.SiteSettings.TopicViewDurationHours();
            public final Anonymous.Admin.SiteSettings.UserProfileViewDurationHours userprofileviewdurationhours = new Anonymous.Admin.SiteSettings.UserProfileViewDurationHours();
            public final Anonymous.Admin.SiteSettings.SummaryScoreThreshold summaryscorethreshold = new Anonymous.Admin.SiteSettings.SummaryScoreThreshold();
            public final Anonymous.Admin.SiteSettings.SummaryPostsRequired summarypostsrequired = new Anonymous.Admin.SiteSettings.SummaryPostsRequired();
            public final Anonymous.Admin.SiteSettings.SummaryLikesRequired summarylikesrequired = new Anonymous.Admin.SiteSettings.SummaryLikesRequired();
            public final Anonymous.Admin.SiteSettings.SummaryPercentFilter summarypercentfilter = new Anonymous.Admin.SiteSettings.SummaryPercentFilter();
            public final Anonymous.Admin.SiteSettings.SummaryMaxResults summarymaxresults = new Anonymous.Admin.SiteSettings.SummaryMaxResults();
            public final Anonymous.Admin.SiteSettings.TopicViewsHeatLow topicviewsheatlow = new Anonymous.Admin.SiteSettings.TopicViewsHeatLow();
            public final Anonymous.Admin.SiteSettings.TopicViewsHeatMedium topicviewsheatmedium = new Anonymous.Admin.SiteSettings.TopicViewsHeatMedium();
            public final Anonymous.Admin.SiteSettings.TopicViewsHeatHigh topicviewsheathigh = new Anonymous.Admin.SiteSettings.TopicViewsHeatHigh();
            public final Anonymous.Admin.SiteSettings.TopicPostLikeHeatLow topicpostlikeheatlow = new Anonymous.Admin.SiteSettings.TopicPostLikeHeatLow();
            public final Anonymous.Admin.SiteSettings.TopicPostLikeHeatMedium topicpostlikeheatmedium = new Anonymous.Admin.SiteSettings.TopicPostLikeHeatMedium();
            public final Anonymous.Admin.SiteSettings.TopicPostLikeHeatHigh topicpostlikeheathigh = new Anonymous.Admin.SiteSettings.TopicPostLikeHeatHigh();
            public final Anonymous.Admin.SiteSettings.HistoryHoursLow historyhourslow = new Anonymous.Admin.SiteSettings.HistoryHoursLow();
            public final Anonymous.Admin.SiteSettings.HistoryHoursMedium historyhoursmedium = new Anonymous.Admin.SiteSettings.HistoryHoursMedium();
            public final Anonymous.Admin.SiteSettings.HistoryHoursHigh historyhourshigh = new Anonymous.Admin.SiteSettings.HistoryHoursHigh();
            public final Anonymous.Admin.SiteSettings.ColdAgeDaysLow coldagedayslow = new Anonymous.Admin.SiteSettings.ColdAgeDaysLow();
            public final Anonymous.Admin.SiteSettings.ColdAgeDaysMedium coldagedaysmedium = new Anonymous.Admin.SiteSettings.ColdAgeDaysMedium();
            public final Anonymous.Admin.SiteSettings.ColdAgeDaysHigh coldagedayshigh = new Anonymous.Admin.SiteSettings.ColdAgeDaysHigh();
            public final Anonymous.Admin.SiteSettings.EducateUntilPosts educateuntilposts = new Anonymous.Admin.SiteSettings.EducateUntilPosts();
            public final Anonymous.Admin.SiteSettings.SequentialRepliesThreshold sequentialrepliesthreshold = new Anonymous.Admin.SiteSettings.SequentialRepliesThreshold();
            public final Anonymous.Admin.SiteSettings.DominatingTopicMinimumPercent dominatingtopicminimumpercent = new Anonymous.Admin.SiteSettings.DominatingTopicMinimumPercent();
            public final Anonymous.Admin.SiteSettings.DisableAvatarEducationMessage disableavatareducationmessage = new Anonymous.Admin.SiteSettings.DisableAvatarEducationMessage();
            public final Anonymous.Admin.SiteSettings.GlobalNotice globalnotice = new Anonymous.Admin.SiteSettings.GlobalNotice();
            public final Anonymous.Admin.SiteSettings.NotifyAboutFlagsAfter notifyaboutflagsafter = new Anonymous.Admin.SiteSettings.NotifyAboutFlagsAfter();
            public final Anonymous.Admin.SiteSettings.ShowCreateTopicsNotice showcreatetopicsnotice = new Anonymous.Admin.SiteSettings.ShowCreateTopicsNotice();
            public final Anonymous.Admin.SiteSettings.DisableEditNotifications disableeditnotifications = new Anonymous.Admin.SiteSettings.DisableEditNotifications();
            public final Anonymous.Admin.SiteSettings.VacuumDbDays vacuumdbdays = new Anonymous.Admin.SiteSettings.VacuumDbDays();
            public final Anonymous.Admin.SiteSettings.DeleteDraftsOlderThanNDays deletedraftsolderthanndays = new Anonymous.Admin.SiteSettings.DeleteDraftsOlderThanNDays();
            public final Anonymous.Admin.SiteSettings.BootstrapModeMinUsers bootstrapmodeminusers = new Anonymous.Admin.SiteSettings.BootstrapModeMinUsers();
            public final Anonymous.Admin.SiteSettings.AutomaticallyUnpinTopics automaticallyunpintopics = new Anonymous.Admin.SiteSettings.AutomaticallyUnpinTopics();
            public final Anonymous.Admin.SiteSettings.ReadTimeWordCount readtimewordcount = new Anonymous.Admin.SiteSettings.ReadTimeWordCount();
            public final Anonymous.Admin.SiteSettings.TopicPageTitleIncludesCategory topicpagetitleincludescategory = new Anonymous.Admin.SiteSettings.TopicPageTitleIncludesCategory();
            public final Anonymous.Admin.SiteSettings.NativeAppInstallBanner nativeappinstallbanner = new Anonymous.Admin.SiteSettings.NativeAppInstallBanner();
            public final Anonymous.Admin.SiteSettings.DefaultEmailDigestFrequency defaultemaildigestfrequency = new Anonymous.Admin.SiteSettings.DefaultEmailDigestFrequency();
            public final Anonymous.Admin.SiteSettings.DefaultIncludeTl0InDigests defaultincludetl0indigests = new Anonymous.Admin.SiteSettings.DefaultIncludeTl0InDigests();
            public final Anonymous.Admin.SiteSettings.DefaultEmailPrivateMessages defaultemailprivatemessages = new Anonymous.Admin.SiteSettings.DefaultEmailPrivateMessages();
            public final Anonymous.Admin.SiteSettings.DefaultEmailDirect defaultemaildirect = new Anonymous.Admin.SiteSettings.DefaultEmailDirect();
            public final Anonymous.Admin.SiteSettings.DefaultEmailMailingListMode defaultemailmailinglistmode = new Anonymous.Admin.SiteSettings.DefaultEmailMailingListMode();
            public final Anonymous.Admin.SiteSettings.DefaultEmailMailingListModeFrequency defaultemailmailinglistmodefrequency = new Anonymous.Admin.SiteSettings.DefaultEmailMailingListModeFrequency();
            public final Anonymous.Admin.SiteSettings.DisableMailingListMode disablemailinglistmode = new Anonymous.Admin.SiteSettings.DisableMailingListMode();
            public final Anonymous.Admin.SiteSettings.DefaultEmailAlways defaultemailalways = new Anonymous.Admin.SiteSettings.DefaultEmailAlways();
            public final Anonymous.Admin.SiteSettings.DefaultEmailPreviousReplies defaultemailpreviousreplies = new Anonymous.Admin.SiteSettings.DefaultEmailPreviousReplies();
            public final Anonymous.Admin.SiteSettings.DefaultEmailInReplyTo defaultemailinreplyto = new Anonymous.Admin.SiteSettings.DefaultEmailInReplyTo();
            public final Anonymous.Admin.SiteSettings.DefaultOtherNewTopicDurationMinutes defaultothernewtopicdurationminutes = new Anonymous.Admin.SiteSettings.DefaultOtherNewTopicDurationMinutes();
            public final Anonymous.Admin.SiteSettings.DefaultOtherAutoTrackTopicAfterMsecs defaultotherautotracktopicaftermsecs = new Anonymous.Admin.SiteSettings.DefaultOtherAutoTrackTopicAfterMsecs();
            public final Anonymous.Admin.SiteSettings.DefaultOtherNotificationLevelWhenReplying defaultothernotificationlevelwhenreplying = new Anonymous.Admin.SiteSettings.DefaultOtherNotificationLevelWhenReplying();
            public final Anonymous.Admin.SiteSettings.DefaultOtherExternalLinksInNewTab defaultotherexternallinksinnewtab = new Anonymous.Admin.SiteSettings.DefaultOtherExternalLinksInNewTab();
            public final Anonymous.Admin.SiteSettings.DefaultOtherEnableQuoting defaultotherenablequoting = new Anonymous.Admin.SiteSettings.DefaultOtherEnableQuoting();
            public final Anonymous.Admin.SiteSettings.DefaultOtherDynamicFavicon defaultotherdynamicfavicon = new Anonymous.Admin.SiteSettings.DefaultOtherDynamicFavicon();
            public final Anonymous.Admin.SiteSettings.DefaultOtherDisableJumpReply defaultotherdisablejumpreply = new Anonymous.Admin.SiteSettings.DefaultOtherDisableJumpReply();
            public final Anonymous.Admin.SiteSettings.DefaultOtherLikeNotificationFrequency defaultotherlikenotificationfrequency = new Anonymous.Admin.SiteSettings.DefaultOtherLikeNotificationFrequency();
            public final Anonymous.Admin.SiteSettings.DefaultTopicsAutomaticUnpin defaulttopicsautomaticunpin = new Anonymous.Admin.SiteSettings.DefaultTopicsAutomaticUnpin();
            public final Anonymous.Admin.SiteSettings.DefaultCategoriesTracking defaultcategoriestracking = new Anonymous.Admin.SiteSettings.DefaultCategoriesTracking();
            public final Anonymous.Admin.SiteSettings.DefaultCategoriesMuted defaultcategoriesmuted = new Anonymous.Admin.SiteSettings.DefaultCategoriesMuted();
            public final Anonymous.Admin.SiteSettings.DefaultCategoriesWatchingFirstPost defaultcategorieswatchingfirstpost = new Anonymous.Admin.SiteSettings.DefaultCategoriesWatchingFirstPost();
            public final Anonymous.Admin.SiteSettings.MaxUserApiReqsPerDay maxuserapireqsperday = new Anonymous.Admin.SiteSettings.MaxUserApiReqsPerDay();
            public final Anonymous.Admin.SiteSettings.MaxUserApiReqsPerMinute maxuserapireqsperminute = new Anonymous.Admin.SiteSettings.MaxUserApiReqsPerMinute();
            public final Anonymous.Admin.SiteSettings.AllowUserApiKeys allowuserapikeys = new Anonymous.Admin.SiteSettings.AllowUserApiKeys();
            public final Anonymous.Admin.SiteSettings.AllowUserApiKeyScopes allowuserapikeyscopes = new Anonymous.Admin.SiteSettings.AllowUserApiKeyScopes();
            public final Anonymous.Admin.SiteSettings.MaxApiKeysPerUser maxapikeysperuser = new Anonymous.Admin.SiteSettings.MaxApiKeysPerUser();
            public final Anonymous.Admin.SiteSettings.MinTrustLevelForUserApiKey mintrustlevelforuserapikey = new Anonymous.Admin.SiteSettings.MinTrustLevelForUserApiKey();
            public final Anonymous.Admin.SiteSettings.AllowedUserApiPushUrls alloweduserapipushurls = new Anonymous.Admin.SiteSettings.AllowedUserApiPushUrls();
            public final Anonymous.Admin.SiteSettings.AllowedUserApiAuthRedirects alloweduserapiauthredirects = new Anonymous.Admin.SiteSettings.AllowedUserApiAuthRedirects();
            public final Anonymous.Admin.SiteSettings.TaggingEnabled taggingenabled = new Anonymous.Admin.SiteSettings.TaggingEnabled();
            public final Anonymous.Admin.SiteSettings.TagStyle tagstyle = new Anonymous.Admin.SiteSettings.TagStyle();
            public final Anonymous.Admin.SiteSettings.MaxTagsPerTopic maxtagspertopic = new Anonymous.Admin.SiteSettings.MaxTagsPerTopic();
            public final Anonymous.Admin.SiteSettings.MaxTagLength maxtaglength = new Anonymous.Admin.SiteSettings.MaxTagLength();
            public final Anonymous.Admin.SiteSettings.MinTrustToCreateTag mintrusttocreatetag = new Anonymous.Admin.SiteSettings.MinTrustToCreateTag();
            public final Anonymous.Admin.SiteSettings.MinTrustLevelToTagTopics mintrustleveltotagtopics = new Anonymous.Admin.SiteSettings.MinTrustLevelToTagTopics();
            public final Anonymous.Admin.SiteSettings.MaxTagSearchResults maxtagsearchresults = new Anonymous.Admin.SiteSettings.MaxTagSearchResults();
            public final Anonymous.Admin.SiteSettings.ShowFilterByTag showfilterbytag = new Anonymous.Admin.SiteSettings.ShowFilterByTag();
            public final Anonymous.Admin.SiteSettings.MaxTagsInFilterList maxtagsinfilterlist = new Anonymous.Admin.SiteSettings.MaxTagsInFilterList();
            public final Anonymous.Admin.SiteSettings.TagsSortAlphabetically tagssortalphabetically = new Anonymous.Admin.SiteSettings.TagsSortAlphabetically();
            public final Anonymous.Admin.SiteSettings.StaffTags stafftags = new Anonymous.Admin.SiteSettings.StaffTags();
            public final Anonymous.Admin.SiteSettings.SuppressOverlappingTagsInList suppressoverlappingtagsinlist = new Anonymous.Admin.SiteSettings.SuppressOverlappingTagsInList();
            public final Anonymous.Admin.SiteSettings.RemoveMutedTagsFromLatest removemutedtagsfromlatest = new Anonymous.Admin.SiteSettings.RemoveMutedTagsFromLatest();
            public final Anonymous.Admin.SiteSettings.DetailsEnabled detailsenabled = new Anonymous.Admin.SiteSettings.DetailsEnabled();
            public final Anonymous.Admin.SiteSettings.DailyPerformanceReport dailyperformancereport = new Anonymous.Admin.SiteSettings.DailyPerformanceReport();
            public final Anonymous.Admin.SiteSettings.PollEnabled pollenabled = new Anonymous.Admin.SiteSettings.PollEnabled();
            public final Anonymous.Admin.SiteSettings.PollMaximumOptions pollmaximumoptions = new Anonymous.Admin.SiteSettings.PollMaximumOptions();
            public final Anonymous.Admin.SiteSettings.PollEditWindowMins polleditwindowmins = new Anonymous.Admin.SiteSettings.PollEditWindowMins();
            public final Anonymous.Admin.SiteSettings.DiscourseNarrativeBotEnabled discoursenarrativebotenabled = new Anonymous.Admin.SiteSettings.DiscourseNarrativeBotEnabled();
            public final Anonymous.Admin.SiteSettings.DisableDiscourseNarrativeBotWelcomePost disablediscoursenarrativebotwelcomepost = new Anonymous.Admin.SiteSettings.DisableDiscourseNarrativeBotWelcomePost();
            public final Anonymous.Admin.SiteSettings.DiscourseNarrativeBotDisablePublicReplies discoursenarrativebotdisablepublicreplies = new Anonymous.Admin.SiteSettings.DiscourseNarrativeBotDisablePublicReplies();
            public final Anonymous.Admin.SiteSettings.DiscourseNarrativeBotIgnoredUsernames discoursenarrativebotignoredusernames = new Anonymous.Admin.SiteSettings.DiscourseNarrativeBotIgnoredUsernames();
            public final Anonymous.Admin.SiteSettings.DiscourseNarrativeBotWelcomePostDelay discoursenarrativebotwelcomepostdelay = new Anonymous.Admin.SiteSettings.DiscourseNarrativeBotWelcomePostDelay();
            public final Anonymous.Admin.SiteSettings.DiscourseNarrativeBotWelcomePostType discoursenarrativebotwelcomeposttype = new Anonymous.Admin.SiteSettings.DiscourseNarrativeBotWelcomePostType();

            public class ActiveUserRateLimitSecs {

                /**
                 * 
                 * <p>
                 * active user rate limit secs
                 * </p>
                 * 
                 * @param active_user_rate_limit_secs
                 *     "How frequently we update the 'last_seen_at' field, in seconds"
                 *     
                 */
                public void put(long active_user_rate_limit_secs) {
                    String url = ("https://discourse.example.com//admin/site_settings/active_user_rate_limit_secs");
                    Map<String, Object> content = new HashMap<>();
                    content.put("active_user_rate_limit_secs", active_user_rate_limit_secs);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AddRelNofollowToUserContent {

                /**
                 * 
                 * <p>
                 * add rel nofollow to user content
                 * </p>
                 * 
                 * @param add_rel_nofollow_to_user_content
                 *     'Add rel nofollow to all submitted user content, except for internal links (including parent domains). If you change this, you must rebake all posts with: "rake posts:rebake"'
                 *     
                 */
                public void put(boolean add_rel_nofollow_to_user_content) {
                    String url = ("https://discourse.example.com//admin/site_settings/add_rel_nofollow_to_user_content");
                    Map<String, Object> content = new HashMap<>();
                    content.put("add_rel_nofollow_to_user_content", add_rel_nofollow_to_user_content);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AlertAdminsIfErrorsPerHour {

                /**
                 * 
                 * <p>
                 * alert admins if errors per hour
                 * </p>
                 * 
                 * @param alert_admins_if_errors_per_hour
                 *     "Number of errors per hour in order to trigger an admin alert. A value of 0 disables this feature. NOTE: requires restart."
                 *     
                 */
                public void put(long alert_admins_if_errors_per_hour) {
                    String url = ("https://discourse.example.com//admin/site_settings/alert_admins_if_errors_per_hour");
                    Map<String, Object> content = new HashMap<>();
                    content.put("alert_admins_if_errors_per_hour", alert_admins_if_errors_per_hour);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AlertAdminsIfErrorsPerMinute {

                /**
                 * 
                 * <p>
                 * alert admins if errors per minute
                 * </p>
                 * 
                 * @param alert_admins_if_errors_per_minute
                 *     "Number of errors per minute in order to trigger an admin alert. A value of 0 disables this feature. NOTE: requires restart."
                 *     
                 */
                public void put(long alert_admins_if_errors_per_minute) {
                    String url = ("https://discourse.example.com//admin/site_settings/alert_admins_if_errors_per_minute");
                    Map<String, Object> content = new HashMap<>();
                    content.put("alert_admins_if_errors_per_minute", alert_admins_if_errors_per_minute);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowAllAttachmentsForGroupMessages {

                /**
                 * 
                 * <p>
                 * allow all attachments for group messages
                 * </p>
                 * 
                 * @param allow_all_attachments_for_group_messages
                 *     "Allow all email attachments for group messages."
                 *     
                 */
                public void put(boolean allow_all_attachments_for_group_messages) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_all_attachments_for_group_messages");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_all_attachments_for_group_messages", allow_all_attachments_for_group_messages);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowAnimatedAvatars {

                /**
                 * 
                 * <p>
                 * allow animated avatars
                 * </p>
                 * 
                 * @param allow_animated_avatars
                 *     "Allow users to use animated gif profile pictures. WARNING: run the avatars:refresh rake task after changing this setting."
                 *     
                 */
                public void put(boolean allow_animated_avatars) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_animated_avatars");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_animated_avatars", allow_animated_avatars);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowAnimatedThumbnails {

                /**
                 * 
                 * <p>
                 * allow animated thumbnails
                 * </p>
                 * 
                 * @param allow_animated_thumbnails
                 *     "Generate animated thumbnails of animated gifs."
                 *     
                 */
                public void put(boolean allow_animated_thumbnails) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_animated_thumbnails");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_animated_thumbnails", allow_animated_thumbnails);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowAnonymousPosting {

                /**
                 * 
                 * <p>
                 * allow anonymous posting
                 * </p>
                 * 
                 * @param allow_anonymous_posting
                 */
                public void put(boolean allow_anonymous_posting) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_anonymous_posting");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_anonymous_posting", allow_anonymous_posting);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowDuplicateTopicTitles {

                /**
                 * 
                 * <p>
                 * allow duplicate topic titles
                 * </p>
                 * 
                 * @param allow_duplicate_topic_titles
                 */
                public void put(boolean allow_duplicate_topic_titles) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_duplicate_topic_titles");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_duplicate_topic_titles", allow_duplicate_topic_titles);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowedHrefSchemes {

                /**
                 * 
                 * <p>
                 * allowed href schemes
                 * </p>
                 * 
                 * @param allowed_href_schemes
                 */
                public void put(String allowed_href_schemes) {
                    String url = ("https://discourse.example.com//admin/site_settings/allowed_href_schemes");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allowed_href_schemes", allowed_href_schemes);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowedUserApiAuthRedirects {

                /**
                 * 
                 * <p>
                 * "allowed user api auth redirects"
                 * </p>
                 * 
                 * @param allowed_user_api_auth_redirects
                 *     "Allowed URL for authentication redirect for user API keys"
                 *     
                 */
                public void put(String allowed_user_api_auth_redirects) {
                    String url = ("https://discourse.example.com//admin/site_settings/allowed_user_api_auth_redirects");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allowed_user_api_auth_redirects", allowed_user_api_auth_redirects);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowedUserApiPushUrls {

                /**
                 * 
                 * <p>
                 * "allowed user api push urls"
                 * </p>
                 * 
                 * @param allowed_user_api_push_urls
                 *     "Allowed URLs for server push to user API"
                 *     
                 */
                public void put(String allowed_user_api_push_urls) {
                    String url = ("https://discourse.example.com//admin/site_settings/allowed_user_api_push_urls");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allowed_user_api_push_urls", allowed_user_api_push_urls);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowHtmlTables {

                /**
                 * 
                 * <p>
                 * allow html tables
                 * </p>
                 * 
                 * @param allow_html_tables
                 */
                public void put(boolean allow_html_tables) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_html_tables");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_html_tables", allow_html_tables);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowIndexInRobotsTxt {

                /**
                 * 
                 * <p>
                 * allow index in robots txt
                 * </p>
                 * 
                 * @param allow_index_in_robots_txt
                 *     "Specify in robots.txt that this site is allowed to be indexed by web search engines."
                 *     
                 */
                public void put(boolean allow_index_in_robots_txt) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_index_in_robots_txt");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_index_in_robots_txt", allow_index_in_robots_txt);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowModeratorsToCreateCategories {

                /**
                 * 
                 * <p>
                 * allow moderators to create categories
                 * </p>
                 * 
                 * @param allow_moderators_to_create_categories
                 *     "Allow moderators to create new categories"
                 *     
                 */
                public void put(boolean allow_moderators_to_create_categories) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_moderators_to_create_categories");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_moderators_to_create_categories", allow_moderators_to_create_categories);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowNewRegistrations {

                /**
                 * 
                 * <p>
                 * Update allow new registrations
                 * </p>
                 * 
                 * @param allow_new_registrations
                 */
                public void put(boolean allow_new_registrations) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_new_registrations");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_new_registrations", allow_new_registrations);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowProfileBackgrounds {

                /**
                 * 
                 * <p>
                 * allow profile backgrounds
                 * </p>
                 * 
                 * @param allow_profile_backgrounds
                 *     "Allow users to upload profile backgrounds."
                 *     
                 */
                public void put(boolean allow_profile_backgrounds) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_profile_backgrounds");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_profile_backgrounds", allow_profile_backgrounds);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowRestore {

                /**
                 * 
                 * <p>
                 * allow_restore
                 * </p>
                 * 
                 * @param allow_restore
                 *     "Allow restore, which can replace ALL site data! Leave false unless you plan to restore a backup"
                 *     
                 */
                public void put(boolean allow_restore) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_restore");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_restore", allow_restore);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowUncategorizedTopics {

                /**
                 * 
                 * <p>
                 * allow uncategorized topics
                 * </p>
                 * 
                 * @param allow_uncategorized_topics
                 */
                public void put(boolean allow_uncategorized_topics) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_uncategorized_topics");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_uncategorized_topics", allow_uncategorized_topics);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowUploadedAvatars {

                /**
                 * 
                 * <p>
                 * allow uploaded avatars
                 * </p>
                 * 
                 * @param allow_uploaded_avatars
                 *     "Allow users to upload custom profile pictures."
                 *     
                 */
                public void put(boolean allow_uploaded_avatars) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_uploaded_avatars");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_uploaded_avatars", allow_uploaded_avatars);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowUppercasePosts {

                /**
                 * 
                 * <p>
                 * allow_uppercase_posts
                 * </p>
                 * 
                 * @param allow_uppercase_posts
                 */
                public void put(boolean allow_uppercase_posts) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_uppercase_posts");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_uppercase_posts", allow_uppercase_posts);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowUserApiKeys {

                /**
                 * 
                 * <p>
                 * "allow user api keys"
                 * </p>
                 * 
                 * @param allow_user_api_keys
                 *     "Allow generation of user API keys"
                 *     
                 */
                public void put(boolean allow_user_api_keys) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_user_api_keys");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_user_api_keys", allow_user_api_keys);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowUserApiKeyScopes {

                /**
                 * 
                 * <p>
                 * "allow user api key scopes"
                 * </p>
                 * 
                 * @param allow_user_api_key_scopes
                 *     "List of scopes allowed for user API keys"
                 *     
                 */
                public void put(String allow_user_api_key_scopes) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_user_api_key_scopes");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_user_api_key_scopes", allow_user_api_key_scopes);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AllowUserLocale {

                /**
                 * 
                 * <p>
                 * Update allow user locale
                 * </p>
                 * 
                 * @param allow_user_locale
                 */
                public void put(boolean allow_user_locale) {
                    String url = ("https://discourse.example.com//admin/site_settings/allow_user_locale");
                    Map<String, Object> content = new HashMap<>();
                    content.put("allow_user_locale", allow_user_locale);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AlternativeReplyByEmailAddresses {

                /**
                 * 
                 * <p>
                 * alternative reply by email addresses
                 * </p>
                 * 
                 * @param alternative_reply_by_email_addresses
                 *     List of alternative templates for reply by email incoming email addresses.
                 */
                public void put(String alternative_reply_by_email_addresses) {
                    String url = ("https://discourse.example.com//admin/site_settings/alternative_reply_by_email_addresses");
                    Map<String, Object> content = new HashMap<>();
                    content.put("alternative_reply_by_email_addresses", alternative_reply_by_email_addresses);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AlwaysShowTrimmedContent {

                /**
                 * 
                 * <p>
                 * always show trimmed content
                 * </p>
                 * 
                 * @param always_show_trimmed_content
                 *     Always show trimmed part of incoming emails. WARNING: might reveal email addresses.
                 */
                public void put(boolean always_show_trimmed_content) {
                    String url = ("https://discourse.example.com//admin/site_settings/always_show_trimmed_content");
                    Map<String, Object> content = new HashMap<>();
                    content.put("always_show_trimmed_content", always_show_trimmed_content);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AnonPollingInterval {

                /**
                 * 
                 * <p>
                 * anon polling interval
                 * </p>
                 * 
                 * @param anon_polling_interval
                 *     "How often should anonymous clients poll in milliseconds"
                 *     
                 */
                public void put(long anon_polling_interval) {
                    String url = ("https://discourse.example.com//admin/site_settings/anon_polling_interval");
                    Map<String, Object> content = new HashMap<>();
                    content.put("anon_polling_interval", anon_polling_interval);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AnonymousAccountDurationMinutes {

                /**
                 * 
                 * <p>
                 * anonymous account duration minutes
                 * </p>
                 * 
                 * @param anonymous_account_duration_minutes
                 */
                public void put(long anonymous_account_duration_minutes) {
                    String url = ("https://discourse.example.com//admin/site_settings/anonymous_account_duration_minutes");
                    Map<String, Object> content = new HashMap<>();
                    content.put("anonymous_account_duration_minutes", anonymous_account_duration_minutes);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AnonymousPostingMinTrustLevel {

                /**
                 * 
                 * <p>
                 * anonymous posting min trust level
                 * </p>
                 * 
                 * @param anonymous_posting_min_trust_level
                 */
                public void put(long anonymous_posting_min_trust_level) {
                    String url = ("https://discourse.example.com//admin/site_settings/anonymous_posting_min_trust_level");
                    Map<String, Object> content = new HashMap<>();
                    content.put("anonymous_posting_min_trust_level", anonymous_posting_min_trust_level);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AppleTouchIconUrl {

                /**
                 * 
                 * <p>
                 * Update the apple touch icon url
                 * </p>
                 * 
                 * @param apple_touch_icon_url
                 */
                public void put(String apple_touch_icon_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/apple_touch_icon_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("apple_touch_icon_url", apple_touch_icon_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ApproveNewTopicsUnlessTrustLevel {

                /**
                 * 
                 * <p>
                 * approve new topics unless trust level
                 * </p>
                 * 
                 * @param approve_new_topics_unless_trust_level
                 */
                public void put(long approve_new_topics_unless_trust_level) {
                    String url = ("https://discourse.example.com//admin/site_settings/approve_new_topics_unless_trust_level");
                    Map<String, Object> content = new HashMap<>();
                    content.put("approve_new_topics_unless_trust_level", approve_new_topics_unless_trust_level);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ApprovePostCount {

                /**
                 * 
                 * <p>
                 * approve post count
                 * </p>
                 * 
                 * @param approve_post_count
                 */
                public void put(long approve_post_count) {
                    String url = ("https://discourse.example.com//admin/site_settings/approve_post_count");
                    Map<String, Object> content = new HashMap<>();
                    content.put("approve_post_count", approve_post_count);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ApproveUnlessTrustLevel {

                /**
                 * 
                 * <p>
                 * approve unless trust level
                 * </p>
                 * 
                 * @param approve_unless_trust_level
                 */
                public void put(long approve_unless_trust_level) {
                    String url = ("https://discourse.example.com//admin/site_settings/approve_unless_trust_level");
                    Map<String, Object> content = new HashMap<>();
                    content.put("approve_unless_trust_level", approve_unless_trust_level);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AttachmentContentTypeBlacklist {

                /**
                 * 
                 * <p>
                 * attachment content type blacklist
                 * </p>
                 * 
                 * @param attachment_content_type_blacklist
                 *     Pipe delimited list of keywords used to blacklist attachments based on the content type.
                 */
                public void put(String attachment_content_type_blacklist) {
                    String url = ("https://discourse.example.com//admin/site_settings/attachment_content_type_blacklist");
                    Map<String, Object> content = new HashMap<>();
                    content.put("attachment_content_type_blacklist", attachment_content_type_blacklist);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AttachmentFilenameBlacklist {

                /**
                 * 
                 * <p>
                 * attachment filename blacklist
                 * </p>
                 * 
                 * @param attachment_filename_blacklist
                 *     Pipe delimited list of keywords used to blacklist attachments based on the filename.
                 */
                public void put(String attachment_filename_blacklist) {
                    String url = ("https://discourse.example.com//admin/site_settings/attachment_filename_blacklist");
                    Map<String, Object> content = new HashMap<>();
                    content.put("attachment_filename_blacklist", attachment_filename_blacklist);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AuthorizedExtensions {

                /**
                 * 
                 * <p>
                 * authorized extensions
                 * </p>
                 * 
                 * @param authorized_extensions
                 *     A pipe delimited list of file extensions allowed for upload (use "*" to enable all file types)
                 */
                public void put(String authorized_extensions) {
                    String url = ("https://discourse.example.com//admin/site_settings/authorized_extensions");
                    Map<String, Object> content = new HashMap<>();
                    content.put("authorized_extensions", authorized_extensions);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AutoBlockFastTypersMaxTrustLevel {

                /**
                 * 
                 * <p>
                 * auto black fast typers max trust level
                 * </p>
                 * 
                 * @param auto_block_fast_typers_max_trust_level
                 *     "Maximum trust level to auto block fast typers"
                 *     
                 */
                public void put(long auto_block_fast_typers_max_trust_level) {
                    String url = ("https://discourse.example.com//admin/site_settings/auto_block_fast_typers_max_trust_level");
                    Map<String, Object> content = new HashMap<>();
                    content.put("auto_block_fast_typers_max_trust_level", auto_block_fast_typers_max_trust_level);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AutoBlockFastTypersOnFirstPost {

                /**
                 * 
                 * <p>
                 * auto block fast typers on first post
                 * </p>
                 * 
                 * @param auto_block_fast_typers_on_first_post
                 *     "Automatically block users that do not meet min_first_post_typing_time"
                 *     
                 */
                public void put(boolean auto_block_fast_typers_on_first_post) {
                    String url = ("https://discourse.example.com//admin/site_settings/auto_block_fast_typers_on_first_post");
                    Map<String, Object> content = new HashMap<>();
                    content.put("auto_block_fast_typers_on_first_post", auto_block_fast_typers_on_first_post);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AutoBlockFirstPostRegex {

                /**
                 * 
                 * <p>
                 * auto block first post regex
                 * </p>
                 * 
                 * @param auto_block_first_post_regex
                 *     "Case insensitive regex that if passed will cause first post by user to be blocked and sent to approval queue. Example: raging|a[bc]a , will cause all posts containing raging or aba or aca to be blocked on first. Only applies to first post."
                 *     
                 */
                public void put(String auto_block_first_post_regex) {
                    String url = ("https://discourse.example.com//admin/site_settings/auto_block_first_post_regex");
                    Map<String, Object> content = new HashMap<>();
                    content.put("auto_block_first_post_regex", auto_block_first_post_regex);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AutoCloseMessagesPostCount {

                /**
                 * 
                 * <p>
                 * auto close messages post count
                 * </p>
                 * 
                 * @param auto_close_messages_post_count
                 */
                public void put(long auto_close_messages_post_count) {
                    String url = ("https://discourse.example.com//admin/site_settings/auto_close_messages_post_count");
                    Map<String, Object> content = new HashMap<>();
                    content.put("auto_close_messages_post_count", auto_close_messages_post_count);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AutoCloseTopicsPostCount {

                /**
                 * 
                 * <p>
                 * auto close topics post count
                 * </p>
                 * 
                 * @param auto_close_topics_post_count
                 */
                public void put(long auto_close_topics_post_count) {
                    String url = ("https://discourse.example.com//admin/site_settings/auto_close_topics_post_count");
                    Map<String, Object> content = new HashMap<>();
                    content.put("auto_close_topics_post_count", auto_close_topics_post_count);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AutoGeneratedWhitelist {

                /**
                 * 
                 * <p>
                 * auto generated whitelist
                 * </p>
                 * 
                 * @param auto_generated_whitelist
                 *     List of email addresses that won't be checked for auto-generated content.
                 */
                public void put(String auto_generated_whitelist) {
                    String url = ("https://discourse.example.com//admin/site_settings/auto_generated_whitelist");
                    Map<String, Object> content = new HashMap<>();
                    content.put("auto_generated_whitelist", auto_generated_whitelist);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AutohighlightAllCode {

                /**
                 * 
                 * <p>
                 * autohighlight all code
                 * </p>
                 * 
                 * @param autohighlight_all_code
                 */
                public void put(boolean autohighlight_all_code) {
                    String url = ("https://discourse.example.com//admin/site_settings/autohighlight_all_code");
                    Map<String, Object> content = new HashMap<>();
                    content.put("autohighlight_all_code", autohighlight_all_code);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AutomaticallyDownloadGravatars {

                /**
                 * 
                 * <p>
                 * automatically download gravatars
                 * </p>
                 * 
                 * @param automatically_download_gravatars
                 *     "Download Gravatars for users upon account creation or email change."
                 *     
                 */
                public void put(boolean automatically_download_gravatars) {
                    String url = ("https://discourse.example.com//admin/site_settings/automatically_download_gravatars");
                    Map<String, Object> content = new HashMap<>();
                    content.put("automatically_download_gravatars", automatically_download_gravatars);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AutomaticallyUnpinTopics {

                /**
                 * 
                 * <p>
                 * automatically unpin topics
                 * </p>
                 * 
                 * @param automatically_unpin_topics
                 *     "Automatically unpin topics when the user reaches the bottom."
                 *     
                 */
                public void put(boolean automatically_unpin_topics) {
                    String url = ("https://discourse.example.com//admin/site_settings/automatically_unpin_topics");
                    Map<String, Object> content = new HashMap<>();
                    content.put("automatically_unpin_topics", automatically_unpin_topics);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AutomaticBackupsEnabled {

                /**
                 * 
                 * <p>
                 * automatic backups enabled
                 * </p>
                 * 
                 * @param automatic_backups_enabled
                 *     "Run automatic backups as defined in backup frequency"
                 *     
                 */
                public void put(boolean automatic_backups_enabled) {
                    String url = ("https://discourse.example.com//admin/site_settings/automatic_backups_enabled");
                    Map<String, Object> content = new HashMap<>();
                    content.put("automatic_backups_enabled", automatic_backups_enabled);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AutoRespondToFlagActions {

                /**
                 * 
                 * <p>
                 * auto respond to flag actions
                 * </p>
                 * 
                 * @param auto_respond_to_flag_actions
                 *     "Enable automatic reply when disposing a flag."
                 *     
                 */
                public void put(boolean auto_respond_to_flag_actions) {
                    String url = ("https://discourse.example.com//admin/site_settings/auto_respond_to_flag_actions");
                    Map<String, Object> content = new HashMap<>();
                    content.put("auto_respond_to_flag_actions", auto_respond_to_flag_actions);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class AvatarSizes {

                /**
                 * 
                 * <p>
                 * avatar sizes
                 * </p>
                 * 
                 * @param avatar_sizes
                 *     "List of automatically generated avatar sizes."
                 *     
                 */
                public void put(String avatar_sizes) {
                    String url = ("https://discourse.example.com//admin/site_settings/avatar_sizes");
                    Map<String, Object> content = new HashMap<>();
                    content.put("avatar_sizes", avatar_sizes);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class BackgroundPollingInterval {

                /**
                 * 
                 * <p>
                 * background polling interval
                 * </p>
                 * 
                 * @param background_polling_interval
                 *     "How often should the clients poll in milliseconds (when the window is in the background)"
                 *     
                 */
                public void put(long background_polling_interval) {
                    String url = ("https://discourse.example.com//admin/site_settings/background_polling_interval");
                    Map<String, Object> content = new HashMap<>();
                    content.put("background_polling_interval", background_polling_interval);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class BackupFrequency {

                /**
                 * 
                 * <p>
                 * backup frequency
                 * </p>
                 * 
                 * @param backup_frequency
                 *     "How frequently we create a site backup, in days."
                 *     
                 */
                public void put(long backup_frequency) {
                    String url = ("https://discourse.example.com//admin/site_settings/backup_frequency");
                    Map<String, Object> content = new HashMap<>();
                    content.put("backup_frequency", backup_frequency);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class BackupTimeOfDay {

                /**
                 * 
                 * <p>
                 * backup time of day
                 * </p>
                 * 
                 * @param backup_time_of_day
                 *     "Time of day UTC when the backup should occur."
                 *     
                 */
                public void put(String backup_time_of_day) {
                    String url = ("https://discourse.example.com//admin/site_settings/backup_time_of_day");
                    Map<String, Object> content = new HashMap<>();
                    content.put("backup_time_of_day", backup_time_of_day);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class BackupWithUploads {

                /**
                 * 
                 * <p>
                 * backup with uploads
                 * </p>
                 * 
                 * @param backup_with_uploads
                 *     "Include uploads in scheduled backups. Disabling this will only backup the database."
                 *     
                 */
                public void put(boolean backup_with_uploads) {
                    String url = ("https://discourse.example.com//admin/site_settings/backup_with_uploads");
                    Map<String, Object> content = new HashMap<>();
                    content.put("backup_with_uploads", backup_with_uploads);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class BlockAutoGeneratedEmails {

                /**
                 * 
                 * <p>
                 * block auto generated emails
                 * </p>
                 * 
                 * @param block_auto_generated_emails
                 *     Block incoming emails identified as being auto generated.
                 */
                public void put(boolean block_auto_generated_emails) {
                    String url = ("https://discourse.example.com//admin/site_settings/block_auto_generated_emails");
                    Map<String, Object> content = new HashMap<>();
                    content.put("block_auto_generated_emails", block_auto_generated_emails);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class BlockCommonPasswords {

                /**
                 * 
                 * <p>
                 * block common passwords
                 * </p>
                 * 
                 * @param block_common_passwords
                 */
                public void put(boolean block_common_passwords) {
                    String url = ("https://discourse.example.com//admin/site_settings/block_common_passwords");
                    Map<String, Object> content = new HashMap<>();
                    content.put("block_common_passwords", block_common_passwords);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class BodyMinEntropy {

                /**
                 * 
                 * <p>
                 * body min entropy
                 * </p>
                 * 
                 * @param body_min_entropy
                 */
                public void put(long body_min_entropy) {
                    String url = ("https://discourse.example.com//admin/site_settings/body_min_entropy");
                    Map<String, Object> content = new HashMap<>();
                    content.put("body_min_entropy", body_min_entropy);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class BootstrapModeMinUsers {

                /**
                 * 
                 * <p>
                 * bootstrap mode min users
                 * </p>
                 * 
                 * @param bootstrap_mode_min_users
                 *     "Minimum number of users required to disable bootstrap mode (set to 0 to disable)"
                 *     
                 */
                public void put(long bootstrap_mode_min_users) {
                    String url = ("https://discourse.example.com//admin/site_settings/bootstrap_mode_min_users");
                    Map<String, Object> content = new HashMap<>();
                    content.put("bootstrap_mode_min_users", bootstrap_mode_min_users);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class BounceScoreThreshold {

                /**
                 * 
                 * <p>
                 * bounce score threshold
                 * </p>
                 * 
                 * @param bounce_score_threshold
                 *     Max bounce score before we will stop emailing a user.
                 */
                public void put(long bounce_score_threshold) {
                    String url = ("https://discourse.example.com//admin/site_settings/bounce_score_threshold");
                    Map<String, Object> content = new HashMap<>();
                    content.put("bounce_score_threshold", bounce_score_threshold);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class BounceScoreThresholdDeactivate {

                /**
                 * 
                 * <p>
                 * bounce score threshold deactive
                 * </p>
                 * 
                 * @param bounce_score_threshold_deactivate
                 *     Max bounce score before we will deactivate a user.
                 */
                public void put(long bounce_score_threshold_deactivate) {
                    String url = ("https://discourse.example.com//admin/site_settings/bounce_score_threshold_deactivate");
                    Map<String, Object> content = new HashMap<>();
                    content.put("bounce_score_threshold_deactivate", bounce_score_threshold_deactivate);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CategoriesTopics {

                /**
                 * 
                 * <p>
                 * Update the number of topics to show
                 * </p>
                 * 
                 * @param categories_topics
                 */
                public void put(long categories_topics) {
                    String url = ("https://discourse.example.com//admin/site_settings/categories_topics");
                    Map<String, Object> content = new HashMap<>();
                    content.put("categories_topics", categories_topics);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CategoryColors {

                /**
                 * 
                 * <p>
                 * Update a list of hexadecimal color values
                 * </p>
                 * 
                 * @param category_colors
                 *     pipe delimited
                 */
                public void put(String category_colors) {
                    String url = ("https://discourse.example.com//admin/site_settings/category_colors");
                    Map<String, Object> content = new HashMap<>();
                    content.put("category_colors", category_colors);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CategoryStyle {

                /**
                 * 
                 * <p>
                 * Update the category style
                 * </p>
                 * 
                 * @param category_style
                 */
                public void put(discourse.example.com.structures.category_style category_style) {
                    String url = ("https://discourse.example.com//admin/site_settings/category_style");
                    Map<String, Object> content = new HashMap<>();
                    content.put("category_style", category_style);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CensoredPattern {

                /**
                 * 
                 * <p>
                 * censored pattern
                 * </p>
                 * 
                 * @param censored_pattern
                 */
                public void put(String censored_pattern) {
                    String url = ("https://discourse.example.com//admin/site_settings/censored_pattern");
                    Map<String, Object> content = new HashMap<>();
                    content.put("censored_pattern", censored_pattern);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CensoredWords {

                /**
                 * 
                 * <p>
                 * censored words
                 * </p>
                 * 
                 * @param censored_words
                 */
                public void put(String censored_words) {
                    String url = ("https://discourse.example.com//admin/site_settings/censored_words");
                    Map<String, Object> content = new HashMap<>();
                    content.put("censored_words", censored_words);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CleanOrphanUploadsGracePeriodHours {

                /**
                 * 
                 * <p>
                 * clean orphan uploads grace period hours
                 * </p>
                 * 
                 * @param clean_orphan_uploads_grace_period_hours
                 *     "Grace period (in hours) before an orphan upload is removed."
                 *     
                 */
                public void put(long clean_orphan_uploads_grace_period_hours) {
                    String url = ("https://discourse.example.com//admin/site_settings/clean_orphan_uploads_grace_period_hours");
                    Map<String, Object> content = new HashMap<>();
                    content.put("clean_orphan_uploads_grace_period_hours", clean_orphan_uploads_grace_period_hours);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CleanUpUploads {

                /**
                 * 
                 * <p>
                 * clean up uploads
                 * </p>
                 * 
                 * @param clean_up_uploads
                 *     "Remove orphan unreferenced uploads to prevent illegal hosting. WARNING: you may want to back up of your /uploads directory before enabling this setting."
                 *     
                 */
                public void put(boolean clean_up_uploads) {
                    String url = ("https://discourse.example.com//admin/site_settings/clean_up_uploads");
                    Map<String, Object> content = new HashMap<>();
                    content.put("clean_up_uploads", clean_up_uploads);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CodeFormattingStyle {

                /**
                 * 
                 * <p>
                 * code formatting style
                 * </p>
                 * 
                 * @param code_formatting_style
                 */
                public void put(discourse.example.com.structures.code_formatting_style code_formatting_style) {
                    String url = ("https://discourse.example.com//admin/site_settings/code_formatting_style");
                    Map<String, Object> content = new HashMap<>();
                    content.put("code_formatting_style", code_formatting_style);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ColdAgeDaysHigh {

                /**
                 * 
                 * <p>
                 * cold age days high
                 * </p>
                 * 
                 * @param cold_age_days_high
                 *     "After this many days of conversation, the last activity date is strongly dimmed."
                 *     
                 */
                public void put(long cold_age_days_high) {
                    String url = ("https://discourse.example.com//admin/site_settings/cold_age_days_high");
                    Map<String, Object> content = new HashMap<>();
                    content.put("cold_age_days_high", cold_age_days_high);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ColdAgeDaysLow {

                /**
                 * 
                 * <p>
                 * cold age days low
                 * </p>
                 * 
                 * @param cold_age_days_low
                 *     "After this many days of conversation, the last activity date is slightly dimmed."
                 *     
                 */
                public void put(long cold_age_days_low) {
                    String url = ("https://discourse.example.com//admin/site_settings/cold_age_days_low");
                    Map<String, Object> content = new HashMap<>();
                    content.put("cold_age_days_low", cold_age_days_low);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ColdAgeDaysMedium {

                /**
                 * 
                 * <p>
                 * cold age days medium
                 * </p>
                 * 
                 * @param cold_age_days_medium
                 *     "After this many days of conversation, the last activity date is moderately dimmed."
                 *     
                 */
                public void put(long cold_age_days_medium) {
                    String url = ("https://discourse.example.com//admin/site_settings/cold_age_days_medium");
                    Map<String, Object> content = new HashMap<>();
                    content.put("cold_age_days_medium", cold_age_days_medium);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CompanyDomain {

                /**
                 * 
                 * <p>
                 * Update the company domain
                 * </p>
                 * 
                 * @param company_domain
                 */
                public void put(String company_domain) {
                    String url = ("https://discourse.example.com//admin/site_settings/company_domain");
                    Map<String, Object> content = new HashMap<>();
                    content.put("company_domain", company_domain);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CompanyFullName {

                /**
                 * 
                 * <p>
                 * Update the company full name
                 * </p>
                 * 
                 * @param company_full_name
                 */
                public void put(String company_full_name) {
                    String url = ("https://discourse.example.com//admin/site_settings/company_full_name");
                    Map<String, Object> content = new HashMap<>();
                    content.put("company_full_name", company_full_name);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CompanyShortName {

                /**
                 * 
                 * <p>
                 * Update the company short name
                 * </p>
                 * 
                 * @param company_short_name
                 */
                public void put(String company_short_name) {
                    String url = ("https://discourse.example.com//admin/site_settings/company_short_name");
                    Map<String, Object> content = new HashMap<>();
                    content.put("company_short_name", company_short_name);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ContactEmail {

                /**
                 * 
                 * <p>
                 * Update the contact email
                 * </p>
                 * 
                 * @param contact_email
                 */
                public void put(String contact_email) {
                    String url = ("https://discourse.example.com//admin/site_settings/contact_email");
                    Map<String, Object> content = new HashMap<>();
                    content.put("contact_email", contact_email);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ContactUrl {

                /**
                 * 
                 * <p>
                 * Update the contact url
                 * </p>
                 * 
                 * @param contact_url
                 */
                public void put(String contact_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/contact_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("contact_url", contact_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ConvertPastedImagesQuality {

                /**
                 * 
                 * <p>
                 * convert pasted images quality
                 * </p>
                 * 
                 * @param convert_pasted_images_quality
                 *     "Quality of the converted JPG file (1 is lowest quality, 100 is best quality)."
                 *     
                 */
                public void put(long convert_pasted_images_quality) {
                    String url = ("https://discourse.example.com//admin/site_settings/convert_pasted_images_quality");
                    Map<String, Object> content = new HashMap<>();
                    content.put("convert_pasted_images_quality", convert_pasted_images_quality);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ConvertPastedImagesToHqJpg {

                /**
                 * 
                 * <p>
                 * convert pasted images to hq jpg
                 * </p>
                 * 
                 * @param convert_pasted_images_to_hq_jpg
                 *     "Convert pasted images to high-quality JPG files."
                 *     
                 */
                public void put(boolean convert_pasted_images_to_hq_jpg) {
                    String url = ("https://discourse.example.com//admin/site_settings/convert_pasted_images_to_hq_jpg");
                    Map<String, Object> content = new HashMap<>();
                    content.put("convert_pasted_images_to_hq_jpg", convert_pasted_images_to_hq_jpg);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CooldownMinutesAfterHidingPosts {

                /**
                 * 
                 * <p>
                 * cooldown minutes after hiding posts
                 * </p>
                 * 
                 * @param cooldown_minutes_after_hiding_posts
                 *     "Number of minutes a user must wait before they can edit a post hidden via community flagging"
                 *     
                 */
                public void put(long cooldown_minutes_after_hiding_posts) {
                    String url = ("https://discourse.example.com//admin/site_settings/cooldown_minutes_after_hiding_posts");
                    Map<String, Object> content = new HashMap<>();
                    content.put("cooldown_minutes_after_hiding_posts", cooldown_minutes_after_hiding_posts);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CorsOrigins {

                /**
                 * 
                 * <p>
                 * cors origins
                 * </p>
                 * 
                 * @param cors_origins
                 *     "Allowed origins for cross-origin requests (CORS). Each origin must include http:// or https://. The DISCOURSE_ENABLE_CORS env variable must be set to true to enable CORS."
                 *     
                 */
                public void put(String cors_origins) {
                    String url = ("https://discourse.example.com//admin/site_settings/cors_origins");
                    Map<String, Object> content = new HashMap<>();
                    content.put("cors_origins", cors_origins);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CrawlImages {

                /**
                 * 
                 * <p>
                 * crawl images
                 * </p>
                 * 
                 * @param crawl_images
                 *     Retrieve images from remote URLs to insert the correct width and height dimensions.
                 */
                public void put(boolean crawl_images) {
                    String url = ("https://discourse.example.com//admin/site_settings/crawl_images");
                    Map<String, Object> content = new HashMap<>();
                    content.put("crawl_images", crawl_images);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class CreateThumbnails {

                /**
                 * 
                 * <p>
                 * create thumbnails
                 * </p>
                 * 
                 * @param create_thumbnails
                 *     "Create thumbnails and lightbox images that are too large to fit in a post"
                 *     
                 */
                public void put(boolean create_thumbnails) {
                    String url = ("https://discourse.example.com//admin/site_settings/create_thumbnails");
                    Map<String, Object> content = new HashMap<>();
                    content.put("create_thumbnails", create_thumbnails);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DailyPerformanceReport {

                /**
                 * 
                 * <p>
                 * "daily performance report"
                 * </p>
                 * 
                 * @param daily_performance_report
                 *     "Analyze NGINX logs daily and post a Staff Only topic with details"
                 *     
                 */
                public void put(boolean daily_performance_report) {
                    String url = ("https://discourse.example.com//admin/site_settings/daily_performance_report");
                    Map<String, Object> content = new HashMap<>();
                    content.put("daily_performance_report", daily_performance_report);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultAvatars {

                /**
                 * 
                 * <p>
                 * default avatars
                 * </p>
                 * 
                 * @param default_avatars
                 *     "URLs to avatars that will be used by default for new users until they change them."
                 *     
                 */
                public void put(String default_avatars) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_avatars");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_avatars", default_avatars);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultCategoriesMuted {

                /**
                 * 
                 * <p>
                 * "default categories muted"
                 * </p>
                 * 
                 * @param default_categories_muted
                 *     "Pipe delimited category id's. List of categories that are muted by default."
                 *     
                 */
                public void put(String default_categories_muted) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_categories_muted");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_categories_muted", default_categories_muted);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultCategoriesTracking {

                /**
                 * 
                 * <p>
                 * "default categories tracking"
                 * </p>
                 * 
                 * @param default_categories_tracking
                 *     "Pipe delimited category id's. List of categories that are tracked by default."
                 *     
                 */
                public void put(String default_categories_tracking) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_categories_tracking");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_categories_tracking", default_categories_tracking);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultCategoriesWatchingFirstPost {

                /**
                 * 
                 * <p>
                 * "default categories watching first post"
                 * </p>
                 * 
                 * @param default_categories_watching_first_post
                 *     "Pipe delimited category id's. List of categories in which first post in each new topic will be watched by default."
                 *     
                 */
                public void put(String default_categories_watching_first_post) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_categories_watching_first_post");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_categories_watching_first_post", default_categories_watching_first_post);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultCodeLang {

                /**
                 * 
                 * <p>
                 * default code lang
                 * </p>
                 * 
                 * @param default_code_lang
                 */
                public void put(String default_code_lang) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_code_lang");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_code_lang", default_code_lang);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultEmailAlways {

                /**
                 * 
                 * <p>
                 * "default email always"
                 * </p>
                 * 
                 * @param default_email_always
                 *     "Send an email notification even when the user is active by default."
                 *     
                 */
                public void put(boolean default_email_always) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_email_always");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_email_always", default_email_always);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultEmailDigestFrequency {

                /**
                 * 
                 * <p>
                 * "default email digest frequency"
                 * </p>
                 * 
                 * @param default_email_digest_frequency
                 *     "How often users receive summary emails by default."
                 *     
                 */
                public void put(long default_email_digest_frequency) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_email_digest_frequency");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_email_digest_frequency", default_email_digest_frequency);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultEmailDirect {

                /**
                 * 
                 * <p>
                 * "default email direct"
                 * </p>
                 * 
                 * @param default_email_direct
                 *     "Send an email when someone quotes/replies to/mentions or invites the user by default."
                 *     
                 */
                public void put(boolean default_email_direct) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_email_direct");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_email_direct", default_email_direct);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultEmailInReplyTo {

                /**
                 * 
                 * <p>
                 * "default email in reply to"
                 * </p>
                 * 
                 * @param default_email_in_reply_to
                 *     "Include excerpt of replied to post in emails by default."
                 *     
                 */
                public void put(boolean default_email_in_reply_to) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_email_in_reply_to");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_email_in_reply_to", default_email_in_reply_to);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultEmailMailingListMode {

                /**
                 * 
                 * <p>
                 * "default email mailing list mode"
                 * </p>
                 * 
                 * @param default_email_mailing_list_mode
                 *     "Send an email for every new post by default."
                 *     
                 */
                public void put(boolean default_email_mailing_list_mode) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_email_mailing_list_mode");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_email_mailing_list_mode", default_email_mailing_list_mode);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultEmailMailingListModeFrequency {

                /**
                 * 
                 * <p>
                 * "default email mailing list mode frequency"
                 * </p>
                 * 
                 * @param default_email_mailing_list_mode_frequency
                 *     "Users who enable mailing list mode will receive emails this often by default."
                 *     
                 */
                public void put(long default_email_mailing_list_mode_frequency) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_email_mailing_list_mode_frequency");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_email_mailing_list_mode_frequency", default_email_mailing_list_mode_frequency);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultEmailPreviousReplies {

                /**
                 * 
                 * <p>
                 * "default email previous replies"
                 * </p>
                 * 
                 * @param default_email_previous_replies
                 *     "Include previous replies in emails by default."
                 *     
                 */
                public void put(long default_email_previous_replies) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_email_previous_replies");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_email_previous_replies", default_email_previous_replies);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultEmailPrivateMessages {

                /**
                 * 
                 * <p>
                 * "default email private messages"
                 * </p>
                 * 
                 * @param default_email_private_messages
                 *     "Send an email when someone messages the user by default."
                 *     
                 */
                public void put(boolean default_email_private_messages) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_email_private_messages");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_email_private_messages", default_email_private_messages);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultIncludeTl0InDigests {

                /**
                 * 
                 * <p>
                 * "default include tl0 in digests"
                 * </p>
                 * 
                 * @param default_include_tl0_in_digests
                 *     "Include posts from new users in summary emails by default. Users can change this in their preferences."
                 *     
                 */
                public void put(boolean default_include_tl0_in_digests) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_include_tl0_in_digests");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_include_tl0_in_digests", default_include_tl0_in_digests);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultInviteeTrustLevel {

                /**
                 * 
                 * <p>
                 * default invitee trust level
                 * </p>
                 * 
                 * @param default_invitee_trust_level
                 *     "Default trust level (0-4) for invited users."
                 *     
                 */
                public void put(long default_invitee_trust_level) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_invitee_trust_level");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_invitee_trust_level", default_invitee_trust_level);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultLocale {

                /**
                 * 
                 * <p>
                 * Update the default locale
                 * </p>
                 * 
                 * @param default_locale
                 */
                public void put(String default_locale) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_locale");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_locale", default_locale);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultOpengraphImageUrl {

                /**
                 * 
                 * <p>
                 * Update the default opengraph image url
                 * </p>
                 * 
                 * @param default_opengraph_image_url
                 */
                public void put(String default_opengraph_image_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_opengraph_image_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_opengraph_image_url", default_opengraph_image_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultOtherAutoTrackTopicAfterMsecs {

                /**
                 * 
                 * <p>
                 * "default other auto track topics after msecs"
                 * </p>
                 * 
                 * @param default_other_auto_track_topic_after_msecs
                 *     "Global default time before a topic is automatically tracked."
                 *     
                 */
                public void put(long default_other_auto_track_topic_after_msecs) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_other_auto_track_topic_after_msecs");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_other_auto_track_topic_after_msecs", default_other_auto_track_topic_after_msecs);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultOtherDisableJumpReply {

                /**
                 * 
                 * <p>
                 * "default other disable jump reply"
                 * </p>
                 * 
                 * @param default_other_disable_jump_reply
                 *     "Don't jump to user's post after they reply by default."
                 *     
                 */
                public void put(boolean default_other_disable_jump_reply) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_other_disable_jump_reply");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_other_disable_jump_reply", default_other_disable_jump_reply);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultOtherDynamicFavicon {

                /**
                 * 
                 * <p>
                 * default other dynamic favicon
                 * </p>
                 * 
                 * @param default_other_dynamic_favicon
                 *     "Show new/updated topic count on browser icon by default."
                 *     
                 */
                public void put(boolean default_other_dynamic_favicon) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_other_dynamic_favicon");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_other_dynamic_favicon", default_other_dynamic_favicon);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultOtherEnableQuoting {

                /**
                 * 
                 * <p>
                 * "default other enable quoting"
                 * </p>
                 * 
                 * @param default_other_enable_quoting
                 *     "Enable quote reply for highlighted text by default."
                 *     
                 */
                public void put(boolean default_other_enable_quoting) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_other_enable_quoting");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_other_enable_quoting", default_other_enable_quoting);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultOtherExternalLinksInNewTab {

                /**
                 * 
                 * <p>
                 * "default other external links in new tab"
                 * </p>
                 * 
                 * @param default_other_external_links_in_new_tab
                 *     "Open external links in a new tab by default."
                 *     
                 */
                public void put(boolean default_other_external_links_in_new_tab) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_other_external_links_in_new_tab");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_other_external_links_in_new_tab", default_other_external_links_in_new_tab);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultOtherLikeNotificationFrequency {

                /**
                 * 
                 * <p>
                 * "default other like notification frequency"
                 * </p>
                 * 
                 * @param default_other_like_notification_frequency
                 *     "Notify users on likes by default"
                 *     
                 */
                public void put(long default_other_like_notification_frequency) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_other_like_notification_frequency");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_other_like_notification_frequency", default_other_like_notification_frequency);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultOtherNewTopicDurationMinutes {

                /**
                 * 
                 * <p>
                 * "default other new topic duration minutes"
                 * </p>
                 * 
                 * @param default_other_new_topic_duration_minutes
                 *     "Global default condition for which a topic is considered new."
                 *     
                 */
                public void put(long default_other_new_topic_duration_minutes) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_other_new_topic_duration_minutes");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_other_new_topic_duration_minutes", default_other_new_topic_duration_minutes);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultOtherNotificationLevelWhenReplying {

                /**
                 * 
                 * <p>
                 * "default other notification level when replying"
                 * </p>
                 * 
                 * @param default_other_notification_level_when_replying
                 *     "Global default notification level when the user replies to a topic."
                 *     
                 */
                public void put(long default_other_notification_level_when_replying) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_other_notification_level_when_replying");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_other_notification_level_when_replying", default_other_notification_level_when_replying);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultTopicsAutomaticUnpin {

                /**
                 * 
                 * <p>
                 * "default topics automatic unpin"
                 * </p>
                 * 
                 * @param default_topics_automatic_unpin
                 *     "Automatically unpin topics when the user reaches the bottom by default."
                 *     
                 */
                public void put(boolean default_topics_automatic_unpin) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_topics_automatic_unpin");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_topics_automatic_unpin", default_topics_automatic_unpin);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DefaultTrustLevel {

                /**
                 * 
                 * <p>
                 * default trust level
                 * </p>
                 * 
                 * @param default_trust_level
                 *     "Default trust level (0-4) for all new users. WARNING! Changing this will put you at serious risk for spam."
                 *     
                 */
                public void put(long default_trust_level) {
                    String url = ("https://discourse.example.com//admin/site_settings/default_trust_level");
                    Map<String, Object> content = new HashMap<>();
                    content.put("default_trust_level", default_trust_level);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DeleteAllPostsMax {

                /**
                 * 
                 * <p>
                 * delete all posts max
                 * </p>
                 * 
                 * @param delete_all_posts_max
                 */
                public void put(long delete_all_posts_max) {
                    String url = ("https://discourse.example.com//admin/site_settings/delete_all_posts_max");
                    Map<String, Object> content = new HashMap<>();
                    content.put("delete_all_posts_max", delete_all_posts_max);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DeleteDigestEmailAfterDays {

                /**
                 * 
                 * <p>
                 * delete digest email after days
                 * </p>
                 * 
                 * @param delete_digest_email_after_days
                 */
                public void put(long delete_digest_email_after_days) {
                    String url = ("https://discourse.example.com//admin/site_settings/delete_digest_email_after_days");
                    Map<String, Object> content = new HashMap<>();
                    content.put("delete_digest_email_after_days", delete_digest_email_after_days);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DeleteDraftsOlderThanNDays {

                /**
                 * 
                 * <p>
                 * delete drafts older than n days
                 * </p>
                 * 
                 * @param delete_drafts_older_than_n_days
                 *     "Delete drafts older than (n) days."
                 *     
                 */
                public void put(long delete_drafts_older_than_n_days) {
                    String url = ("https://discourse.example.com//admin/site_settings/delete_drafts_older_than_n_days");
                    Map<String, Object> content = new HashMap<>();
                    content.put("delete_drafts_older_than_n_days", delete_drafts_older_than_n_days);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DeleteEmailLogsAfterDays {

                /**
                 * 
                 * <p>
                 * delete email logs after days
                 * </p>
                 * 
                 * @param delete_email_logs_after_days
                 *     Delete email logs after (N) days. 0 to keep indefinitely
                 *     
                 */
                public void put(long delete_email_logs_after_days) {
                    String url = ("https://discourse.example.com//admin/site_settings/delete_email_logs_after_days");
                    Map<String, Object> content = new HashMap<>();
                    content.put("delete_email_logs_after_days", delete_email_logs_after_days);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DeleteOldHiddenPosts {

                /**
                 * 
                 * <p>
                 * delete old hidden posts
                 * </p>
                 * 
                 * @param delete_old_hidden_posts
                 */
                public void put(boolean delete_old_hidden_posts) {
                    String url = ("https://discourse.example.com//admin/site_settings/delete_old_hidden_posts");
                    Map<String, Object> content = new HashMap<>();
                    content.put("delete_old_hidden_posts", delete_old_hidden_posts);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DeleteRemovedPostsAfter {

                /**
                 * 
                 * <p>
                 * delete removed posts after
                 * </p>
                 * 
                 * @param delete_removed_posts_after
                 */
                public void put(long delete_removed_posts_after) {
                    String url = ("https://discourse.example.com//admin/site_settings/delete_removed_posts_after");
                    Map<String, Object> content = new HashMap<>();
                    content.put("delete_removed_posts_after", delete_removed_posts_after);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DeleteUserMaxPostAge {

                /**
                 * 
                 * <p>
                 * delete user max post age
                 * </p>
                 * 
                 * @param delete_user_max_post_age
                 */
                public void put(long delete_user_max_post_age) {
                    String url = ("https://discourse.example.com//admin/site_settings/delete_user_max_post_age");
                    Map<String, Object> content = new HashMap<>();
                    content.put("delete_user_max_post_age", delete_user_max_post_age);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DesktopCategoryPageStyle {

                /**
                 * 
                 * <p>
                 * Update the visual style for the /categories page
                 * </p>
                 * 
                 * @param desktop_category_page_style
                 */
                public void put(discourse.example.com.structures.desktop_category_page_style desktop_category_page_style) {
                    String url = ("https://discourse.example.com//admin/site_settings/desktop_category_page_style");
                    Map<String, Object> content = new HashMap<>();
                    content.put("desktop_category_page_style", desktop_category_page_style);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DetailsEnabled {

                /**
                 * 
                 * <p>
                 * "details enabled"
                 * </p>
                 * 
                 * @param details_enabled
                 *     'Enable the details plugin. If you change this, you must rebake all posts with: "rake posts:rebake".'
                 *     
                 */
                public void put(boolean details_enabled) {
                    String url = ("https://discourse.example.com//admin/site_settings/details_enabled");
                    Map<String, Object> content = new HashMap<>();
                    content.put("details_enabled", details_enabled);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DigestLogoUrl {

                /**
                 * 
                 * <p>
                 * Update the digest logo url
                 * </p>
                 * 
                 * @param digest_logo_url
                 */
                public void put(String digest_logo_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/digest_logo_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("digest_logo_url", digest_logo_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DigestMinExcerptLength {

                /**
                 * 
                 * <p>
                 * digest min excerpt length
                 * </p>
                 * 
                 * @param digest_min_excerpt_length
                 */
                public void put(long digest_min_excerpt_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/digest_min_excerpt_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("digest_min_excerpt_length", digest_min_excerpt_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DigestOtherTopics {

                /**
                 * 
                 * <p>
                 * digest other topics
                 * </p>
                 * 
                 * @param digest_other_topics
                 */
                public void put(long digest_other_topics) {
                    String url = ("https://discourse.example.com//admin/site_settings/digest_other_topics");
                    Map<String, Object> content = new HashMap<>();
                    content.put("digest_other_topics", digest_other_topics);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DigestPosts {

                /**
                 * 
                 * <p>
                 * digest posts
                 * </p>
                 * 
                 * @param digest_posts
                 */
                public void put(long digest_posts) {
                    String url = ("https://discourse.example.com//admin/site_settings/digest_posts");
                    Map<String, Object> content = new HashMap<>();
                    content.put("digest_posts", digest_posts);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DigestSuppressCategories {

                /**
                 * 
                 * <p>
                 * digest suppress categories
                 * </p>
                 * 
                 * @param digest_suppress_categories
                 *     pipe delimited category_id's
                 */
                public void put(String digest_suppress_categories) {
                    String url = ("https://discourse.example.com//admin/site_settings/digest_suppress_categories");
                    Map<String, Object> content = new HashMap<>();
                    content.put("digest_suppress_categories", digest_suppress_categories);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DigestTopics {

                /**
                 * 
                 * <p>
                 * digest topics
                 * </p>
                 * 
                 * @param digest_topics
                 */
                public void put(long digest_topics) {
                    String url = ("https://discourse.example.com//admin/site_settings/digest_topics");
                    Map<String, Object> content = new HashMap<>();
                    content.put("digest_topics", digest_topics);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DisableAvatarEducationMessage {

                /**
                 * 
                 * <p>
                 * disable avatar education message
                 * </p>
                 * 
                 * @param disable_avatar_education_message
                 *     "Disable education message for changing avatar."
                 *     
                 */
                public void put(boolean disable_avatar_education_message) {
                    String url = ("https://discourse.example.com//admin/site_settings/disable_avatar_education_message");
                    Map<String, Object> content = new HashMap<>();
                    content.put("disable_avatar_education_message", disable_avatar_education_message);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DisableDigestEmails {

                /**
                 * 
                 * <p>
                 * disable digest emails
                 * </p>
                 * 
                 * @param digest_digest_emails
                 */
                public void put(boolean digest_digest_emails) {
                    String url = ("https://discourse.example.com//admin/site_settings/disable_digest_emails");
                    Map<String, Object> content = new HashMap<>();
                    content.put("digest_digest_emails", digest_digest_emails);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DisabledImageDownloadDomains {

                /**
                 * 
                 * <p>
                 * disabled image download domains
                 * </p>
                 * 
                 * @param disabled_image_download_domains
                 *     Remote images will never be downloaded from these domains. Pipe-delimited list.
                 */
                public void put(String disabled_image_download_domains) {
                    String url = ("https://discourse.example.com//admin/site_settings/disabled_image_download_domains");
                    Map<String, Object> content = new HashMap<>();
                    content.put("disabled_image_download_domains", disabled_image_download_domains);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DisableDiscourseNarrativeBotWelcomePost {

                /**
                 * 
                 * <p>
                 * disable discourse narrative bot welcome post
                 * </p>
                 * 
                 * @param disable_discourse_narrative_bot_welcome_post
                 *     disable discourse narrative bot welcome post
                 *     
                 */
                public void put(boolean disable_discourse_narrative_bot_welcome_post) {
                    String url = ("https://discourse.example.com//admin/site_settings/disable_discourse_narrative_bot_welcome_post");
                    Map<String, Object> content = new HashMap<>();
                    content.put("disable_discourse_narrative_bot_welcome_post", disable_discourse_narrative_bot_welcome_post);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DisableEditNotifications {

                /**
                 * 
                 * <p>
                 * disable edit notifications
                 * </p>
                 * 
                 * @param disable_edit_notifications
                 *     "Disables edit notifications by the system user when 'download_remote_images_to_local' is active."
                 *     
                 */
                public void put(boolean disable_edit_notifications) {
                    String url = ("https://discourse.example.com//admin/site_settings/disable_edit_notifications");
                    Map<String, Object> content = new HashMap<>();
                    content.put("disable_edit_notifications", disable_edit_notifications);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DisableEmails {

                /**
                 * 
                 * <p>
                 * disable emails
                 * </p>
                 * 
                 * @param disable_emails
                 *     Prevent Discourse from sending any kind of emails
                 *     
                 */
                public void put(boolean disable_emails) {
                    String url = ("https://discourse.example.com//admin/site_settings/disable_emails");
                    Map<String, Object> content = new HashMap<>();
                    content.put("disable_emails", disable_emails);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DisableMailingListMode {

                /**
                 * 
                 * <p>
                 * "disable mailing list mode"
                 * </p>
                 * 
                 * @param disable_mailing_list_mode
                 *     "Disallow users from enabling mailing list mode."
                 *     
                 */
                public void put(boolean disable_mailing_list_mode) {
                    String url = ("https://discourse.example.com//admin/site_settings/disable_mailing_list_mode");
                    Map<String, Object> content = new HashMap<>();
                    content.put("disable_mailing_list_mode", disable_mailing_list_mode);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DiscourseNarrativeBotDisablePublicReplies {

                /**
                 * 
                 * <p>
                 * discourse narrative bot disable public replies
                 * </p>
                 * 
                 * @param discourse_narrative_bot_disable_public_replies
                 *     Disable public replies by Discourse Narrative Bot
                 *     
                 */
                public void put(boolean discourse_narrative_bot_disable_public_replies) {
                    String url = ("https://discourse.example.com//admin/site_settings/discourse_narrative_bot_disable_public_replies");
                    Map<String, Object> content = new HashMap<>();
                    content.put("discourse_narrative_bot_disable_public_replies", discourse_narrative_bot_disable_public_replies);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DiscourseNarrativeBotEnabled {

                /**
                 * 
                 * <p>
                 * enable discourse narrative bot
                 * </p>
                 * 
                 * @param discourse_narrative_bot_enabled
                 *     Enable Discourse Narrative Bot
                 *     
                 */
                public void put(boolean discourse_narrative_bot_enabled) {
                    String url = ("https://discourse.example.com//admin/site_settings/discourse_narrative_bot_enabled");
                    Map<String, Object> content = new HashMap<>();
                    content.put("discourse_narrative_bot_enabled", discourse_narrative_bot_enabled);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DiscourseNarrativeBotIgnoredUsernames {

                /**
                 * 
                 * <p>
                 * discourse narrative bot ignored usernames
                 * </p>
                 * 
                 * @param discourse_narrative_bot_ignored_usernames
                 *     Usernames that the Discourse Narrative Bot should ignore. Pipe delimited.
                 *     
                 */
                public void put(boolean discourse_narrative_bot_ignored_usernames) {
                    String url = ("https://discourse.example.com//admin/site_settings/discourse_narrative_bot_ignored_usernames");
                    Map<String, Object> content = new HashMap<>();
                    content.put("discourse_narrative_bot_ignored_usernames", discourse_narrative_bot_ignored_usernames);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DiscourseNarrativeBotWelcomePostDelay {

                /**
                 * 
                 * <p>
                 * discourse narrative bot welcome post delay
                 * </p>
                 * 
                 * @param discourse_narrative_bot_welcome_post_delay
                 *     Wait (n) seconds before sending the Discourse Narrative Bot welcome post.
                 *     
                 */
                public void put(long discourse_narrative_bot_welcome_post_delay) {
                    String url = ("https://discourse.example.com//admin/site_settings/discourse_narrative_bot_welcome_post_delay");
                    Map<String, Object> content = new HashMap<>();
                    content.put("discourse_narrative_bot_welcome_post_delay", discourse_narrative_bot_welcome_post_delay);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DiscourseNarrativeBotWelcomePostType {

                /**
                 * 
                 * <p>
                 * discourse narrative bot welcome post type
                 * </p>
                 * 
                 * @param discourse_narrative_bot_welcome_post_delay
                 *     Type of welcome post that the Discourse Narrative Bot should send out
                 *     
                 */
                public void put(discourse.example.com.structures.discourse_narrative_bot_welcome_post_delay discourse_narrative_bot_welcome_post_delay) {
                    String url = ("https://discourse.example.com//admin/site_settings/discourse_narrative_bot_welcome_post_type");
                    Map<String, Object> content = new HashMap<>();
                    content.put("discourse_narrative_bot_welcome_post_delay", discourse_narrative_bot_welcome_post_delay);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DisplayNameOnEmailFrom {

                /**
                 * 
                 * <p>
                 * display name on email from
                 * </p>
                 * 
                 * @param display_name_on_email_from
                 *     Display full names on email from fields
                 *     
                 */
                public void put(boolean display_name_on_email_from) {
                    String url = ("https://discourse.example.com//admin/site_settings/display_name_on_email_from");
                    Map<String, Object> content = new HashMap<>();
                    content.put("display_name_on_email_from", display_name_on_email_from);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DisplayNameOnPosts {

                /**
                 * 
                 * <p>
                 * display name on posts
                 * </p>
                 * 
                 * @param display_name_on_posts
                 */
                public void put(boolean display_name_on_posts) {
                    String url = ("https://discourse.example.com//admin/site_settings/display_name_on_posts");
                    Map<String, Object> content = new HashMap<>();
                    content.put("display_name_on_posts", display_name_on_posts);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DominatingTopicMinimumPercent {

                /**
                 * 
                 * <p>
                 * dominating topic minimum percent
                 * </p>
                 * 
                 * @param dominating_topic_minimum_percent
                 *     "What percentage of posts a user has to make in a topic before being reminded about overly dominating a topic."
                 *     
                 */
                public void put(long dominating_topic_minimum_percent) {
                    String url = ("https://discourse.example.com//admin/site_settings/dominating_topic_minimum_percent");
                    Map<String, Object> content = new HashMap<>();
                    content.put("dominating_topic_minimum_percent", dominating_topic_minimum_percent);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DownloadRemoteImagesMaxDaysOld {

                /**
                 * 
                 * <p>
                 * download remote images max days old
                 * </p>
                 * 
                 * @param download_remote_images_max_days_old
                 *     Don't download remote images for posts that are more than n days old.
                 *     
                 */
                public void put(long download_remote_images_max_days_old) {
                    String url = ("https://discourse.example.com//admin/site_settings/download_remote_images_max_days_old");
                    Map<String, Object> content = new HashMap<>();
                    content.put("download_remote_images_max_days_old", download_remote_images_max_days_old);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DownloadRemoteImagesThreshold {

                /**
                 * 
                 * <p>
                 * download remote images threshold
                 * </p>
                 * 
                 * @param download_remote_images_threshold
                 *     Minimum disk space necessary to download remote images locally (in percent)
                 *     
                 */
                public void put(long download_remote_images_threshold) {
                    String url = ("https://discourse.example.com//admin/site_settings/download_remote_images_threshold");
                    Map<String, Object> content = new HashMap<>();
                    content.put("download_remote_images_threshold", download_remote_images_threshold);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class DownloadRemoteImagesToLocal {

                /**
                 * 
                 * <p>
                 * download remote images to local
                 * </p>
                 * 
                 * @param max_image_width
                 *     Convert remote images to local images by downloading them; this prevents broken images.
                 */
                public void put(boolean max_image_width) {
                    String url = ("https://discourse.example.com//admin/site_settings/download_remote_images_to_local");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_image_width", max_image_width);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EditHistoryVisibleToPublic {

                /**
                 * 
                 * <p>
                 * edit history visible to public
                 * </p>
                 * 
                 * @param edit_history_visible_to_public
                 */
                public void put(boolean edit_history_visible_to_public) {
                    String url = ("https://discourse.example.com//admin/site_settings/edit_history_visible_to_public");
                    Map<String, Object> content = new HashMap<>();
                    content.put("edit_history_visible_to_public", edit_history_visible_to_public);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EditingGracePeriod {

                /**
                 * 
                 * <p>
                 * editing grace period
                 * </p>
                 * 
                 * @param editing_grace_period
                 */
                public void put(long editing_grace_period) {
                    String url = ("https://discourse.example.com//admin/site_settings/editing_grace_period");
                    Map<String, Object> content = new HashMap<>();
                    content.put("editing_grace_period", editing_grace_period);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EducateUntilPosts {

                /**
                 * 
                 * <p>
                 * educate until posts
                 * </p>
                 * 
                 * @param educate_until_posts
                 *     "When the user starts typing their first (n) new posts, show the pop-up new user education panel in the composer."
                 *     
                 */
                public void put(long educate_until_posts) {
                    String url = ("https://discourse.example.com//admin/site_settings/educate_until_posts");
                    Map<String, Object> content = new HashMap<>();
                    content.put("educate_until_posts", educate_until_posts);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailAccentBgColor {

                /**
                 * 
                 * <p>
                 * email accent bg color
                 * </p>
                 * 
                 * @param email_accent_bg_color
                 *     Enter a color name ('red') or hex value ('#FF000').
                 *     
                 */
                public void put(String email_accent_bg_color) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_accent_bg_color");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_accent_bg_color", email_accent_bg_color);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailAccentFgColor {

                /**
                 * 
                 * <p>
                 * email accent fg color
                 * </p>
                 * 
                 * @param email_accent_fg_color
                 *     Enter a color name ('white') or hex value ('#FFFFFF').
                 *     
                 */
                public void put(String email_accent_fg_color) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_accent_fg_color");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_accent_fg_color", email_accent_fg_color);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailCustomHeaders {

                /**
                 * 
                 * <p>
                 * email custom headers
                 * </p>
                 * 
                 * @param email_custom_headers
                 *     A pipe-delimited list of custom email headers
                 */
                public void put(String email_custom_headers) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_custom_headers");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_custom_headers", email_custom_headers);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailDomainsBlacklist {

                /**
                 * 
                 * <p>
                 * email domains blacklist
                 * </p>
                 * 
                 * @param email_domains_blacklist
                 *     pipe delimited
                 *     
                 */
                public void put(String email_domains_blacklist) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_domains_blacklist");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_domains_blacklist", email_domains_blacklist);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailDomainsWhitelist {

                /**
                 * 
                 * <p>
                 * email domains whitelist
                 * </p>
                 * 
                 * @param email_domains_whitelist
                 *     pipe delimited
                 *     
                 */
                public void put(String email_domains_whitelist) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_domains_whitelist");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_domains_whitelist", email_domains_whitelist);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailEditable {

                /**
                 * 
                 * <p>
                 * email editable
                 * </p>
                 * 
                 * @param email_editable
                 */
                public void put(boolean email_editable) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_editable");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_editable", email_editable);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailIn {

                /**
                 * 
                 * <p>
                 * email in
                 * </p>
                 * 
                 * @param email_in
                 *     'Allow users to post new topics via email (requires pop3 polling). Configure the addresses in the "Settings" tab of each category.'
                 *     
                 */
                public void put(boolean email_in) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_in");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_in", email_in);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailInMinTrust {

                /**
                 * 
                 * <p>
                 * email in min trust
                 * </p>
                 * 
                 * @param email_in_min_trust
                 *     The minimum trust level a user needs to have to be allowed to post new topics via email.
                 *     
                 */
                public void put(long email_in_min_trust) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_in_min_trust");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_in_min_trust", email_in_min_trust);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailLinkColor {

                /**
                 * 
                 * <p>
                 * email link color
                 * </p>
                 * 
                 * @param email_link_color
                 *     Enter a color name ('blue') or hex value ('#0000FF').
                 *     
                 */
                public void put(String email_link_color) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_link_color");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_link_color", email_link_color);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailPostsContext {

                /**
                 * 
                 * <p>
                 * email posts context
                 * </p>
                 * 
                 * @param email_posts_context
                 */
                public void put(long email_posts_context) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_posts_context");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_posts_context", email_posts_context);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailPrefix {

                /**
                 * 
                 * <p>
                 * email prefix
                 * </p>
                 * 
                 * @param email_prefix
                 *     "The [label] used in the subject of emails. It will default to 'title' if not set."
                 *     
                 */
                public void put(String email_prefix) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_prefix");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_prefix", email_prefix);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailSiteTitle {

                /**
                 * 
                 * <p>
                 * email site title
                 * </p>
                 * 
                 * @param email_site_title
                 *     The title of the site used as the sender of emails from the site. Default to 'title' if not set. If your 'title' contains characters that are not allowed in email sender strings, use this setting.
                 *     
                 */
                public void put(String email_site_title) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_site_title");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_site_title", email_site_title);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailSubject {

                /**
                 * 
                 * <p>
                 * email subject
                 * </p>
                 * 
                 * @param email_subject
                 *     Customizable subject format for standard emails.
                 */
                public void put(String email_subject) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_subject");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_subject", email_subject);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailTimeWindowMins {

                /**
                 * 
                 * <p>
                 * email time window mins
                 * </p>
                 * 
                 * @param email_time_window_mins
                 */
                public void put(long email_time_window_mins) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_time_window_mins");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_time_window_mins", email_time_window_mins);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmailTokenValidHours {

                /**
                 * 
                 * <p>
                 * email token valid hours
                 * </p>
                 * 
                 * @param email_token_valid_hours
                 */
                public void put(long email_token_valid_hours) {
                    String url = ("https://discourse.example.com//admin/site_settings/email_token_valid_hours");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email_token_valid_hours", email_token_valid_hours);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmbedTruncate {

                /**
                 * 
                 * <p>
                 * embed truncate
                 * </p>
                 * 
                 * @param embed_truncate
                 */
                public void put(boolean embed_truncate) {
                    String url = ("https://discourse.example.com//admin/site_settings/embed_truncate");
                    Map<String, Object> content = new HashMap<>();
                    content.put("embed_truncate", embed_truncate);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EmojiSet {

                /**
                 * 
                 * <p>
                 * emoji set
                 * </p>
                 * 
                 * @param emoji_set
                 */
                public void put(discourse.example.com.structures.emoji_set emoji_set) {
                    String url = ("https://discourse.example.com//admin/site_settings/emoji_set");
                    Map<String, Object> content = new HashMap<>();
                    content.put("emoji_set", emoji_set);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableBadges {

                /**
                 * 
                 * <p>
                 * Update enable the badge system
                 * </p>
                 * 
                 * @param enable_badges
                 */
                public void put(boolean enable_badges) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_badges");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_badges", enable_badges);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableEmoji {

                /**
                 * 
                 * <p>
                 * enable emoji
                 * </p>
                 * 
                 * @param enable_emoji
                 */
                public void put(boolean enable_emoji) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_emoji");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_emoji", enable_emoji);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableEscapedFragments {

                /**
                 * 
                 * <p>
                 * enable escaped fragments
                 * </p>
                 * 
                 * @param enable_escaped_fragments
                 *     "Fall back to Google's Ajax-Crawling API if no webcrawler is detected. See https://developers.google.com/webmasters/ajax-crawling/docs/learn-more"
                 *     
                 */
                public void put(boolean enable_escaped_fragments) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_escaped_fragments");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_escaped_fragments", enable_escaped_fragments);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableFacebookLogins {

                /**
                 * 
                 * <p>
                 * enable facebook logins
                 * </p>
                 * 
                 * @param enable_facebook_logins
                 */
                public void put(boolean enable_facebook_logins) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_facebook_logins");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_facebook_logins", enable_facebook_logins);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableFlashVideoOnebox {

                /**
                 * 
                 * <p>
                 * enable flash video onebox
                 * </p>
                 * 
                 * @param enable_flash_video_onebox
                 *     "Enable embedding of swf and flv (Adobe Flash) links in oneboxes. WARNING: may introduce security risks."
                 *     
                 */
                public void put(boolean enable_flash_video_onebox) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_flash_video_onebox");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_flash_video_onebox", enable_flash_video_onebox);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableForwardedEmails {

                /**
                 * 
                 * <p>
                 * enable forwarded emails
                 * </p>
                 * 
                 * @param enable_forwarded_emails
                 *     [BETA] Allow users to create a topic by forwarding an email in.
                 */
                public void put(boolean enable_forwarded_emails) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_forwarded_emails");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_forwarded_emails", enable_forwarded_emails);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableGithubLogins {

                /**
                 * 
                 * <p>
                 * enable github logins
                 * </p>
                 * 
                 * @param enable_github_logins
                 */
                public void put(boolean enable_github_logins) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_github_logins");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_github_logins", enable_github_logins);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableGoogleOauth2Logins {

                /**
                 * 
                 * <p>
                 * Update enable Google Oauth2 authentication
                 * </p>
                 * 
                 * @param enable_google_oath2_logins
                 */
                public void put(boolean enable_google_oath2_logins) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_google_oauth2_logins");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_google_oath2_logins", enable_google_oath2_logins);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableInstagramLogins {

                /**
                 * 
                 * <p>
                 * enable instagram logins
                 * </p>
                 * 
                 * @param enable_instagram_logins
                 */
                public void put(boolean enable_instagram_logins) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_instagram_logins");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_instagram_logins", enable_instagram_logins);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableLocalLogins {

                /**
                 * 
                 * <p>
                 * Update enable_local_logins
                 * </p>
                 * 
                 * @param enable_local_logins
                 */
                public void put(boolean enable_local_logins) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_local_logins");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_local_logins", enable_local_logins);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableLongPolling {

                /**
                 * 
                 * <p>
                 * enable long polling
                 * </p>
                 * 
                 * @param enable_long_polling
                 *     "Message bus used for notification can use long polling"
                 *     
                 */
                public void put(boolean enable_long_polling) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_long_polling");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_long_polling", enable_long_polling);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableMobileTheme {

                /**
                 * 
                 * <p>
                 * Update enable mobile theme
                 * </p>
                 * 
                 * @param enable_mobile_theme
                 */
                public void put(boolean enable_mobile_theme) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_mobile_theme");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_mobile_theme", enable_mobile_theme);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableNames {

                /**
                 * 
                 * <p>
                 * enable names
                 * </p>
                 * 
                 * @param enable_names
                 */
                public void put(boolean enable_names) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_names");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_names", enable_names);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableNoscriptSupport {

                /**
                 * 
                 * <p>
                 * enable noscript support
                 * </p>
                 * 
                 * @param enable_noscript_support
                 *     "Enable standard webcrawler search engine support via the noscript tag"
                 *     
                 */
                public void put(boolean enable_noscript_support) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_noscript_support");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_noscript_support", enable_noscript_support);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnablePrivateMessages {

                /**
                 * 
                 * <p>
                 * enable private messages
                 * </p>
                 * 
                 * @param enable_private_messages
                 */
                public void put(boolean enable_private_messages) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_private_messages");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_private_messages", enable_private_messages);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableS3Backups {

                /**
                 * 
                 * <p>
                 * enable s3 backups
                 * </p>
                 * 
                 * @param enable_s3_backups
                 *     "Upload backups to S3 when complete. IMPORTANT: requires valid S3 credentials entered in Files settings."
                 *     
                 */
                public void put(boolean enable_s3_backups) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_s3_backups");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_s3_backups", enable_s3_backups);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableS3Uploads {

                /**
                 * 
                 * <p>
                 * enable s3 uploads
                 * </p>
                 * 
                 * @param enable_s3_uploads
                 *     "Place uploads on Amazon S3 storage. IMPORTANT: requires valid S3 credentials (both access key id & secret access key)."
                 *     
                 */
                public void put(boolean enable_s3_uploads) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_s3_uploads");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_s3_uploads", enable_s3_uploads);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableSignupCta {

                /**
                 * 
                 * <p>
                 * Update enable signup cta
                 * </p>
                 * 
                 * @param enable_signup_cta
                 */
                public void put(boolean enable_signup_cta) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_signup_cta");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_signup_cta", enable_signup_cta);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableSso {

                /**
                 * 
                 * <p>
                 * enable sso
                 * </p>
                 * 
                 * @param enable_sso
                 */
                public void put(boolean enable_sso) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_sso");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_sso", enable_sso);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableSsoProvider {

                /**
                 * 
                 * <p>
                 * enable sso provider
                 * </p>
                 * 
                 * @param enable_sso_provider
                 */
                public void put(boolean enable_sso_provider) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_sso_provider");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_sso_provider", enable_sso_provider);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableStagedUsers {

                /**
                 * 
                 * <p>
                 * enable staged users
                 * </p>
                 * 
                 * @param enable_staged_users
                 *     Automatically create staged users when processing incoming emails.
                 */
                public void put(boolean enable_staged_users) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_staged_users");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_staged_users", enable_staged_users);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableTwitterLogins {

                /**
                 * 
                 * <p>
                 * Enable twitter logins
                 * </p>
                 * 
                 * @param enable_twitter_logins
                 */
                public void put(boolean enable_twitter_logins) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_twitter_logins");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_twitter_logins", enable_twitter_logins);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableUserDirectory {

                /**
                 * 
                 * <p>
                 * enable user directory
                 * </p>
                 * 
                 * @param enable_user_directory
                 */
                public void put(boolean enable_user_directory) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_user_directory");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_user_directory", enable_user_directory);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableWhispers {

                /**
                 * 
                 * <p>
                 * Update enable whispers
                 * </p>
                 * 
                 * @param enable_whispers
                 */
                public void put(boolean enable_whispers) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_whispers");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_whispers", enable_whispers);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnableYahooLogins {

                /**
                 * 
                 * <p>
                 * Update enable yahoo logins
                 * </p>
                 * 
                 * @param enable_yahoo_logins
                 */
                public void put(boolean enable_yahoo_logins) {
                    String url = ("https://discourse.example.com//admin/site_settings/enable_yahoo_logins");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enable_yahoo_logins", enable_yahoo_logins);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class EnforceSquareEmoji {

                /**
                 * 
                 * <p>
                 * enforce square emoji
                 * </p>
                 * 
                 * @param enforce_square_emoji
                 */
                public void put(boolean enforce_square_emoji) {
                    String url = ("https://discourse.example.com//admin/site_settings/enforce_square_emoji");
                    Map<String, Object> content = new HashMap<>();
                    content.put("enforce_square_emoji", enforce_square_emoji);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ExcludeRelNofollowDomains {

                /**
                 * 
                 * <p>
                 * Update the exclude rel nofollow domains
                 * </p>
                 * 
                 * @param exclude_rel_nofollow_domains
                 *     pipe delimited
                 *     
                 */
                public void put(String exclude_rel_nofollow_domains) {
                    String url = ("https://discourse.example.com//admin/site_settings/exclude_rel_nofollow_domains");
                    Map<String, Object> content = new HashMap<>();
                    content.put("exclude_rel_nofollow_domains", exclude_rel_nofollow_domains);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ExternalSystemAvatarsEnabled {

                /**
                 * 
                 * <p>
                 * external system avatars enabled
                 * </p>
                 * 
                 * @param external_system_avatars_enabled
                 *     "Use external system avatars service."
                 *     
                 */
                public void put(boolean external_system_avatars_enabled) {
                    String url = ("https://discourse.example.com//admin/site_settings/external_system_avatars_enabled");
                    Map<String, Object> content = new HashMap<>();
                    content.put("external_system_avatars_enabled", external_system_avatars_enabled);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ExternalSystemAvatarsUrl {

                /**
                 * 
                 * <p>
                 * external system avatars url
                 * </p>
                 * 
                 * @param external_system_avatars_url
                 *     "URL of the external system avatars service. Allowed substitutions are {username} {first_letter} {color} {size}"
                 *     
                 */
                public void put(String external_system_avatars_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/external_system_avatars_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("external_system_avatars_url", external_system_avatars_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class FacebookAppId {

                /**
                 * 
                 * <p>
                 * facebook app id
                 * </p>
                 * 
                 * @param facebook_app_id
                 */
                public void put(String facebook_app_id) {
                    String url = ("https://discourse.example.com//admin/site_settings/facebook_app_id");
                    Map<String, Object> content = new HashMap<>();
                    content.put("facebook_app_id", facebook_app_id);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class FacebookAppSecret {

                /**
                 * 
                 * <p>
                 * facebook app secret
                 * </p>
                 * 
                 * @param facebook_app_secret
                 */
                public void put(String facebook_app_secret) {
                    String url = ("https://discourse.example.com//admin/site_settings/facebook_app_secret");
                    Map<String, Object> content = new HashMap<>();
                    content.put("facebook_app_secret", facebook_app_secret);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class FacebookRequestExtraProfileDetails {

                /**
                 * 
                 * <p>
                 * facebook request extra profile details
                 * </p>
                 * 
                 * @param facebook_request_extra_profile_details
                 */
                public void put(boolean facebook_request_extra_profile_details) {
                    String url = ("https://discourse.example.com//admin/site_settings/facebook_request_extra_profile_details");
                    Map<String, Object> content = new HashMap<>();
                    content.put("facebook_request_extra_profile_details", facebook_request_extra_profile_details);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class FagUrl {

                /**
                 * 
                 * <p>
                 * faq url
                 * </p>
                 * 
                 * @param faq_url
                 *     "If you have a FAQ hosted elsewhere that you want to use, provide the full URL here."
                 *     
                 */
                public void put(String faq_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/fag_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("faq_url", faq_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class FaviconUrl {

                /**
                 * 
                 * <p>
                 * Update the favicon url
                 * </p>
                 * 
                 * @param favicon_url
                 */
                public void put(String favicon_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/favicon_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("favicon_url", favicon_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class FixedCategoryPositions {

                /**
                 * 
                 * <p>
                 * Update fixed category positions
                 * </p>
                 * 
                 * @param fixed_category_positions
                 */
                public void put(boolean fixed_category_positions) {
                    String url = ("https://discourse.example.com//admin/site_settings/fixed_category_positions");
                    Map<String, Object> content = new HashMap<>();
                    content.put("fixed_category_positions", fixed_category_positions);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class FixedCategoryPositionsOnCreate {

                /**
                 * 
                 * <p>
                 * Update fixed category positions on create
                 * </p>
                 * 
                 * @param fixed_category_positions_on_create
                 */
                public void put(boolean fixed_category_positions_on_create) {
                    String url = ("https://discourse.example.com//admin/site_settings/fixed_category_positions_on_create");
                    Map<String, Object> content = new HashMap<>();
                    content.put("fixed_category_positions_on_create", fixed_category_positions_on_create);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class FlagSockpuppets {

                /**
                 * 
                 * <p>
                 * flag sockpuppets
                 * </p>
                 * 
                 * @param flag_sockpuppets
                 *     "If a new user replies to a topic from the same IP address as the new user who started the topic, flag both of their posts as potential spam."
                 *     
                 */
                public void put(boolean flag_sockpuppets) {
                    String url = ("https://discourse.example.com//admin/site_settings/flag_sockpuppets");
                    Map<String, Object> content = new HashMap<>();
                    content.put("flag_sockpuppets", flag_sockpuppets);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class FlagsRequiredToHidePost {

                /**
                 * 
                 * <p>
                 * flags required to hide post
                 * </p>
                 * 
                 * @param flags_required_to_hide_post
                 *     "Number of flags that cause a post to be automatically hidden and message sent to the user (0 for never)"
                 *     
                 */
                public void put(long flags_required_to_hide_post) {
                    String url = ("https://discourse.example.com//admin/site_settings/flags_required_to_hide_post");
                    Map<String, Object> content = new HashMap<>();
                    content.put("flags_required_to_hide_post", flags_required_to_hide_post);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class FlushTimingsSecs {

                /**
                 * 
                 * <p>
                 * flush timings secs
                 * </p>
                 * 
                 * @param flush_timings_secs
                 *     "How frequently we flush timing data to the server, in seconds."
                 *     
                 */
                public void put(long flush_timings_secs) {
                    String url = ("https://discourse.example.com//admin/site_settings/flush_timings_secs");
                    Map<String, Object> content = new HashMap<>();
                    content.put("flush_timings_secs", flush_timings_secs);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ForceHostname {

                /**
                 * 
                 * <p>
                 * force hostname
                 * </p>
                 * 
                 * @param force_hostname
                 *     "DEVELOPER ONLY! WARNING! Specify a hostname in the URL. Leave blank for default."
                 *     
                 */
                public void put(String force_hostname) {
                    String url = ("https://discourse.example.com//admin/site_settings/force_hostname");
                    Map<String, Object> content = new HashMap<>();
                    content.put("force_hostname", force_hostname);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ForceHttps {

                /**
                 * 
                 * <p>
                 * force https
                 * </p>
                 * 
                 * @param force_https
                 *     "Force your site to use HTTPS only. WARNING: do NOT enable this until you verify HTTPS is fully set up and working absolutely everywhere! Did you check your CDN, all social logins, and any external logos / dependencies to make sure they are all HTTPS compatible, too?"
                 *     
                 */
                public void put(boolean force_https) {
                    String url = ("https://discourse.example.com//admin/site_settings/force_https");
                    Map<String, Object> content = new HashMap<>();
                    content.put("force_https", force_https);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ForgotPasswordStrict {

                /**
                 * 
                 * <p>
                 * forgot password strict
                 * </p>
                 * 
                 * @param forgot_password_strict
                 */
                public void put(boolean forgot_password_strict) {
                    String url = ("https://discourse.example.com//admin/site_settings/forgot_password_strict");
                    Map<String, Object> content = new HashMap<>();
                    content.put("forgot_password_strict", forgot_password_strict);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class FullNameRequired {

                /**
                 * 
                 * <p>
                 * full name required
                 * </p>
                 * 
                 * @param full_name_required
                 */
                public void put(boolean full_name_required) {
                    String url = ("https://discourse.example.com//admin/site_settings/full_name_required");
                    Map<String, Object> content = new HashMap<>();
                    content.put("full_name_required", full_name_required);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class GaDomainName {

                /**
                 * 
                 * <p>
                 * Update the OBSOLETE ga domain name
                 * </p>
                 * 
                 * @param ga_domain_name
                 */
                public void put(String ga_domain_name) {
                    String url = ("https://discourse.example.com//admin/site_settings/ga_domain_name");
                    Map<String, Object> content = new HashMap<>();
                    content.put("ga_domain_name", ga_domain_name);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class GaTrackingCode {

                /**
                 * 
                 * <p>
                 * Update the OBSOLETE ga tracking code
                 * </p>
                 * 
                 * @param ga_tracking_code
                 */
                public void put(String ga_tracking_code) {
                    String url = ("https://discourse.example.com//admin/site_settings/ga_tracking_code");
                    Map<String, Object> content = new HashMap<>();
                    content.put("ga_tracking_code", ga_tracking_code);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class GaUniversalDomainName {

                /**
                 * 
                 * <p>
                 * Update Google Universal Analytics domain name
                 * </p>
                 * 
                 * @param ga_universal_domain_name
                 */
                public void put(String ga_universal_domain_name) {
                    String url = ("https://discourse.example.com//admin/site_settings/ga_universal_domain_name");
                    Map<String, Object> content = new HashMap<>();
                    content.put("ga_universal_domain_name", ga_universal_domain_name);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class GaUniversalTrackingCode {

                /**
                 * 
                 * <p>
                 * Update Google Universal Analytics tracking code
                 * </p>
                 * 
                 * @param ga_universal_tracking_code
                 */
                public void put(String ga_universal_tracking_code) {
                    String url = ("https://discourse.example.com//admin/site_settings/ga_universal_tracking_code");
                    Map<String, Object> content = new HashMap<>();
                    content.put("ga_universal_tracking_code", ga_universal_tracking_code);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class GithubClientId {

                /**
                 * 
                 * <p>
                 * github client id
                 * </p>
                 * 
                 * @param github_client_id
                 */
                public void put(String github_client_id) {
                    String url = ("https://discourse.example.com//admin/site_settings/github_client_id");
                    Map<String, Object> content = new HashMap<>();
                    content.put("github_client_id", github_client_id);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class GithubClientSecret {

                /**
                 * 
                 * <p>
                 * github client secret
                 * </p>
                 * 
                 * @param github_client_secret
                 */
                public void put(String github_client_secret) {
                    String url = ("https://discourse.example.com//admin/site_settings/github_client_secret");
                    Map<String, Object> content = new HashMap<>();
                    content.put("github_client_secret", github_client_secret);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class GlobalNotice {

                /**
                 * 
                 * <p>
                 * global notice
                 * </p>
                 * 
                 * @param global_notice
                 *     "Display an URGENT, EMERGENCY global banner notice to all visitors, change to blank to hide it (HTML allowed)."
                 *     
                 */
                public void put(String global_notice) {
                    String url = ("https://discourse.example.com//admin/site_settings/global_notice");
                    Map<String, Object> content = new HashMap<>();
                    content.put("global_notice", global_notice);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class GoogleOath2ClientId {

                /**
                 * 
                 * <p>
                 * Update google oauth2 client id
                 * </p>
                 * 
                 * @param google_oath2_client_id
                 */
                public void put(String google_oath2_client_id) {
                    String url = ("https://discourse.example.com//admin/site_settings/google_oath2_client_id");
                    Map<String, Object> content = new HashMap<>();
                    content.put("google_oath2_client_id", google_oath2_client_id);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class GoogleOath2ClientSecret {

                /**
                 * 
                 * <p>
                 * Update google oauth2 client secret
                 * </p>
                 * 
                 * @param google_oath2_client_secret
                 */
                public void put(String google_oath2_client_secret) {
                    String url = ("https://discourse.example.com//admin/site_settings/google_oath2_client_secret");
                    Map<String, Object> content = new HashMap<>();
                    content.put("google_oath2_client_secret", google_oath2_client_secret);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class GtmContainerId {

                /**
                 * 
                 * <p>
                 * Update Google Tag Manager container id
                 * </p>
                 * 
                 * @param gtm_container_id
                 */
                public void put(String gtm_container_id) {
                    String url = ("https://discourse.example.com//admin/site_settings/gtm_container_id");
                    Map<String, Object> content = new HashMap<>();
                    content.put("gtm_container_id", gtm_container_id);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class HardBounceScore {

                /**
                 * 
                 * <p>
                 * hard bounce score
                 * </p>
                 * 
                 * @param hard_bounce_score
                 *     Bounce score added to the user when a permanent bounce happens.
                 */
                public void put(long hard_bounce_score) {
                    String url = ("https://discourse.example.com//admin/site_settings/hard_bounce_score");
                    Map<String, Object> content = new HashMap<>();
                    content.put("hard_bounce_score", hard_bounce_score);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class HideUserProfilesFromPublic {

                /**
                 * 
                 * <p>
                 * hide user profiles from public
                 * </p>
                 * 
                 * @param hide_user_profiles_from_public
                 */
                public void put(boolean hide_user_profiles_from_public) {
                    String url = ("https://discourse.example.com//admin/site_settings/hide_user_profiles_from_public");
                    Map<String, Object> content = new HashMap<>();
                    content.put("hide_user_profiles_from_public", hide_user_profiles_from_public);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class HighlightedLanguages {

                /**
                 * 
                 * <p>
                 * highlighted languages
                 * </p>
                 * 
                 * @param highlighted_languages
                 */
                public void put(String highlighted_languages) {
                    String url = ("https://discourse.example.com//admin/site_settings/highlighted_languages");
                    Map<String, Object> content = new HashMap<>();
                    content.put("highlighted_languages", highlighted_languages);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class HistoryHoursHigh {

                /**
                 * 
                 * <p>
                 * history hours high
                 * </p>
                 * 
                 * @param history_hours_high
                 *     "A post edited within this many hours has the edit indicator strongly highlighted."
                 *     
                 */
                public void put(long history_hours_high) {
                    String url = ("https://discourse.example.com//admin/site_settings/history_hours_high");
                    Map<String, Object> content = new HashMap<>();
                    content.put("history_hours_high", history_hours_high);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class HistoryHoursLow {

                /**
                 * 
                 * <p>
                 * history hours low
                 * </p>
                 * 
                 * @param history_hours_low
                 *     "A post edited within this many hours has the edit indicator slightly highlighted"
                 *     
                 */
                public void put(long history_hours_low) {
                    String url = ("https://discourse.example.com//admin/site_settings/history_hours_low");
                    Map<String, Object> content = new HashMap<>();
                    content.put("history_hours_low", history_hours_low);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class HistoryHoursMedium {

                /**
                 * 
                 * <p>
                 * history hours medium
                 * </p>
                 * 
                 * @param history_hours_medium
                 *     "A post edited within this many hours has the edit indicator moderately highlighted."
                 *     
                 */
                public void put(long history_hours_medium) {
                    String url = ("https://discourse.example.com//admin/site_settings/history_hours_medium");
                    Map<String, Object> content = new HashMap<>();
                    content.put("history_hours_medium", history_hours_medium);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class IgnoreByTitle {

                /**
                 * 
                 * <p>
                 * ignore by title
                 * </p>
                 * 
                 * @param ignore_by_title
                 *     pipe delimited list
                 */
                public void put(String ignore_by_title) {
                    String url = ("https://discourse.example.com//admin/site_settings/ignore_by_title");
                    Map<String, Object> content = new HashMap<>();
                    content.put("ignore_by_title", ignore_by_title);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class IncomingEmailPreferHtml {

                /**
                 * 
                 * <p>
                 * incoming email prefer html
                 * </p>
                 * 
                 * @param incoming_email_prefer_html
                 *     Use the HTML instead of the text for incoming email. May cause unexpected formatting issues!
                 *     
                 */
                public void put(boolean incoming_email_prefer_html) {
                    String url = ("https://discourse.example.com//admin/site_settings/incoming_email_prefer_html");
                    Map<String, Object> content = new HashMap<>();
                    content.put("incoming_email_prefer_html", incoming_email_prefer_html);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class InstagramConsumerKey {

                /**
                 * 
                 * <p>
                 * instagram consumer key
                 * </p>
                 * 
                 * @param instagram_consumer_key
                 */
                public void put(String instagram_consumer_key) {
                    String url = ("https://discourse.example.com//admin/site_settings/instagram_consumer_key");
                    Map<String, Object> content = new HashMap<>();
                    content.put("instagram_consumer_key", instagram_consumer_key);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class InstagramConsumerSecret {

                /**
                 * 
                 * <p>
                 * instagram consumer secret
                 * </p>
                 * 
                 * @param instagram_consumer_secret
                 */
                public void put(String instagram_consumer_secret) {
                    String url = ("https://discourse.example.com//admin/site_settings/instagram_consumer_secret");
                    Map<String, Object> content = new HashMap<>();
                    content.put("instagram_consumer_secret", instagram_consumer_secret);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class InviteExpiryDays {

                /**
                 * 
                 * <p>
                 * invite expiry days
                 * </p>
                 * 
                 * @param invite_expiry_days
                 */
                public void put(long invite_expiry_days) {
                    String url = ("https://discourse.example.com//admin/site_settings/invite_expiry_days");
                    Map<String, Object> content = new HashMap<>();
                    content.put("invite_expiry_days", invite_expiry_days);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class InviteOnly {

                /**
                 * 
                 * <p>
                 * Update invite only
                 * </p>
                 * 
                 * @param invite_only
                 */
                public void put(boolean invite_only) {
                    String url = ("https://discourse.example.com//admin/site_settings/invite_only");
                    Map<String, Object> content = new HashMap<>();
                    content.put("invite_only", invite_only);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class InvitePassthroughHours {

                /**
                 * 
                 * <p>
                 * invite passthrough hours
                 * </p>
                 * 
                 * @param invite_passthrough_hours
                 */
                public void put(long invite_passthrough_hours) {
                    String url = ("https://discourse.example.com//admin/site_settings/invite_passthrough_hours");
                    Map<String, Object> content = new HashMap<>();
                    content.put("invite_passthrough_hours", invite_passthrough_hours);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class InvitesPerPage {

                /**
                 * 
                 * <p>
                 * invites per page
                 * </p>
                 * 
                 * @param invites_per_page
                 */
                public void put(long invites_per_page) {
                    String url = ("https://discourse.example.com//admin/site_settings/invites_per_page");
                    Map<String, Object> content = new HashMap<>();
                    content.put("invites_per_page", invites_per_page);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class LevenshteinDistanceSpammerEmails {

                /**
                 * 
                 * <p>
                 * levenshtein distance spammer emails
                 * </p>
                 * 
                 * @param levenshtein_distance_spammer_emails
                 *     "When matching spammer emails, number of characters difference that will still allow a fuzzy match."
                 *     
                 */
                public void put(long levenshtein_distance_spammer_emails) {
                    String url = ("https://discourse.example.com//admin/site_settings/levenshtein_distance_spammer_emails");
                    Map<String, Object> content = new HashMap<>();
                    content.put("levenshtein_distance_spammer_emails", levenshtein_distance_spammer_emails);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class LimitSuggestedToCategory {

                /**
                 * 
                 * <p>
                 * Update show topics from the current category
                 * </p>
                 * 
                 * @param limit_suggested_to_category
                 */
                public void put(boolean limit_suggested_to_category) {
                    String url = ("https://discourse.example.com//admin/site_settings/limit_suggested_to_category");
                    Map<String, Object> content = new HashMap<>();
                    content.put("limit_suggested_to_category", limit_suggested_to_category);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class LoginRequired {

                /**
                 * 
                 * <p>
                 * Update login required
                 * </p>
                 * 
                 * @param login_required
                 */
                public void put(boolean login_required) {
                    String url = ("https://discourse.example.com//admin/site_settings/login_required");
                    Map<String, Object> content = new HashMap<>();
                    content.put("login_required", login_required);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class LogMailProcessingFailures {

                /**
                 * 
                 * <p>
                 * log mail processing failures
                 * </p>
                 * 
                 * @param log_mail_processing_failures
                 *     Log all email processing failures to http://yoursite.com/logs
                 */
                public void put(boolean log_mail_processing_failures) {
                    String url = ("https://discourse.example.com//admin/site_settings/log_mail_processing_failures");
                    Map<String, Object> content = new HashMap<>();
                    content.put("log_mail_processing_failures", log_mail_processing_failures);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class LogoSmallUrl {

                /**
                 * 
                 * <p>
                 * Update the small logo url
                 * </p>
                 * 
                 * @param logo_small_url
                 */
                public void put(String logo_small_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/logo_small_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("logo_small_url", logo_small_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class LogoUrl {

                /**
                 * 
                 * <p>
                 * Update logo url
                 * </p>
                 * 
                 * @param logo_url
                 */
                public void put(String logo_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/logo_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("logo_url", logo_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class LogoutRedirect {

                /**
                 * 
                 * <p>
                 * logout redirect
                 * </p>
                 * 
                 * @param logout_redirect
                 */
                public void put(String logout_redirect) {
                    String url = ("https://discourse.example.com//admin/site_settings/logout_redirect");
                    Map<String, Object> content = new HashMap<>();
                    content.put("logout_redirect", logout_redirect);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class LogOutStrict {

                /**
                 * 
                 * <p>
                 * log out strict
                 * </p>
                 * 
                 * @param log_out_strict
                 */
                public void put(boolean log_out_strict) {
                    String url = ("https://discourse.example.com//admin/site_settings/log_out_strict");
                    Map<String, Object> content = new HashMap<>();
                    content.put("log_out_strict", log_out_strict);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class LongPollingBaseUrl {

                /**
                 * 
                 * <p>
                 * long polling base url
                 * </p>
                 * 
                 * @param long_polling_base_url
                 *     "Base URL used for long polling (when a CDN is serving dynamic content, be sure to set this to origin pull) eg: http://origin.site.com"
                 *     
                 */
                public void put(String long_polling_base_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/long_polling_base_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("long_polling_base_url", long_polling_base_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class LongPollingInterval {

                /**
                 * 
                 * <p>
                 * long polling interval
                 * </p>
                 * 
                 * @param long_polling_interval
                 *     "Amount of time the server should wait before responding to clients when there is no data to send (logged on users only)"
                 *     
                 */
                public void put(long long_polling_interval) {
                    String url = ("https://discourse.example.com//admin/site_settings/long_polling_interval");
                    Map<String, Object> content = new HashMap<>();
                    content.put("long_polling_interval", long_polling_interval);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MailgunApiKey {

                /**
                 * 
                 * <p>
                 * mailgun api key
                 * </p>
                 * 
                 * @param mailgun_api_key
                 *     Mailgun Secret API key used to verify webhook messages.
                 */
                public void put(String mailgun_api_key) {
                    String url = ("https://discourse.example.com//admin/site_settings/mailgun_api_key");
                    Map<String, Object> content = new HashMap<>();
                    content.put("mailgun_api_key", mailgun_api_key);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ManualPollingEnabled {

                /**
                 * 
                 * <p>
                 * manual polling enabled
                 * </p>
                 * 
                 * @param manual_polling_enabled
                 */
                public void put(boolean manual_polling_enabled) {
                    String url = ("https://discourse.example.com//admin/site_settings/manual_polling_enabled");
                    Map<String, Object> content = new HashMap<>();
                    content.put("manual_polling_enabled", manual_polling_enabled);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxAgeUnmatchedEmails {

                /**
                 * 
                 * <p>
                 * max age unmatched emails
                 * </p>
                 * 
                 * @param max_age_unmatched_emails
                 *     "Delete unmatched screened email entries after (N) days."
                 *     
                 */
                public void put(long max_age_unmatched_emails) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_age_unmatched_emails");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_age_unmatched_emails", max_age_unmatched_emails);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxAgeUnmatchedIps {

                /**
                 * 
                 * <p>
                 * max age unmatched ips
                 * </p>
                 * 
                 * @param max_age_unmatched_ips
                 *     "Delete unmatched screened IP entries after (N) days."
                 *     
                 */
                public void put(long max_age_unmatched_ips) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_age_unmatched_ips");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_age_unmatched_ips", max_age_unmatched_ips);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxApiKeysPerUser {

                /**
                 * 
                 * <p>
                 * "max api keys per user"
                 * </p>
                 * 
                 * @param max_api_keys_per_user
                 *     "Maximum number of user API keys per user"
                 *     
                 */
                public void put(long max_api_keys_per_user) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_api_keys_per_user");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_api_keys_per_user", max_api_keys_per_user);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxAttachmentSizeKb {

                /**
                 * 
                 * <p>
                 * max attachment size kb
                 * </p>
                 * 
                 * @param max_image_size_kb
                 *     The maximum attachment upload size in kB. This must be configured in nginx {client_max_body_size} / apache or proxy as well.
                 */
                public void put(long max_image_size_kb) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_attachment_size_kb");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_image_size_kb", max_image_size_kb);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxBookmarksPerDay {

                /**
                 * 
                 * <p>
                 * max bookmarks per day
                 * </p>
                 * 
                 * @param max_bookmarks_per_day
                 *     "Maximum number of bookmarks per user per day."
                 *     
                 */
                public void put(long max_bookmarks_per_day) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_bookmarks_per_day");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_bookmarks_per_day", max_bookmarks_per_day);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxEditsPerDay {

                /**
                 * 
                 * <p>
                 * max edits per day
                 * </p>
                 * 
                 * @param max_edits_per_day
                 *     "Maximum number of edits per user per day."
                 *     
                 */
                public void put(long max_edits_per_day) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_edits_per_day");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_edits_per_day", max_edits_per_day);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxEmailsPerDayPerUser {

                /**
                 * 
                 * <p>
                 * max emails per day per user
                 * </p>
                 * 
                 * @param max_emails_per_day_per_user
                 *     Maximum number of emails to send users per day. 0 to disable the limit
                 */
                public void put(long max_emails_per_day_per_user) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_emails_per_day_per_user");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_emails_per_day_per_user", max_emails_per_day_per_user);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxFlagsPerDay {

                /**
                 * 
                 * <p>
                 * max flags per day
                 * </p>
                 * 
                 * @param max_flags_per_day
                 *     "Maximum number of flags per user per day."
                 *     
                 */
                public void put(long max_flags_per_day) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_flags_per_day");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_flags_per_day", max_flags_per_day);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxImageHeight {

                /**
                 * 
                 * <p>
                 * max image height
                 * </p>
                 * 
                 * @param max_image_height
                 *     Maximum thumbnail height of images in a post
                 */
                public void put(long max_image_height) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_image_height");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_image_height", max_image_height);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxImageMegapixels {

                /**
                 * 
                 * <p>
                 * max image megapixels
                 * </p>
                 * 
                 * @param max_image_megapixels
                 *     Maximum number of megapixels allowed for an image
                 */
                public void put(long max_image_megapixels) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_image_megapixels");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_image_megapixels", max_image_megapixels);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxImageSizeKb {

                /**
                 * 
                 * <p>
                 * max image size kb
                 * </p>
                 * 
                 * @param max_image_size_kb
                 *     The maximum image upload size in kB. This must be configured in nginx {client_max_body_size} / apache or proxy as well.
                 */
                public void put(long max_image_size_kb) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_image_size_kb");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_image_size_kb", max_image_size_kb);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxImageWidth {

                /**
                 * 
                 * <p>
                 * max image width
                 * </p>
                 * 
                 * @param max_image_width
                 *     Maximum thumbnail width of images in a post
                 */
                public void put(long max_image_width) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_image_width");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_image_width", max_image_width);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaximumBackups {

                /**
                 * 
                 * <p>
                 * maximum backups
                 * </p>
                 * 
                 * @param maximum_backups
                 *     "The maximum amount of backups to keep on disk. Older backups are automatically deleted"
                 *     
                 */
                public void put(long maximum_backups) {
                    String url = ("https://discourse.example.com//admin/site_settings/maximum_backups");
                    Map<String, Object> content = new HashMap<>();
                    content.put("maximum_backups", maximum_backups);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaximumSessionAge {

                /**
                 * 
                 * <p>
                 * maximum session age
                 * </p>
                 * 
                 * @param maximum_session_age
                 */
                public void put(long maximum_session_age) {
                    String url = ("https://discourse.example.com//admin/site_settings/maximum_session_age");
                    Map<String, Object> content = new HashMap<>();
                    content.put("maximum_session_age", maximum_session_age);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaximumStagedUsersPerEmail {

                /**
                 * 
                 * <p>
                 * maximum staged users per email
                 * </p>
                 * 
                 * @param maximum_staged_users_per_email
                 *     Maximum number of staged users created when processing an incoming email.
                 */
                public void put(long maximum_staged_users_per_email) {
                    String url = ("https://discourse.example.com//admin/site_settings/maximum_staged_users_per_email");
                    Map<String, Object> content = new HashMap<>();
                    content.put("maximum_staged_users_per_email", maximum_staged_users_per_email);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxInvitesPerDay {

                /**
                 * 
                 * <p>
                 * max invites per day
                 * </p>
                 * 
                 * @param max_invites_per_day
                 *     "Maximum number of invites a user can send per day."
                 *     
                 */
                public void put(long max_invites_per_day) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_invites_per_day");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_invites_per_day", max_invites_per_day);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxLikesPerDay {

                /**
                 * 
                 * <p>
                 * max likes per day
                 * </p>
                 * 
                 * @param max_likes_per_day
                 *     "Maximum number of likes per user per day."
                 *     
                 */
                public void put(long max_likes_per_day) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_likes_per_day");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_likes_per_day", max_likes_per_day);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxMentionsPerPost {

                /**
                 * 
                 * <p>
                 * max mentions per post
                 * </p>
                 * 
                 * @param max_mentions_per_post
                 */
                public void put(long max_mentions_per_post) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_mentions_per_post");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_mentions_per_post", max_mentions_per_post);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxNewAccountsPerRegistrationIp {

                /**
                 * 
                 * <p>
                 * max new accounts per registration ip
                 * </p>
                 * 
                 * @param max_new_accounts_per_registration_ip
                 *     "If there are already (n) trust level 0 accounts from this IP (and none is a staff member or at TL2 or higher), stop accepting new signups from that IP."
                 *     
                 */
                public void put(long max_new_accounts_per_registration_ip) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_new_accounts_per_registration_ip");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_new_accounts_per_registration_ip", max_new_accounts_per_registration_ip);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxOneboxesPerPost {

                /**
                 * 
                 * <p>
                 * max oneboxes per post
                 * </p>
                 * 
                 * @param max_oneboxes_per_post
                 *     "Enable embedding of swf and flv (Adobe Flash) links in oneboxes. WARNING: may introduce security risks."
                 *     
                 */
                public void put(long max_oneboxes_per_post) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_oneboxes_per_post");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_oneboxes_per_post", max_oneboxes_per_post);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxPostLength {

                /**
                 * 
                 * <p>
                 * max post length
                 * </p>
                 * 
                 * @param max_post_length
                 */
                public void put(long max_post_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_post_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_post_length", max_post_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxPrintsPerHourPerUser {

                /**
                 * 
                 * <p>
                 * max prints per hour per user
                 * </p>
                 * 
                 * @param max_prints_per_hour_per_user
                 *     "Maximum number of /print page impressions (set to 0 to disable)"
                 *     
                 */
                public void put(long max_prints_per_hour_per_user) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_prints_per_hour_per_user");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_prints_per_hour_per_user", max_prints_per_hour_per_user);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxPrivateMessagesPerDay {

                /**
                 * 
                 * <p>
                 * max private messages per day
                 * </p>
                 * 
                 * @param max_private_messages_per_day
                 *     "Maximum number of messages users can create per day."
                 *     
                 */
                public void put(long max_private_messages_per_day) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_private_messages_per_day");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_private_messages_per_day", max_private_messages_per_day);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxRepliesInFirstDay {

                /**
                 * 
                 * <p>
                 * max replies in first day
                 * </p>
                 * 
                 * @param max_replies_in_first_day
                 *     "The maximum number of replies a user is allowed to create in the 24 hour period after creating their first post"
                 *     
                 */
                public void put(long max_replies_in_first_day) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_replies_in_first_day");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_replies_in_first_day", max_replies_in_first_day);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxReplyHistory {

                /**
                 * 
                 * <p>
                 * max reply history
                 * </p>
                 * 
                 * @param max_reply_history
                 */
                public void put(long max_reply_history) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_reply_history");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_reply_history", max_reply_history);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxSimilarResults {

                /**
                 * 
                 * <p>
                 * max similar results
                 * </p>
                 * 
                 * @param max_similar_results
                 *     "How many similar topics to show above the editor when composing a new topic. Comparison is based on title and body."
                 *     
                 */
                public void put(long max_similar_results) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_similar_results");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_similar_results", max_similar_results);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxTagLength {

                /**
                 * 
                 * <p>
                 * "max tag length"
                 * </p>
                 * 
                 * @param max_tag_length
                 *     "The maximum amount of characters that can be used in a tag."
                 *     
                 */
                public void put(long max_tag_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_tag_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_tag_length", max_tag_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxTagSearchResults {

                /**
                 * 
                 * <p>
                 * "max_tag_search_results"
                 * </p>
                 * 
                 * @param max_tag_search_results
                 *     "When searching for tags, the maximum number of results to show."
                 *     
                 */
                public void put(long max_tag_search_results) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_tag_search_results");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_tag_search_results", max_tag_search_results);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxTagsInFilterList {

                /**
                 * 
                 * <p>
                 * "max tags in filter list"
                 * </p>
                 * 
                 * @param max_tags_in_filter_list
                 *     "Maximum number of tags to show in the filter dropdown. The most used tags will be shown."
                 *     
                 */
                public void put(long max_tags_in_filter_list) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_tags_in_filter_list");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_tags_in_filter_list", max_tags_in_filter_list);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxTagsPerTopic {

                /**
                 * 
                 * <p>
                 * "max tags per topic"
                 * </p>
                 * 
                 * @param max_tags_per_topic
                 *     "The maximum tags that can be applied to a topic."
                 *     
                 */
                public void put(long max_tags_per_topic) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_tags_per_topic");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_tags_per_topic", max_tags_per_topic);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxTopicInvitationsPerDay {

                /**
                 * 
                 * <p>
                 * max topic invitations per day
                 * </p>
                 * 
                 * @param max_topic_invitations_per_day
                 *     "Maximum number of topic invitations a user can send per day."
                 *     
                 */
                public void put(long max_topic_invitations_per_day) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_topic_invitations_per_day");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_topic_invitations_per_day", max_topic_invitations_per_day);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxTopicsInFirstDay {

                /**
                 * 
                 * <p>
                 * max topics in first day
                 * </p>
                 * 
                 * @param max_topics_in_first_day
                 *     "The maximum number of topics a user is allowed to create in the 24 hour period after creating their first post"
                 *     
                 */
                public void put(long max_topics_in_first_day) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_topics_in_first_day");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_topics_in_first_day", max_topics_in_first_day);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxTopicsPerDay {

                /**
                 * 
                 * <p>
                 * max topics per day
                 * </p>
                 * 
                 * @param max_topics_per_day
                 *     "Maximum number of topics a user can create per day."
                 *     
                 */
                public void put(long max_topics_per_day) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_topics_per_day");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_topics_per_day", max_topics_per_day);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxTopicTitleLength {

                /**
                 * 
                 * <p>
                 * max topic title length
                 * </p>
                 * 
                 * @param max_topic_title_length
                 */
                public void put(long max_topic_title_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_topic_title_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_topic_title_length", max_topic_title_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxUserApiReqsPerDay {

                /**
                 * 
                 * <p>
                 * "max user api reqs per day"
                 * </p>
                 * 
                 * @param max_user_api_reqs_per_day
                 *     "Maximum number of user API requests per key per day"
                 *     
                 */
                public void put(long max_user_api_reqs_per_day) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_user_api_reqs_per_day");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_user_api_reqs_per_day", max_user_api_reqs_per_day);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxUserApiReqsPerMinute {

                /**
                 * 
                 * <p>
                 * "max user api reqs per minute"
                 * </p>
                 * 
                 * @param max_user_api_reqs_per_minute
                 *     "Maximum number of user API requests per key per minute"
                 *     
                 */
                public void put(long max_user_api_reqs_per_minute) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_user_api_reqs_per_minute");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_user_api_reqs_per_minute", max_user_api_reqs_per_minute);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxUsernameLength {

                /**
                 * 
                 * <p>
                 * max username length
                 * </p>
                 * 
                 * @param max_username_length
                 */
                public void put(long max_username_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_username_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_username_length", max_username_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MaxUsersNotifiedPerGroupMention {

                /**
                 * 
                 * <p>
                 * max users notified per group mention
                 * </p>
                 * 
                 * @param max_users_notified_per_group_mention
                 */
                public void put(long max_users_notified_per_group_mention) {
                    String url = ("https://discourse.example.com//admin/site_settings/max_users_notified_per_group_mention");
                    Map<String, Object> content = new HashMap<>();
                    content.put("max_users_notified_per_group_mention", max_users_notified_per_group_mention);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinAdminPasswordLength {

                /**
                 * 
                 * <p>
                 * min admin password length
                 * </p>
                 * 
                 * @param min_admin_password_length
                 */
                public void put(long min_admin_password_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_admin_password_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_admin_password_length", min_admin_password_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinBanEntriesForRollUp {

                /**
                 * 
                 * <p>
                 * min ban entries for roll up
                 * </p>
                 * 
                 * @param min_ban_entries_for_roll_up
                 *     "When clicking the Roll up button, will create a new subnet ban entry if there are at least (N) entries."
                 *     
                 */
                public void put(long min_ban_entries_for_roll_up) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_ban_entries_for_roll_up");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_ban_entries_for_roll_up", min_ban_entries_for_roll_up);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinBodyTitleLength {

                /**
                 * 
                 * <p>
                 * min body title length
                 * </p>
                 * 
                 * @param min_body_title_length
                 */
                public void put(long min_body_title_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_body_title_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_body_title_length", min_body_title_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinFirstPostLength {

                /**
                 * 
                 * <p>
                 * min first post length
                 * </p>
                 * 
                 * @param min_first_post_length
                 */
                public void put(long min_first_post_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_first_post_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_first_post_length", min_first_post_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinFirstPostTypingTime {

                /**
                 * 
                 * <p>
                 * min first post typing time
                 * </p>
                 * 
                 * @param min_first_post_typing_time
                 *     "Minimum amount of time in milliseconds a user must type during first post, if threshold is not met post will automatically enter the needs approval queue. Set to 0 to disable (not recommended)"
                 *     
                 */
                public void put(long min_first_post_typing_time) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_first_post_typing_time");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_first_post_typing_time", min_first_post_typing_time);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinimumTopicsSimilar {

                /**
                 * 
                 * <p>
                 * minimum topics similar
                 * </p>
                 * 
                 * @param minimum_topics_similar
                 *     "How many topics need to exist before similar topics are presented when composing new topics."
                 *     
                 */
                public void put(long minimum_topics_similar) {
                    String url = ("https://discourse.example.com//admin/site_settings/minimum_topics_similar");
                    Map<String, Object> content = new HashMap<>();
                    content.put("minimum_topics_similar", minimum_topics_similar);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinPasswordLength {

                /**
                 * 
                 * <p>
                 * min password length
                 * </p>
                 * 
                 * @param min_password_length
                 */
                public void put(long min_password_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_password_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_password_length", min_password_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinPostLength {

                /**
                 * 
                 * <p>
                 * min post length
                 * </p>
                 * 
                 * @param min_post_length
                 */
                public void put(long min_post_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_post_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_post_length", min_post_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinPrivateMessagePostLength {

                /**
                 * 
                 * <p>
                 * min private message post length
                 * </p>
                 * 
                 * @param min_private_message_post_length
                 */
                public void put(long min_private_message_post_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_private_message_post_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_private_message_post_length", min_private_message_post_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinPrivateMessageTitleLength {

                /**
                 * 
                 * <p>
                 * min private message title length
                 * </p>
                 * 
                 * @param min_private_message_title_length
                 */
                public void put(long min_private_message_title_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_private_message_title_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_private_message_title_length", min_private_message_title_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinSearchTermLength {

                /**
                 * 
                 * <p>
                 * min search term length
                 * </p>
                 * 
                 * @param min_search_term_length
                 *     "Minimum valid search term length in characters"
                 *     
                 */
                public void put(long min_search_term_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_search_term_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_search_term_length", min_search_term_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinTitleSimilarLength {

                /**
                 * 
                 * <p>
                 * min_title_similar_length
                 * </p>
                 * 
                 * @param min_title_similar_length
                 */
                public void put(long min_title_similar_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_title_similar_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_title_similar_length", min_title_similar_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinTopicTitleLength {

                /**
                 * 
                 * <p>
                 * min topic title length
                 * </p>
                 * 
                 * @param min_topic_title_length
                 */
                public void put(long min_topic_title_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_topic_title_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_topic_title_length", min_topic_title_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinTrustLevelForUserApiKey {

                /**
                 * 
                 * <p>
                 * "min trust level for user api key"
                 * </p>
                 * 
                 * @param min_trust_level_for_user_api_key
                 *     "Trust level required for generation of user API keys"
                 *     
                 */
                public void put(long min_trust_level_for_user_api_key) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_trust_level_for_user_api_key");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_trust_level_for_user_api_key", min_trust_level_for_user_api_key);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinTrustLevelToTagTopics {

                /**
                 * 
                 * <p>
                 * "min trust level to tag topics"
                 * </p>
                 * 
                 * @param min_trust_level_to_tag_topics
                 *     "Minimum trust level required to tag topics"
                 *     
                 */
                public void put(long min_trust_level_to_tag_topics) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_trust_level_to_tag_topics");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_trust_level_to_tag_topics", min_trust_level_to_tag_topics);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinTrustToAllowSelfWiki {

                /**
                 * 
                 * <p>
                 * min trust to allow self wiki
                 * </p>
                 * 
                 * @param min_trust_to_allow_self_wiki
                 *     "The minimum trust level required to make user's own post wiki."
                 *     
                 */
                public void put(long min_trust_to_allow_self_wiki) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_trust_to_allow_self_wiki");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_trust_to_allow_self_wiki", min_trust_to_allow_self_wiki);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinTrustToCreateTag {

                /**
                 * 
                 * <p>
                 * "min trust to create tag"
                 * </p>
                 * 
                 * @param tagging_enabled
                 *     "The minimum trust level required to create a tag."
                 *     
                 */
                public void put(long tagging_enabled) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_trust_to_create_tag");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tagging_enabled", tagging_enabled);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinTrustToCreateTopic {

                /**
                 * 
                 * <p>
                 * min trust to create topic
                 * </p>
                 * 
                 * @param min_trust_to_create_topic
                 *     "The minimum trust level required to create a new topic"
                 *     
                 */
                public void put(long min_trust_to_create_topic) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_trust_to_create_topic");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_trust_to_create_topic", min_trust_to_create_topic);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinTrustToEditPost {

                /**
                 * 
                 * <p>
                 * min trust to edit post
                 * </p>
                 * 
                 * @param min_trust_to_edit_post
                 *     "The minimum trust level required to edit posts."
                 *     
                 */
                public void put(long min_trust_to_edit_post) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_trust_to_edit_post");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_trust_to_edit_post", min_trust_to_edit_post);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinTrustToEditWikiPost {

                /**
                 * 
                 * <p>
                 * min trust to edit wiki post
                 * </p>
                 * 
                 * @param min_trust_to_edit_wiki_post
                 *     "The minimum trust level required to edit post marked as wiki."
                 *     
                 */
                public void put(long min_trust_to_edit_wiki_post) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_trust_to_edit_wiki_post");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_trust_to_edit_wiki_post", min_trust_to_edit_wiki_post);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinTrustToSendMessages {

                /**
                 * 
                 * <p>
                 * min trust to send messages
                 * </p>
                 * 
                 * @param min_trust_to_send_messages
                 *     "The minimum trust level required to create new private messages."
                 *     
                 */
                public void put(long min_trust_to_send_messages) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_trust_to_send_messages");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_trust_to_send_messages", min_trust_to_send_messages);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MinUsernameLength {

                /**
                 * 
                 * <p>
                 * min username length
                 * </p>
                 * 
                 * @param min_username_length
                 */
                public void put(long min_username_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/min_username_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("min_username_length", min_username_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MobileLogoUrl {

                /**
                 * 
                 * <p>
                 * Update the mobile logo url
                 * </p>
                 * 
                 * @param mobile_logo_url
                 */
                public void put(String mobile_logo_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/mobile_logo_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("mobile_logo_url", mobile_logo_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class MustApproveUsers {

                /**
                 * 
                 * <p>
                 * Update must approve users
                 * </p>
                 * 
                 * @param must_approve_users
                 */
                public void put(boolean must_approve_users) {
                    String url = ("https://discourse.example.com//admin/site_settings/must_approve_users");
                    Map<String, Object> content = new HashMap<>();
                    content.put("must_approve_users", must_approve_users);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NativeAppInstallBanner {

                /**
                 * 
                 * <p>
                 * "native app install banner"
                 * </p>
                 * 
                 * @param native_app_install_banner
                 *     "Asks recurring visitors to install Discourse native app."
                 *     
                 */
                public void put(boolean native_app_install_banner) {
                    String url = ("https://discourse.example.com//admin/site_settings/native_app_install_banner");
                    Map<String, Object> content = new HashMap<>();
                    content.put("native_app_install_banner", native_app_install_banner);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NewuserMaxAttachments {

                /**
                 * 
                 * <p>
                 * newuser max attachments
                 * </p>
                 * 
                 * @param newuser_max_attachments
                 */
                public void put(long newuser_max_attachments) {
                    String url = ("https://discourse.example.com//admin/site_settings/newuser_max_attachments");
                    Map<String, Object> content = new HashMap<>();
                    content.put("newuser_max_attachments", newuser_max_attachments);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NewuserMaxImages {

                /**
                 * 
                 * <p>
                 * newuser max images
                 * </p>
                 * 
                 * @param newuser_max_images
                 */
                public void put(long newuser_max_images) {
                    String url = ("https://discourse.example.com//admin/site_settings/newuser_max_images");
                    Map<String, Object> content = new HashMap<>();
                    content.put("newuser_max_images", newuser_max_images);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NewuserMaxLinks {

                /**
                 * 
                 * <p>
                 * newuser max links
                 * </p>
                 * 
                 * @param newuser_max_links
                 */
                public void put(long newuser_max_links) {
                    String url = ("https://discourse.example.com//admin/site_settings/newuser_max_links");
                    Map<String, Object> content = new HashMap<>();
                    content.put("newuser_max_links", newuser_max_links);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NewuserMaxMentionsPerPost {

                /**
                 * 
                 * <p>
                 * newuser max mentions per post
                 * </p>
                 * 
                 * @param newuser_max_mentions_per_post
                 */
                public void put(long newuser_max_mentions_per_post) {
                    String url = ("https://discourse.example.com//admin/site_settings/newuser_max_mentions_per_post");
                    Map<String, Object> content = new HashMap<>();
                    content.put("newuser_max_mentions_per_post", newuser_max_mentions_per_post);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NewuserMaxRepliesPerTopic {

                /**
                 * 
                 * <p>
                 * newuser max replies per topic
                 * </p>
                 * 
                 * @param newuser_max_replies_per_topic
                 */
                public void put(long newuser_max_replies_per_topic) {
                    String url = ("https://discourse.example.com//admin/site_settings/newuser_max_replies_per_topic");
                    Map<String, Object> content = new HashMap<>();
                    content.put("newuser_max_replies_per_topic", newuser_max_replies_per_topic);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NewuserSpamHostThreshold {

                /**
                 * 
                 * <p>
                 * newuser spam host threshold
                 * </p>
                 * 
                 * @param newuser_spam_host_threshold
                 *     "How many times a new user can post a link to the same host within their `newuser_spam_host_threshold` posts before being considered spam."
                 *     
                 */
                public void put(long newuser_spam_host_threshold) {
                    String url = ("https://discourse.example.com//admin/site_settings/newuser_spam_host_threshold");
                    Map<String, Object> content = new HashMap<>();
                    content.put("newuser_spam_host_threshold", newuser_spam_host_threshold);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NewVersionEmails {

                /**
                 * 
                 * <p>
                 * new version emails
                 * </p>
                 * 
                 * @param new_version_emails
                 *     "Send an email to the contact_email address when a new version of Discourse is available."
                 *     
                 */
                public void put(boolean new_version_emails) {
                    String url = ("https://discourse.example.com//admin/site_settings/new_version_emails");
                    Map<String, Object> content = new HashMap<>();
                    content.put("new_version_emails", new_version_emails);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NotificationEmail {

                /**
                 * 
                 * <p>
                 * Update the notification email
                 * </p>
                 * 
                 * @param notification_email
                 */
                public void put(String notification_email) {
                    String url = ("https://discourse.example.com//admin/site_settings/notification_email");
                    Map<String, Object> content = new HashMap<>();
                    content.put("notification_email", notification_email);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NotifyAboutFlagsAfter {

                /**
                 * 
                 * <p>
                 * notify about flags after
                 * </p>
                 * 
                 * @param notify_about_flags_after
                 *     "If there are flags that haven't been handled after this many hours, send an email to the contact_email. Set to 0 to disable."
                 *     
                 */
                public void put(long notify_about_flags_after) {
                    String url = ("https://discourse.example.com//admin/site_settings/notify_about_flags_after");
                    Map<String, Object> content = new HashMap<>();
                    content.put("notify_about_flags_after", notify_about_flags_after);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NotifyAboutQueuedPostsAfter {

                /**
                 * 
                 * <p>
                 * notify about queued posts after
                 * </p>
                 * 
                 * @param notify_about_queued_posts_after
                 */
                public void put(long notify_about_queued_posts_after) {
                    String url = ("https://discourse.example.com//admin/site_settings/notify_about_queued_posts_after");
                    Map<String, Object> content = new HashMap<>();
                    content.put("notify_about_queued_posts_after", notify_about_queued_posts_after);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NotifyModsWhenUserBlocked {

                /**
                 * 
                 * <p>
                 * notify mods when user blocked
                 * </p>
                 * 
                 * @param notify_mods_when_user_blocked
                 *     "If a user is automatically blocked, send a message to all moderators."
                 *     
                 */
                public void put(boolean notify_mods_when_user_blocked) {
                    String url = ("https://discourse.example.com//admin/site_settings/notify_mods_when_user_blocked");
                    Map<String, Object> content = new HashMap<>();
                    content.put("notify_mods_when_user_blocked", notify_mods_when_user_blocked);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NumFlaggersToCloseTopic {

                /**
                 * 
                 * <p>
                 * num flaggers to close topic
                 * </p>
                 * 
                 * @param num_flaggers_to_close_topic
                 *     "Minimum number of unique flaggers that is required to automatically pause a topic for intervention"
                 *     
                 */
                public void put(long num_flaggers_to_close_topic) {
                    String url = ("https://discourse.example.com//admin/site_settings/num_flaggers_to_close_topic");
                    Map<String, Object> content = new HashMap<>();
                    content.put("num_flaggers_to_close_topic", num_flaggers_to_close_topic);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NumFlagsToCloseTopic {

                /**
                 * 
                 * <p>
                 * num flags to close topic
                 * </p>
                 * 
                 * @param num_flags_to_close_topic
                 *     "Minimum number of active flags that is required to automatically pause a topic for intervention"
                 *     
                 */
                public void put(long num_flags_to_close_topic) {
                    String url = ("https://discourse.example.com//admin/site_settings/num_flags_to_close_topic");
                    Map<String, Object> content = new HashMap<>();
                    content.put("num_flags_to_close_topic", num_flags_to_close_topic);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NumSpamFlagsToBlockNewUser {

                /**
                 * 
                 * <p>
                 * num spam flags to block new user
                 * </p>
                 * 
                 * @param num_spam_flags_to_block_new_user
                 *     "If a new user's posts get this many spam flags from num_users_to_block_new_user different users, hide all their posts and prevent future posting. 0 to disable."
                 *     
                 */
                public void put(long num_spam_flags_to_block_new_user) {
                    String url = ("https://discourse.example.com//admin/site_settings/num_spam_flags_to_block_new_user");
                    Map<String, Object> content = new HashMap<>();
                    content.put("num_spam_flags_to_block_new_user", num_spam_flags_to_block_new_user);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NumTl3FlagsToBlockNewUser {

                /**
                 * 
                 * <p>
                 * num tl3 flags to block new user
                 * </p>
                 * 
                 * @param num_tl3_flags_to_block_new_user
                 *     "If a new user's posts get this many flags from num_tl3_users_to_block_new_user different trust level 3 users, hide all their posts and prevent future posting. 0 to disable."
                 *     
                 */
                public void put(long num_tl3_flags_to_block_new_user) {
                    String url = ("https://discourse.example.com//admin/site_settings/num_tl3_flags_to_block_new_user");
                    Map<String, Object> content = new HashMap<>();
                    content.put("num_tl3_flags_to_block_new_user", num_tl3_flags_to_block_new_user);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NumTl3UsersToBlockNewUser {

                /**
                 * 
                 * <p>
                 * num tl3 users to block new user
                 * </p>
                 * 
                 * @param num_tl3_users_to_block_new_user
                 *     "If a new user's posts get num_tl3_flags_to_block_new_user flags from this many different trust level 3 users, hide all their posts and prevent future posting. 0 to disable."
                 *     
                 */
                public void put(long num_tl3_users_to_block_new_user) {
                    String url = ("https://discourse.example.com//admin/site_settings/num_tl3_users_to_block_new_user");
                    Map<String, Object> content = new HashMap<>();
                    content.put("num_tl3_users_to_block_new_user", num_tl3_users_to_block_new_user);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class NumUsersToBlockNewUser {

                /**
                 * 
                 * <p>
                 * num users to block new user
                 * </p>
                 * 
                 * @param num_users_to_block_new_user
                 *     "If a new user's posts get num_spam_flags_to_block_new_user spam flags from this many different users, hide all their posts and prevent future posting. 0 to disable."
                 *     
                 */
                public void put(long num_users_to_block_new_user) {
                    String url = ("https://discourse.example.com//admin/site_settings/num_users_to_block_new_user");
                    Map<String, Object> content = new HashMap<>();
                    content.put("num_users_to_block_new_user", num_users_to_block_new_user);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class OneboxDomainsBlacklist {

                /**
                 * 
                 * <p>
                 * onebox domains blacklist
                 * </p>
                 * 
                 * @param onebox_domains_blacklist
                 *     "A list of domains that will never be oneboxed."
                 *     
                 */
                public void put(String onebox_domains_blacklist) {
                    String url = ("https://discourse.example.com//admin/site_settings/onebox_domains_blacklist");
                    Map<String, Object> content = new HashMap<>();
                    content.put("onebox_domains_blacklist", onebox_domains_blacklist);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PendingUsersReminderDelay {

                /**
                 * 
                 * <p>
                 * pending users reminder delay
                 * </p>
                 * 
                 * @param pending_users_reminder_delay
                 */
                public void put(long pending_users_reminder_delay) {
                    String url = ("https://discourse.example.com//admin/site_settings/pending_users_reminder_delay");
                    Map<String, Object> content = new HashMap<>();
                    content.put("pending_users_reminder_delay", pending_users_reminder_delay);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PermalinkNormalizations {

                /**
                 * 
                 * <p>
                 * permalink normalizations
                 * </p>
                 * 
                 * @param permalink_normalizations
                 *     "Apply the following regex before matching permalinks, for example: /(topic.*)\?.*<!---->/\1 will strip query strings from topic routes. Format is regex+string use \1 etc. to access captures"
                 *     
                 */
                public void put(String permalink_normalizations) {
                    String url = ("https://discourse.example.com//admin/site_settings/permalink_normalizations");
                    Map<String, Object> content = new HashMap<>();
                    content.put("permalink_normalizations", permalink_normalizations);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PollEditWindowMins {

                /**
                 * 
                 * <p>
                 * poll edit window mins
                 * </p>
                 * 
                 * @param poll_edit_window_mins
                 *     Number of minutes after post creation during which polls can be edited.
                 *     
                 */
                public void put(long poll_edit_window_mins) {
                    String url = ("https://discourse.example.com//admin/site_settings/poll_edit_window_mins");
                    Map<String, Object> content = new HashMap<>();
                    content.put("poll_edit_window_mins", poll_edit_window_mins);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PollEnabled {

                /**
                 * 
                 * <p>
                 * "poll enabled"
                 * </p>
                 * 
                 * @param poll_enabled
                 *     "Allow users to create polls?"
                 *     
                 */
                public void put(boolean poll_enabled) {
                    String url = ("https://discourse.example.com//admin/site_settings/poll_enabled");
                    Map<String, Object> content = new HashMap<>();
                    content.put("poll_enabled", poll_enabled);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PollingInterval {

                /**
                 * 
                 * <p>
                 * polling interval
                 * </p>
                 * 
                 * @param polling_interval
                 *     "When not long polling, how often should logged on clients poll in milliseconds"
                 *     
                 */
                public void put(long polling_interval) {
                    String url = ("https://discourse.example.com//admin/site_settings/polling_interval");
                    Map<String, Object> content = new HashMap<>();
                    content.put("polling_interval", polling_interval);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PollMaximumOptions {

                /**
                 * 
                 * <p>
                 * "poll maximum options"
                 * </p>
                 * 
                 * @param poll_maximum_options
                 *     "Maximum number of options allowed in a poll."
                 *     
                 */
                public void put(long poll_maximum_options) {
                    String url = ("https://discourse.example.com//admin/site_settings/poll_maximum_options");
                    Map<String, Object> content = new HashMap<>();
                    content.put("poll_maximum_options", poll_maximum_options);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Pop3PollingEnabled {

                /**
                 * 
                 * <p>
                 * pop3 polling enabled
                 * </p>
                 * 
                 * @param pop3_polling_enabled
                 *     You must set a 'pop3 polling host' before enabling POP3 polling
                 */
                public void put(boolean pop3_polling_enabled) {
                    String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_enabled");
                    Map<String, Object> content = new HashMap<>();
                    content.put("pop3_polling_enabled", pop3_polling_enabled);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Pop3PollingHost {

                /**
                 * 
                 * <p>
                 * pop3 polling host
                 * </p>
                 * 
                 * @param pop3_polling_host
                 *     The host to poll for email via POP3
                 */
                public void put(String pop3_polling_host) {
                    String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_host");
                    Map<String, Object> content = new HashMap<>();
                    content.put("pop3_polling_host", pop3_polling_host);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Pop3PollingOpensslVerify {

                /**
                 * 
                 * <p>
                 * pop3 polling openssl verify
                 * </p>
                 * 
                 * @param pop3_polling_openssl_verify
                 *     Verify TLS server certificate
                 */
                public void put(boolean pop3_polling_openssl_verify) {
                    String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_openssl_verify");
                    Map<String, Object> content = new HashMap<>();
                    content.put("pop3_polling_openssl_verify", pop3_polling_openssl_verify);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Pop3PollingPassword {

                /**
                 * 
                 * <p>
                 * pop3 polling password
                 * </p>
                 * 
                 * @param pop3_polling_password
                 *     The password for the POP3 account to poll for email.
                 */
                public void put(String pop3_polling_password) {
                    String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_password");
                    Map<String, Object> content = new HashMap<>();
                    content.put("pop3_polling_password", pop3_polling_password);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Pop3PollingPeriodMins {

                /**
                 * 
                 * <p>
                 * pop3 polling period mins
                 * </p>
                 * 
                 * @param pop3_polling_period_mins
                 *     "The period in minutes between checking the POP3 account for email. NOTE: requires restart."
                 *     
                 */
                public void put(long pop3_polling_period_mins) {
                    String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_period_mins");
                    Map<String, Object> content = new HashMap<>();
                    content.put("pop3_polling_period_mins", pop3_polling_period_mins);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Pop3PollingPort {

                /**
                 * 
                 * <p>
                 * pop3 polling port
                 * </p>
                 * 
                 * @param pop3_polling_port
                 *     The port to poll a POP3 account on
                 */
                public void put(long pop3_polling_port) {
                    String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_port");
                    Map<String, Object> content = new HashMap<>();
                    content.put("pop3_polling_port", pop3_polling_port);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Pop3PollingSsl {

                /**
                 * 
                 * <p>
                 * pop3 polling ssl
                 * </p>
                 * 
                 * @param pop3_polling_ssl
                 *     Use SSL while connecting to the POP3 server
                 */
                public void put(boolean pop3_polling_ssl) {
                    String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_ssl");
                    Map<String, Object> content = new HashMap<>();
                    content.put("pop3_polling_ssl", pop3_polling_ssl);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Pop3PollingUsername {

                /**
                 * 
                 * <p>
                 * pop3 polling username
                 * </p>
                 * 
                 * @param pop3_polling_username
                 *     The username for the POP3 account to poll for email.
                 */
                public void put(String pop3_polling_username) {
                    String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_username");
                    Map<String, Object> content = new HashMap<>();
                    content.put("pop3_polling_username", pop3_polling_username);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Port {

                /**
                 * 
                 * <p>
                 * port
                 * </p>
                 * 
                 * @param port
                 *     "DEVELOPER ONLY! WARNING! Use this HTTP port rather than the default of port 80. Leave blank for default of 80."
                 *     
                 */
                public void put(long port) {
                    String url = ("https://discourse.example.com//admin/site_settings/port");
                    Map<String, Object> content = new HashMap<>();
                    content.put("port", port);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PostEditTimeLimit {

                /**
                 * 
                 * <p>
                 * post edit time limit
                 * </p>
                 * 
                 * @param post_edit_time_limit
                 */
                public void put(long post_edit_time_limit) {
                    String url = ("https://discourse.example.com//admin/site_settings/post_edit_time_limit");
                    Map<String, Object> content = new HashMap<>();
                    content.put("post_edit_time_limit", post_edit_time_limit);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PostExcerptMaxlength {

                /**
                 * 
                 * <p>
                 * post excerpt maxlength
                 * </p>
                 * 
                 * @param post_excerpt_maxlength
                 */
                public void put(long post_excerpt_maxlength) {
                    String url = ("https://discourse.example.com//admin/site_settings/post_excerpt_maxlength");
                    Map<String, Object> content = new HashMap<>();
                    content.put("post_excerpt_maxlength", post_excerpt_maxlength);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PostMenu {

                /**
                 * 
                 * <p>
                 * Update the post menu items
                 * </p>
                 * 
                 * @param post_menu
                 *     pipe delimited
                 */
                public void put(discourse.example.com.structures.post_menu post_menu) {
                    String url = ("https://discourse.example.com//admin/site_settings/post_menu");
                    Map<String, Object> content = new HashMap<>();
                    content.put("post_menu", post_menu);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PostMenuHiddenItems {

                /**
                 * 
                 * <p>
                 * Update the post menu hidden items
                 * </p>
                 * 
                 * @param post_menu_hidden_items
                 *     pipe delimited
                 */
                public void put(discourse.example.com.structures.post_menu_hidden_items post_menu_hidden_items) {
                    String url = ("https://discourse.example.com//admin/site_settings/post_menu_hidden_items");
                    Map<String, Object> content = new HashMap<>();
                    content.put("post_menu_hidden_items", post_menu_hidden_items);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PostOneboxMaxlength {

                /**
                 * 
                 * <p>
                 * post onebox maxlength
                 * </p>
                 * 
                 * @param post_onebox_maxlength
                 *     "Maximum length of a oneboxed Discourse post in characters."
                 *     
                 */
                public void put(long post_onebox_maxlength) {
                    String url = ("https://discourse.example.com//admin/site_settings/post_onebox_maxlength");
                    Map<String, Object> content = new HashMap<>();
                    content.put("post_onebox_maxlength", post_onebox_maxlength);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PostUndoActionWindowMins {

                /**
                 * 
                 * <p>
                 * post undo action window mins
                 * </p>
                 * 
                 * @param post_undo_action_window_mins
                 */
                public void put(long post_undo_action_window_mins) {
                    String url = ("https://discourse.example.com//admin/site_settings/post_undo_action_window_mins");
                    Map<String, Object> content = new HashMap<>();
                    content.put("post_undo_action_window_mins", post_undo_action_window_mins);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PreventAnonsFromDownloadingFiles {

                /**
                 * 
                 * <p>
                 * prevent anons from downloading files
                 * </p>
                 * 
                 * @param prevent_anons_from_downloading_files
                 *     "Prevent anonymous users from downloading attachments. WARNING: this will prevent any non-image site assets posted as attachments from working."
                 *     
                 */
                public void put(boolean prevent_anons_from_downloading_files) {
                    String url = ("https://discourse.example.com//admin/site_settings/prevent_anons_from_downloading_files");
                    Map<String, Object> content = new HashMap<>();
                    content.put("prevent_anons_from_downloading_files", prevent_anons_from_downloading_files);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PreviousVisitTimeoutHours {

                /**
                 * 
                 * <p>
                 * previous visit timeout hours
                 * </p>
                 * 
                 * @param previous_visit_timeout_hours
                 *     "How long a visit lasts before we consider it the 'previous' visit, in hours"
                 *     
                 */
                public void put(long previous_visit_timeout_hours) {
                    String url = ("https://discourse.example.com//admin/site_settings/previous_visit_timeout_hours");
                    Map<String, Object> content = new HashMap<>();
                    content.put("previous_visit_timeout_hours", previous_visit_timeout_hours);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PrioritizeUsernameInUx {

                /**
                 * 
                 * <p>
                 * prioritize username in ux
                 * </p>
                 * 
                 * @param prioritize_username_in_ux
                 */
                public void put(boolean prioritize_username_in_ux) {
                    String url = ("https://discourse.example.com//admin/site_settings/prioritize_username_in_ux");
                    Map<String, Object> content = new HashMap<>();
                    content.put("prioritize_username_in_ux", prioritize_username_in_ux);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PrivacyPolicyUrl {

                /**
                 * 
                 * <p>
                 * privacy policy url
                 * </p>
                 * 
                 * @param privacy_policy_url
                 *     "If you have a Privacy Policy document hosted elsewhere that you want to use, provide the full URL here."
                 *     
                 */
                public void put(String privacy_policy_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/privacy_policy_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("privacy_policy_url", privacy_policy_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PrivateEmailTimeWindowSeconds {

                /**
                 * 
                 * <p>
                 * private email time window seconds
                 * </p>
                 * 
                 * @param private_email_time_window_seconds
                 */
                public void put(long private_email_time_window_seconds) {
                    String url = ("https://discourse.example.com//admin/site_settings/private_email_time_window_seconds");
                    Map<String, Object> content = new HashMap<>();
                    content.put("private_email_time_window_seconds", private_email_time_window_seconds);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PublicUserCustomFields {

                /**
                 * 
                 * <p>
                 * public user custom fields
                 * </p>
                 * 
                 * @param public_user_custom_fields
                 */
                public void put(String public_user_custom_fields) {
                    String url = ("https://discourse.example.com//admin/site_settings/public_user_custom_fields");
                    Map<String, Object> content = new HashMap<>();
                    content.put("public_user_custom_fields", public_user_custom_fields);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PurgeDeletedUploadsGracePeriodDays {

                /**
                 * 
                 * <p>
                 * purge deleted uploads grace period days
                 * </p>
                 * 
                 * @param purge_deleted_uploads_grace_period_days
                 *     "Grace period (in days) before a deleted upload is erased."
                 *     
                 */
                public void put(long purge_deleted_uploads_grace_period_days) {
                    String url = ("https://discourse.example.com//admin/site_settings/purge_deleted_uploads_grace_period_days");
                    Map<String, Object> content = new HashMap<>();
                    content.put("purge_deleted_uploads_grace_period_days", purge_deleted_uploads_grace_period_days);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class PurgeUnactivatedUsersGracePeriodDays {

                /**
                 * 
                 * <p>
                 * purge unactivated users grace period days
                 * </p>
                 * 
                 * @param purge_unactivated_users_grace_period_days
                 */
                public void put(long purge_unactivated_users_grace_period_days) {
                    String url = ("https://discourse.example.com//admin/site_settings/purge_unactivated_users_grace_period_days");
                    Map<String, Object> content = new HashMap<>();
                    content.put("purge_unactivated_users_grace_period_days", purge_unactivated_users_grace_period_days);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class QueueJobs {

                /**
                 * 
                 * <p>
                 * queue jobs
                 * </p>
                 * 
                 * @param port
                 *     "DEVELOPER ONLY! WARNING! By default, queue jobs in sidekiq. If disabled, your site will be broken."
                 *     
                 */
                public void put(boolean port) {
                    String url = ("https://discourse.example.com//admin/site_settings/queue_jobs");
                    Map<String, Object> content = new HashMap<>();
                    content.put("port", port);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class RateLimitCreatePost {

                /**
                 * 
                 * <p>
                 * rate limit create post
                 * </p>
                 * 
                 * @param rate_limit_create_post
                 *     "After posting, users must wait (n) seconds before creating another post."
                 *     
                 */
                public void put(long rate_limit_create_post) {
                    String url = ("https://discourse.example.com//admin/site_settings/rate_limit_create_post");
                    Map<String, Object> content = new HashMap<>();
                    content.put("rate_limit_create_post", rate_limit_create_post);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class RateLimitCreateTopic {

                /**
                 * 
                 * <p>
                 * rate limit create topic
                 * </p>
                 * 
                 * @param rate_limit_create_topic
                 *     "After creating a topic, users must wait (n) seconds before creating another topic."
                 *     
                 */
                public void put(long rate_limit_create_topic) {
                    String url = ("https://discourse.example.com//admin/site_settings/rate_limit_create_topic");
                    Map<String, Object> content = new HashMap<>();
                    content.put("rate_limit_create_topic", rate_limit_create_topic);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class RateLimitNewUserCreatePost {

                /**
                 * 
                 * <p>
                 * rate limit new user create post
                 * </p>
                 * 
                 * @param rate_limit_new_user_create_post
                 *     "After posting, new users must wait (n) seconds before creating another post."
                 *     
                 */
                public void put(long rate_limit_new_user_create_post) {
                    String url = ("https://discourse.example.com//admin/site_settings/rate_limit_new_user_create_post");
                    Map<String, Object> content = new HashMap<>();
                    content.put("rate_limit_new_user_create_post", rate_limit_new_user_create_post);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class RateLimitNewUserCreateTopic {

                /**
                 * 
                 * <p>
                 * rate limit new user create topic
                 * </p>
                 * 
                 * @param rate_limit_new_user_create_topic
                 *     "After creating a topic, new users must wait (n) seconds before creating another topic."
                 *     
                 */
                public void put(long rate_limit_new_user_create_topic) {
                    String url = ("https://discourse.example.com//admin/site_settings/rate_limit_new_user_create_topic");
                    Map<String, Object> content = new HashMap<>();
                    content.put("rate_limit_new_user_create_topic", rate_limit_new_user_create_topic);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ReadonlyModeDuringBackup {

                /**
                 * 
                 * <p>
                 * readonly_mode_during_backup
                 * </p>
                 * 
                 * @param readonly_mode_during_backup
                 *     "Enable read only mode while taking a backup"
                 *     
                 */
                public void put(boolean readonly_mode_during_backup) {
                    String url = ("https://discourse.example.com//admin/site_settings/readonly_mode_during_backup");
                    Map<String, Object> content = new HashMap<>();
                    content.put("readonly_mode_during_backup", readonly_mode_during_backup);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ReadTimeWordCount {

                /**
                 * 
                 * <p>
                 * read time word count
                 * </p>
                 * 
                 * @param read_time_word_count
                 *     "Word count per minute for calculating estimated reading time."
                 *     
                 */
                public void put(long read_time_word_count) {
                    String url = ("https://discourse.example.com//admin/site_settings/read_time_word_count");
                    Map<String, Object> content = new HashMap<>();
                    content.put("read_time_word_count", read_time_word_count);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class RebakeOldPostsCount {

                /**
                 * 
                 * <p>
                 * rebake old posts count
                 * </p>
                 * 
                 * @param rebake_old_posts_count
                 *     "Number of old posts to be rebaked every 15 minutes."
                 *     
                 */
                public void put(long rebake_old_posts_count) {
                    String url = ("https://discourse.example.com//admin/site_settings/rebake_old_posts_count");
                    Map<String, Object> content = new HashMap<>();
                    content.put("rebake_old_posts_count", rebake_old_posts_count);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class RedirectUsersToTopPage {

                /**
                 * 
                 * <p>
                 * redirect users to top page
                 * </p>
                 * 
                 * @param redirect_users_to_top_page
                 */
                public void put(boolean redirect_users_to_top_page) {
                    String url = ("https://discourse.example.com//admin/site_settings/redirect_users_to_top_page");
                    Map<String, Object> content = new HashMap<>();
                    content.put("redirect_users_to_top_page", redirect_users_to_top_page);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class RelativeDateDuration {

                /**
                 * 
                 * <p>
                 * Update relative date duration
                 * </p>
                 * 
                 * @param relative_date_duration
                 */
                public void put(long relative_date_duration) {
                    String url = ("https://discourse.example.com//admin/site_settings/relative_date_duration");
                    Map<String, Object> content = new HashMap<>();
                    content.put("relative_date_duration", relative_date_duration);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class RemoveMutedTagsFromLatest {

                /**
                 * 
                 * <p>
                 * "remove muted tags from latest"
                 * </p>
                 * 
                 * @param remove_muted_tags_from_latest
                 *     "Don't show topics tagged with muted tags in the latest topic list."
                 *     
                 */
                public void put(boolean remove_muted_tags_from_latest) {
                    String url = ("https://discourse.example.com//admin/site_settings/remove_muted_tags_from_latest");
                    Map<String, Object> content = new HashMap<>();
                    content.put("remove_muted_tags_from_latest", remove_muted_tags_from_latest);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ReplyByEmailAddress {

                /**
                 * 
                 * <p>
                 * reply by email address
                 * </p>
                 * 
                 * @param reply_by_email_address
                 *     Template for reply by email incoming email address.
                 */
                public void put(String reply_by_email_address) {
                    String url = ("https://discourse.example.com//admin/site_settings/reply_by_email_address");
                    Map<String, Object> content = new HashMap<>();
                    content.put("reply_by_email_address", reply_by_email_address);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ReplyByEmailEnabled {

                /**
                 * 
                 * <p>
                 * reply by email enabled
                 * </p>
                 * 
                 * @param reply_by_email_enabled
                 *     `reply_by_email_address` needs to be set first
                 */
                public void put(boolean reply_by_email_enabled) {
                    String url = ("https://discourse.example.com//admin/site_settings/reply_by_email_enabled");
                    Map<String, Object> content = new HashMap<>();
                    content.put("reply_by_email_enabled", reply_by_email_enabled);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ReservedUsernames {

                /**
                 * 
                 * <p>
                 * reserved usernames
                 * </p>
                 * 
                 * @param reserved_usernames
                 *     pipe delimited
                 *     
                 */
                public void put(String reserved_usernames) {
                    String url = ("https://discourse.example.com//admin/site_settings/reserved_usernames");
                    Map<String, Object> content = new HashMap<>();
                    content.put("reserved_usernames", reserved_usernames);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ResetBounceScoreAfterDays {

                /**
                 * 
                 * <p>
                 * reset bounce score after days
                 * </p>
                 * 
                 * @param reset_bounce_score_after_days
                 *     Automatically reset bounce score after X days.
                 */
                public void put(long reset_bounce_score_after_days) {
                    String url = ("https://discourse.example.com//admin/site_settings/reset_bounce_score_after_days");
                    Map<String, Object> content = new HashMap<>();
                    content.put("reset_bounce_score_after_days", reset_bounce_score_after_days);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class S3AccessKeyId {

                /**
                 * 
                 * <p>
                 * s3 access key id
                 * </p>
                 * 
                 * @param s3_access_key_id
                 *     "The Amazon S3 access key id that will be used to upload images."
                 *     
                 */
                public void put(String s3_access_key_id) {
                    String url = ("https://discourse.example.com//admin/site_settings/s3_access_key_id");
                    Map<String, Object> content = new HashMap<>();
                    content.put("s3_access_key_id", s3_access_key_id);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class S3BackupBucket {

                /**
                 * 
                 * <p>
                 * s3 backup bucket
                 * </p>
                 * 
                 * @param s3_backup_bucket
                 *     "The remote bucket to hold backups. WARNING: Make sure it is a private bucket."
                 *     
                 */
                public void put(String s3_backup_bucket) {
                    String url = ("https://discourse.example.com//admin/site_settings/s3_backup_bucket");
                    Map<String, Object> content = new HashMap<>();
                    content.put("s3_backup_bucket", s3_backup_bucket);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class S3CdnUrl {

                /**
                 * 
                 * <p>
                 * s3 cdn url
                 * </p>
                 * 
                 * @param s3_cdn_url
                 *     "The CDN URL to use for all s3 assets (for example: https://cdn.somewhere.com). WARNING: after changing this setting you must rebake all old posts."
                 *     
                 */
                public void put(String s3_cdn_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/s3_cdn_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("s3_cdn_url", s3_cdn_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class S3DisableCleanup {

                /**
                 * 
                 * <p>
                 * s3 disable cleanup
                 * </p>
                 * 
                 * @param s3_disable_cleanup
                 *     "Disable the removal of backups from S3 when removed locally."
                 *     
                 */
                public void put(boolean s3_disable_cleanup) {
                    String url = ("https://discourse.example.com//admin/site_settings/s3_disable_cleanup");
                    Map<String, Object> content = new HashMap<>();
                    content.put("s3_disable_cleanup", s3_disable_cleanup);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class S3Region {

                /**
                 * 
                 * <p>
                 * s3 region
                 * </p>
                 * 
                 * @param s3_region
                 *     "The Amazon S3 region name that will be used to upload images."
                 *     
                 */
                public void put(discourse.example.com.structures.s3_region s3_region) {
                    String url = ("https://discourse.example.com//admin/site_settings/s3_region");
                    Map<String, Object> content = new HashMap<>();
                    content.put("s3_region", s3_region);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class S3SecretAccessKey {

                /**
                 * 
                 * <p>
                 * s3 secret access key
                 * </p>
                 * 
                 * @param s3_secret_access_key
                 *     "The Amazon S3 secret access key that will be used to upload images."
                 *     
                 */
                public void put(String s3_secret_access_key) {
                    String url = ("https://discourse.example.com//admin/site_settings/s3_secret_access_key");
                    Map<String, Object> content = new HashMap<>();
                    content.put("s3_secret_access_key", s3_secret_access_key);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class S3UploadBucket {

                /**
                 * 
                 * <p>
                 * s3 upload bucket
                 * </p>
                 * 
                 * @param s3_upload_bucket
                 *     "The Amazon S3 bucket name that files will be uploaded into. WARNING: must be lowercase, no periods, no underscores."
                 *     
                 */
                public void put(String s3_upload_bucket) {
                    String url = ("https://discourse.example.com//admin/site_settings/s3_upload_bucket");
                    Map<String, Object> content = new HashMap<>();
                    content.put("s3_upload_bucket", s3_upload_bucket);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class S3UseIamProfile {

                /**
                 * 
                 * <p>
                 * s3 use iam profile
                 * </p>
                 * 
                 * @param s3_use_iam_profile
                 *     'Use AWS EC2 IAM role to retrieve keys. NOTE: enabling will override "s3 access key id" and "s3 secret access key" settings.'
                 *     
                 */
                public void put(boolean s3_use_iam_profile) {
                    String url = ("https://discourse.example.com//admin/site_settings/s3_use_iam_profile");
                    Map<String, Object> content = new HashMap<>();
                    content.put("s3_use_iam_profile", s3_use_iam_profile);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SearchPreferRecentPosts {

                /**
                 * 
                 * <p>
                 * search prefer recent posts
                 * </p>
                 * 
                 * @param search_prefer_recent_posts
                 *     "If searching your large forum is slow, this option tries an index of more recent posts first"
                 *     
                 */
                public void put(boolean search_prefer_recent_posts) {
                    String url = ("https://discourse.example.com//admin/site_settings/search_prefer_recent_posts");
                    Map<String, Object> content = new HashMap<>();
                    content.put("search_prefer_recent_posts", search_prefer_recent_posts);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SearchRecentPostsSize {

                /**
                 * 
                 * <p>
                 * search recent posts size
                 * </p>
                 * 
                 * @param search_recent_posts_size
                 *     "How many recent posts to keep in the index"
                 *     
                 */
                public void put(long search_recent_posts_size) {
                    String url = ("https://discourse.example.com//admin/site_settings/search_recent_posts_size");
                    Map<String, Object> content = new HashMap<>();
                    content.put("search_recent_posts_size", search_recent_posts_size);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SearchTokenizeChineseJapaneseKorean {

                /**
                 * 
                 * <p>
                 * search tokenize chinese japanese korean
                 * </p>
                 * 
                 * @param search_tokenize_chinese_japanese_korean
                 *     "Force search to tokenize Chinese/Japanese/Korean even on non CJK sites"
                 *     
                 */
                public void put(boolean search_tokenize_chinese_japanese_korean) {
                    String url = ("https://discourse.example.com//admin/site_settings/search_tokenize_chinese_japanese_korean");
                    Map<String, Object> content = new HashMap<>();
                    content.put("search_tokenize_chinese_japanese_korean", search_tokenize_chinese_japanese_korean);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SendWelcomeMessage {

                /**
                 * 
                 * <p>
                 * send welcome message
                 * </p>
                 * 
                 * @param send_welcome_message
                 *     "Send all new users a welcome message with a quick start guide."
                 *     
                 */
                public void put(boolean send_welcome_message) {
                    String url = ("https://discourse.example.com//admin/site_settings/send_welcome_message");
                    Map<String, Object> content = new HashMap<>();
                    content.put("send_welcome_message", send_welcome_message);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SequentialRepliesThreshold {

                /**
                 * 
                 * <p>
                 * sequential replies threshold
                 * </p>
                 * 
                 * @param sequential_replies_threshold
                 *     "Number of posts a user has to make in a row in a topic before being reminded about too many sequential replies."
                 *     
                 */
                public void put(long sequential_replies_threshold) {
                    String url = ("https://discourse.example.com//admin/site_settings/sequential_replies_threshold");
                    Map<String, Object> content = new HashMap<>();
                    content.put("sequential_replies_threshold", sequential_replies_threshold);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SetLocaleFromAcceptLanguageHeader {

                /**
                 * 
                 * <p>
                 * Update set locale from accept language header
                 * </p>
                 * 
                 * @param set_locale_from_accept_language_header
                 */
                public void put(boolean set_locale_from_accept_language_header) {
                    String url = ("https://discourse.example.com//admin/site_settings/set_locale_from_accept_language_header");
                    Map<String, Object> content = new HashMap<>();
                    content.put("set_locale_from_accept_language_header", set_locale_from_accept_language_header);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ShortEmailLength {

                /**
                 * 
                 * <p>
                 * short email length
                 * </p>
                 * 
                 * @param short_email_length
                 *     Short email length in Bytes
                 */
                public void put(long short_email_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/short_email_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("short_email_length", short_email_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ShortProgressTextThreshold {

                /**
                 * 
                 * <p>
                 * short progress text threshold
                 * </p>
                 * 
                 * @param short_progress_text_threshold
                 */
                public void put(long short_progress_text_threshold) {
                    String url = ("https://discourse.example.com//admin/site_settings/short_progress_text_threshold");
                    Map<String, Object> content = new HashMap<>();
                    content.put("short_progress_text_threshold", short_progress_text_threshold);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ShowCreateTopicsNotice {

                /**
                 * 
                 * <p>
                 * show create topics notice
                 * </p>
                 * 
                 * @param show_create_topics_notice
                 *     "If the site has fewer than 5 public topics, show a notice asking admins to create some topics."
                 *     
                 */
                public void put(boolean show_create_topics_notice) {
                    String url = ("https://discourse.example.com//admin/site_settings/show_create_topics_notice");
                    Map<String, Object> content = new HashMap<>();
                    content.put("show_create_topics_notice", show_create_topics_notice);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ShowEmailOnProfile {

                /**
                 * 
                 * <p>
                 * show email on profile
                 * </p>
                 * 
                 * @param show_email_on_profile
                 */
                public void put(boolean show_email_on_profile) {
                    String url = ("https://discourse.example.com//admin/site_settings/show_email_on_profile");
                    Map<String, Object> content = new HashMap<>();
                    content.put("show_email_on_profile", show_email_on_profile);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ShowFilterByTag {

                /**
                 * 
                 * <p>
                 * "show filter by tag"
                 * </p>
                 * 
                 * @param show_filter_by_tag
                 *     "Show a dropdown to filter a topic list by tag."
                 *     
                 */
                public void put(boolean show_filter_by_tag) {
                    String url = ("https://discourse.example.com//admin/site_settings/show_filter_by_tag");
                    Map<String, Object> content = new HashMap<>();
                    content.put("show_filter_by_tag", show_filter_by_tag);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ShowPinnedExcerptDesktop {

                /**
                 * 
                 * <p>
                 * show pinned excerpt desktop
                 * </p>
                 * 
                 * @param show_pinned_excerpt_desktop
                 */
                public void put(boolean show_pinned_excerpt_desktop) {
                    String url = ("https://discourse.example.com//admin/site_settings/show_pinned_excerpt_desktop");
                    Map<String, Object> content = new HashMap<>();
                    content.put("show_pinned_excerpt_desktop", show_pinned_excerpt_desktop);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ShowPinnedExcerptMobile {

                /**
                 * 
                 * <p>
                 * show pinned excerpt mobile
                 * </p>
                 * 
                 * @param show_pinned_excerpt_mobile
                 */
                public void put(boolean show_pinned_excerpt_mobile) {
                    String url = ("https://discourse.example.com//admin/site_settings/show_pinned_excerpt_mobile");
                    Map<String, Object> content = new HashMap<>();
                    content.put("show_pinned_excerpt_mobile", show_pinned_excerpt_mobile);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ShowSubcategoryList {

                /**
                 * 
                 * <p>
                 * Update show subcategory list
                 * </p>
                 * 
                 * @param show_subcategory_list
                 */
                public void put(boolean show_subcategory_list) {
                    String url = ("https://discourse.example.com//admin/site_settings/show_subcategory_list");
                    Map<String, Object> content = new HashMap<>();
                    content.put("show_subcategory_list", show_subcategory_list);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ShowTimeGapDays {

                /**
                 * 
                 * <p>
                 * show time gap days
                 * </p>
                 * 
                 * @param show_time_gap_days
                 */
                public void put(long show_time_gap_days) {
                    String url = ("https://discourse.example.com//admin/site_settings/show_time_gap_days");
                    Map<String, Object> content = new HashMap<>();
                    content.put("show_time_gap_days", show_time_gap_days);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class ShowTopicFeaturedLinkInDigest {

                /**
                 * 
                 * <p>
                 * show topic featured link in digest
                 * </p>
                 * 
                 * @param show_topic_featured_link_in_digest
                 */
                public void put(boolean show_topic_featured_link_in_digest) {
                    String url = ("https://discourse.example.com//admin/site_settings/show_topic_featured_link_in_digest");
                    Map<String, Object> content = new HashMap<>();
                    content.put("show_topic_featured_link_in_digest", show_topic_featured_link_in_digest);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SiteContactUsername {

                /**
                 * 
                 * <p>
                 * Update the site contact username
                 * </p>
                 * 
                 * @param site_contact_username
                 */
                public void put(String site_contact_username) {
                    String url = ("https://discourse.example.com//admin/site_settings/site_contact_username");
                    Map<String, Object> content = new HashMap<>();
                    content.put("site_contact_username", site_contact_username);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SiteDescription {

                /**
                 * 
                 * <p>
                 * Update the site description
                 * </p>
                 * 
                 * @param site_description
                 */
                public void put(String site_description) {
                    String url = ("https://discourse.example.com//admin/site_settings/site_description");
                    Map<String, Object> content = new HashMap<>();
                    content.put("site_description", site_description);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SlugGenerationMethod {

                /**
                 * 
                 * <p>
                 * slug generation method
                 * </p>
                 * 
                 * @param slug_generation_method
                 *     "Choose a slug generation method. 'encoded' will generate percent encoding string. 'none' will disable slug at all."
                 *     
                 */
                public void put(discourse.example.com.structures.slug_generation_method slug_generation_method) {
                    String url = ("https://discourse.example.com//admin/site_settings/slug_generation_method");
                    Map<String, Object> content = new HashMap<>();
                    content.put("slug_generation_method", slug_generation_method);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SoftBounceScore {

                /**
                 * 
                 * <p>
                 * soft bounce score
                 * </p>
                 * 
                 * @param soft_bounce_score
                 *     Bounce score added to the user when a temporary bounce happens.
                 */
                public void put(long soft_bounce_score) {
                    String url = ("https://discourse.example.com//admin/site_settings/soft_bounce_score");
                    Map<String, Object> content = new HashMap<>();
                    content.put("soft_bounce_score", soft_bounce_score);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SsoAllowsAllReturnPaths {

                /**
                 * 
                 * <p>
                 * sso allows all return paths
                 * </p>
                 * 
                 * @param ss_allows_all_return_paths
                 */
                public void put(boolean ss_allows_all_return_paths) {
                    String url = ("https://discourse.example.com//admin/site_settings/sso_allows_all_return_paths");
                    Map<String, Object> content = new HashMap<>();
                    content.put("ss_allows_all_return_paths", ss_allows_all_return_paths);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SsoNotApprovedUrl {

                /**
                 * 
                 * <p>
                 * sso not approved url
                 * </p>
                 * 
                 * @param sso_not_approved_url
                 */
                public void put(String sso_not_approved_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/sso_not_approved_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("sso_not_approved_url", sso_not_approved_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SsoOverridesAvatar {

                /**
                 * 
                 * <p>
                 * sso overrides avatar
                 * </p>
                 * 
                 * @param sso_overrides_avatar
                 */
                public void put(boolean sso_overrides_avatar) {
                    String url = ("https://discourse.example.com//admin/site_settings/sso_overrides_avatar");
                    Map<String, Object> content = new HashMap<>();
                    content.put("sso_overrides_avatar", sso_overrides_avatar);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SsoOverridesBio {

                /**
                 * 
                 * <p>
                 * sso overrides bio
                 * </p>
                 * 
                 * @param sso_overrides_bio
                 */
                public void put(boolean sso_overrides_bio) {
                    String url = ("https://discourse.example.com//admin/site_settings/sso_overrides_bio");
                    Map<String, Object> content = new HashMap<>();
                    content.put("sso_overrides_bio", sso_overrides_bio);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SsoOverridesEmail {

                /**
                 * 
                 * <p>
                 * sso overrides email
                 * </p>
                 * 
                 * @param sso_overrides_email
                 */
                public void put(boolean sso_overrides_email) {
                    String url = ("https://discourse.example.com//admin/site_settings/sso_overrides_email");
                    Map<String, Object> content = new HashMap<>();
                    content.put("sso_overrides_email", sso_overrides_email);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SsoOverridesName {

                /**
                 * 
                 * <p>
                 * sso overrides name
                 * </p>
                 * 
                 * @param sso_overrides_name
                 */
                public void put(boolean sso_overrides_name) {
                    String url = ("https://discourse.example.com//admin/site_settings/sso_overrides_name");
                    Map<String, Object> content = new HashMap<>();
                    content.put("sso_overrides_name", sso_overrides_name);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SsoOverridesUsername {

                /**
                 * 
                 * <p>
                 * sso overrides username
                 * </p>
                 * 
                 * @param sso_overrides_username
                 */
                public void put(boolean sso_overrides_username) {
                    String url = ("https://discourse.example.com//admin/site_settings/sso_overrides_username");
                    Map<String, Object> content = new HashMap<>();
                    content.put("sso_overrides_username", sso_overrides_username);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SsoSecret {

                /**
                 * 
                 * <p>
                 * sso secret
                 * </p>
                 * 
                 * @param sso_secret
                 */
                public void put(String sso_secret) {
                    String url = ("https://discourse.example.com//admin/site_settings/sso_secret");
                    Map<String, Object> content = new HashMap<>();
                    content.put("sso_secret", sso_secret);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SsoUrl {

                /**
                 * 
                 * <p>
                 * sso url
                 * </p>
                 * 
                 * @param sso_url
                 */
                public void put(String sso_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/sso_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("sso_url", sso_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class StaffLikeWeight {

                /**
                 * 
                 * <p>
                 * staff like weight
                 * </p>
                 * 
                 * @param staff_like_weight
                 *     "How much extra weighting factor to give staff likes."
                 *     
                 */
                public void put(long staff_like_weight) {
                    String url = ("https://discourse.example.com//admin/site_settings/staff_like_weight");
                    Map<String, Object> content = new HashMap<>();
                    content.put("staff_like_weight", staff_like_weight);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class StaffTags {

                /**
                 * 
                 * <p>
                 * "staff tags"
                 * </p>
                 * 
                 * @param staff_tags
                 *     "A list of tags that can only be applied by staff members"
                 *     
                 */
                public void put(String staff_tags) {
                    String url = ("https://discourse.example.com//admin/site_settings/staff_tags");
                    Map<String, Object> content = new HashMap<>();
                    content.put("staff_tags", staff_tags);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class StaffUsersCustomFields {

                /**
                 * 
                 * <p>
                 * staff user custom fields
                 * </p>
                 * 
                 * @param staff_users_custom_fields
                 */
                public void put(String staff_users_custom_fields) {
                    String url = ("https://discourse.example.com//admin/site_settings/staff_users_custom_fields");
                    Map<String, Object> content = new HashMap<>();
                    content.put("staff_users_custom_fields", staff_users_custom_fields);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class StripImagesFromShortEmails {

                /**
                 * 
                 * <p>
                 * strip images from short emails
                 * </p>
                 * 
                 * @param strip_images_from_short_emails
                 *     Strip images from emails having size less than 2800 Bytes
                 */
                public void put(boolean strip_images_from_short_emails) {
                    String url = ("https://discourse.example.com//admin/site_settings/strip_images_from_short_emails");
                    Map<String, Object> content = new HashMap<>();
                    content.put("strip_images_from_short_emails", strip_images_from_short_emails);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SuggestedTopics {

                /**
                 * 
                 * <p>
                 * Update the number of suggested topics
                 * </p>
                 * 
                 * @param suggested_topics
                 */
                public void put(long suggested_topics) {
                    String url = ("https://discourse.example.com//admin/site_settings/suggested_topics");
                    Map<String, Object> content = new HashMap<>();
                    content.put("suggested_topics", suggested_topics);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SuggestedTopicsMaxDaysOld {

                /**
                 * 
                 * <p>
                 * Update suggested topics max days old
                 * </p>
                 * 
                 * @param suggested_topics_max_days_old
                 */
                public void put(long suggested_topics_max_days_old) {
                    String url = ("https://discourse.example.com//admin/site_settings/suggested_topics_max_days_old");
                    Map<String, Object> content = new HashMap<>();
                    content.put("suggested_topics_max_days_old", suggested_topics_max_days_old);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SummaryLikesRequired {

                /**
                 * 
                 * <p>
                 * summary likes required
                 * </p>
                 * 
                 * @param summary_likes_required
                 *     "Minimum likes in a topic before 'Summarize This Topic' is enabled"
                 *     
                 */
                public void put(long summary_likes_required) {
                    String url = ("https://discourse.example.com//admin/site_settings/summary_likes_required");
                    Map<String, Object> content = new HashMap<>();
                    content.put("summary_likes_required", summary_likes_required);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SummaryMaxResults {

                /**
                 * 
                 * <p>
                 * summary max results
                 * </p>
                 * 
                 * @param summary_max_results
                 *     "Maximum posts returned by 'Summary This Topic'"
                 *     
                 */
                public void put(long summary_max_results) {
                    String url = ("https://discourse.example.com//admin/site_settings/summary_max_results");
                    Map<String, Object> content = new HashMap<>();
                    content.put("summary_max_results", summary_max_results);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SummaryPercentFilter {

                /**
                 * 
                 * <p>
                 * summary percent filter
                 * </p>
                 * 
                 * @param summary_percent_filter
                 *     "When a user clicks 'Summarize This Topic', show the top % of posts"
                 *     
                 */
                public void put(long summary_percent_filter) {
                    String url = ("https://discourse.example.com//admin/site_settings/summary_percent_filter");
                    Map<String, Object> content = new HashMap<>();
                    content.put("summary_percent_filter", summary_percent_filter);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SummaryPostsRequired {

                /**
                 * 
                 * <p>
                 * summary posts required
                 * </p>
                 * 
                 * @param summary_posts_required
                 *     "Minimum posts in a topic before 'Summarize This Topic' is enabled"
                 *     
                 */
                public void put(long summary_posts_required) {
                    String url = ("https://discourse.example.com//admin/site_settings/summary_posts_required");
                    Map<String, Object> content = new HashMap<>();
                    content.put("summary_posts_required", summary_posts_required);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SummaryScoreThreshold {

                /**
                 * 
                 * <p>
                 * summary score threshold
                 * </p>
                 * 
                 * @param summary_score_threshold
                 *     "The minimum score required for a post to be included in 'Summarize This Topic'"
                 *     
                 */
                public void put(long summary_score_threshold) {
                    String url = ("https://discourse.example.com//admin/site_settings/summary_score_threshold");
                    Map<String, Object> content = new HashMap<>();
                    content.put("summary_score_threshold", summary_score_threshold);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SuppressOverlappingTagsInList {

                /**
                 * 
                 * <p>
                 * "suppress overlapping tags in list"
                 * </p>
                 * 
                 * @param suppress_overlapping_tags_in_list
                 *     "If tags match exact words in topic titles, don't show the tag"
                 *     
                 */
                public void put(boolean suppress_overlapping_tags_in_list) {
                    String url = ("https://discourse.example.com//admin/site_settings/suppress_overlapping_tags_in_list");
                    Map<String, Object> content = new HashMap<>();
                    content.put("suppress_overlapping_tags_in_list", suppress_overlapping_tags_in_list);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SuppressReplyDirectlyAbove {

                /**
                 * 
                 * <p>
                 * suppress reply directly above
                 * </p>
                 * 
                 * @param suppress_reply_directly_above
                 */
                public void put(boolean suppress_reply_directly_above) {
                    String url = ("https://discourse.example.com//admin/site_settings/suppress_reply_directly_above");
                    Map<String, Object> content = new HashMap<>();
                    content.put("suppress_reply_directly_above", suppress_reply_directly_above);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SuppressReplyDirectlyBelow {

                /**
                 * 
                 * <p>
                 * suppress reply directly below
                 * </p>
                 * 
                 * @param suppress_reply_directly_below
                 */
                public void put(boolean suppress_reply_directly_below) {
                    String url = ("https://discourse.example.com//admin/site_settings/suppress_reply_directly_below");
                    Map<String, Object> content = new HashMap<>();
                    content.put("suppress_reply_directly_below", suppress_reply_directly_below);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SuppressReplyWhenQuoting {

                /**
                 * 
                 * <p>
                 * suppress reply when quoting
                 * </p>
                 * 
                 * @param suppress_reply_when_quoting
                 */
                public void put(boolean suppress_reply_when_quoting) {
                    String url = ("https://discourse.example.com//admin/site_settings/suppress_reply_when_quoting");
                    Map<String, Object> content = new HashMap<>();
                    content.put("suppress_reply_when_quoting", suppress_reply_when_quoting);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class SuppressUncategorizedBadge {

                /**
                 * 
                 * <p>
                 * suppress uncategorized badge
                 * </p>
                 * 
                 * @param suppress_uncategorized_badge
                 *     "Don't show the badge for uncategorized topics in topic lists."
                 *     
                 */
                public void put(boolean suppress_uncategorized_badge) {
                    String url = ("https://discourse.example.com//admin/site_settings/suppress_uncategorized_badge");
                    Map<String, Object> content = new HashMap<>();
                    content.put("suppress_uncategorized_badge", suppress_uncategorized_badge);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TaggingEnabled {

                /**
                 * 
                 * <p>
                 * "tagging enabled"
                 * </p>
                 * 
                 * @param tagging_enabled
                 *     "Enable tags on topics?"
                 *     
                 */
                public void put(boolean tagging_enabled) {
                    String url = ("https://discourse.example.com//admin/site_settings/tagging_enabled");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tagging_enabled", tagging_enabled);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TagsSortAlphabetically {

                /**
                 * 
                 * <p>
                 * "tags sort alphabetically"
                 * </p>
                 * 
                 * @param tags_sort_alphabetically
                 *     "Show tags in alphabetical order. Default is to show in order of popularity."
                 *     
                 */
                public void put(boolean tags_sort_alphabetically) {
                    String url = ("https://discourse.example.com//admin/site_settings/tags_sort_alphabetically");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tags_sort_alphabetically", tags_sort_alphabetically);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TagStyle {

                /**
                 * 
                 * <p>
                 * "tag style"
                 * </p>
                 * 
                 * @param tag_style
                 *     "Visual style for tag badges."
                 *     
                 */
                public void put(discourse.example.com.structures.tag_style tag_style) {
                    String url = ("https://discourse.example.com//admin/site_settings/tag_style");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tag_style", tag_style);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Title {

                /**
                 * 
                 * <p>
                 * Update the site title
                 * </p>
                 * 
                 * @param title
                 */
                public void put(String title) {
                    String url = ("https://discourse.example.com//admin/site_settings/title");
                    Map<String, Object> content = new HashMap<>();
                    content.put("title", title);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TitleFancyEntities {

                /**
                 * 
                 * <p>
                 * title fancy entities
                 * </p>
                 * 
                 * @param title_fancy_entities
                 */
                public void put(boolean title_fancy_entities) {
                    String url = ("https://discourse.example.com//admin/site_settings/title_fancy_entities");
                    Map<String, Object> content = new HashMap<>();
                    content.put("title_fancy_entities", title_fancy_entities);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TitleMaxWordLength {

                /**
                 * 
                 * <p>
                 * title max word length
                 * </p>
                 * 
                 * @param title_max_word_length
                 */
                public void put(long title_max_word_length) {
                    String url = ("https://discourse.example.com//admin/site_settings/title_max_word_length");
                    Map<String, Object> content = new HashMap<>();
                    content.put("title_max_word_length", title_max_word_length);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TitleMinEntropy {

                /**
                 * 
                 * <p>
                 * title min entropy
                 * </p>
                 * 
                 * @param title_min_entropy
                 */
                public void put(long title_min_entropy) {
                    String url = ("https://discourse.example.com//admin/site_settings/title_min_entropy");
                    Map<String, Object> content = new HashMap<>();
                    content.put("title_min_entropy", title_min_entropy);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TitlePrettify {

                /**
                 * 
                 * <p>
                 * title_prettify
                 * </p>
                 * 
                 * @param title_prettify
                 */
                public void put(boolean title_prettify) {
                    String url = ("https://discourse.example.com//admin/site_settings/title_prettify");
                    Map<String, Object> content = new HashMap<>();
                    content.put("title_prettify", title_prettify);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl1RequiresReadPosts {

                /**
                 * 
                 * <p>
                 * tl1 requires read posts
                 * </p>
                 * 
                 * @param tl1_requires_read_posts
                 *     "How many posts a new user must read before promotion to trust level 1."
                 *     
                 */
                public void put(long tl1_requires_read_posts) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl1_requires_read_posts");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl1_requires_read_posts", tl1_requires_read_posts);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl1RequiresTimeSpentMins {

                /**
                 * 
                 * <p>
                 * tl1 requires time spent mins
                 * </p>
                 * 
                 * @param tl1_requires_time_spent_mins
                 *     "How many minutes a new user must read posts before promotion to trust level 1."
                 *     
                 */
                public void put(long tl1_requires_time_spent_mins) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl1_requires_time_spent_mins");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl1_requires_time_spent_mins", tl1_requires_time_spent_mins);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl1RequiresTopicsEntered {

                /**
                 * 
                 * <p>
                 * tl1 requires topics entered
                 * </p>
                 * 
                 * @param tl1_requires_topics_entered
                 *     "How many topics a new user must enter before promotion to trust level 1."
                 *     
                 */
                public void put(long tl1_requires_topics_entered) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl1_requires_topics_entered");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl1_requires_topics_entered", tl1_requires_topics_entered);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl2AdditionalLikesPerDayMultiplier {

                /**
                 * 
                 * <p>
                 * tl2 additional likes per day multiplier
                 * </p>
                 */
                public void put() {
                    String url = ("https://discourse.example.com//admin/site_settings/tl2_additional_likes_per_day_multiplier");
                    requestPut(url, null, null, Void.class);
                }
            }

            public class Tl2RequiresDaysVisited {

                /**
                 * 
                 * <p>
                 * tl2 requires days visited
                 * </p>
                 * 
                 * @param tl2_requires_days_visited
                 *     "How many days a user must visit the site before promotion to trust level 2."
                 *     
                 */
                public void put(long tl2_requires_days_visited) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl2_requires_days_visited");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl2_requires_days_visited", tl2_requires_days_visited);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl2RequiresLikesGiven {

                /**
                 * 
                 * <p>
                 * tl2 requires likes given
                 * </p>
                 * 
                 * @param tl2_requires_likes_given
                 *     "How many likes a user must cast before promotion to trust level 2."
                 *     
                 */
                public void put(long tl2_requires_likes_given) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl2_requires_likes_given");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl2_requires_likes_given", tl2_requires_likes_given);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl2RequiresLikesReceived {

                /**
                 * 
                 * <p>
                 * tl2 requires likes received
                 * </p>
                 * 
                 * @param tl2_requires_likes_received
                 *     "How many likes a user must receive before promotion to trust level 2."
                 *     
                 */
                public void put(long tl2_requires_likes_received) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl2_requires_likes_received");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl2_requires_likes_received", tl2_requires_likes_received);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl2RequiresReadPosts {

                /**
                 * 
                 * <p>
                 * tl2 requires read posts
                 * </p>
                 * 
                 * @param tl2_requires_read_posts
                 *     "How many posts a user must read before promotion to trust level 2."
                 *     
                 */
                public void put(long tl2_requires_read_posts) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl2_requires_read_posts");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl2_requires_read_posts", tl2_requires_read_posts);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl2RequiresTimeSpentMins {

                /**
                 * 
                 * <p>
                 * tl2 requires time spent mins
                 * </p>
                 * 
                 * @param tl2_requires_time_spent_mins
                 *     "How many minutes a user must read posts before promotion to trust level 2."
                 *     
                 */
                public void put(long tl2_requires_time_spent_mins) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl2_requires_time_spent_mins");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl2_requires_time_spent_mins", tl2_requires_time_spent_mins);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl2RequiresTopicReplyCount {

                /**
                 * 
                 * <p>
                 * tl2 requires topic reply count
                 * </p>
                 * 
                 * @param tl2_requires_topic_reply_count
                 *     "How many topics user must reply to before promotion to trust level 2."
                 *     
                 */
                public void put(long tl2_requires_topic_reply_count) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl2_requires_topic_reply_count");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl2_requires_topic_reply_count", tl2_requires_topic_reply_count);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl2RequiresTopicsEntered {

                /**
                 * 
                 * <p>
                 * tl2 requires topics entered
                 * </p>
                 * 
                 * @param tl2_requires_topics_entered
                 *     "How many topics a user must enter before promotion to trust level 2."
                 *     
                 */
                public void put(long tl2_requires_topics_entered) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl2_requires_topics_entered");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl2_requires_topics_entered", tl2_requires_topics_entered);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl3AdditionalLikesPerDayMultiplier {

                /**
                 * 
                 * <p>
                 * tl3 additional likes per day multiplier
                 * </p>
                 */
                public void put() {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_additional_likes_per_day_multiplier");
                    requestPut(url, null, null, Void.class);
                }
            }

            public class Tl3LinksNoFollow {

                /**
                 * 
                 * <p>
                 * tl3 links no follow
                 * </p>
                 * 
                 * @param tl3_links_no_follow
                 *     "Do not remove rel=nofollow from links posted by trust level 3 users."
                 *     
                 */
                public void put(boolean tl3_links_no_follow) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_links_no_follow");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl3_links_no_follow", tl3_links_no_follow);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl3PromotionMinDuration {

                /**
                 * 
                 * <p>
                 * tl3 promotion min duration
                 * </p>
                 * 
                 * @param tl3_promotion_min_duration
                 *     "The minimum number of days that a promotion to trust level 3 lasts before a user can be demoted back to trust level 2."
                 *     
                 */
                public void put(long tl3_promotion_min_duration) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_promotion_min_duration");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl3_promotion_min_duration", tl3_promotion_min_duration);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl3RequiresDaysVisited {

                /**
                 * 
                 * <p>
                 * tl3 requires days visited
                 * </p>
                 * 
                 * @param tl3_requires_days_visited
                 *     "Minimum number of days that a user needs to have visited the site in the last (tl3 time period) days to qualify for promotion to trust level 3. Set higher than tl3 time period to disable promotions to tl3. (0 or higher)"
                 *     
                 */
                public void put(long tl3_requires_days_visited) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_days_visited");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl3_requires_days_visited", tl3_requires_days_visited);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl3RequiresLikesGiven {

                /**
                 * 
                 * <p>
                 * tl3 requires likes given
                 * </p>
                 * 
                 * @param tl3_requires_likes_given
                 *     "The minimum number of likes that must be given in the last (tl3 time period) days to qualify for promotion to trust level 3."
                 *     
                 */
                public void put(long tl3_requires_likes_given) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_likes_given");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl3_requires_likes_given", tl3_requires_likes_given);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl3RequiresLikesReceived {

                /**
                 * 
                 * <p>
                 * tl3 requires likes received
                 * </p>
                 * 
                 * @param tl3_requires_likes_received
                 *     "The minimum number of likes that must be received in the last (tl3 time period) days to qualify for promotion to trust level 3."
                 *     
                 */
                public void put(long tl3_requires_likes_received) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_likes_received");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl3_requires_likes_received", tl3_requires_likes_received);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl3RequiresMaxFlagged {

                /**
                 * 
                 * <p>
                 * tl3 requires max flagged
                 * </p>
                 * 
                 * @param tl3_requires_max_flagged
                 *     "User must not have had more than x posts flagged by x different users in the last (tl3 time period) days to qualify for promotion to trust level 3, where x is this setting's value. (0 or higher)"
                 *     
                 */
                public void put(long tl3_requires_max_flagged) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_max_flagged");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl3_requires_max_flagged", tl3_requires_max_flagged);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl3RequiresPostsRead {

                /**
                 * 
                 * <p>
                 * tl3 requires posts read
                 * </p>
                 * 
                 * @param tl3_requires_posts_read
                 *     "The percentage of posts created in the last (tl3 time period) days that a user needs to have viewed to qualify for promotion to trust level 3. (0 to 100)"
                 *     
                 */
                public void put(long tl3_requires_posts_read) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_posts_read");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl3_requires_posts_read", tl3_requires_posts_read);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl3RequiresPostsReadAllTime {

                /**
                 * 
                 * <p>
                 * tl3 requires posts read all time
                 * </p>
                 * 
                 * @param tl3_requires_posts_read_all_time
                 *     "The minimum total number of posts a user must have read to qualify for trust level 3."
                 *     
                 */
                public void put(long tl3_requires_posts_read_all_time) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_posts_read_all_time");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl3_requires_posts_read_all_time", tl3_requires_posts_read_all_time);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl3RequiresPostsReadCap {

                /**
                 * 
                 * <p>
                 * tl3 requires posts read cap
                 * </p>
                 * 
                 * @param tl3_requires_posts_read_cap
                 *     "The maximum required number of posts read in the last (tl3 time period) days."
                 *     
                 */
                public void put(long tl3_requires_posts_read_cap) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_posts_read_cap");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl3_requires_posts_read_cap", tl3_requires_posts_read_cap);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl3RequiresTopicsRepliedTo {

                /**
                 * 
                 * <p>
                 * tl3 requires topics replied to
                 * </p>
                 * 
                 * @param tl3_requires_topics_replied_to
                 *     "Minimum number of topics a user needs to have replied to in the last (tl3 time period) days to qualify for promotion to trust level 3. (0 or higher)"
                 *     
                 */
                public void put(long tl3_requires_topics_replied_to) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_topics_replied_to");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl3_requires_topics_replied_to", tl3_requires_topics_replied_to);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl3RequiresTopicsViewed {

                /**
                 * 
                 * <p>
                 * tl3 requires topics viewed
                 * </p>
                 * 
                 * @param tl3_requires_topics_viewed
                 *     "The percentage of topics created in the last (tl3 time period) days that a user needs to have viewed to qualify for promotion to trust level 3. (0 to 100)"
                 *     
                 */
                public void put(long tl3_requires_topics_viewed) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_topics_viewed");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl3_requires_topics_viewed", tl3_requires_topics_viewed);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl3RequiresTopicsViewedAllTime {

                /**
                 * 
                 * <p>
                 * tl3 requires topics viewed all time
                 * </p>
                 * 
                 * @param tl3_requires_viewed_all_time
                 *     "The minimum total number of topics a user must have viewed to qualify for trust level 3."
                 *     
                 */
                public void put(long tl3_requires_viewed_all_time) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_topics_viewed_all_time");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl3_requires_viewed_all_time", tl3_requires_viewed_all_time);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl3RequiresTopicsViewedCap {

                /**
                 * 
                 * <p>
                 * tl3 requires topics viewed cap
                 * </p>
                 * 
                 * @param tl3_requires_topics_viewed_cap
                 *     "The maximum required number of topics viewed in the last (tl3 time period) days."
                 *     
                 */
                public void put(long tl3_requires_topics_viewed_cap) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_topics_viewed_cap");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl3_requires_topics_viewed_cap", tl3_requires_topics_viewed_cap);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl3TimePeriod {

                /**
                 * 
                 * <p>
                 * tl2 time period
                 * </p>
                 * 
                 * @param tl3_time_period
                 *     "Trust Level 3 requirements time period (in days)"
                 *     
                 */
                public void put(long tl3_time_period) {
                    String url = ("https://discourse.example.com//admin/site_settings/tl3_time_period");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tl3_time_period", tl3_time_period);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Tl4AdditionalLikesPerDayMultiplier {

                /**
                 * 
                 * <p>
                 * tl4 additional likes per day multiplier
                 * </p>
                 */
                public void put() {
                    String url = ("https://discourse.example.com//admin/site_settings/tl4_additional_likes_per_day_multiplier");
                    requestPut(url, null, null, Void.class);
                }
            }

            public class TopicFeaturedLinkEnabled {

                /**
                 * 
                 * <p>
                 * topic featured link enabled
                 * </p>
                 * 
                 * @param topic_featured_link_enabled
                 */
                public void put(boolean topic_featured_link_enabled) {
                    String url = ("https://discourse.example.com//admin/site_settings/topic_featured_link_enabled");
                    Map<String, Object> content = new HashMap<>();
                    content.put("topic_featured_link_enabled", topic_featured_link_enabled);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TopicPageTitleIncludesCategory {

                /**
                 * 
                 * <p>
                 * topic page title includes category
                 * </p>
                 * 
                 * @param topic_page_title_includes_category
                 *     "Topic page title includes the category name."
                 *     
                 */
                public void put(boolean topic_page_title_includes_category) {
                    String url = ("https://discourse.example.com//admin/site_settings/topic_page_title_includes_category");
                    Map<String, Object> content = new HashMap<>();
                    content.put("topic_page_title_includes_category", topic_page_title_includes_category);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TopicPostLikeHeatHigh {

                /**
                 * 
                 * <p>
                 * topic post like heat high
                 * </p>
                 */
                public void put() {
                    String url = ("https://discourse.example.com//admin/site_settings/topic_post_like_heat_high");
                    requestPut(url, null, null, Void.class);
                }
            }

            public class TopicPostLikeHeatLow {

                /**
                 * 
                 * <p>
                 * topic post like heat low
                 * </p>
                 */
                public void put() {
                    String url = ("https://discourse.example.com//admin/site_settings/topic_post_like_heat_low");
                    requestPut(url, null, null, Void.class);
                }
            }

            public class TopicPostLikeHeatMedium {

                /**
                 * 
                 * <p>
                 * topic post like heat medium
                 * </p>
                 */
                public void put() {
                    String url = ("https://discourse.example.com//admin/site_settings/topic_post_like_heat_medium");
                    requestPut(url, null, null, Void.class);
                }
            }

            public class TopicViewDurationHours {

                /**
                 * 
                 * <p>
                 * topic view duration hours
                 * </p>
                 * 
                 * @param topic_view_duration_hours
                 *     "Count a new topic view once per IP/User every N hours"
                 *     
                 */
                public void put(long topic_view_duration_hours) {
                    String url = ("https://discourse.example.com//admin/site_settings/topic_view_duration_hours");
                    Map<String, Object> content = new HashMap<>();
                    content.put("topic_view_duration_hours", topic_view_duration_hours);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TopicViewsHeatHigh {

                /**
                 * 
                 * <p>
                 * topic views heat high
                 * </p>
                 * 
                 * @param topic_views_heat_high
                 *     "After this many views, the views field is strongly highlighted."
                 *     
                 */
                public void put(long topic_views_heat_high) {
                    String url = ("https://discourse.example.com//admin/site_settings/topic_views_heat_high");
                    Map<String, Object> content = new HashMap<>();
                    content.put("topic_views_heat_high", topic_views_heat_high);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TopicViewsHeatLow {

                /**
                 * 
                 * <p>
                 * topic views heat low
                 * </p>
                 * 
                 * @param topic_view_heat_low
                 *     "After this many views, the views field is slightly highlighted."
                 *     
                 */
                public void put(long topic_view_heat_low) {
                    String url = ("https://discourse.example.com//admin/site_settings/topic_views_heat_low");
                    Map<String, Object> content = new HashMap<>();
                    content.put("topic_view_heat_low", topic_view_heat_low);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TopicViewsHeatMedium {

                /**
                 * 
                 * <p>
                 * topic views heat medium
                 * </p>
                 * 
                 * @param topic_views_heat_medium
                 *     "After this many views, the views field is moderately highlighted."
                 *     
                 */
                public void put(long topic_views_heat_medium) {
                    String url = ("https://discourse.example.com//admin/site_settings/topic_views_heat_medium");
                    Map<String, Object> content = new HashMap<>();
                    content.put("topic_views_heat_medium", topic_views_heat_medium);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TopMenu {

                /**
                 * 
                 * <p>
                 * Update the homepage navigation
                 * </p>
                 * 
                 * @param top_menu
                 *     pipe delimited
                 */
                public void put(discourse.example.com.structures.top_menu top_menu) {
                    String url = ("https://discourse.example.com//admin/site_settings/top_menu");
                    Map<String, Object> content = new HashMap<>();
                    content.put("top_menu", top_menu);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TopTopicsFormulaFirstPostLikesMultiplier {

                /**
                 * 
                 * <p>
                 * top topics formula first post likes multiplier
                 * </p>
                 */
                public void put() {
                    String url = ("https://discourse.example.com//admin/site_settings/top_topics_formula_first_post_likes_multiplier");
                    requestPut(url, null, null, Void.class);
                }
            }

            public class TopTopicsFormulaLogViewsMultiplier {

                /**
                 * 
                 * <p>
                 * top topics formula log views multiplier
                 * </p>
                 */
                public void put() {
                    String url = ("https://discourse.example.com//admin/site_settings/top_topics_formula_log_views_multiplier");
                    requestPut(url, null, null, Void.class);
                }
            }

            public class TosUrl {

                /**
                 * 
                 * <p>
                 * tos url
                 * </p>
                 * 
                 * @param tos_url
                 *     "If you have a Terms of Service document hosted elsewhere that you want to use, provide the full URL here."
                 *     
                 */
                public void put(String tos_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/tos_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("tos_url", tos_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TrackExternalRightClicks {

                /**
                 * 
                 * <p>
                 * Update track external right clicks
                 * </p>
                 * 
                 * @param track_external_right_clicks
                 */
                public void put(boolean track_external_right_clicks) {
                    String url = ("https://discourse.example.com//admin/site_settings/track_external_right_clicks");
                    Map<String, Object> content = new HashMap<>();
                    content.put("track_external_right_clicks", track_external_right_clicks);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TraditionalMarkdownLinebreaks {

                /**
                 * 
                 * <p>
                 * traditional markdown linebreaks
                 * </p>
                 * 
                 * @param traditional_markdown_linebreaks
                 */
                public void put(boolean traditional_markdown_linebreaks) {
                    String url = ("https://discourse.example.com//admin/site_settings/traditional_markdown_linebreaks");
                    Map<String, Object> content = new HashMap<>();
                    content.put("traditional_markdown_linebreaks", traditional_markdown_linebreaks);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TwitterConsumerKey {

                /**
                 * 
                 * <p>
                 * twitter consumer key
                 * </p>
                 * 
                 * @param twitter_consumer_key
                 */
                public void put(String twitter_consumer_key) {
                    String url = ("https://discourse.example.com//admin/site_settings/twitter_consumer_key");
                    Map<String, Object> content = new HashMap<>();
                    content.put("twitter_consumer_key", twitter_consumer_key);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TwitterConsumerSecret {

                /**
                 * 
                 * <p>
                 * twitter consumer secret
                 * </p>
                 * 
                 * @param twitter_consumer_secret
                 */
                public void put(String twitter_consumer_secret) {
                    String url = ("https://discourse.example.com//admin/site_settings/twitter_consumer_secret");
                    Map<String, Object> content = new HashMap<>();
                    content.put("twitter_consumer_secret", twitter_consumer_secret);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class TwitterSummaryLargeImageUrl {

                /**
                 * 
                 * <p>
                 * Update the twitter summary large image url
                 * </p>
                 * 
                 * @param twitter_summary_large_image_url
                 */
                public void put(String twitter_summary_large_image_url) {
                    String url = ("https://discourse.example.com//admin/site_settings/twitter_summary_large_image_url");
                    Map<String, Object> content = new HashMap<>();
                    content.put("twitter_summary_large_image_url", twitter_summary_large_image_url);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class UniquePostsMin {

                /**
                 * 
                 * <p>
                 * unique posts mins
                 * </p>
                 * 
                 * @param unique_posts_min
                 *     "How many minutes before a user can make a post with the same content again"
                 *     
                 */
                public void put(long unique_posts_min) {
                    String url = ("https://discourse.example.com//admin/site_settings/unique_posts_min");
                    Map<String, Object> content = new HashMap<>();
                    content.put("unique_posts_min", unique_posts_min);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class UnsubscribeViaEmail {

                /**
                 * 
                 * <p>
                 * unsubscribe via email
                 * </p>
                 * 
                 * @param unsubscribe_via_email
                 *     Allow users to unsubscribe from emails by sending an email with 'unsubscribe' in the subject or body
                 *     
                 */
                public void put(boolean unsubscribe_via_email) {
                    String url = ("https://discourse.example.com//admin/site_settings/unsubscribe_via_email");
                    Map<String, Object> content = new HashMap<>();
                    content.put("unsubscribe_via_email", unsubscribe_via_email);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class UnsubscribeViaEmailFooter {

                /**
                 * 
                 * <p>
                 * unsubscribe via email footer
                 * </p>
                 * 
                 * @param unsubscribe_via_email_footer
                 *     Attach an unsubcribe via email mailto: link to the footer of sent email
                 */
                public void put(boolean unsubscribe_via_email_footer) {
                    String url = ("https://discourse.example.com//admin/site_settings/unsubscribe_via_email_footer");
                    Map<String, Object> content = new HashMap<>();
                    content.put("unsubscribe_via_email_footer", unsubscribe_via_email_footer);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class UseAdminIpWhitelist {

                /**
                 * 
                 * <p>
                 * use admin ip whitelist
                 * </p>
                 * 
                 * @param use_admin_ip_whitelist
                 *     "Admins can only log in if they are at an IP address defined in the Screened IPs list (Admin > Logs > Screened Ips)."
                 *     
                 */
                public void put(boolean use_admin_ip_whitelist) {
                    String url = ("https://discourse.example.com//admin/site_settings/use_admin_ip_whitelist");
                    Map<String, Object> content = new HashMap<>();
                    content.put("use_admin_ip_whitelist", use_admin_ip_whitelist);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class UsernameChangePeriod {

                /**
                 * 
                 * <p>
                 * username change period
                 * </p>
                 * 
                 * @param username_change_period
                 */
                public void put(long username_change_period) {
                    String url = ("https://discourse.example.com//admin/site_settings/username_change_period");
                    Map<String, Object> content = new HashMap<>();
                    content.put("username_change_period", username_change_period);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class UserProfileViewDurationHours {

                /**
                 * 
                 * <p>
                 * user profile view duration hours
                 * </p>
                 * 
                 * @param user_profile_view_duration_hours
                 *     "Count a new user profile view once per IP/User every N hours"
                 *     
                 */
                public void put(long user_profile_view_duration_hours) {
                    String url = ("https://discourse.example.com//admin/site_settings/user_profile_view_duration_hours");
                    Map<String, Object> content = new HashMap<>();
                    content.put("user_profile_view_duration_hours", user_profile_view_duration_hours);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class VacuumDbDays {

                /**
                 * 
                 * <p>
                 * vacuum db days
                 * </p>
                 * 
                 * @param vacuum_db_days
                 *     "Run VACUUM ANALYZE to reclaim DB space after migrations (set to 0 to disable)"
                 *     
                 */
                public void put(long vacuum_db_days) {
                    String url = ("https://discourse.example.com//admin/site_settings/vacuum_db_days");
                    Map<String, Object> content = new HashMap<>();
                    content.put("vacuum_db_days", vacuum_db_days);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class VerboseLocalization {

                /**
                 * 
                 * <p>
                 * verbose localization
                 * </p>
                 * 
                 * @param verbose_localization
                 *     "Show extended localization tips in the UI"
                 *     
                 */
                public void put(boolean verbose_localization) {
                    String url = ("https://discourse.example.com//admin/site_settings/verbose_localization");
                    Map<String, Object> content = new HashMap<>();
                    content.put("verbose_localization", verbose_localization);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class VerboseSsoLogging {

                /**
                 * 
                 * <p>
                 * verbose sso logging
                 * </p>
                 * 
                 * @param verbose_sso_logging
                 */
                public void put(boolean verbose_sso_logging) {
                    String url = ("https://discourse.example.com//admin/site_settings/verbose_sso_logging");
                    Map<String, Object> content = new HashMap<>();
                    content.put("verbose_sso_logging", verbose_sso_logging);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class VersionChecks {

                /**
                 * 
                 * <p>
                 * version checks
                 * </p>
                 * 
                 * @param version_checks
                 *     "Ping the Discourse Hub for version updates and show new version messages on the /admin dashboard"
                 *     
                 */
                public void put(boolean version_checks) {
                    String url = ("https://discourse.example.com//admin/site_settings/version_checks");
                    Map<String, Object> content = new HashMap<>();
                    content.put("version_checks", version_checks);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class WarnRevivingOldTopicAge {

                /**
                 * 
                 * <p>
                 * warn reviving old topic age
                 * </p>
                 * 
                 * @param warn_reviving_old_topic_age
                 */
                public void put(long warn_reviving_old_topic_age) {
                    String url = ("https://discourse.example.com//admin/site_settings/warn_reviving_old_topic_age");
                    Map<String, Object> content = new HashMap<>();
                    content.put("warn_reviving_old_topic_age", warn_reviving_old_topic_age);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class WhiteListedSpamHostDomains {

                /**
                 * 
                 * <p>
                 * white listed spam host domains
                 * </p>
                 * 
                 * @param white_listed_spam_host_domains
                 *     "A list of domains excluded from spam host testing. New users will never be restricted from creating posts with links to these domains."
                 *     
                 */
                public void put(String white_listed_spam_host_domains) {
                    String url = ("https://discourse.example.com//admin/site_settings/white_listed_spam_host_domains");
                    Map<String, Object> content = new HashMap<>();
                    content.put("white_listed_spam_host_domains", white_listed_spam_host_domains);
                    requestPut(url, null, content, Void.class);
                }
            }
        }

        public class SiteSettingsJson {

            /**
             * 
             * <p>
             * Show site settings
             * </p>
             */
            public Requested<Object> get() {
                String url = ("https://discourse.example.com//admin/site_settings.json");
                return requestGet(url, null, Object.class);
            }
        }

        public class Users {
            public final Anonymous.Admin.Users.Suspend suspend = new Anonymous.Admin.Users.Suspend();
            public final Anonymous.Admin.Users.Unsuspend unsuspend = new Anonymous.Admin.Users.Unsuspend();
            public final Anonymous.Admin.Users.Silence silence = new Anonymous.Admin.Users.Silence();
            public final Anonymous.Admin.Users.Unsilence unsilence = new Anonymous.Admin.Users.Unsilence();
            public final Anonymous.Admin.Users.Activate activate = new Anonymous.Admin.Users.Activate();
            public final Anonymous.Admin.Users.Anonymize anonymize = new Anonymous.Admin.Users.Anonymize();
            public final Anonymous.Admin.Users.GenerateApiKey generateapikey = new Anonymous.Admin.Users.GenerateApiKey();
            public final Anonymous.Admin.Users.Groups groups = new Anonymous.Admin.Users.Groups();
            public final Anonymous.Admin.Users.List list = new Anonymous.Admin.Users.List();
            public final Anonymous.Admin.Users.LogOut logout = new Anonymous.Admin.Users.LogOut();

            /**
             * 
             * <p>
             * Get a specific user by id. Returns more info than the public user route.
             * </p>
             * 
             * @param id
             */
            public Requested<Object> getByIdJson(long id) {
                String url = ("https://discourse.example.com//admin/users/{id}.json".replace("{id}", ""+id));
                return requestGet(url, null, Object.class);
            }

            /**
             * 
             * <p>
             * Delete a user
             * </p>
             * 
             * @param id
             * @param delete_posts
             * @param block_email
             * @param block_urls
             * @param block_ip
             */
            public Requested<Object> deleteByIdJson(long id,
                boolean delete_posts,
                boolean block_email,
                boolean block_urls,
                boolean block_ip) {
                String url = ("https://discourse.example.com//admin/users/{id}.json".replace("{id}", ""+id));
                return requestDel(url, null, Object.class);
            }

            public class Activate {

                /**
                 * 
                 * <p>
                 * Activate a user
                 * </p>
                 * 
                 * @param id
                 */
                public Requested<Object> putById(long id) {
                    String url = ("https://discourse.example.com//admin/users/{id}/activate".replace("{id}", ""+id));
                    return requestPut(url, null, null, Object.class);
                }
            }

            public class Anonymize {

                /**
                 * 
                 * <p>
                 * Anonymize a user's account by changing their username and email address to random values. This is non-reversable
                 * </p>
                 * 
                 * @param id
                 */
                public Requested<Object> putById(long id) {
                    String url = ("https://discourse.example.com//admin/users/{id}/anonymize".replace("{id}", ""+id));
                    return requestPut(url, null, null, Object.class);
                }
            }

            public class GenerateApiKey {

                /**
                 * 
                 * <p>
                 * Generate/Regenerate api_key for a user
                 * </p>
                 * 
                 * @param id
                 */
                public Requested<Object> postById(long id) {
                    String url = ("https://discourse.example.com//admin/users/{id}/generate_api_key".replace("{id}", ""+id));
                    return requestPost(url, null, null, Object.class);
                }
            }

            public class Groups {

                /**
                 * 
                 * <p>
                 * Assign a group to a user
                 * </p>
                 * 
                 * @param id
                 * @param group_id
                 */
                public void postById(long id, long group_id) {
                    String url = ("https://discourse.example.com//admin/users/{id}/groups".replace("{id}", ""+id));
                    Map<String, Object> content = new HashMap<>();
                    content.put("group_id", group_id);
                    requestPost(url, null, content, Void.class);
                }

                /**
                 * 
                 * <p>
                 * Remove a group assigned to a user
                 * </p>
                 * 
                 * @param id
                 * @param group_id
                 */
                public void deleteByIdGroupId(long id, long group_id) {
                    String url = ("https://discourse.example.com//admin/users/{id}/groups/{group_id}".replace("{id}", ""+id).replace("{group_id}", ""+group_id));
                    requestDel(url, null, Void.class);
                }
            }

            public class List {

                /**
                 * 
                 * <p>
                 * Returns a list of users
                 * </p>
                 * 
                 * @param flag
                 * @param order
                 * @param ascending
                 *     optional. defaults to descending.
                 *     
                 * @param page
                 * @param show_emails
                 */
                public Requested<Object[]> getByFlagJson(discourse.example.com.structures.flag flag,
                    discourse.example.com.structures.order order,
                    Boolean ascending,
                    Long page,
                    Boolean show_emails) {
                    String url = ("https://discourse.example.com//admin/users/list/{flag}.json".replace("{flag}", ""+flag)+"?"+(order==null?"":"&order="+flatten(order))+(ascending==null?"":"&ascending="+flatten(ascending))+(page==null?"":"&page="+flatten(page))+(show_emails==null?"":"&show_emails="+flatten(show_emails)));
                    return requestGet(url, null, Object[].class);
                }
            }

            public class LogOut {

                /**
                 * 
                 * <p>
                 * Log a user out
                 * </p>
                 * 
                 * @param id
                 */
                public Requested<Object> postById(Object id) {
                    String url = ("https://discourse.example.com//admin/users/{id}/log_out".replace("{id}", ""+id));
                    return requestPost(url, null, null, Object.class);
                }
            }

            public class Silence {

                /**
                 * 
                 * <p>
                 * Silence a user
                 * </p>
                 * 
                 * @param id
                 * @param message
                 * @param silenced_till
                 * @param reason
                 * @param post_action
                 */
                public Requested<Object> putById(long id,
                    String message,
                    String silenced_till,
                    String reason,
                    String post_action) {
                    String url = ("https://discourse.example.com//admin/users/{id}/silence".replace("{id}", ""+id));
                    Map<String, Object> content = new HashMap<>();
                    content.put("message", message);
                    content.put("silenced_till", silenced_till);
                    content.put("reason", reason);
                    content.put("post_action", post_action);
                    return requestPut(url, null, content, Object.class);
                }
            }

            public class Suspend {

                /**
                 * 
                 * <p>
                 * Suspend a user
                 * </p>
                 * 
                 * @param id
                 * @param suspend_until
                 * @param reason
                 */
                public void putById(long id, String suspend_until, String reason) {
                    String url = ("https://discourse.example.com//admin/users/{id}/suspend".replace("{id}", ""+id));
                    Map<String, Object> content = new HashMap<>();
                    content.put("suspend_until", suspend_until);
                    content.put("reason", reason);
                    requestPut(url, null, content, Void.class);
                }
            }

            public class Unsilence {

                /**
                 * 
                 * <p>
                 * Unsilence a user
                 * </p>
                 * 
                 * @param id
                 */
                public Requested<Object> putById(long id) {
                    String url = ("https://discourse.example.com//admin/users/{id}/unsilence".replace("{id}", ""+id));
                    return requestPut(url, null, null, Object.class);
                }
            }

            public class Unsuspend {

                /**
                 * 
                 * <p>
                 * Unsuspend a user
                 * </p>
                 * 
                 * @param id
                 */
                public void putById(long id) {
                    String url = ("https://discourse.example.com//admin/users/{id}/unsuspend".replace("{id}", ""+id));
                    requestPut(url, null, null, Void.class);
                }
            }
        }
    }

    public class C {

        /**
         * 
         * <p>
         * Get a list of topics in the specified category
         * </p>
         * 
         * @param id
         * @param page
         */
        public Requested<Object> getByIdJson(long id, Long page) {
            String url = ("https://discourse.example.com//c/{id}.json".replace("{id}", ""+id)+"?"+(page==null?"":"&page="+flatten(page)));
            return requestGet(url, null, Object.class);
        }
    }

    public class Categories {

        /**
         * 
         * <p>
         * Update a single category
         * </p>
         * 
         * @param name
         * @param color
         * @param text_color
         */
        public Requested<Object> putById(String name, String color, String text_color) {
            String url = ("https://discourse.example.com//categories/{id}");
            Map<String, Object> content = new HashMap<>();
            content.put("name", name);
            content.put("color", color);
            content.put("text_color", text_color);
            return requestPut(url, null, content, Object.class);
        }
    }

    public class CategoriesJson {

        /**
         * Get a list of categories
         * 
         * <p>
         * The Categories endpoint returns a list of all the categories for
         * your discourse site that you have access to.
         * </p>
         */
        public Requested<Object> get() {
            String url = ("https://discourse.example.com//categories.json");
            return requestGet(url, null, Object.class);
        }

        /**
         * 
         * <p>
         * Create a new category
         * </p>
         * 
         * @param name
         * @param color
         * @param text_color
         */
        public Requested<Object> post(String name, String color, String text_color) {
            String url = ("https://discourse.example.com//categories.json");
            Map<String, Object> content = new HashMap<>();
            content.put("name", name);
            content.put("color", color);
            content.put("text_color", text_color);
            return requestPost(url, null, content, Object.class);
        }
    }

    public class DirectoryItemsJson {

        /**
         * 
         * <p>
         * Get a public list of users
         * </p>
         * 
         * @param period
         * @param order
         * @param asc
         * @param page
         */
        public Requested<Object> get(discourse.example.com.structures.period period,
            discourse.example.com.structures.order order,
            Boolean asc,
            Long page) {
            String url = ("https://discourse.example.com//directory_items.json?period={period}&order={order}"+"?"+(period==null?"":"&period="+flatten(period))+(order==null?"":"&order="+flatten(order))+(asc==null?"":"&asc="+flatten(asc))+(page==null?"":"&page="+flatten(page)));
            return requestGet(url, null, Object.class);
        }
    }

    public class ExportCsv {
        public final Anonymous.ExportCsv.ExportEntityJson exportentity_json = new Anonymous.ExportCsv.ExportEntityJson();

        public class ExportEntityJson {

            /**
             * 
             * <p>
             * Start export of a report
             * </p>
             * 
             * @param entity
             * @param args_name_
             * @param args_start_date_
             * @param args_end_date_
             * @param args_group_id_
             */
            public Requested<Object> post(String entity,
                String args_name_,
                String args_start_date_,
                String args_end_date_,
                long args_group_id_) {
                String url = ("https://discourse.example.com//export_csv/export_entity.json");
                Map<String, Object> content = new HashMap<>();
                content.put("entity", entity);
                content.put("args_name_", args_name_);
                content.put("args_start_date_", args_start_date_);
                content.put("args_end_date_", args_end_date_);
                content.put("args_group_id_", args_group_id_);
                return requestPost(url, null, content, Object.class);
            }
        }
    }

    public class Groups {
        public final Anonymous.Groups.MembersJson members_json = new Anonymous.Groups.MembersJson();

        /**
         * 
         * <p>
         * Get a specific group
         * </p>
         */
        public Requested<Object> getByNameJson() {
            String url = ("https://discourse.example.com//groups/{name}.json");
            return requestGet(url, null, Object.class);
        }

        /**
         * 
         * <p>
         * Update a group
         * </p>
         */
        public Requested<Object> putByNameJson() {
            String url = ("https://discourse.example.com//groups/{name}.json");
            return requestPut(url, null, null, Object.class);
        }

        public class MembersJson {

            /**
             * 
             * <p>
             * Get some group members
             * </p>
             */
            public Requested<Object> getByGroupName() {
                String url = ("https://discourse.example.com//groups/{group_name}/members.json");
                return requestGet(url, null, Object.class);
            }

            /**
             * Add user(s) to a group
             * 
             * <p>
             * Add user(s) to a group (comma separated)
             * </p>
             * 
             * @param usernames
             */
            public Requested<Object> putByGroupId(String usernames) {
                String url = ("https://discourse.example.com//groups/{group_id}/members.json");
                Map<String, Object> content = new HashMap<>();
                content.put("usernames", usernames);
                return requestPut(url, null, content, Object.class);
            }

            /**
             * Remove user(s) from a group
             * 
             * <p>
             * You may use one of the following request body params to specify the user(s) to remove.
             * </p>
             * 
             * @param user_id
             * @param user_ids
             * @param username
             * @param usernames
             * @param user_email
             * @param user_emails
             */
            public Requested<Object> deleteByGroupId(long user_id,
                String user_ids,
                String username,
                String usernames,
                String user_email,
                String user_emails) {
                String url = ("https://discourse.example.com//groups/{group_id}/members.json");
                return requestDel(url, null, Object.class);
            }
        }
    }

    public class GroupsJson {

        /**
         * 
         * <p>
         * Get some groups
         * </p>
         */
        public Requested<Object[]> get() {
            String url = ("https://discourse.example.com//groups.json");
            return requestGet(url, null, Object[].class);
        }
    }

    public class Invites {
        public final Anonymous.Invites.Link link = new Anonymous.Invites.Link();

        /**
         * 
         * <p>
         * Invite a user by email to join your forum
         * </p>
         * 
         * @param email
         * @param group_names
         * @param custom_message
         */
        public Requested<Object> post(String email, String group_names, String custom_message) {
            String url = ("https://discourse.example.com//invites");
            Map<String, Object> content = new HashMap<>();
            content.put("email", email);
            content.put("group_names", group_names);
            content.put("custom_message", custom_message);
            return requestPost(url, null, content, Object.class);
        }

        public class Link {

            /**
             * 
             * <p>
             * Generate an invite link but don't send an email
             * </p>
             * 
             * @param email
             * @param group_names
             * @param custom_message
             */
            public Requested<String> post(String email, String group_names, String custom_message) {
                String url = ("https://discourse.example.com//invites/link");
                Map<String, Object> content = new HashMap<>();
                content.put("email", email);
                content.put("group_names", group_names);
                content.put("custom_message", custom_message);
                return requestPost(url, null, content, String.class);
            }
        }
    }

    public class LatestJson {

        /**
         * 
         * <p>
         * Get the latest topics
         * </p>
         * 
         * @param order
         * @param ascending
         *     defaults to desc, add `ascending=true` to sort asc
         */
        public Requested<Object> get(discourse.example.com.structures.order order, Boolean ascending) {
            String url = ("https://discourse.example.com//latest.json".replace("{order}", ""+order).replace("{ascending}", ""+ascending));
            return requestGet(url, null, Object.class);
        }
    }

    public class Notifications {
        public final Anonymous.Notifications.MarkReadJson markread_json = new Anonymous.Notifications.MarkReadJson();

        public class MarkReadJson {

            /**
             * 
             * <p>
             * Mark notifications as read
             * </p>
             * 
             * @param id
             *     (optional) Leave off to mark all notifications as read
             *     
             */
            public Requested<Object> put(long id) {
                String url = ("https://discourse.example.com//notifications/mark-read.json");
                Map<String, Object> content = new HashMap<>();
                content.put("id", id);
                return requestPut(url, null, content, Object.class);
            }
        }
    }

    public class NotificationsJson {

        /**
         * 
         * <p>
         * Get notifications for the specified user
         * </p>
         * 
         * @param username
         */
        public Requested<Object> get(String username) {
            String url = ("https://discourse.example.com//notifications.json"+"?"+(username==null?"":"&username="+flatten(username)));
            return requestGet(url, null, Object.class);
        }
    }

    public class PageViewTotalReqs {

        /**
         * 
         * <p>
         * return pageview stats, defaults to one month
         * </p>
         * 
         * @param start_date
         * @param end_date
         * @param category_id
         * @param group_id
         */
        public Requested<Object> get(String start_date,
            String end_date,
            Long category_id,
            Long group_id) {
            String url = ("https://discourse.example.com//page_view_total_reqs"+"?"+(start_date==null?"":"&start_date="+flatten(start_date))+(end_date==null?"":"&end_date="+flatten(end_date))+(category_id==null?"":"&category_id="+flatten(category_id))+(group_id==null?"":"&group_id="+flatten(group_id)));
            return requestGet(url, null, Object.class);
        }
    }

    public class Polls {
        public final Anonymous.Polls.Vote vote = new Anonymous.Polls.Vote();

        public class Vote {

            /**
             * 
             * <p>
             * vote on a poll
             * </p>
             * 
             * @param post_id
             * @param poll_name
             * @param options__
             */
            public Requested<Object> put(long post_id, String poll_name, String options__) {
                String url = ("https://discourse.example.com//polls/vote");
                Map<String, Object> content = new HashMap<>();
                content.put("post_id", post_id);
                content.put("poll_name", poll_name);
                content.put("options__", options__);
                return requestPut(url, null, content, Object.class);
            }
        }
    }

    public class PostActions {

        /**
         * 
         * <p>
         * Like a post and other actions
         * </p>
         * 
         * @param id
         * @param post_action_type_id
         * @param flag_topic
         */
        public void post(long id, long post_action_type_id, boolean flag_topic) {
            String url = ("https://discourse.example.com//post_actions");
            Map<String, Object> content = new HashMap<>();
            content.put("id", id);
            content.put("post_action_type_id", post_action_type_id);
            content.put("flag_topic", flag_topic);
            requestPost(url, null, content, Void.class);
        }

        /**
         * 
         * <p>
         * Un-like a post
         * </p>
         * 
         * @param id
         * @param post_action_type_id
         */
        public void deleteById(long id, long post_action_type_id) {
            String url = ("https://discourse.example.com//post_actions/{id}".replace("{id}", ""+id));
            requestDel(url, null, Void.class);
        }
    }

    public class Posts {
        public final Anonymous.Posts.Locked locked = new Anonymous.Posts.Locked();

        /**
         * 
         * <p>
         * Get a single post
         * </p>
         * 
         * @param id
         */
        public Requested<Object> getByIdJson(long id) {
            String url = ("https://discourse.example.com//posts/{id}.json".replace("{id}", ""+id));
            return requestGet(url, null, Object.class);
        }

        /**
         * 
         * <p>
         * Update a single post
         * </p>
         * 
         * @param id
         * @param post_raw_
         * @param post_raw_old_
         * @param post_edit_reason_
         * @param post_cooked_
         */
        public Requested<Object> putByIdJson(long id,
            String post_raw_,
            String post_raw_old_,
            String post_edit_reason_,
            String post_cooked_) {
            String url = ("https://discourse.example.com//posts/{id}.json".replace("{id}", ""+id));
            Map<String, Object> content = new HashMap<>();
            content.put("post_raw_", post_raw_);
            content.put("post_raw_old_", post_raw_old_);
            content.put("post_edit_reason_", post_edit_reason_);
            content.put("post_cooked_", post_cooked_);
            return requestPut(url, null, content, Object.class);
        }

        public class Locked {

            /**
             * 
             * <p>
             * Lock a post from being edited
             * </p>
             * 
             * @param id
             * @param locked
             *     True or False
             *     
             */
            public void putById(long id, boolean locked) {
                String url = ("https://discourse.example.com//posts/{id}/locked".replace("{id}", ""+id));
                Map<String, Object> content = new HashMap<>();
                content.put("locked", locked);
                requestPut(url, null, content, Void.class);
            }
        }
    }

    public class PostsJson {

        /**
         * 
         * <p>
         * Get a list of the latest posts across topics
         * </p>
         * 
         * @param before
         */
        public Requested<Object> get(Long before) {
            String url = ("https://discourse.example.com//posts.json".replace("{before}", ""+before));
            return requestGet(url, null, Object.class);
        }

        /**
         * 
         * <p>
         * Create a new topic, a new post, or a private message
         * </p>
         * 
         * @param title
         *     required if creating a new topic or new private message
         *     
         * @param topic_id
         *     required if creating a new post
         * @param raw
         * @param category
         *     optional if creating a new topic,
         *     ignored if creating a new post
         *     
         * @param target_usernames
         *     required for private message, comma separated
         *     
         * @param archetype
         *     required for private message
         *     
         * @param created_at
         *     pick a date other than the default current time
         *     
         */
        public Requested<Object> post(String title,
            long topic_id,
            String raw,
            long category,
            String target_usernames,
            discourse.example.com.structures.archetype archetype,
            String created_at) {
            String url = ("https://discourse.example.com//posts.json");
            Map<String, Object> content = new HashMap<>();
            content.put("title", title);
            content.put("topic_id", topic_id);
            content.put("raw", raw);
            content.put("category", category);
            content.put("target_usernames", target_usernames);
            content.put("archetype", archetype);
            content.put("created_at", created_at);
            return requestPost(url, null, content, Object.class);
        }
    }

    public class Search {
        public final Anonymous.Search.Query query = new Anonymous.Search.Query();

        public class Query {

            /**
             * 
             * <p>
             * Search for something
             * </p>
             * 
             * @param term
             * @param include_blurbs
             */
            public Requested<Object> get(String term, Boolean include_blurbs) {
                String url = ("https://discourse.example.com//search/query".replace("{term}", ""+term).replace("{include_blurbs}", ""+include_blurbs));
                return requestGet(url, null, Object.class);
            }
        }
    }

    public class Session {
        public final Anonymous.Session.ForgotPassword forgotpassword = new Anonymous.Session.ForgotPassword();

        public class ForgotPassword {

            /**
             * 
             * <p>
             * Send password reset email
             * </p>
             * 
             * @param login
             */
            public Requested<Object> post(String login) {
                String url = ("https://discourse.example.com//session/forgot_password");
                Map<String, Object> content = new HashMap<>();
                content.put("login", login);
                return requestPost(url, null, content, Object.class);
            }
        }
    }

    public class T {
        public final Anonymous.T.PostsJson posts_json = new Anonymous.T.PostsJson();
        public final Anonymous.T.Invite invite = new Anonymous.T.Invite();
        public final Anonymous.T.Bookmark bookmark = new Anonymous.T.Bookmark();
        public final Anonymous.T.Status status = new Anonymous.T.Status();
        public final Anonymous.T.Timer timer = new Anonymous.T.Timer();
        public final Anonymous.T.ChangeTimestamp changetimestamp = new Anonymous.T.ChangeTimestamp();
        public final Anonymous.T.Notifications notifications = new Anonymous.T.Notifications();

        /**
         * 
         * <p>
         * Get a single topic
         * </p>
         * 
         * @param id
         * @param print
         *     Will return up to 1000 posts in a topic
         */
        public Requested<Object> getByIdJson(long id, Boolean print) {
            String url = ("https://discourse.example.com//t/{id}.json".replace("{id}", ""+id)+"?"+(print==null?"":"&print="+flatten(print)));
            return requestGet(url, null, Object.class);
        }

        /**
         * 
         * <p>
         * Remove a single topic
         * </p>
         * 
         * @param id
         */
        public void deleteByIdJson(long id) {
            String url = ("https://discourse.example.com//t/{id}.json".replace("{id}", ""+id));
            requestDel(url, null, Void.class);
        }

        /**
         * 
         * <p>
         * Update a single topic
         * </p>
         * 
         * @param slug
         *     ProTip: You can just use a `-` instead of the actual slug and the topic will be found by the id.
         * @param id
         * @param title
         * @param category_id
         */
        public Requested<Object> putBySlugIdJson(String slug,
            long id,
            String title,
            long category_id) {
            String url = ("https://discourse.example.com//t/{slug}/{id}.json".replace("{slug}", ""+slug).replace("{id}", ""+id));
            Map<String, Object> content = new HashMap<>();
            content.put("title", title);
            content.put("category_id", category_id);
            return requestPut(url, null, content, Object.class);
        }

        public class Bookmark {

            /**
             * 
             * <p>
             * Bookmark a topic
             * </p>
             * 
             * @param id
             */
            public void putById(long id) {
                String url = ("https://discourse.example.com//t/{id}/bookmark".replace("{id}", ""+id));
                requestPut(url, null, null, Void.class);
            }
        }

        public class ChangeTimestamp {

            /**
             * 
             * <p>
             * Update a topics timestamp
             * </p>
             * 
             * @param timestamp
             */
            public Requested<Object> putById(long timestamp) {
                String url = ("https://discourse.example.com//t/{id}/change-timestamp");
                Map<String, Object> content = new HashMap<>();
                content.put("timestamp", timestamp);
                return requestPut(url, null, content, Object.class);
            }
        }

        public class Invite {

            /**
             * 
             * <p>
             * Invite user to topic
             * </p>
             * 
             * @param id
             * @param username
             */
            public Requested<Object> postById(long id, String username) {
                String url = ("https://discourse.example.com//t/{id}/invite".replace("{id}", ""+id));
                Map<String, Object> content = new HashMap<>();
                content.put("username", username);
                return requestPost(url, null, content, Object.class);
            }
        }

        public class Notifications {

            /**
             * 
             * <p>
             * set notification level
             * </p>
             * 
             * @param notification_level
             */
            public Requested<Object> postById(long notification_level) {
                String url = ("https://discourse.example.com//t/{id}/notifications");
                Map<String, Object> content = new HashMap<>();
                content.put("notification_level", notification_level);
                return requestPost(url, null, content, Object.class);
            }
        }

        public class PostsJson {

            /**
             * 
             * <p>
             * Get specific posts in a topic. Used for infinite scrolling or pagination.
             * </p>
             * 
             * @param post_ids__
             *     post_ids can be found in the post_stream
             */
            public Requested<Object> getById(Long post_ids__) {
                String url = ("https://discourse.example.com//t/{id}/posts.json".replace("{post_ids__}", ""+post_ids__));
                return requestGet(url, null, Object.class);
            }
        }

        public class Status {

            /**
             * 
             * <p>
             * Update a topic's status
             * </p>
             * 
             * @param id
             * @param status
             *     A lowercase string. Valid values shown above.
             *     
             * @param enabled
             *     This would be true or false
             *     
             * @param until
             *     Only required for pinned and pinned-globally.
             *     
             */
            public Requested<Object> putById(long id,
                discourse.example.com.structures.status status,
                boolean enabled,
                String until) {
                String url = ("https://discourse.example.com//t/{id}/status".replace("{id}", ""+id));
                Map<String, Object> content = new HashMap<>();
                content.put("status", status);
                content.put("enabled", enabled);
                content.put("until", until);
                return requestPut(url, null, content, Object.class);
            }
        }

        public class Timer {

            /**
             * 
             * <p>
             * Create a timed topic
             * </p>
             * 
             * @param time
             * @param status_type
             * @param based_on_last_post
             * @param category_id
             */
            public Requested<Object> postById(String time,
                String status_type,
                boolean based_on_last_post,
                long category_id) {
                String url = ("https://discourse.example.com//t/{id}/timer");
                Map<String, Object> content = new HashMap<>();
                content.put("time", time);
                content.put("status_type", status_type);
                content.put("based_on_last_post", based_on_last_post);
                content.put("category_id", category_id);
                return requestPost(url, null, content, Object.class);
            }
        }
    }

    public class TagGroups {

        /**
         * 
         * <p>
         * Get a single tag group
         * </p>
         * 
         * @param id
         */
        public Requested<Object> getByIdJson(long id) {
            String url = ("https://discourse.example.com//tag_groups/{id}.json".replace("{id}", ""+id));
            return requestGet(url, null, Object.class);
        }

        /**
         * 
         * <p>
         * Update an existing tag group
         * </p>
         * 
         * @param id
         * @param name
         * @param tag_names
         */
        public Requested<Object> putByIdJson(long id, String name, String[] tag_names) {
            String url = ("https://discourse.example.com//tag_groups/{id}.json".replace("{id}", ""+id));
            Map<String, Object> content = new HashMap<>();
            content.put("name", name);
            content.put("tag_names", tag_names);
            return requestPut(url, null, content, Object.class);
        }
    }

    public class TagGroupsJson {

        /**
         * 
         * <p>
         * Get a list of tag groups
         * </p>
         */
        public Requested<Object> get() {
            String url = ("https://discourse.example.com//tag_groups.json");
            return requestGet(url, null, Object.class);
        }

        /**
         * 
         * <p>
         * Create a new tag group
         * </p>
         * 
         * @param name
         * @param tag_names
         */
        public Requested<Object> post(String name, String[] tag_names) {
            String url = ("https://discourse.example.com//tag_groups.json");
            Map<String, Object> content = new HashMap<>();
            content.put("name", name);
            content.put("tag_names", tag_names);
            return requestPost(url, null, content, Object.class);
        }
    }

    public class Tags {

        /**
         * 
         * <p>
         * Get a list of tags
         * </p>
         */
        public void get() {
            String url = ("https://discourse.example.com//tags");
            requestGet(url, null, Void.class);
        }

        /**
         * 
         * <p>
         * Get a specific tag
         * </p>
         * 
         * @param tag
         */
        public void getByTag(String tag) {
            String url = ("https://discourse.example.com//tags/{tag}".replace("{tag}", ""+tag));
            requestGet(url, null, Void.class);
        }
    }

    public class Top {

        /**
         * 
         * <p>
         * Get the top topics filtered by specified flag
         * </p>
         * 
         * @param flag
         */
        public void getByFlagJson(discourse.example.com.structures.flag flag) {
            String url = ("https://discourse.example.com//top/{flag}.json".replace("{flag}", ""+flag));
            requestGet(url, null, Void.class);
        }
    }

    public class Topics {
        public final Anonymous.Topics.PrivateMessages privatemessages = new Anonymous.Topics.PrivateMessages();
        public final Anonymous.Topics.PrivateMessagesSent privatemessagessent = new Anonymous.Topics.PrivateMessagesSent();

        public class PrivateMessages {

            /**
             * 
             * <p>
             * Get a list of private messages for a user
             * </p>
             */
            public Requested<Object> getByUsernameJson() {
                String url = ("https://discourse.example.com//topics/private-messages/{username}.json");
                return requestGet(url, null, Object.class);
            }
        }

        public class PrivateMessagesSent {

            /**
             * 
             * <p>
             * Get a list of private messages sent
             * </p>
             */
            public Requested<Object> getByUsernameJson() {
                String url = ("https://discourse.example.com//topics/private-messages-sent/{username}.json");
                return requestGet(url, null, Object.class);
            }
        }
    }

    public class TopJson {

        /**
         * 
         * <p>
         * Get the top topics
         * </p>
         */
        public Requested<Object> get() {
            String url = ("https://discourse.example.com//top.json");
            return requestGet(url, null, Object.class);
        }
    }

    public class U {
        public final Anonymous.U.ByExternal byexternal = new Anonymous.U.ByExternal();

        public class ByExternal {

            /**
             * 
             * <p>
             * Get a single user by SSO external ID
             * </p>
             * 
             * @param external_id
             */
            public Requested<Object> getByExternalIdJson(long external_id) {
                String url = ("https://discourse.example.com//u/by-external/{external_id}.json".replace("{external_id}", ""+external_id));
                return requestGet(url, null, Object.class);
            }
        }
    }

    public class UploadsJson {

        /**
         * 
         * <p>
         * Upload a file like an image or an avatar
         * </p>
         * 
         * @param type
         *     a lowercase string with numbers but no spaces. Set to 'avatar' if uploading an avatar
         *     
         * @param user_id
         *     required if uploading an avatar
         * @param synchronous
         *     use this flag to return an id and url
         */
        public Requested<Object> post(discourse.example.com.structures.type type, long user_id, boolean synchronous) {
            String url = ("https://discourse.example.com//uploads.json");
            Map<String, Object> content = new HashMap<>();
            content.put("type", type);
            content.put("user_id", user_id);
            content.put("synchronous", synchronous);
            return requestPost(url, null, content, Object.class);
        }
    }

    public class UserActionsJson {

        /**
         * 
         * <p>
         * Get a list of user actions
         * </p>
         * 
         * @param offset
         * @param username
         * @param filter
         */
        public Requested<Object> get(long offset, String username, long filter) {
            String url = ("https://discourse.example.com//user_actions.json"+"?"+"&offset="+flatten(offset)+(username==null?"":"&username="+flatten(username))+"&filter="+flatten(filter));
            return requestGet(url, null, Object.class);
        }
    }

    public class UserAvatar {
        public final Anonymous.UserAvatar.RefreshGravatarJson refreshgravatar_json = new Anonymous.UserAvatar.RefreshGravatarJson();

        public class RefreshGravatarJson {

            /**
             * 
             * <p>
             * Refresh a users gravatar
             * </p>
             * 
             * @param username
             */
            public Requested<Object> postByUsername(String username) {
                String url = ("https://discourse.example.com//user_avatar/{username}/refresh_gravatar.json".replace("{username}", ""+username));
                return requestPost(url, null, null, Object.class);
            }
        }
    }

    public class UserBadges {

        /**
         * 
         * <p>
         * get a list of badges assigned to a user
         * </p>
         */
        public Requested<Object> getByUsernameJson() {
            String url = ("https://discourse.example.com//user-badges/{username}.json");
            return requestGet(url, null, Object.class);
        }

        /**
         * 
         * <p>
         * revoke a badge assigned to a user
         * </p>
         * 
         * @param id
         */
        public Requested<Object> deleteById(long id) {
            String url = ("https://discourse.example.com//user_badges/{id}".replace("{id}", ""+id));
            return requestDel(url, null, Object.class);
        }
    }

    public class UserBadgesJson {

        /**
         * 
         * <p>
         * assign a badge to a user
         * </p>
         * 
         * @param username
         * @param badge_id
         * @param reason
         */
        public Requested<Object> post(String username, long badge_id, String reason) {
            String url = ("https://discourse.example.com//user_badges.json");
            Map<String, Object> content = new HashMap<>();
            content.put("username", username);
            content.put("badge_id", badge_id);
            content.put("reason", reason);
            return requestPost(url, null, content, Object.class);
        }
    }

    public class Users {
        public final Anonymous.Users.Preferences preferences = new Anonymous.Users.Preferences();
        public final Anonymous.Users.PasswordReset passwordreset = new Anonymous.Users.PasswordReset();

        /**
         * 
         * <p>
         * Get a single user by username
         * </p>
         * 
         * @param username
         */
        public Requested<Object> getByUsernameJson(String username) {
            String url = ("https://discourse.example.com//users/{username}.json".replace("{username}", ""+username));
            return requestGet(url, null, Object.class);
        }

        /**
         * 
         * <p>
         * Creates a new user
         * </p>
         * 
         * @param name
         * @param email
         * @param password
         * @param username
         * @param active
         * @param approved
         * @param user_fields_1_
         */
        public Requested<Object> post(String name,
            String email,
            String password,
            String username,
            boolean active,
            boolean approved,
            String user_fields_1_) {
            String url = ("https://discourse.example.com//users");
            Map<String, Object> content = new HashMap<>();
            content.put("name", name);
            content.put("email", email);
            content.put("password", password);
            content.put("username", username);
            content.put("active", active);
            content.put("approved", approved);
            content.put("user_fields_1_", user_fields_1_);
            return requestPost(url, null, content, Object.class);
        }

        public class PasswordReset {

            /**
             * 
             * <p>
             * Create a new password
             * </p>
             * 
             * @param username
             * @param password
             */
            public void putByToken(String username, String password) {
                String url = ("https://discourse.example.com//users/password-reset/{token}");
                Map<String, Object> content = new HashMap<>();
                content.put("username", username);
                content.put("password", password);
                requestPut(url, null, content, Void.class);
            }
        }

        public class Preferences {
            public final Anonymous.Users.Preferences.Avatar avatar = new Anonymous.Users.Preferences.Avatar();
            public final Anonymous.Users.Preferences.Email email = new Anonymous.Users.Preferences.Email();

            public class Avatar {
                public final Anonymous.Users.Preferences.Avatar.Pick pick = new Anonymous.Users.Preferences.Avatar.Pick();

                public class Pick {

                    /**
                     * 
                     * <p>
                     * Update avatar
                     * </p>
                     * 
                     * @param upload_id
                     * @param type
                     */
                    public Requested<Object> putByUsername(long upload_id, String type) {
                        String url = ("https://discourse.example.com//users/{username}/preferences/avatar/pick");
                        Map<String, Object> content = new HashMap<>();
                        content.put("upload_id", upload_id);
                        content.put("type", type);
                        return requestPut(url, null, content, Object.class);
                    }
                }
            }

            public class Email {

                /**
                 * 
                 * <p>
                 * Update email
                 * </p>
                 * 
                 * @param email
                 */
                public void putByUsername(String email) {
                    String url = ("https://discourse.example.com//users/{username}/preferences/email");
                    Map<String, Object> content = new HashMap<>();
                    content.put("email", email);
                    requestPut(url, null, content, Void.class);
                }
            }
        }
    }
}
