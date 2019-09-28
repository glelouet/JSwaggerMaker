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
    public final Anonymous.Categoriesjson categories_json = new Anonymous.Categoriesjson();
    public final Anonymous.C c = new Anonymous.C();
    public final Anonymous.Categories categories = new Anonymous.Categories();
    public final Anonymous.Postsjson posts_json = new Anonymous.Postsjson();
    public final Anonymous.Posts posts = new Anonymous.Posts();
    public final Anonymous.Postactions postactions = new Anonymous.Postactions();
    public final Anonymous.T t = new Anonymous.T();
    public final Anonymous.Topics topics = new Anonymous.Topics();
    public final Anonymous.Notificationsjson notifications_json = new Anonymous.Notificationsjson();
    public final Anonymous.Notifications notifications = new Anonymous.Notifications();
    public final Anonymous.Invites invites = new Anonymous.Invites();
    public final Anonymous.Taggroupsjson taggroups_json = new Anonymous.Taggroupsjson();
    public final Anonymous.Taggroups taggroups = new Anonymous.Taggroups();
    public final Anonymous.Users users = new Anonymous.Users();
    public final Anonymous.U u = new Anonymous.U();
    public final Anonymous.Uploadsjson uploads_json = new Anonymous.Uploadsjson();
    public final Anonymous.Directoryitemsjson directoryitems_json = new Anonymous.Directoryitemsjson();
    public final Anonymous.Tags tags = new Anonymous.Tags();
    public final Anonymous.Search search = new Anonymous.Search();
    public final Anonymous.Admin admin = new Anonymous.Admin();
    public final Anonymous.Groupsjson groups_json = new Anonymous.Groupsjson();
    public final Anonymous.Groups groups = new Anonymous.Groups();
    public final Anonymous.Latestjson latest_json = new Anonymous.Latestjson();
    public final Anonymous.Topjson top_json = new Anonymous.Topjson();
    public final Anonymous.Top top = new Anonymous.Top();
    public final Anonymous.Session session = new Anonymous.Session();
    public final Anonymous.Userbadges userbadges = new Anonymous.Userbadges();
    public final Anonymous.Userbadgesjson userbadges_json = new Anonymous.Userbadgesjson();
    public final Anonymous.Useractionsjson useractions_json = new Anonymous.Useractionsjson();
    public final Anonymous.Aboutjson about_json = new Anonymous.Aboutjson();
    public final Anonymous.Polls polls = new Anonymous.Polls();
    public final Anonymous.Pageviewtotalreqs pageviewtotalreqs = new Anonymous.Pageviewtotalreqs();
    public final Anonymous.Exportcsv exportcsv = new Anonymous.Exportcsv();
    public final Anonymous.Useravatar useravatar = new Anonymous.Useravatar();

    public class Aboutjson {

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
        public final Anonymous.Admin.Emailjson email_json = new Anonymous.Admin.Emailjson();
        public final Anonymous.Admin.Customize customize = new Anonymous.Admin.Customize();
        public final Anonymous.Admin.Users users = new Anonymous.Admin.Users();
        public final Anonymous.Admin.Groups groups = new Anonymous.Admin.Groups();
        public final Anonymous.Admin.Sitesettingsjson sitesettings_json = new Anonymous.Admin.Sitesettingsjson();
        public final Anonymous.Admin.Sitesettings sitesettings = new Anonymous.Admin.Sitesettings();
        public final Anonymous.Admin.Plugins plugins = new Anonymous.Admin.Plugins();
        public final Anonymous.Admin.Backupsjson backups_json = new Anonymous.Admin.Backupsjson();
        public final Anonymous.Admin.Backups backups = new Anonymous.Admin.Backups();
        public final Anonymous.Admin.Emails emails = new Anonymous.Admin.Emails();
        public final Anonymous.Admin.Flags flags = new Anonymous.Admin.Flags();
        public final Anonymous.Admin.Badgesjson badges_json = new Anonymous.Admin.Badgesjson();
        public final Anonymous.Admin.Api api = new Anonymous.Admin.Api();
        public final Anonymous.Admin.Logs logs = new Anonymous.Admin.Logs();

        public class Api {
            public final Anonymous.Admin.Api.Webhooks webhooks = new Anonymous.Admin.Api.Webhooks();

            public class Webhooks {

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

        public class Backupsjson {

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

        public class Badgesjson {

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
            public final Anonymous.Admin.Customize.Emailtemplatesjson emailtemplates_json = new Anonymous.Admin.Customize.Emailtemplatesjson();
            public final Anonymous.Admin.Customize.Userfieldsjson userfields_json = new Anonymous.Admin.Customize.Userfieldsjson();
            public final Anonymous.Admin.Customize.Userfields userfields = new Anonymous.Admin.Customize.Userfields();

            public class Emailtemplatesjson {

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

            public class Userfields {

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

            public class Userfieldsjson {

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

        public class Emailjson {

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
            public Requested<Object[]> getByActionjson(discourse.example.com.structures.action action, long offset) {
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
            public Requested<Object> getByTypejson(discourse.example.com.structures.type type, long offset) {
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
            public Requested<Object> deleteByGroupidjson() {
                String url = ("https://discourse.example.com//admin/groups/{group_id}.json");
                return requestDel(url, null, Object.class);
            }
        }

        public class Logs {
            public final Anonymous.Admin.Logs.Staffactionlogsjson staffactionlogs_json = new Anonymous.Admin.Logs.Staffactionlogsjson();

            public class Staffactionlogsjson {

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

        public class Sitesettings {
            public final Anonymous.Admin.Sitesettings.Title title = new Anonymous.Admin.Sitesettings.Title();
            public final Anonymous.Admin.Sitesettings.Sitedescription sitedescription = new Anonymous.Admin.Sitesettings.Sitedescription();
            public final Anonymous.Admin.Sitesettings.Contactemail contactemail = new Anonymous.Admin.Sitesettings.Contactemail();
            public final Anonymous.Admin.Sitesettings.Contacturl contacturl = new Anonymous.Admin.Sitesettings.Contacturl();
            public final Anonymous.Admin.Sitesettings.Notificationemail notificationemail = new Anonymous.Admin.Sitesettings.Notificationemail();
            public final Anonymous.Admin.Sitesettings.Sitecontactusername sitecontactusername = new Anonymous.Admin.Sitesettings.Sitecontactusername();
            public final Anonymous.Admin.Sitesettings.Logourl logourl = new Anonymous.Admin.Sitesettings.Logourl();
            public final Anonymous.Admin.Sitesettings.Logosmallurl logosmallurl = new Anonymous.Admin.Sitesettings.Logosmallurl();
            public final Anonymous.Admin.Sitesettings.Digestlogourl digestlogourl = new Anonymous.Admin.Sitesettings.Digestlogourl();
            public final Anonymous.Admin.Sitesettings.Mobilelogourl mobilelogourl = new Anonymous.Admin.Sitesettings.Mobilelogourl();
            public final Anonymous.Admin.Sitesettings.Faviconurl faviconurl = new Anonymous.Admin.Sitesettings.Faviconurl();
            public final Anonymous.Admin.Sitesettings.Appletouchiconurl appletouchiconurl = new Anonymous.Admin.Sitesettings.Appletouchiconurl();
            public final Anonymous.Admin.Sitesettings.Defaultopengraphimageurl defaultopengraphimageurl = new Anonymous.Admin.Sitesettings.Defaultopengraphimageurl();
            public final Anonymous.Admin.Sitesettings.Twittersummarylargeimageurl twittersummarylargeimageurl = new Anonymous.Admin.Sitesettings.Twittersummarylargeimageurl();
            public final Anonymous.Admin.Sitesettings.Excluderelnofollowdomains excluderelnofollowdomains = new Anonymous.Admin.Sitesettings.Excluderelnofollowdomains();
            public final Anonymous.Admin.Sitesettings.Companyshortname companyshortname = new Anonymous.Admin.Sitesettings.Companyshortname();
            public final Anonymous.Admin.Sitesettings.Companyfullname companyfullname = new Anonymous.Admin.Sitesettings.Companyfullname();
            public final Anonymous.Admin.Sitesettings.Companydomain companydomain = new Anonymous.Admin.Sitesettings.Companydomain();
            public final Anonymous.Admin.Sitesettings.Defaultlocale defaultlocale = new Anonymous.Admin.Sitesettings.Defaultlocale();
            public final Anonymous.Admin.Sitesettings.Allowuserlocale allowuserlocale = new Anonymous.Admin.Sitesettings.Allowuserlocale();
            public final Anonymous.Admin.Sitesettings.Setlocalefromacceptlanguageheader setlocalefromacceptlanguageheader = new Anonymous.Admin.Sitesettings.Setlocalefromacceptlanguageheader();
            public final Anonymous.Admin.Sitesettings.Categoriestopics categoriestopics = new Anonymous.Admin.Sitesettings.Categoriestopics();
            public final Anonymous.Admin.Sitesettings.Suggestedtopics suggestedtopics = new Anonymous.Admin.Sitesettings.Suggestedtopics();
            public final Anonymous.Admin.Sitesettings.Limitsuggestedtocategory limitsuggestedtocategory = new Anonymous.Admin.Sitesettings.Limitsuggestedtocategory();
            public final Anonymous.Admin.Sitesettings.Suggestedtopicsmaxdaysold suggestedtopicsmaxdaysold = new Anonymous.Admin.Sitesettings.Suggestedtopicsmaxdaysold();
            public final Anonymous.Admin.Sitesettings.Trackexternalrightclicks trackexternalrightclicks = new Anonymous.Admin.Sitesettings.Trackexternalrightclicks();
            public final Anonymous.Admin.Sitesettings.Gauniversaltrackingcode gauniversaltrackingcode = new Anonymous.Admin.Sitesettings.Gauniversaltrackingcode();
            public final Anonymous.Admin.Sitesettings.Gauniversaldomainname gauniversaldomainname = new Anonymous.Admin.Sitesettings.Gauniversaldomainname();
            public final Anonymous.Admin.Sitesettings.Gatrackingcode gatrackingcode = new Anonymous.Admin.Sitesettings.Gatrackingcode();
            public final Anonymous.Admin.Sitesettings.Gadomainname gadomainname = new Anonymous.Admin.Sitesettings.Gadomainname();
            public final Anonymous.Admin.Sitesettings.Gtmcontainerid gtmcontainerid = new Anonymous.Admin.Sitesettings.Gtmcontainerid();
            public final Anonymous.Admin.Sitesettings.Topmenu topmenu = new Anonymous.Admin.Sitesettings.Topmenu();
            public final Anonymous.Admin.Sitesettings.Postmenu postmenu = new Anonymous.Admin.Sitesettings.Postmenu();
            public final Anonymous.Admin.Sitesettings.Postmenuhiddenitems postmenuhiddenitems = new Anonymous.Admin.Sitesettings.Postmenuhiddenitems();
            public final Anonymous.Admin.Sitesettings.Desktopcategorypagestyle desktopcategorypagestyle = new Anonymous.Admin.Sitesettings.Desktopcategorypagestyle();
            public final Anonymous.Admin.Sitesettings.Categorycolors categorycolors = new Anonymous.Admin.Sitesettings.Categorycolors();
            public final Anonymous.Admin.Sitesettings.Categorystyle categorystyle = new Anonymous.Admin.Sitesettings.Categorystyle();
            public final Anonymous.Admin.Sitesettings.Enablemobiletheme enablemobiletheme = new Anonymous.Admin.Sitesettings.Enablemobiletheme();
            public final Anonymous.Admin.Sitesettings.Relativedateduration relativedateduration = new Anonymous.Admin.Sitesettings.Relativedateduration();
            public final Anonymous.Admin.Sitesettings.Fixedcategorypositions fixedcategorypositions = new Anonymous.Admin.Sitesettings.Fixedcategorypositions();
            public final Anonymous.Admin.Sitesettings.Fixedcategorypositionsoncreate fixedcategorypositionsoncreate = new Anonymous.Admin.Sitesettings.Fixedcategorypositionsoncreate();
            public final Anonymous.Admin.Sitesettings.Showsubcategorylist showsubcategorylist = new Anonymous.Admin.Sitesettings.Showsubcategorylist();
            public final Anonymous.Admin.Sitesettings.Enablebadges enablebadges = new Anonymous.Admin.Sitesettings.Enablebadges();
            public final Anonymous.Admin.Sitesettings.Enablewhispers enablewhispers = new Anonymous.Admin.Sitesettings.Enablewhispers();
            public final Anonymous.Admin.Sitesettings.Inviteonly inviteonly = new Anonymous.Admin.Sitesettings.Inviteonly();
            public final Anonymous.Admin.Sitesettings.Loginrequired loginrequired = new Anonymous.Admin.Sitesettings.Loginrequired();
            public final Anonymous.Admin.Sitesettings.Mustapproveusers mustapproveusers = new Anonymous.Admin.Sitesettings.Mustapproveusers();
            public final Anonymous.Admin.Sitesettings.Enablelocallogins enablelocallogins = new Anonymous.Admin.Sitesettings.Enablelocallogins();
            public final Anonymous.Admin.Sitesettings.Allownewregistrations allownewregistrations = new Anonymous.Admin.Sitesettings.Allownewregistrations();
            public final Anonymous.Admin.Sitesettings.Enablesignupcta enablesignupcta = new Anonymous.Admin.Sitesettings.Enablesignupcta();
            public final Anonymous.Admin.Sitesettings.Enablegoogleoauth2logins enablegoogleoauth2logins = new Anonymous.Admin.Sitesettings.Enablegoogleoauth2logins();
            public final Anonymous.Admin.Sitesettings.Googleoath2clientid googleoath2clientid = new Anonymous.Admin.Sitesettings.Googleoath2clientid();
            public final Anonymous.Admin.Sitesettings.Googleoath2clientsecret googleoath2clientsecret = new Anonymous.Admin.Sitesettings.Googleoath2clientsecret();
            public final Anonymous.Admin.Sitesettings.Enableyahoologins enableyahoologins = new Anonymous.Admin.Sitesettings.Enableyahoologins();
            public final Anonymous.Admin.Sitesettings.Enabletwitterlogins enabletwitterlogins = new Anonymous.Admin.Sitesettings.Enabletwitterlogins();
            public final Anonymous.Admin.Sitesettings.Twitterconsumerkey twitterconsumerkey = new Anonymous.Admin.Sitesettings.Twitterconsumerkey();
            public final Anonymous.Admin.Sitesettings.Twitterconsumersecret twitterconsumersecret = new Anonymous.Admin.Sitesettings.Twitterconsumersecret();
            public final Anonymous.Admin.Sitesettings.Enableinstagramlogins enableinstagramlogins = new Anonymous.Admin.Sitesettings.Enableinstagramlogins();
            public final Anonymous.Admin.Sitesettings.Instagramconsumerkey instagramconsumerkey = new Anonymous.Admin.Sitesettings.Instagramconsumerkey();
            public final Anonymous.Admin.Sitesettings.Instagramconsumersecret instagramconsumersecret = new Anonymous.Admin.Sitesettings.Instagramconsumersecret();
            public final Anonymous.Admin.Sitesettings.Enablefacebooklogins enablefacebooklogins = new Anonymous.Admin.Sitesettings.Enablefacebooklogins();
            public final Anonymous.Admin.Sitesettings.Facebookappid facebookappid = new Anonymous.Admin.Sitesettings.Facebookappid();
            public final Anonymous.Admin.Sitesettings.Facebookappsecret facebookappsecret = new Anonymous.Admin.Sitesettings.Facebookappsecret();
            public final Anonymous.Admin.Sitesettings.Facebookrequestextraprofiledetails facebookrequestextraprofiledetails = new Anonymous.Admin.Sitesettings.Facebookrequestextraprofiledetails();
            public final Anonymous.Admin.Sitesettings.Enablegithublogins enablegithublogins = new Anonymous.Admin.Sitesettings.Enablegithublogins();
            public final Anonymous.Admin.Sitesettings.Githubclientid githubclientid = new Anonymous.Admin.Sitesettings.Githubclientid();
            public final Anonymous.Admin.Sitesettings.Githubclientsecret githubclientsecret = new Anonymous.Admin.Sitesettings.Githubclientsecret();
            public final Anonymous.Admin.Sitesettings.Enablesso enablesso = new Anonymous.Admin.Sitesettings.Enablesso();
            public final Anonymous.Admin.Sitesettings.Ssoallowsallreturnpaths ssoallowsallreturnpaths = new Anonymous.Admin.Sitesettings.Ssoallowsallreturnpaths();
            public final Anonymous.Admin.Sitesettings.Enablessoprovider enablessoprovider = new Anonymous.Admin.Sitesettings.Enablessoprovider();
            public final Anonymous.Admin.Sitesettings.Verbosessologging verbosessologging = new Anonymous.Admin.Sitesettings.Verbosessologging();
            public final Anonymous.Admin.Sitesettings.Ssourl ssourl = new Anonymous.Admin.Sitesettings.Ssourl();
            public final Anonymous.Admin.Sitesettings.Ssosecret ssosecret = new Anonymous.Admin.Sitesettings.Ssosecret();
            public final Anonymous.Admin.Sitesettings.Ssooverridesbio ssooverridesbio = new Anonymous.Admin.Sitesettings.Ssooverridesbio();
            public final Anonymous.Admin.Sitesettings.Ssooverridesemail ssooverridesemail = new Anonymous.Admin.Sitesettings.Ssooverridesemail();
            public final Anonymous.Admin.Sitesettings.Ssooverridesusername ssooverridesusername = new Anonymous.Admin.Sitesettings.Ssooverridesusername();
            public final Anonymous.Admin.Sitesettings.Ssooverridesname ssooverridesname = new Anonymous.Admin.Sitesettings.Ssooverridesname();
            public final Anonymous.Admin.Sitesettings.Ssooverridesavatar ssooverridesavatar = new Anonymous.Admin.Sitesettings.Ssooverridesavatar();
            public final Anonymous.Admin.Sitesettings.Ssonotapprovedurl ssonotapprovedurl = new Anonymous.Admin.Sitesettings.Ssonotapprovedurl();
            public final Anonymous.Admin.Sitesettings.Emaildomainsblacklist emaildomainsblacklist = new Anonymous.Admin.Sitesettings.Emaildomainsblacklist();
            public final Anonymous.Admin.Sitesettings.Emaildomainswhitelist emaildomainswhitelist = new Anonymous.Admin.Sitesettings.Emaildomainswhitelist();
            public final Anonymous.Admin.Sitesettings.Forgotpasswordstrict forgotpasswordstrict = new Anonymous.Admin.Sitesettings.Forgotpasswordstrict();
            public final Anonymous.Admin.Sitesettings.Logoutstrict logoutstrict = new Anonymous.Admin.Sitesettings.Logoutstrict();
            public final Anonymous.Admin.Sitesettings.Pendingusersreminderdelay pendingusersreminderdelay = new Anonymous.Admin.Sitesettings.Pendingusersreminderdelay();
            public final Anonymous.Admin.Sitesettings.Maximumsessionage maximumsessionage = new Anonymous.Admin.Sitesettings.Maximumsessionage();
            public final Anonymous.Admin.Sitesettings.Minusernamelength minusernamelength = new Anonymous.Admin.Sitesettings.Minusernamelength();
            public final Anonymous.Admin.Sitesettings.Maxusernamelength maxusernamelength = new Anonymous.Admin.Sitesettings.Maxusernamelength();
            public final Anonymous.Admin.Sitesettings.Reservedusernames reservedusernames = new Anonymous.Admin.Sitesettings.Reservedusernames();
            public final Anonymous.Admin.Sitesettings.Minpasswordlength minpasswordlength = new Anonymous.Admin.Sitesettings.Minpasswordlength();
            public final Anonymous.Admin.Sitesettings.Minadminpasswordlength minadminpasswordlength = new Anonymous.Admin.Sitesettings.Minadminpasswordlength();
            public final Anonymous.Admin.Sitesettings.Blockcommonpasswords blockcommonpasswords = new Anonymous.Admin.Sitesettings.Blockcommonpasswords();
            public final Anonymous.Admin.Sitesettings.Usernamechangeperiod usernamechangeperiod = new Anonymous.Admin.Sitesettings.Usernamechangeperiod();
            public final Anonymous.Admin.Sitesettings.Emaileditable emaileditable = new Anonymous.Admin.Sitesettings.Emaileditable();
            public final Anonymous.Admin.Sitesettings.Logoutredirect logoutredirect = new Anonymous.Admin.Sitesettings.Logoutredirect();
            public final Anonymous.Admin.Sitesettings.Fullnamerequired fullnamerequired = new Anonymous.Admin.Sitesettings.Fullnamerequired();
            public final Anonymous.Admin.Sitesettings.Enablenames enablenames = new Anonymous.Admin.Sitesettings.Enablenames();
            public final Anonymous.Admin.Sitesettings.Inviteexpirydays inviteexpirydays = new Anonymous.Admin.Sitesettings.Inviteexpirydays();
            public final Anonymous.Admin.Sitesettings.Invitepassthroughhours invitepassthroughhours = new Anonymous.Admin.Sitesettings.Invitepassthroughhours();
            public final Anonymous.Admin.Sitesettings.Invitesperpage invitesperpage = new Anonymous.Admin.Sitesettings.Invitesperpage();
            public final Anonymous.Admin.Sitesettings.Deleteusermaxpostage deleteusermaxpostage = new Anonymous.Admin.Sitesettings.Deleteusermaxpostage();
            public final Anonymous.Admin.Sitesettings.Deleteallpostsmax deleteallpostsmax = new Anonymous.Admin.Sitesettings.Deleteallpostsmax();
            public final Anonymous.Admin.Sitesettings.Redirectuserstotoppage redirectuserstotoppage = new Anonymous.Admin.Sitesettings.Redirectuserstotoppage();
            public final Anonymous.Admin.Sitesettings.Showemailonprofile showemailonprofile = new Anonymous.Admin.Sitesettings.Showemailonprofile();
            public final Anonymous.Admin.Sitesettings.Prioritizeusernameinux prioritizeusernameinux = new Anonymous.Admin.Sitesettings.Prioritizeusernameinux();
            public final Anonymous.Admin.Sitesettings.Emailtokenvalidhours emailtokenvalidhours = new Anonymous.Admin.Sitesettings.Emailtokenvalidhours();
            public final Anonymous.Admin.Sitesettings.Purgeunactivatedusersgraceperioddays purgeunactivatedusersgraceperioddays = new Anonymous.Admin.Sitesettings.Purgeunactivatedusersgraceperioddays();
            public final Anonymous.Admin.Sitesettings.Publicusercustomfields publicusercustomfields = new Anonymous.Admin.Sitesettings.Publicusercustomfields();
            public final Anonymous.Admin.Sitesettings.Staffuserscustomfields staffuserscustomfields = new Anonymous.Admin.Sitesettings.Staffuserscustomfields();
            public final Anonymous.Admin.Sitesettings.Enableuserdirectory enableuserdirectory = new Anonymous.Admin.Sitesettings.Enableuserdirectory();
            public final Anonymous.Admin.Sitesettings.Allowanonymousposting allowanonymousposting = new Anonymous.Admin.Sitesettings.Allowanonymousposting();
            public final Anonymous.Admin.Sitesettings.Anonymouspostingmintrustlevel anonymouspostingmintrustlevel = new Anonymous.Admin.Sitesettings.Anonymouspostingmintrustlevel();
            public final Anonymous.Admin.Sitesettings.Anonymousaccountdurationminutes anonymousaccountdurationminutes = new Anonymous.Admin.Sitesettings.Anonymousaccountdurationminutes();
            public final Anonymous.Admin.Sitesettings.Hideuserprofilesfrompublic hideuserprofilesfrompublic = new Anonymous.Admin.Sitesettings.Hideuserprofilesfrompublic();
            public final Anonymous.Admin.Sitesettings.Minpostlength minpostlength = new Anonymous.Admin.Sitesettings.Minpostlength();
            public final Anonymous.Admin.Sitesettings.Minfirstpostlength minfirstpostlength = new Anonymous.Admin.Sitesettings.Minfirstpostlength();
            public final Anonymous.Admin.Sitesettings.Minprivatemessagepostlength minprivatemessagepostlength = new Anonymous.Admin.Sitesettings.Minprivatemessagepostlength();
            public final Anonymous.Admin.Sitesettings.Maxpostlength maxpostlength = new Anonymous.Admin.Sitesettings.Maxpostlength();
            public final Anonymous.Admin.Sitesettings.Topicfeaturedlinkenabled topicfeaturedlinkenabled = new Anonymous.Admin.Sitesettings.Topicfeaturedlinkenabled();
            public final Anonymous.Admin.Sitesettings.Bodyminentropy bodyminentropy = new Anonymous.Admin.Sitesettings.Bodyminentropy();
            public final Anonymous.Admin.Sitesettings.Mintopictitlelength mintopictitlelength = new Anonymous.Admin.Sitesettings.Mintopictitlelength();
            public final Anonymous.Admin.Sitesettings.Maxtopictitlelength maxtopictitlelength = new Anonymous.Admin.Sitesettings.Maxtopictitlelength();
            public final Anonymous.Admin.Sitesettings.Titleminentropy titleminentropy = new Anonymous.Admin.Sitesettings.Titleminentropy();
            public final Anonymous.Admin.Sitesettings.Allowuppercaseposts allowuppercaseposts = new Anonymous.Admin.Sitesettings.Allowuppercaseposts();
            public final Anonymous.Admin.Sitesettings.Titleprettify titleprettify = new Anonymous.Admin.Sitesettings.Titleprettify();
            public final Anonymous.Admin.Sitesettings.Titlefancyentities titlefancyentities = new Anonymous.Admin.Sitesettings.Titlefancyentities();
            public final Anonymous.Admin.Sitesettings.Minprivatemessagetitlelength minprivatemessagetitlelength = new Anonymous.Admin.Sitesettings.Minprivatemessagetitlelength();
            public final Anonymous.Admin.Sitesettings.Allowuncategorizedtopics allowuncategorizedtopics = new Anonymous.Admin.Sitesettings.Allowuncategorizedtopics();
            public final Anonymous.Admin.Sitesettings.Allowduplicatetopictitles allowduplicatetopictitles = new Anonymous.Admin.Sitesettings.Allowduplicatetopictitles();
            public final Anonymous.Admin.Sitesettings.Mintitlesimilarlength mintitlesimilarlength = new Anonymous.Admin.Sitesettings.Mintitlesimilarlength();
            public final Anonymous.Admin.Sitesettings.Minbodytitlelength minbodytitlelength = new Anonymous.Admin.Sitesettings.Minbodytitlelength();
            public final Anonymous.Admin.Sitesettings.Enableprivatemessages enableprivatemessages = new Anonymous.Admin.Sitesettings.Enableprivatemessages();
            public final Anonymous.Admin.Sitesettings.Editinggraceperiod editinggraceperiod = new Anonymous.Admin.Sitesettings.Editinggraceperiod();
            public final Anonymous.Admin.Sitesettings.Postedittimelimit postedittimelimit = new Anonymous.Admin.Sitesettings.Postedittimelimit();
            public final Anonymous.Admin.Sitesettings.Edithistoryvisibletopublic edithistoryvisibletopublic = new Anonymous.Admin.Sitesettings.Edithistoryvisibletopublic();
            public final Anonymous.Admin.Sitesettings.Deleteremovedpostsafter deleteremovedpostsafter = new Anonymous.Admin.Sitesettings.Deleteremovedpostsafter();
            public final Anonymous.Admin.Sitesettings.Traditionalmarkdownlinebreaks traditionalmarkdownlinebreaks = new Anonymous.Admin.Sitesettings.Traditionalmarkdownlinebreaks();
            public final Anonymous.Admin.Sitesettings.Allowhtmltables allowhtmltables = new Anonymous.Admin.Sitesettings.Allowhtmltables();
            public final Anonymous.Admin.Sitesettings.Suppressreplydirectlybelow suppressreplydirectlybelow = new Anonymous.Admin.Sitesettings.Suppressreplydirectlybelow();
            public final Anonymous.Admin.Sitesettings.Suppressreplydirectlyabove suppressreplydirectlyabove = new Anonymous.Admin.Sitesettings.Suppressreplydirectlyabove();
            public final Anonymous.Admin.Sitesettings.Suppressreplywhenquoting suppressreplywhenquoting = new Anonymous.Admin.Sitesettings.Suppressreplywhenquoting();
            public final Anonymous.Admin.Sitesettings.Maxreplyhistory maxreplyhistory = new Anonymous.Admin.Sitesettings.Maxreplyhistory();
            public final Anonymous.Admin.Sitesettings.Postundoactionwindowmins postundoactionwindowmins = new Anonymous.Admin.Sitesettings.Postundoactionwindowmins();
            public final Anonymous.Admin.Sitesettings.Maxmentionsperpost maxmentionsperpost = new Anonymous.Admin.Sitesettings.Maxmentionsperpost();
            public final Anonymous.Admin.Sitesettings.Maxusersnotifiedpergroupmention maxusersnotifiedpergroupmention = new Anonymous.Admin.Sitesettings.Maxusersnotifiedpergroupmention();
            public final Anonymous.Admin.Sitesettings.Newusermaxrepliespertopic newusermaxrepliespertopic = new Anonymous.Admin.Sitesettings.Newusermaxrepliespertopic();
            public final Anonymous.Admin.Sitesettings.Newusermaxmentionsperpost newusermaxmentionsperpost = new Anonymous.Admin.Sitesettings.Newusermaxmentionsperpost();
            public final Anonymous.Admin.Sitesettings.Titlemaxwordlength titlemaxwordlength = new Anonymous.Admin.Sitesettings.Titlemaxwordlength();
            public final Anonymous.Admin.Sitesettings.Newusermaxlinks newusermaxlinks = new Anonymous.Admin.Sitesettings.Newusermaxlinks();
            public final Anonymous.Admin.Sitesettings.Newusermaximages newusermaximages = new Anonymous.Admin.Sitesettings.Newusermaximages();
            public final Anonymous.Admin.Sitesettings.Newusermaxattachments newusermaxattachments = new Anonymous.Admin.Sitesettings.Newusermaxattachments();
            public final Anonymous.Admin.Sitesettings.Postexcerptmaxlength postexcerptmaxlength = new Anonymous.Admin.Sitesettings.Postexcerptmaxlength();
            public final Anonymous.Admin.Sitesettings.Showpinnedexcerptmobile showpinnedexcerptmobile = new Anonymous.Admin.Sitesettings.Showpinnedexcerptmobile();
            public final Anonymous.Admin.Sitesettings.Showpinnedexcerptdesktop showpinnedexcerptdesktop = new Anonymous.Admin.Sitesettings.Showpinnedexcerptdesktop();
            public final Anonymous.Admin.Sitesettings.Displaynameonposts displaynameonposts = new Anonymous.Admin.Sitesettings.Displaynameonposts();
            public final Anonymous.Admin.Sitesettings.Showtimegapdays showtimegapdays = new Anonymous.Admin.Sitesettings.Showtimegapdays();
            public final Anonymous.Admin.Sitesettings.Shortprogresstextthreshold shortprogresstextthreshold = new Anonymous.Admin.Sitesettings.Shortprogresstextthreshold();
            public final Anonymous.Admin.Sitesettings.Defaultcodelang defaultcodelang = new Anonymous.Admin.Sitesettings.Defaultcodelang();
            public final Anonymous.Admin.Sitesettings.Warnrevivingoldtopicage warnrevivingoldtopicage = new Anonymous.Admin.Sitesettings.Warnrevivingoldtopicage();
            public final Anonymous.Admin.Sitesettings.Autohighlightallcode autohighlightallcode = new Anonymous.Admin.Sitesettings.Autohighlightallcode();
            public final Anonymous.Admin.Sitesettings.Highlightedlanguages highlightedlanguages = new Anonymous.Admin.Sitesettings.Highlightedlanguages();
            public final Anonymous.Admin.Sitesettings.Deleteoldhiddenposts deleteoldhiddenposts = new Anonymous.Admin.Sitesettings.Deleteoldhiddenposts();
            public final Anonymous.Admin.Sitesettings.Censoredwords censoredwords = new Anonymous.Admin.Sitesettings.Censoredwords();
            public final Anonymous.Admin.Sitesettings.Censoredpattern censoredpattern = new Anonymous.Admin.Sitesettings.Censoredpattern();
            public final Anonymous.Admin.Sitesettings.Enableemoji enableemoji = new Anonymous.Admin.Sitesettings.Enableemoji();
            public final Anonymous.Admin.Sitesettings.Emojiset emojiset = new Anonymous.Admin.Sitesettings.Emojiset();
            public final Anonymous.Admin.Sitesettings.Enforcesquareemoji enforcesquareemoji = new Anonymous.Admin.Sitesettings.Enforcesquareemoji();
            public final Anonymous.Admin.Sitesettings.Approvepostcount approvepostcount = new Anonymous.Admin.Sitesettings.Approvepostcount();
            public final Anonymous.Admin.Sitesettings.Approveunlesstrustlevel approveunlesstrustlevel = new Anonymous.Admin.Sitesettings.Approveunlesstrustlevel();
            public final Anonymous.Admin.Sitesettings.Approvenewtopicsunlesstrustlevel approvenewtopicsunlesstrustlevel = new Anonymous.Admin.Sitesettings.Approvenewtopicsunlesstrustlevel();
            public final Anonymous.Admin.Sitesettings.Notifyaboutqueuedpostsafter notifyaboutqueuedpostsafter = new Anonymous.Admin.Sitesettings.Notifyaboutqueuedpostsafter();
            public final Anonymous.Admin.Sitesettings.Autoclosemessagespostcount autoclosemessagespostcount = new Anonymous.Admin.Sitesettings.Autoclosemessagespostcount();
            public final Anonymous.Admin.Sitesettings.Autoclosetopicspostcount autoclosetopicspostcount = new Anonymous.Admin.Sitesettings.Autoclosetopicspostcount();
            public final Anonymous.Admin.Sitesettings.Codeformattingstyle codeformattingstyle = new Anonymous.Admin.Sitesettings.Codeformattingstyle();
            public final Anonymous.Admin.Sitesettings.Embedtruncate embedtruncate = new Anonymous.Admin.Sitesettings.Embedtruncate();
            public final Anonymous.Admin.Sitesettings.Allowedhrefschemes allowedhrefschemes = new Anonymous.Admin.Sitesettings.Allowedhrefschemes();
            public final Anonymous.Admin.Sitesettings.Emailtimewindowmins emailtimewindowmins = new Anonymous.Admin.Sitesettings.Emailtimewindowmins();
            public final Anonymous.Admin.Sitesettings.Privateemailtimewindowseconds privateemailtimewindowseconds = new Anonymous.Admin.Sitesettings.Privateemailtimewindowseconds();
            public final Anonymous.Admin.Sitesettings.Emailpostscontext emailpostscontext = new Anonymous.Admin.Sitesettings.Emailpostscontext();
            public final Anonymous.Admin.Sitesettings.Digestminexcerptlength digestminexcerptlength = new Anonymous.Admin.Sitesettings.Digestminexcerptlength();
            public final Anonymous.Admin.Sitesettings.Digesttopics digesttopics = new Anonymous.Admin.Sitesettings.Digesttopics();
            public final Anonymous.Admin.Sitesettings.Digestposts digestposts = new Anonymous.Admin.Sitesettings.Digestposts();
            public final Anonymous.Admin.Sitesettings.Digestothertopics digestothertopics = new Anonymous.Admin.Sitesettings.Digestothertopics();
            public final Anonymous.Admin.Sitesettings.Deletedigestemailafterdays deletedigestemailafterdays = new Anonymous.Admin.Sitesettings.Deletedigestemailafterdays();
            public final Anonymous.Admin.Sitesettings.Digestsuppresscategories digestsuppresscategories = new Anonymous.Admin.Sitesettings.Digestsuppresscategories();
            public final Anonymous.Admin.Sitesettings.Disabledigestemails disabledigestemails = new Anonymous.Admin.Sitesettings.Disabledigestemails();
            public final Anonymous.Admin.Sitesettings.Emailaccentbgcolor emailaccentbgcolor = new Anonymous.Admin.Sitesettings.Emailaccentbgcolor();
            public final Anonymous.Admin.Sitesettings.Emailaccentfgcolor emailaccentfgcolor = new Anonymous.Admin.Sitesettings.Emailaccentfgcolor();
            public final Anonymous.Admin.Sitesettings.Emaillinkcolor emaillinkcolor = new Anonymous.Admin.Sitesettings.Emaillinkcolor();
            public final Anonymous.Admin.Sitesettings.Showtopicfeaturedlinkindigest showtopicfeaturedlinkindigest = new Anonymous.Admin.Sitesettings.Showtopicfeaturedlinkindigest();
            public final Anonymous.Admin.Sitesettings.Emailcustomheaders emailcustomheaders = new Anonymous.Admin.Sitesettings.Emailcustomheaders();
            public final Anonymous.Admin.Sitesettings.Emailsubject emailsubject = new Anonymous.Admin.Sitesettings.Emailsubject();
            public final Anonymous.Admin.Sitesettings.Replybyemailenabled replybyemailenabled = new Anonymous.Admin.Sitesettings.Replybyemailenabled();
            public final Anonymous.Admin.Sitesettings.Replybyemailaddress replybyemailaddress = new Anonymous.Admin.Sitesettings.Replybyemailaddress();
            public final Anonymous.Admin.Sitesettings.Alternativereplybyemailaddresses alternativereplybyemailaddresses = new Anonymous.Admin.Sitesettings.Alternativereplybyemailaddresses();
            public final Anonymous.Admin.Sitesettings.Manualpollingenabled manualpollingenabled = new Anonymous.Admin.Sitesettings.Manualpollingenabled();
            public final Anonymous.Admin.Sitesettings.Pop3pollingenabled pop3pollingenabled = new Anonymous.Admin.Sitesettings.Pop3pollingenabled();
            public final Anonymous.Admin.Sitesettings.Pop3pollingssl pop3pollingssl = new Anonymous.Admin.Sitesettings.Pop3pollingssl();
            public final Anonymous.Admin.Sitesettings.Pop3pollingopensslverify pop3pollingopensslverify = new Anonymous.Admin.Sitesettings.Pop3pollingopensslverify();
            public final Anonymous.Admin.Sitesettings.Pop3pollingperiodmins pop3pollingperiodmins = new Anonymous.Admin.Sitesettings.Pop3pollingperiodmins();
            public final Anonymous.Admin.Sitesettings.Pop3pollinghost pop3pollinghost = new Anonymous.Admin.Sitesettings.Pop3pollinghost();
            public final Anonymous.Admin.Sitesettings.Pop3pollingport pop3pollingport = new Anonymous.Admin.Sitesettings.Pop3pollingport();
            public final Anonymous.Admin.Sitesettings.Pop3pollingusername pop3pollingusername = new Anonymous.Admin.Sitesettings.Pop3pollingusername();
            public final Anonymous.Admin.Sitesettings.Pop3pollingpassword pop3pollingpassword = new Anonymous.Admin.Sitesettings.Pop3pollingpassword();
            public final Anonymous.Admin.Sitesettings.Logmailprocessingfailures logmailprocessingfailures = new Anonymous.Admin.Sitesettings.Logmailprocessingfailures();
            public final Anonymous.Admin.Sitesettings.Incomingemailpreferhtml incomingemailpreferhtml = new Anonymous.Admin.Sitesettings.Incomingemailpreferhtml();
            public final Anonymous.Admin.Sitesettings.Emailin emailin = new Anonymous.Admin.Sitesettings.Emailin();
            public final Anonymous.Admin.Sitesettings.Emailinmintrust emailinmintrust = new Anonymous.Admin.Sitesettings.Emailinmintrust();
            public final Anonymous.Admin.Sitesettings.Emailprefix emailprefix = new Anonymous.Admin.Sitesettings.Emailprefix();
            public final Anonymous.Admin.Sitesettings.Emailsitetitle emailsitetitle = new Anonymous.Admin.Sitesettings.Emailsitetitle();
            public final Anonymous.Admin.Sitesettings.Disableemails disableemails = new Anonymous.Admin.Sitesettings.Disableemails();
            public final Anonymous.Admin.Sitesettings.Stripimagesfromshortemails stripimagesfromshortemails = new Anonymous.Admin.Sitesettings.Stripimagesfromshortemails();
            public final Anonymous.Admin.Sitesettings.Shortemaillength shortemaillength = new Anonymous.Admin.Sitesettings.Shortemaillength();
            public final Anonymous.Admin.Sitesettings.Displaynameonemailfrom displaynameonemailfrom = new Anonymous.Admin.Sitesettings.Displaynameonemailfrom();
            public final Anonymous.Admin.Sitesettings.Unsubscribeviaemail unsubscribeviaemail = new Anonymous.Admin.Sitesettings.Unsubscribeviaemail();
            public final Anonymous.Admin.Sitesettings.Unsubscribeviaemailfooter unsubscribeviaemailfooter = new Anonymous.Admin.Sitesettings.Unsubscribeviaemailfooter();
            public final Anonymous.Admin.Sitesettings.Deleteemaillogsafterdays deleteemaillogsafterdays = new Anonymous.Admin.Sitesettings.Deleteemaillogsafterdays();
            public final Anonymous.Admin.Sitesettings.Maxemailsperdayperuser maxemailsperdayperuser = new Anonymous.Admin.Sitesettings.Maxemailsperdayperuser();
            public final Anonymous.Admin.Sitesettings.Enablestagedusers enablestagedusers = new Anonymous.Admin.Sitesettings.Enablestagedusers();
            public final Anonymous.Admin.Sitesettings.Maximumstagedusersperemail maximumstagedusersperemail = new Anonymous.Admin.Sitesettings.Maximumstagedusersperemail();
            public final Anonymous.Admin.Sitesettings.Autogeneratedwhitelist autogeneratedwhitelist = new Anonymous.Admin.Sitesettings.Autogeneratedwhitelist();
            public final Anonymous.Admin.Sitesettings.Blockautogeneratedemails blockautogeneratedemails = new Anonymous.Admin.Sitesettings.Blockautogeneratedemails();
            public final Anonymous.Admin.Sitesettings.Ignorebytitle ignorebytitle = new Anonymous.Admin.Sitesettings.Ignorebytitle();
            public final Anonymous.Admin.Sitesettings.Mailgunapikey mailgunapikey = new Anonymous.Admin.Sitesettings.Mailgunapikey();
            public final Anonymous.Admin.Sitesettings.Bouncescorethreshold bouncescorethreshold = new Anonymous.Admin.Sitesettings.Bouncescorethreshold();
            public final Anonymous.Admin.Sitesettings.Bouncescorethresholddeactivate bouncescorethresholddeactivate = new Anonymous.Admin.Sitesettings.Bouncescorethresholddeactivate();
            public final Anonymous.Admin.Sitesettings.Softbouncescore softbouncescore = new Anonymous.Admin.Sitesettings.Softbouncescore();
            public final Anonymous.Admin.Sitesettings.Hardbouncescore hardbouncescore = new Anonymous.Admin.Sitesettings.Hardbouncescore();
            public final Anonymous.Admin.Sitesettings.Resetbouncescoreafterdays resetbouncescoreafterdays = new Anonymous.Admin.Sitesettings.Resetbouncescoreafterdays();
            public final Anonymous.Admin.Sitesettings.Attachmentcontenttypeblacklist attachmentcontenttypeblacklist = new Anonymous.Admin.Sitesettings.Attachmentcontenttypeblacklist();
            public final Anonymous.Admin.Sitesettings.Attachmentfilenameblacklist attachmentfilenameblacklist = new Anonymous.Admin.Sitesettings.Attachmentfilenameblacklist();
            public final Anonymous.Admin.Sitesettings.Enableforwardedemails enableforwardedemails = new Anonymous.Admin.Sitesettings.Enableforwardedemails();
            public final Anonymous.Admin.Sitesettings.Alwaysshowtrimmedcontent alwaysshowtrimmedcontent = new Anonymous.Admin.Sitesettings.Alwaysshowtrimmedcontent();
            public final Anonymous.Admin.Sitesettings.Maximagesizekb maximagesizekb = new Anonymous.Admin.Sitesettings.Maximagesizekb();
            public final Anonymous.Admin.Sitesettings.Maxattachmentsizekb maxattachmentsizekb = new Anonymous.Admin.Sitesettings.Maxattachmentsizekb();
            public final Anonymous.Admin.Sitesettings.Maximagemegapixels maximagemegapixels = new Anonymous.Admin.Sitesettings.Maximagemegapixels();
            public final Anonymous.Admin.Sitesettings.Authorizedextensions authorizedextensions = new Anonymous.Admin.Sitesettings.Authorizedextensions();
            public final Anonymous.Admin.Sitesettings.Crawlimages crawlimages = new Anonymous.Admin.Sitesettings.Crawlimages();
            public final Anonymous.Admin.Sitesettings.Maximagewidth maximagewidth = new Anonymous.Admin.Sitesettings.Maximagewidth();
            public final Anonymous.Admin.Sitesettings.Maximageheight maximageheight = new Anonymous.Admin.Sitesettings.Maximageheight();
            public final Anonymous.Admin.Sitesettings.Downloadremoteimagestolocal downloadremoteimagestolocal = new Anonymous.Admin.Sitesettings.Downloadremoteimagestolocal();
            public final Anonymous.Admin.Sitesettings.Downloadremoteimagesthreshold downloadremoteimagesthreshold = new Anonymous.Admin.Sitesettings.Downloadremoteimagesthreshold();
            public final Anonymous.Admin.Sitesettings.Downloadremoteimagesmaxdaysold downloadremoteimagesmaxdaysold = new Anonymous.Admin.Sitesettings.Downloadremoteimagesmaxdaysold();
            public final Anonymous.Admin.Sitesettings.Disabledimagedownloaddomains disabledimagedownloaddomains = new Anonymous.Admin.Sitesettings.Disabledimagedownloaddomains();
            public final Anonymous.Admin.Sitesettings.Createthumbnails createthumbnails = new Anonymous.Admin.Sitesettings.Createthumbnails();
            public final Anonymous.Admin.Sitesettings.Cleanupuploads cleanupuploads = new Anonymous.Admin.Sitesettings.Cleanupuploads();
            public final Anonymous.Admin.Sitesettings.Cleanorphanuploadsgraceperiodhours cleanorphanuploadsgraceperiodhours = new Anonymous.Admin.Sitesettings.Cleanorphanuploadsgraceperiodhours();
            public final Anonymous.Admin.Sitesettings.Purgedeleteduploadsgraceperioddays purgedeleteduploadsgraceperioddays = new Anonymous.Admin.Sitesettings.Purgedeleteduploadsgraceperioddays();
            public final Anonymous.Admin.Sitesettings.Preventanonsfromdownloadingfiles preventanonsfromdownloadingfiles = new Anonymous.Admin.Sitesettings.Preventanonsfromdownloadingfiles();
            public final Anonymous.Admin.Sitesettings.Enables3uploads enables3uploads = new Anonymous.Admin.Sitesettings.Enables3uploads();
            public final Anonymous.Admin.Sitesettings.S3useiamprofile s3useiamprofile = new Anonymous.Admin.Sitesettings.S3useiamprofile();
            public final Anonymous.Admin.Sitesettings.S3accesskeyid s3accesskeyid = new Anonymous.Admin.Sitesettings.S3accesskeyid();
            public final Anonymous.Admin.Sitesettings.S3secretaccesskey s3secretaccesskey = new Anonymous.Admin.Sitesettings.S3secretaccesskey();
            public final Anonymous.Admin.Sitesettings.S3region s3region = new Anonymous.Admin.Sitesettings.S3region();
            public final Anonymous.Admin.Sitesettings.S3uploadbucket s3uploadbucket = new Anonymous.Admin.Sitesettings.S3uploadbucket();
            public final Anonymous.Admin.Sitesettings.S3cdnurl s3cdnurl = new Anonymous.Admin.Sitesettings.S3cdnurl();
            public final Anonymous.Admin.Sitesettings.Allowprofilebackgrounds allowprofilebackgrounds = new Anonymous.Admin.Sitesettings.Allowprofilebackgrounds();
            public final Anonymous.Admin.Sitesettings.Automaticallydownloadgravatars automaticallydownloadgravatars = new Anonymous.Admin.Sitesettings.Automaticallydownloadgravatars();
            public final Anonymous.Admin.Sitesettings.Allowuploadedavatars allowuploadedavatars = new Anonymous.Admin.Sitesettings.Allowuploadedavatars();
            public final Anonymous.Admin.Sitesettings.Allowanimatedavatars allowanimatedavatars = new Anonymous.Admin.Sitesettings.Allowanimatedavatars();
            public final Anonymous.Admin.Sitesettings.Allowanimatedthumbnails allowanimatedthumbnails = new Anonymous.Admin.Sitesettings.Allowanimatedthumbnails();
            public final Anonymous.Admin.Sitesettings.Defaultavatars defaultavatars = new Anonymous.Admin.Sitesettings.Defaultavatars();
            public final Anonymous.Admin.Sitesettings.Avatarsizes avatarsizes = new Anonymous.Admin.Sitesettings.Avatarsizes();
            public final Anonymous.Admin.Sitesettings.Externalsystemavatarsenabled externalsystemavatarsenabled = new Anonymous.Admin.Sitesettings.Externalsystemavatarsenabled();
            public final Anonymous.Admin.Sitesettings.Externalsystemavatarsurl externalsystemavatarsurl = new Anonymous.Admin.Sitesettings.Externalsystemavatarsurl();
            public final Anonymous.Admin.Sitesettings.Allowallattachmentsforgroupmessages allowallattachmentsforgroupmessages = new Anonymous.Admin.Sitesettings.Allowallattachmentsforgroupmessages();
            public final Anonymous.Admin.Sitesettings.Convertpastedimagestohqjpg convertpastedimagestohqjpg = new Anonymous.Admin.Sitesettings.Convertpastedimagestohqjpg();
            public final Anonymous.Admin.Sitesettings.Convertpastedimagesquality convertpastedimagesquality = new Anonymous.Admin.Sitesettings.Convertpastedimagesquality();
            public final Anonymous.Admin.Sitesettings.Defaulttrustlevel defaulttrustlevel = new Anonymous.Admin.Sitesettings.Defaulttrustlevel();
            public final Anonymous.Admin.Sitesettings.Defaultinviteetrustlevel defaultinviteetrustlevel = new Anonymous.Admin.Sitesettings.Defaultinviteetrustlevel();
            public final Anonymous.Admin.Sitesettings.Mintrusttocreatetopic mintrusttocreatetopic = new Anonymous.Admin.Sitesettings.Mintrusttocreatetopic();
            public final Anonymous.Admin.Sitesettings.Mintrusttoeditwikipost mintrusttoeditwikipost = new Anonymous.Admin.Sitesettings.Mintrusttoeditwikipost();
            public final Anonymous.Admin.Sitesettings.Mintrusttoeditpost mintrusttoeditpost = new Anonymous.Admin.Sitesettings.Mintrusttoeditpost();
            public final Anonymous.Admin.Sitesettings.Mintrusttoallowselfwiki mintrusttoallowselfwiki = new Anonymous.Admin.Sitesettings.Mintrusttoallowselfwiki();
            public final Anonymous.Admin.Sitesettings.Mintrusttosendmessages mintrusttosendmessages = new Anonymous.Admin.Sitesettings.Mintrusttosendmessages();
            public final Anonymous.Admin.Sitesettings.Tl1requirestopicsentered tl1requirestopicsentered = new Anonymous.Admin.Sitesettings.Tl1requirestopicsentered();
            public final Anonymous.Admin.Sitesettings.Tl1requiresreadposts tl1requiresreadposts = new Anonymous.Admin.Sitesettings.Tl1requiresreadposts();
            public final Anonymous.Admin.Sitesettings.Tl1requirestimespentmins tl1requirestimespentmins = new Anonymous.Admin.Sitesettings.Tl1requirestimespentmins();
            public final Anonymous.Admin.Sitesettings.Tl2requirestopicsentered tl2requirestopicsentered = new Anonymous.Admin.Sitesettings.Tl2requirestopicsentered();
            public final Anonymous.Admin.Sitesettings.Tl2requiresreadposts tl2requiresreadposts = new Anonymous.Admin.Sitesettings.Tl2requiresreadposts();
            public final Anonymous.Admin.Sitesettings.Tl2requirestimespentmins tl2requirestimespentmins = new Anonymous.Admin.Sitesettings.Tl2requirestimespentmins();
            public final Anonymous.Admin.Sitesettings.Tl2requiresdaysvisited tl2requiresdaysvisited = new Anonymous.Admin.Sitesettings.Tl2requiresdaysvisited();
            public final Anonymous.Admin.Sitesettings.Tl2requireslikesreceived tl2requireslikesreceived = new Anonymous.Admin.Sitesettings.Tl2requireslikesreceived();
            public final Anonymous.Admin.Sitesettings.Tl2requireslikesgiven tl2requireslikesgiven = new Anonymous.Admin.Sitesettings.Tl2requireslikesgiven();
            public final Anonymous.Admin.Sitesettings.Tl2requirestopicreplycount tl2requirestopicreplycount = new Anonymous.Admin.Sitesettings.Tl2requirestopicreplycount();
            public final Anonymous.Admin.Sitesettings.Tl3timeperiod tl3timeperiod = new Anonymous.Admin.Sitesettings.Tl3timeperiod();
            public final Anonymous.Admin.Sitesettings.Tl3requiresdaysvisited tl3requiresdaysvisited = new Anonymous.Admin.Sitesettings.Tl3requiresdaysvisited();
            public final Anonymous.Admin.Sitesettings.Tl3requirestopicsrepliedto tl3requirestopicsrepliedto = new Anonymous.Admin.Sitesettings.Tl3requirestopicsrepliedto();
            public final Anonymous.Admin.Sitesettings.Tl3requirestopicsviewed tl3requirestopicsviewed = new Anonymous.Admin.Sitesettings.Tl3requirestopicsviewed();
            public final Anonymous.Admin.Sitesettings.Tl3requirestopicsviewedcap tl3requirestopicsviewedcap = new Anonymous.Admin.Sitesettings.Tl3requirestopicsviewedcap();
            public final Anonymous.Admin.Sitesettings.Tl3requirespostsread tl3requirespostsread = new Anonymous.Admin.Sitesettings.Tl3requirespostsread();
            public final Anonymous.Admin.Sitesettings.Tl3requirespostsreadcap tl3requirespostsreadcap = new Anonymous.Admin.Sitesettings.Tl3requirespostsreadcap();
            public final Anonymous.Admin.Sitesettings.Tl3requirestopicsviewedalltime tl3requirestopicsviewedalltime = new Anonymous.Admin.Sitesettings.Tl3requirestopicsviewedalltime();
            public final Anonymous.Admin.Sitesettings.Tl3requirespostsreadalltime tl3requirespostsreadalltime = new Anonymous.Admin.Sitesettings.Tl3requirespostsreadalltime();
            public final Anonymous.Admin.Sitesettings.Tl3requiresmaxflagged tl3requiresmaxflagged = new Anonymous.Admin.Sitesettings.Tl3requiresmaxflagged();
            public final Anonymous.Admin.Sitesettings.Tl3promotionminduration tl3promotionminduration = new Anonymous.Admin.Sitesettings.Tl3promotionminduration();
            public final Anonymous.Admin.Sitesettings.Tl3requireslikesgiven tl3requireslikesgiven = new Anonymous.Admin.Sitesettings.Tl3requireslikesgiven();
            public final Anonymous.Admin.Sitesettings.Tl3requireslikesreceived tl3requireslikesreceived = new Anonymous.Admin.Sitesettings.Tl3requireslikesreceived();
            public final Anonymous.Admin.Sitesettings.Tl3linksnofollow tl3linksnofollow = new Anonymous.Admin.Sitesettings.Tl3linksnofollow();
            public final Anonymous.Admin.Sitesettings.Forcehttps forcehttps = new Anonymous.Admin.Sitesettings.Forcehttps();
            public final Anonymous.Admin.Sitesettings.Enableescapedfragments enableescapedfragments = new Anonymous.Admin.Sitesettings.Enableescapedfragments();
            public final Anonymous.Admin.Sitesettings.Allowindexinrobotstxt allowindexinrobotstxt = new Anonymous.Admin.Sitesettings.Allowindexinrobotstxt();
            public final Anonymous.Admin.Sitesettings.Enablenoscriptsupport enablenoscriptsupport = new Anonymous.Admin.Sitesettings.Enablenoscriptsupport();
            public final Anonymous.Admin.Sitesettings.Allowmoderatorstocreatecategories allowmoderatorstocreatecategories = new Anonymous.Admin.Sitesettings.Allowmoderatorstocreatecategories();
            public final Anonymous.Admin.Sitesettings.Corsorigins corsorigins = new Anonymous.Admin.Sitesettings.Corsorigins();
            public final Anonymous.Admin.Sitesettings.Useadminipwhitelist useadminipwhitelist = new Anonymous.Admin.Sitesettings.Useadminipwhitelist();
            public final Anonymous.Admin.Sitesettings.Enableflashvideoonebox enableflashvideoonebox = new Anonymous.Admin.Sitesettings.Enableflashvideoonebox();
            public final Anonymous.Admin.Sitesettings.Postoneboxmaxlength postoneboxmaxlength = new Anonymous.Admin.Sitesettings.Postoneboxmaxlength();
            public final Anonymous.Admin.Sitesettings.Oneboxdomainsblacklist oneboxdomainsblacklist = new Anonymous.Admin.Sitesettings.Oneboxdomainsblacklist();
            public final Anonymous.Admin.Sitesettings.Maxoneboxesperpost maxoneboxesperpost = new Anonymous.Admin.Sitesettings.Maxoneboxesperpost();
            public final Anonymous.Admin.Sitesettings.Addrelnofollowtousercontent addrelnofollowtousercontent = new Anonymous.Admin.Sitesettings.Addrelnofollowtousercontent();
            public final Anonymous.Admin.Sitesettings.Flagsrequiredtohidepost flagsrequiredtohidepost = new Anonymous.Admin.Sitesettings.Flagsrequiredtohidepost();
            public final Anonymous.Admin.Sitesettings.Cooldownminutesafterhidingposts cooldownminutesafterhidingposts = new Anonymous.Admin.Sitesettings.Cooldownminutesafterhidingposts();
            public final Anonymous.Admin.Sitesettings.Numspamflagstoblocknewuser numspamflagstoblocknewuser = new Anonymous.Admin.Sitesettings.Numspamflagstoblocknewuser();
            public final Anonymous.Admin.Sitesettings.Numuserstoblocknewuser numuserstoblocknewuser = new Anonymous.Admin.Sitesettings.Numuserstoblocknewuser();
            public final Anonymous.Admin.Sitesettings.Numtl3flagstoblocknewuser numtl3flagstoblocknewuser = new Anonymous.Admin.Sitesettings.Numtl3flagstoblocknewuser();
            public final Anonymous.Admin.Sitesettings.Numtl3userstoblocknewuser numtl3userstoblocknewuser = new Anonymous.Admin.Sitesettings.Numtl3userstoblocknewuser();
            public final Anonymous.Admin.Sitesettings.Notifymodswhenuserblocked notifymodswhenuserblocked = new Anonymous.Admin.Sitesettings.Notifymodswhenuserblocked();
            public final Anonymous.Admin.Sitesettings.Flagsockpuppets flagsockpuppets = new Anonymous.Admin.Sitesettings.Flagsockpuppets();
            public final Anonymous.Admin.Sitesettings.Newuserspamhostthreshold newuserspamhostthreshold = new Anonymous.Admin.Sitesettings.Newuserspamhostthreshold();
            public final Anonymous.Admin.Sitesettings.Whitelistedspamhostdomains whitelistedspamhostdomains = new Anonymous.Admin.Sitesettings.Whitelistedspamhostdomains();
            public final Anonymous.Admin.Sitesettings.Levenshteindistancespammeremails levenshteindistancespammeremails = new Anonymous.Admin.Sitesettings.Levenshteindistancespammeremails();
            public final Anonymous.Admin.Sitesettings.Maxnewaccountsperregistrationip maxnewaccountsperregistrationip = new Anonymous.Admin.Sitesettings.Maxnewaccountsperregistrationip();
            public final Anonymous.Admin.Sitesettings.Minbanentriesforrollup minbanentriesforrollup = new Anonymous.Admin.Sitesettings.Minbanentriesforrollup();
            public final Anonymous.Admin.Sitesettings.Maxageunmatchedemails maxageunmatchedemails = new Anonymous.Admin.Sitesettings.Maxageunmatchedemails();
            public final Anonymous.Admin.Sitesettings.Maxageunmatchedips maxageunmatchedips = new Anonymous.Admin.Sitesettings.Maxageunmatchedips();
            public final Anonymous.Admin.Sitesettings.Numflaggerstoclosetopic numflaggerstoclosetopic = new Anonymous.Admin.Sitesettings.Numflaggerstoclosetopic();
            public final Anonymous.Admin.Sitesettings.Numflagstoclosetopic numflagstoclosetopic = new Anonymous.Admin.Sitesettings.Numflagstoclosetopic();
            public final Anonymous.Admin.Sitesettings.Autorespondtoflagactions autorespondtoflagactions = new Anonymous.Admin.Sitesettings.Autorespondtoflagactions();
            public final Anonymous.Admin.Sitesettings.Minfirstposttypingtime minfirstposttypingtime = new Anonymous.Admin.Sitesettings.Minfirstposttypingtime();
            public final Anonymous.Admin.Sitesettings.Autoblockfasttypersonfirstpost autoblockfasttypersonfirstpost = new Anonymous.Admin.Sitesettings.Autoblockfasttypersonfirstpost();
            public final Anonymous.Admin.Sitesettings.Autoblockfasttypersmaxtrustlevel autoblockfasttypersmaxtrustlevel = new Anonymous.Admin.Sitesettings.Autoblockfasttypersmaxtrustlevel();
            public final Anonymous.Admin.Sitesettings.Autoblockfirstpostregex autoblockfirstpostregex = new Anonymous.Admin.Sitesettings.Autoblockfirstpostregex();
            public final Anonymous.Admin.Sitesettings.Uniquepostsmin uniquepostsmin = new Anonymous.Admin.Sitesettings.Uniquepostsmin();
            public final Anonymous.Admin.Sitesettings.Ratelimitcreatetopic ratelimitcreatetopic = new Anonymous.Admin.Sitesettings.Ratelimitcreatetopic();
            public final Anonymous.Admin.Sitesettings.Ratelimitcreatepost ratelimitcreatepost = new Anonymous.Admin.Sitesettings.Ratelimitcreatepost();
            public final Anonymous.Admin.Sitesettings.Ratelimitnewusercreatetopic ratelimitnewusercreatetopic = new Anonymous.Admin.Sitesettings.Ratelimitnewusercreatetopic();
            public final Anonymous.Admin.Sitesettings.Ratelimitnewusercreatepost ratelimitnewusercreatepost = new Anonymous.Admin.Sitesettings.Ratelimitnewusercreatepost();
            public final Anonymous.Admin.Sitesettings.Maxtopicsperday maxtopicsperday = new Anonymous.Admin.Sitesettings.Maxtopicsperday();
            public final Anonymous.Admin.Sitesettings.Maxprivatemessagesperday maxprivatemessagesperday = new Anonymous.Admin.Sitesettings.Maxprivatemessagesperday();
            public final Anonymous.Admin.Sitesettings.Maxlikesperday maxlikesperday = new Anonymous.Admin.Sitesettings.Maxlikesperday();
            public final Anonymous.Admin.Sitesettings.Maxbookmarksperday maxbookmarksperday = new Anonymous.Admin.Sitesettings.Maxbookmarksperday();
            public final Anonymous.Admin.Sitesettings.Maxflagsperday maxflagsperday = new Anonymous.Admin.Sitesettings.Maxflagsperday();
            public final Anonymous.Admin.Sitesettings.Maxeditsperday maxeditsperday = new Anonymous.Admin.Sitesettings.Maxeditsperday();
            public final Anonymous.Admin.Sitesettings.Maxinvitesperday maxinvitesperday = new Anonymous.Admin.Sitesettings.Maxinvitesperday();
            public final Anonymous.Admin.Sitesettings.Maxtopicinvitationsperday maxtopicinvitationsperday = new Anonymous.Admin.Sitesettings.Maxtopicinvitationsperday();
            public final Anonymous.Admin.Sitesettings.Maxtopicsinfirstday maxtopicsinfirstday = new Anonymous.Admin.Sitesettings.Maxtopicsinfirstday();
            public final Anonymous.Admin.Sitesettings.Maxrepliesinfirstday maxrepliesinfirstday = new Anonymous.Admin.Sitesettings.Maxrepliesinfirstday();
            public final Anonymous.Admin.Sitesettings.Tl2additionallikesperdaymultiplier tl2additionallikesperdaymultiplier = new Anonymous.Admin.Sitesettings.Tl2additionallikesperdaymultiplier();
            public final Anonymous.Admin.Sitesettings.Tl3additionallikesperdaymultiplier tl3additionallikesperdaymultiplier = new Anonymous.Admin.Sitesettings.Tl3additionallikesperdaymultiplier();
            public final Anonymous.Admin.Sitesettings.Tl4additionallikesperdaymultiplier tl4additionallikesperdaymultiplier = new Anonymous.Admin.Sitesettings.Tl4additionallikesperdaymultiplier();
            public final Anonymous.Admin.Sitesettings.Alertadminsiferrorsperminute alertadminsiferrorsperminute = new Anonymous.Admin.Sitesettings.Alertadminsiferrorsperminute();
            public final Anonymous.Admin.Sitesettings.Alertadminsiferrorsperhour alertadminsiferrorsperhour = new Anonymous.Admin.Sitesettings.Alertadminsiferrorsperhour();
            public final Anonymous.Admin.Sitesettings.Maxprintsperhourperuser maxprintsperhourperuser = new Anonymous.Admin.Sitesettings.Maxprintsperhourperuser();
            public final Anonymous.Admin.Sitesettings.Forcehostname forcehostname = new Anonymous.Admin.Sitesettings.Forcehostname();
            public final Anonymous.Admin.Sitesettings.Port port = new Anonymous.Admin.Sitesettings.Port();
            public final Anonymous.Admin.Sitesettings.Queuejobs queuejobs = new Anonymous.Admin.Sitesettings.Queuejobs();
            public final Anonymous.Admin.Sitesettings.Enablelongpolling enablelongpolling = new Anonymous.Admin.Sitesettings.Enablelongpolling();
            public final Anonymous.Admin.Sitesettings.Longpollinginterval longpollinginterval = new Anonymous.Admin.Sitesettings.Longpollinginterval();
            public final Anonymous.Admin.Sitesettings.Longpollingbaseurl longpollingbaseurl = new Anonymous.Admin.Sitesettings.Longpollingbaseurl();
            public final Anonymous.Admin.Sitesettings.Backgroundpollinginterval backgroundpollinginterval = new Anonymous.Admin.Sitesettings.Backgroundpollinginterval();
            public final Anonymous.Admin.Sitesettings.Pollinginterval pollinginterval = new Anonymous.Admin.Sitesettings.Pollinginterval();
            public final Anonymous.Admin.Sitesettings.Anonpollinginterval anonpollinginterval = new Anonymous.Admin.Sitesettings.Anonpollinginterval();
            public final Anonymous.Admin.Sitesettings.Flushtimingssecs flushtimingssecs = new Anonymous.Admin.Sitesettings.Flushtimingssecs();
            public final Anonymous.Admin.Sitesettings.Activeuserratelimitsecs activeuserratelimitsecs = new Anonymous.Admin.Sitesettings.Activeuserratelimitsecs();
            public final Anonymous.Admin.Sitesettings.Verboselocalization verboselocalization = new Anonymous.Admin.Sitesettings.Verboselocalization();
            public final Anonymous.Admin.Sitesettings.Toptopicsformulalogviewsmultiplier toptopicsformulalogviewsmultiplier = new Anonymous.Admin.Sitesettings.Toptopicsformulalogviewsmultiplier();
            public final Anonymous.Admin.Sitesettings.Toptopicsformulafirstpostlikesmultiplier toptopicsformulafirstpostlikesmultiplier = new Anonymous.Admin.Sitesettings.Toptopicsformulafirstpostlikesmultiplier();
            public final Anonymous.Admin.Sitesettings.Rebakeoldpostscount rebakeoldpostscount = new Anonymous.Admin.Sitesettings.Rebakeoldpostscount();
            public final Anonymous.Admin.Sitesettings.Tosurl tosurl = new Anonymous.Admin.Sitesettings.Tosurl();
            public final Anonymous.Admin.Sitesettings.Privacypolicyurl privacypolicyurl = new Anonymous.Admin.Sitesettings.Privacypolicyurl();
            public final Anonymous.Admin.Sitesettings.Fagurl fagurl = new Anonymous.Admin.Sitesettings.Fagurl();
            public final Anonymous.Admin.Sitesettings.Readonlymodeduringbackup readonlymodeduringbackup = new Anonymous.Admin.Sitesettings.Readonlymodeduringbackup();
            public final Anonymous.Admin.Sitesettings.Allowrestore allowrestore = new Anonymous.Admin.Sitesettings.Allowrestore();
            public final Anonymous.Admin.Sitesettings.Maximumbackups maximumbackups = new Anonymous.Admin.Sitesettings.Maximumbackups();
            public final Anonymous.Admin.Sitesettings.Automaticbackupsenabled automaticbackupsenabled = new Anonymous.Admin.Sitesettings.Automaticbackupsenabled();
            public final Anonymous.Admin.Sitesettings.Backupfrequency backupfrequency = new Anonymous.Admin.Sitesettings.Backupfrequency();
            public final Anonymous.Admin.Sitesettings.Enables3backups enables3backups = new Anonymous.Admin.Sitesettings.Enables3backups();
            public final Anonymous.Admin.Sitesettings.S3backupbucket s3backupbucket = new Anonymous.Admin.Sitesettings.S3backupbucket();
            public final Anonymous.Admin.Sitesettings.S3disablecleanup s3disablecleanup = new Anonymous.Admin.Sitesettings.S3disablecleanup();
            public final Anonymous.Admin.Sitesettings.Backuptimeofday backuptimeofday = new Anonymous.Admin.Sitesettings.Backuptimeofday();
            public final Anonymous.Admin.Sitesettings.Backupwithuploads backupwithuploads = new Anonymous.Admin.Sitesettings.Backupwithuploads();
            public final Anonymous.Admin.Sitesettings.Minsearchtermlength minsearchtermlength = new Anonymous.Admin.Sitesettings.Minsearchtermlength();
            public final Anonymous.Admin.Sitesettings.Searchtokenizechinesejapanesekorean searchtokenizechinesejapanesekorean = new Anonymous.Admin.Sitesettings.Searchtokenizechinesejapanesekorean();
            public final Anonymous.Admin.Sitesettings.Searchpreferrecentposts searchpreferrecentposts = new Anonymous.Admin.Sitesettings.Searchpreferrecentposts();
            public final Anonymous.Admin.Sitesettings.Searchrecentpostssize searchrecentpostssize = new Anonymous.Admin.Sitesettings.Searchrecentpostssize();
            public final Anonymous.Admin.Sitesettings.Versionchecks versionchecks = new Anonymous.Admin.Sitesettings.Versionchecks();
            public final Anonymous.Admin.Sitesettings.Newversionemails newversionemails = new Anonymous.Admin.Sitesettings.Newversionemails();
            public final Anonymous.Admin.Sitesettings.Sendwelcomemessage sendwelcomemessage = new Anonymous.Admin.Sitesettings.Sendwelcomemessage();
            public final Anonymous.Admin.Sitesettings.Suppressuncategorizedbadge suppressuncategorizedbadge = new Anonymous.Admin.Sitesettings.Suppressuncategorizedbadge();
            public final Anonymous.Admin.Sitesettings.Sluggenerationmethod sluggenerationmethod = new Anonymous.Admin.Sitesettings.Sluggenerationmethod();
            public final Anonymous.Admin.Sitesettings.Permalinknormalizations permalinknormalizations = new Anonymous.Admin.Sitesettings.Permalinknormalizations();
            public final Anonymous.Admin.Sitesettings.Maxsimilarresults maxsimilarresults = new Anonymous.Admin.Sitesettings.Maxsimilarresults();
            public final Anonymous.Admin.Sitesettings.Minimumtopicssimilar minimumtopicssimilar = new Anonymous.Admin.Sitesettings.Minimumtopicssimilar();
            public final Anonymous.Admin.Sitesettings.Previousvisittimeouthours previousvisittimeouthours = new Anonymous.Admin.Sitesettings.Previousvisittimeouthours();
            public final Anonymous.Admin.Sitesettings.Stafflikeweight stafflikeweight = new Anonymous.Admin.Sitesettings.Stafflikeweight();
            public final Anonymous.Admin.Sitesettings.Topicviewdurationhours topicviewdurationhours = new Anonymous.Admin.Sitesettings.Topicviewdurationhours();
            public final Anonymous.Admin.Sitesettings.Userprofileviewdurationhours userprofileviewdurationhours = new Anonymous.Admin.Sitesettings.Userprofileviewdurationhours();
            public final Anonymous.Admin.Sitesettings.Summaryscorethreshold summaryscorethreshold = new Anonymous.Admin.Sitesettings.Summaryscorethreshold();
            public final Anonymous.Admin.Sitesettings.Summarypostsrequired summarypostsrequired = new Anonymous.Admin.Sitesettings.Summarypostsrequired();
            public final Anonymous.Admin.Sitesettings.Summarylikesrequired summarylikesrequired = new Anonymous.Admin.Sitesettings.Summarylikesrequired();
            public final Anonymous.Admin.Sitesettings.Summarypercentfilter summarypercentfilter = new Anonymous.Admin.Sitesettings.Summarypercentfilter();
            public final Anonymous.Admin.Sitesettings.Summarymaxresults summarymaxresults = new Anonymous.Admin.Sitesettings.Summarymaxresults();
            public final Anonymous.Admin.Sitesettings.Topicviewsheatlow topicviewsheatlow = new Anonymous.Admin.Sitesettings.Topicviewsheatlow();
            public final Anonymous.Admin.Sitesettings.Topicviewsheatmedium topicviewsheatmedium = new Anonymous.Admin.Sitesettings.Topicviewsheatmedium();
            public final Anonymous.Admin.Sitesettings.Topicviewsheathigh topicviewsheathigh = new Anonymous.Admin.Sitesettings.Topicviewsheathigh();
            public final Anonymous.Admin.Sitesettings.Topicpostlikeheatlow topicpostlikeheatlow = new Anonymous.Admin.Sitesettings.Topicpostlikeheatlow();
            public final Anonymous.Admin.Sitesettings.Topicpostlikeheatmedium topicpostlikeheatmedium = new Anonymous.Admin.Sitesettings.Topicpostlikeheatmedium();
            public final Anonymous.Admin.Sitesettings.Topicpostlikeheathigh topicpostlikeheathigh = new Anonymous.Admin.Sitesettings.Topicpostlikeheathigh();
            public final Anonymous.Admin.Sitesettings.Historyhourslow historyhourslow = new Anonymous.Admin.Sitesettings.Historyhourslow();
            public final Anonymous.Admin.Sitesettings.Historyhoursmedium historyhoursmedium = new Anonymous.Admin.Sitesettings.Historyhoursmedium();
            public final Anonymous.Admin.Sitesettings.Historyhourshigh historyhourshigh = new Anonymous.Admin.Sitesettings.Historyhourshigh();
            public final Anonymous.Admin.Sitesettings.Coldagedayslow coldagedayslow = new Anonymous.Admin.Sitesettings.Coldagedayslow();
            public final Anonymous.Admin.Sitesettings.Coldagedaysmedium coldagedaysmedium = new Anonymous.Admin.Sitesettings.Coldagedaysmedium();
            public final Anonymous.Admin.Sitesettings.Coldagedayshigh coldagedayshigh = new Anonymous.Admin.Sitesettings.Coldagedayshigh();
            public final Anonymous.Admin.Sitesettings.Educateuntilposts educateuntilposts = new Anonymous.Admin.Sitesettings.Educateuntilposts();
            public final Anonymous.Admin.Sitesettings.Sequentialrepliesthreshold sequentialrepliesthreshold = new Anonymous.Admin.Sitesettings.Sequentialrepliesthreshold();
            public final Anonymous.Admin.Sitesettings.Dominatingtopicminimumpercent dominatingtopicminimumpercent = new Anonymous.Admin.Sitesettings.Dominatingtopicminimumpercent();
            public final Anonymous.Admin.Sitesettings.Disableavatareducationmessage disableavatareducationmessage = new Anonymous.Admin.Sitesettings.Disableavatareducationmessage();
            public final Anonymous.Admin.Sitesettings.Globalnotice globalnotice = new Anonymous.Admin.Sitesettings.Globalnotice();
            public final Anonymous.Admin.Sitesettings.Notifyaboutflagsafter notifyaboutflagsafter = new Anonymous.Admin.Sitesettings.Notifyaboutflagsafter();
            public final Anonymous.Admin.Sitesettings.Showcreatetopicsnotice showcreatetopicsnotice = new Anonymous.Admin.Sitesettings.Showcreatetopicsnotice();
            public final Anonymous.Admin.Sitesettings.Disableeditnotifications disableeditnotifications = new Anonymous.Admin.Sitesettings.Disableeditnotifications();
            public final Anonymous.Admin.Sitesettings.Vacuumdbdays vacuumdbdays = new Anonymous.Admin.Sitesettings.Vacuumdbdays();
            public final Anonymous.Admin.Sitesettings.Deletedraftsolderthanndays deletedraftsolderthanndays = new Anonymous.Admin.Sitesettings.Deletedraftsolderthanndays();
            public final Anonymous.Admin.Sitesettings.Bootstrapmodeminusers bootstrapmodeminusers = new Anonymous.Admin.Sitesettings.Bootstrapmodeminusers();
            public final Anonymous.Admin.Sitesettings.Automaticallyunpintopics automaticallyunpintopics = new Anonymous.Admin.Sitesettings.Automaticallyunpintopics();
            public final Anonymous.Admin.Sitesettings.Readtimewordcount readtimewordcount = new Anonymous.Admin.Sitesettings.Readtimewordcount();
            public final Anonymous.Admin.Sitesettings.Topicpagetitleincludescategory topicpagetitleincludescategory = new Anonymous.Admin.Sitesettings.Topicpagetitleincludescategory();
            public final Anonymous.Admin.Sitesettings.Nativeappinstallbanner nativeappinstallbanner = new Anonymous.Admin.Sitesettings.Nativeappinstallbanner();
            public final Anonymous.Admin.Sitesettings.Defaultemaildigestfrequency defaultemaildigestfrequency = new Anonymous.Admin.Sitesettings.Defaultemaildigestfrequency();
            public final Anonymous.Admin.Sitesettings.Defaultincludetl0indigests defaultincludetl0indigests = new Anonymous.Admin.Sitesettings.Defaultincludetl0indigests();
            public final Anonymous.Admin.Sitesettings.Defaultemailprivatemessages defaultemailprivatemessages = new Anonymous.Admin.Sitesettings.Defaultemailprivatemessages();
            public final Anonymous.Admin.Sitesettings.Defaultemaildirect defaultemaildirect = new Anonymous.Admin.Sitesettings.Defaultemaildirect();
            public final Anonymous.Admin.Sitesettings.Defaultemailmailinglistmode defaultemailmailinglistmode = new Anonymous.Admin.Sitesettings.Defaultemailmailinglistmode();
            public final Anonymous.Admin.Sitesettings.Defaultemailmailinglistmodefrequency defaultemailmailinglistmodefrequency = new Anonymous.Admin.Sitesettings.Defaultemailmailinglistmodefrequency();
            public final Anonymous.Admin.Sitesettings.Disablemailinglistmode disablemailinglistmode = new Anonymous.Admin.Sitesettings.Disablemailinglistmode();
            public final Anonymous.Admin.Sitesettings.Defaultemailalways defaultemailalways = new Anonymous.Admin.Sitesettings.Defaultemailalways();
            public final Anonymous.Admin.Sitesettings.Defaultemailpreviousreplies defaultemailpreviousreplies = new Anonymous.Admin.Sitesettings.Defaultemailpreviousreplies();
            public final Anonymous.Admin.Sitesettings.Defaultemailinreplyto defaultemailinreplyto = new Anonymous.Admin.Sitesettings.Defaultemailinreplyto();
            public final Anonymous.Admin.Sitesettings.Defaultothernewtopicdurationminutes defaultothernewtopicdurationminutes = new Anonymous.Admin.Sitesettings.Defaultothernewtopicdurationminutes();
            public final Anonymous.Admin.Sitesettings.Defaultotherautotracktopicaftermsecs defaultotherautotracktopicaftermsecs = new Anonymous.Admin.Sitesettings.Defaultotherautotracktopicaftermsecs();
            public final Anonymous.Admin.Sitesettings.Defaultothernotificationlevelwhenreplying defaultothernotificationlevelwhenreplying = new Anonymous.Admin.Sitesettings.Defaultothernotificationlevelwhenreplying();
            public final Anonymous.Admin.Sitesettings.Defaultotherexternallinksinnewtab defaultotherexternallinksinnewtab = new Anonymous.Admin.Sitesettings.Defaultotherexternallinksinnewtab();
            public final Anonymous.Admin.Sitesettings.Defaultotherenablequoting defaultotherenablequoting = new Anonymous.Admin.Sitesettings.Defaultotherenablequoting();
            public final Anonymous.Admin.Sitesettings.Defaultotherdynamicfavicon defaultotherdynamicfavicon = new Anonymous.Admin.Sitesettings.Defaultotherdynamicfavicon();
            public final Anonymous.Admin.Sitesettings.Defaultotherdisablejumpreply defaultotherdisablejumpreply = new Anonymous.Admin.Sitesettings.Defaultotherdisablejumpreply();
            public final Anonymous.Admin.Sitesettings.Defaultotherlikenotificationfrequency defaultotherlikenotificationfrequency = new Anonymous.Admin.Sitesettings.Defaultotherlikenotificationfrequency();
            public final Anonymous.Admin.Sitesettings.Defaulttopicsautomaticunpin defaulttopicsautomaticunpin = new Anonymous.Admin.Sitesettings.Defaulttopicsautomaticunpin();
            public final Anonymous.Admin.Sitesettings.Defaultcategoriestracking defaultcategoriestracking = new Anonymous.Admin.Sitesettings.Defaultcategoriestracking();
            public final Anonymous.Admin.Sitesettings.Defaultcategoriesmuted defaultcategoriesmuted = new Anonymous.Admin.Sitesettings.Defaultcategoriesmuted();
            public final Anonymous.Admin.Sitesettings.Defaultcategorieswatchingfirstpost defaultcategorieswatchingfirstpost = new Anonymous.Admin.Sitesettings.Defaultcategorieswatchingfirstpost();
            public final Anonymous.Admin.Sitesettings.Maxuserapireqsperday maxuserapireqsperday = new Anonymous.Admin.Sitesettings.Maxuserapireqsperday();
            public final Anonymous.Admin.Sitesettings.Maxuserapireqsperminute maxuserapireqsperminute = new Anonymous.Admin.Sitesettings.Maxuserapireqsperminute();
            public final Anonymous.Admin.Sitesettings.Allowuserapikeys allowuserapikeys = new Anonymous.Admin.Sitesettings.Allowuserapikeys();
            public final Anonymous.Admin.Sitesettings.Allowuserapikeyscopes allowuserapikeyscopes = new Anonymous.Admin.Sitesettings.Allowuserapikeyscopes();
            public final Anonymous.Admin.Sitesettings.Maxapikeysperuser maxapikeysperuser = new Anonymous.Admin.Sitesettings.Maxapikeysperuser();
            public final Anonymous.Admin.Sitesettings.Mintrustlevelforuserapikey mintrustlevelforuserapikey = new Anonymous.Admin.Sitesettings.Mintrustlevelforuserapikey();
            public final Anonymous.Admin.Sitesettings.Alloweduserapipushurls alloweduserapipushurls = new Anonymous.Admin.Sitesettings.Alloweduserapipushurls();
            public final Anonymous.Admin.Sitesettings.Alloweduserapiauthredirects alloweduserapiauthredirects = new Anonymous.Admin.Sitesettings.Alloweduserapiauthredirects();
            public final Anonymous.Admin.Sitesettings.Taggingenabled taggingenabled = new Anonymous.Admin.Sitesettings.Taggingenabled();
            public final Anonymous.Admin.Sitesettings.Tagstyle tagstyle = new Anonymous.Admin.Sitesettings.Tagstyle();
            public final Anonymous.Admin.Sitesettings.Maxtagspertopic maxtagspertopic = new Anonymous.Admin.Sitesettings.Maxtagspertopic();
            public final Anonymous.Admin.Sitesettings.Maxtaglength maxtaglength = new Anonymous.Admin.Sitesettings.Maxtaglength();
            public final Anonymous.Admin.Sitesettings.Mintrusttocreatetag mintrusttocreatetag = new Anonymous.Admin.Sitesettings.Mintrusttocreatetag();
            public final Anonymous.Admin.Sitesettings.Mintrustleveltotagtopics mintrustleveltotagtopics = new Anonymous.Admin.Sitesettings.Mintrustleveltotagtopics();
            public final Anonymous.Admin.Sitesettings.Maxtagsearchresults maxtagsearchresults = new Anonymous.Admin.Sitesettings.Maxtagsearchresults();
            public final Anonymous.Admin.Sitesettings.Showfilterbytag showfilterbytag = new Anonymous.Admin.Sitesettings.Showfilterbytag();
            public final Anonymous.Admin.Sitesettings.Maxtagsinfilterlist maxtagsinfilterlist = new Anonymous.Admin.Sitesettings.Maxtagsinfilterlist();
            public final Anonymous.Admin.Sitesettings.Tagssortalphabetically tagssortalphabetically = new Anonymous.Admin.Sitesettings.Tagssortalphabetically();
            public final Anonymous.Admin.Sitesettings.Stafftags stafftags = new Anonymous.Admin.Sitesettings.Stafftags();
            public final Anonymous.Admin.Sitesettings.Suppressoverlappingtagsinlist suppressoverlappingtagsinlist = new Anonymous.Admin.Sitesettings.Suppressoverlappingtagsinlist();
            public final Anonymous.Admin.Sitesettings.Removemutedtagsfromlatest removemutedtagsfromlatest = new Anonymous.Admin.Sitesettings.Removemutedtagsfromlatest();
            public final Anonymous.Admin.Sitesettings.Detailsenabled detailsenabled = new Anonymous.Admin.Sitesettings.Detailsenabled();
            public final Anonymous.Admin.Sitesettings.Dailyperformancereport dailyperformancereport = new Anonymous.Admin.Sitesettings.Dailyperformancereport();
            public final Anonymous.Admin.Sitesettings.Pollenabled pollenabled = new Anonymous.Admin.Sitesettings.Pollenabled();
            public final Anonymous.Admin.Sitesettings.Pollmaximumoptions pollmaximumoptions = new Anonymous.Admin.Sitesettings.Pollmaximumoptions();
            public final Anonymous.Admin.Sitesettings.Polleditwindowmins polleditwindowmins = new Anonymous.Admin.Sitesettings.Polleditwindowmins();
            public final Anonymous.Admin.Sitesettings.Discoursenarrativebotenabled discoursenarrativebotenabled = new Anonymous.Admin.Sitesettings.Discoursenarrativebotenabled();
            public final Anonymous.Admin.Sitesettings.Disablediscoursenarrativebotwelcomepost disablediscoursenarrativebotwelcomepost = new Anonymous.Admin.Sitesettings.Disablediscoursenarrativebotwelcomepost();
            public final Anonymous.Admin.Sitesettings.Discoursenarrativebotdisablepublicreplies discoursenarrativebotdisablepublicreplies = new Anonymous.Admin.Sitesettings.Discoursenarrativebotdisablepublicreplies();
            public final Anonymous.Admin.Sitesettings.Discoursenarrativebotignoredusernames discoursenarrativebotignoredusernames = new Anonymous.Admin.Sitesettings.Discoursenarrativebotignoredusernames();
            public final Anonymous.Admin.Sitesettings.Discoursenarrativebotwelcomepostdelay discoursenarrativebotwelcomepostdelay = new Anonymous.Admin.Sitesettings.Discoursenarrativebotwelcomepostdelay();
            public final Anonymous.Admin.Sitesettings.Discoursenarrativebotwelcomeposttype discoursenarrativebotwelcomeposttype = new Anonymous.Admin.Sitesettings.Discoursenarrativebotwelcomeposttype();

            public class Activeuserratelimitsecs {

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

            public class Addrelnofollowtousercontent {

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

            public class Alertadminsiferrorsperhour {

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

            public class Alertadminsiferrorsperminute {

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

            public class Allowallattachmentsforgroupmessages {

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

            public class Allowanimatedavatars {

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

            public class Allowanimatedthumbnails {

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

            public class Allowanonymousposting {

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

            public class Allowduplicatetopictitles {

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

            public class Allowedhrefschemes {

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

            public class Alloweduserapiauthredirects {

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

            public class Alloweduserapipushurls {

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

            public class Allowhtmltables {

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

            public class Allowindexinrobotstxt {

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

            public class Allowmoderatorstocreatecategories {

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

            public class Allownewregistrations {

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

            public class Allowprofilebackgrounds {

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

            public class Allowrestore {

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

            public class Allowuncategorizedtopics {

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

            public class Allowuploadedavatars {

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

            public class Allowuppercaseposts {

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

            public class Allowuserapikeys {

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

            public class Allowuserapikeyscopes {

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

            public class Allowuserlocale {

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

            public class Alternativereplybyemailaddresses {

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

            public class Alwaysshowtrimmedcontent {

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

            public class Anonpollinginterval {

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

            public class Anonymousaccountdurationminutes {

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

            public class Anonymouspostingmintrustlevel {

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

            public class Appletouchiconurl {

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

            public class Approvenewtopicsunlesstrustlevel {

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

            public class Approvepostcount {

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

            public class Approveunlesstrustlevel {

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

            public class Attachmentcontenttypeblacklist {

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

            public class Attachmentfilenameblacklist {

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

            public class Authorizedextensions {

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

            public class Autoblockfasttypersmaxtrustlevel {

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

            public class Autoblockfasttypersonfirstpost {

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

            public class Autoblockfirstpostregex {

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

            public class Autoclosemessagespostcount {

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

            public class Autoclosetopicspostcount {

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

            public class Autogeneratedwhitelist {

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

            public class Autohighlightallcode {

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

            public class Automaticallydownloadgravatars {

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

            public class Automaticallyunpintopics {

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

            public class Automaticbackupsenabled {

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

            public class Autorespondtoflagactions {

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

            public class Avatarsizes {

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

            public class Backgroundpollinginterval {

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

            public class Backupfrequency {

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

            public class Backuptimeofday {

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

            public class Backupwithuploads {

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

            public class Blockautogeneratedemails {

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

            public class Blockcommonpasswords {

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

            public class Bodyminentropy {

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

            public class Bootstrapmodeminusers {

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

            public class Bouncescorethreshold {

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

            public class Bouncescorethresholddeactivate {

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

            public class Categoriestopics {

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

            public class Categorycolors {

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

            public class Categorystyle {

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

            public class Censoredpattern {

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

            public class Censoredwords {

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

            public class Cleanorphanuploadsgraceperiodhours {

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

            public class Cleanupuploads {

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

            public class Codeformattingstyle {

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

            public class Coldagedayshigh {

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

            public class Coldagedayslow {

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

            public class Coldagedaysmedium {

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

            public class Companydomain {

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

            public class Companyfullname {

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

            public class Companyshortname {

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

            public class Contactemail {

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

            public class Contacturl {

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

            public class Convertpastedimagesquality {

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

            public class Convertpastedimagestohqjpg {

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

            public class Cooldownminutesafterhidingposts {

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

            public class Corsorigins {

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

            public class Crawlimages {

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

            public class Createthumbnails {

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

            public class Dailyperformancereport {

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

            public class Defaultavatars {

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

            public class Defaultcategoriesmuted {

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

            public class Defaultcategoriestracking {

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

            public class Defaultcategorieswatchingfirstpost {

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

            public class Defaultcodelang {

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

            public class Defaultemailalways {

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

            public class Defaultemaildigestfrequency {

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

            public class Defaultemaildirect {

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

            public class Defaultemailinreplyto {

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

            public class Defaultemailmailinglistmode {

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

            public class Defaultemailmailinglistmodefrequency {

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

            public class Defaultemailpreviousreplies {

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

            public class Defaultemailprivatemessages {

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

            public class Defaultincludetl0indigests {

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

            public class Defaultinviteetrustlevel {

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

            public class Defaultlocale {

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

            public class Defaultopengraphimageurl {

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

            public class Defaultotherautotracktopicaftermsecs {

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

            public class Defaultotherdisablejumpreply {

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

            public class Defaultotherdynamicfavicon {

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

            public class Defaultotherenablequoting {

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

            public class Defaultotherexternallinksinnewtab {

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

            public class Defaultotherlikenotificationfrequency {

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

            public class Defaultothernewtopicdurationminutes {

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

            public class Defaultothernotificationlevelwhenreplying {

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

            public class Defaulttopicsautomaticunpin {

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

            public class Defaulttrustlevel {

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

            public class Deleteallpostsmax {

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

            public class Deletedigestemailafterdays {

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

            public class Deletedraftsolderthanndays {

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

            public class Deleteemaillogsafterdays {

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

            public class Deleteoldhiddenposts {

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

            public class Deleteremovedpostsafter {

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

            public class Deleteusermaxpostage {

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

            public class Desktopcategorypagestyle {

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

            public class Detailsenabled {

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

            public class Digestlogourl {

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

            public class Digestminexcerptlength {

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

            public class Digestothertopics {

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

            public class Digestposts {

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

            public class Digestsuppresscategories {

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

            public class Digesttopics {

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

            public class Disableavatareducationmessage {

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

            public class Disabledigestemails {

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

            public class Disabledimagedownloaddomains {

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

            public class Disablediscoursenarrativebotwelcomepost {

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

            public class Disableeditnotifications {

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

            public class Disableemails {

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

            public class Disablemailinglistmode {

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

            public class Discoursenarrativebotdisablepublicreplies {

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

            public class Discoursenarrativebotenabled {

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

            public class Discoursenarrativebotignoredusernames {

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

            public class Discoursenarrativebotwelcomepostdelay {

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

            public class Discoursenarrativebotwelcomeposttype {

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

            public class Displaynameonemailfrom {

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

            public class Displaynameonposts {

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

            public class Dominatingtopicminimumpercent {

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

            public class Downloadremoteimagesmaxdaysold {

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

            public class Downloadremoteimagesthreshold {

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

            public class Downloadremoteimagestolocal {

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

            public class Edithistoryvisibletopublic {

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

            public class Editinggraceperiod {

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

            public class Educateuntilposts {

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

            public class Emailaccentbgcolor {

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

            public class Emailaccentfgcolor {

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

            public class Emailcustomheaders {

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

            public class Emaildomainsblacklist {

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

            public class Emaildomainswhitelist {

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

            public class Emaileditable {

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

            public class Emailin {

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

            public class Emailinmintrust {

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

            public class Emaillinkcolor {

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

            public class Emailpostscontext {

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

            public class Emailprefix {

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

            public class Emailsitetitle {

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

            public class Emailsubject {

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

            public class Emailtimewindowmins {

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

            public class Emailtokenvalidhours {

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

            public class Embedtruncate {

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

            public class Emojiset {

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

            public class Enablebadges {

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

            public class Enableemoji {

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

            public class Enableescapedfragments {

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

            public class Enablefacebooklogins {

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

            public class Enableflashvideoonebox {

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

            public class Enableforwardedemails {

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

            public class Enablegithublogins {

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

            public class Enablegoogleoauth2logins {

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

            public class Enableinstagramlogins {

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

            public class Enablelocallogins {

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

            public class Enablelongpolling {

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

            public class Enablemobiletheme {

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

            public class Enablenames {

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

            public class Enablenoscriptsupport {

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

            public class Enableprivatemessages {

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

            public class Enables3backups {

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

            public class Enables3uploads {

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

            public class Enablesignupcta {

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

            public class Enablesso {

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

            public class Enablessoprovider {

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

            public class Enablestagedusers {

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

            public class Enabletwitterlogins {

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

            public class Enableuserdirectory {

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

            public class Enablewhispers {

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

            public class Enableyahoologins {

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

            public class Enforcesquareemoji {

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

            public class Excluderelnofollowdomains {

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

            public class Externalsystemavatarsenabled {

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

            public class Externalsystemavatarsurl {

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

            public class Facebookappid {

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

            public class Facebookappsecret {

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

            public class Facebookrequestextraprofiledetails {

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

            public class Fagurl {

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

            public class Faviconurl {

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

            public class Fixedcategorypositions {

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

            public class Fixedcategorypositionsoncreate {

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

            public class Flagsockpuppets {

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

            public class Flagsrequiredtohidepost {

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

            public class Flushtimingssecs {

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

            public class Forcehostname {

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

            public class Forcehttps {

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

            public class Forgotpasswordstrict {

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

            public class Fullnamerequired {

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

            public class Gadomainname {

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

            public class Gatrackingcode {

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

            public class Gauniversaldomainname {

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

            public class Gauniversaltrackingcode {

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

            public class Githubclientid {

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

            public class Githubclientsecret {

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

            public class Globalnotice {

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

            public class Googleoath2clientid {

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

            public class Googleoath2clientsecret {

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

            public class Gtmcontainerid {

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

            public class Hardbouncescore {

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

            public class Hideuserprofilesfrompublic {

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

            public class Highlightedlanguages {

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

            public class Historyhourshigh {

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

            public class Historyhourslow {

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

            public class Historyhoursmedium {

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

            public class Ignorebytitle {

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

            public class Incomingemailpreferhtml {

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

            public class Instagramconsumerkey {

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

            public class Instagramconsumersecret {

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

            public class Inviteexpirydays {

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

            public class Inviteonly {

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

            public class Invitepassthroughhours {

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

            public class Invitesperpage {

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

            public class Levenshteindistancespammeremails {

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

            public class Limitsuggestedtocategory {

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

            public class Loginrequired {

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

            public class Logmailprocessingfailures {

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

            public class Logosmallurl {

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

            public class Logourl {

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

            public class Logoutredirect {

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

            public class Logoutstrict {

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

            public class Longpollingbaseurl {

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

            public class Longpollinginterval {

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

            public class Mailgunapikey {

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

            public class Manualpollingenabled {

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

            public class Maxageunmatchedemails {

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

            public class Maxageunmatchedips {

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

            public class Maxapikeysperuser {

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

            public class Maxattachmentsizekb {

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

            public class Maxbookmarksperday {

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

            public class Maxeditsperday {

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

            public class Maxemailsperdayperuser {

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

            public class Maxflagsperday {

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

            public class Maximageheight {

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

            public class Maximagemegapixels {

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

            public class Maximagesizekb {

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

            public class Maximagewidth {

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

            public class Maximumbackups {

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

            public class Maximumsessionage {

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

            public class Maximumstagedusersperemail {

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

            public class Maxinvitesperday {

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

            public class Maxlikesperday {

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

            public class Maxmentionsperpost {

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

            public class Maxnewaccountsperregistrationip {

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

            public class Maxoneboxesperpost {

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

            public class Maxpostlength {

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

            public class Maxprintsperhourperuser {

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

            public class Maxprivatemessagesperday {

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

            public class Maxrepliesinfirstday {

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

            public class Maxreplyhistory {

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

            public class Maxsimilarresults {

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

            public class Maxtaglength {

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

            public class Maxtagsearchresults {

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

            public class Maxtagsinfilterlist {

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

            public class Maxtagspertopic {

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

            public class Maxtopicinvitationsperday {

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

            public class Maxtopicsinfirstday {

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

            public class Maxtopicsperday {

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

            public class Maxtopictitlelength {

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

            public class Maxuserapireqsperday {

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

            public class Maxuserapireqsperminute {

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

            public class Maxusernamelength {

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

            public class Maxusersnotifiedpergroupmention {

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

            public class Minadminpasswordlength {

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

            public class Minbanentriesforrollup {

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

            public class Minbodytitlelength {

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

            public class Minfirstpostlength {

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

            public class Minfirstposttypingtime {

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

            public class Minimumtopicssimilar {

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

            public class Minpasswordlength {

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

            public class Minpostlength {

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

            public class Minprivatemessagepostlength {

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

            public class Minprivatemessagetitlelength {

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

            public class Minsearchtermlength {

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

            public class Mintitlesimilarlength {

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

            public class Mintopictitlelength {

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

            public class Mintrustlevelforuserapikey {

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

            public class Mintrustleveltotagtopics {

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

            public class Mintrusttoallowselfwiki {

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

            public class Mintrusttocreatetag {

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

            public class Mintrusttocreatetopic {

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

            public class Mintrusttoeditpost {

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

            public class Mintrusttoeditwikipost {

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

            public class Mintrusttosendmessages {

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

            public class Minusernamelength {

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

            public class Mobilelogourl {

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

            public class Mustapproveusers {

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

            public class Nativeappinstallbanner {

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

            public class Newusermaxattachments {

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

            public class Newusermaximages {

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

            public class Newusermaxlinks {

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

            public class Newusermaxmentionsperpost {

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

            public class Newusermaxrepliespertopic {

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

            public class Newuserspamhostthreshold {

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

            public class Newversionemails {

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

            public class Notificationemail {

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

            public class Notifyaboutflagsafter {

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

            public class Notifyaboutqueuedpostsafter {

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

            public class Notifymodswhenuserblocked {

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

            public class Numflaggerstoclosetopic {

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

            public class Numflagstoclosetopic {

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

            public class Numspamflagstoblocknewuser {

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

            public class Numtl3flagstoblocknewuser {

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

            public class Numtl3userstoblocknewuser {

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

            public class Numuserstoblocknewuser {

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

            public class Oneboxdomainsblacklist {

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

            public class Pendingusersreminderdelay {

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

            public class Permalinknormalizations {

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

            public class Polleditwindowmins {

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

            public class Pollenabled {

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

            public class Pollinginterval {

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

            public class Pollmaximumoptions {

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

            public class Pop3pollingenabled {

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

            public class Pop3pollinghost {

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

            public class Pop3pollingopensslverify {

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

            public class Pop3pollingpassword {

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

            public class Pop3pollingperiodmins {

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

            public class Pop3pollingport {

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

            public class Pop3pollingssl {

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

            public class Pop3pollingusername {

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

            public class Postedittimelimit {

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

            public class Postexcerptmaxlength {

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

            public class Postmenu {

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

            public class Postmenuhiddenitems {

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

            public class Postoneboxmaxlength {

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

            public class Postundoactionwindowmins {

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

            public class Preventanonsfromdownloadingfiles {

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

            public class Previousvisittimeouthours {

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

            public class Prioritizeusernameinux {

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

            public class Privacypolicyurl {

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

            public class Privateemailtimewindowseconds {

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

            public class Publicusercustomfields {

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

            public class Purgedeleteduploadsgraceperioddays {

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

            public class Purgeunactivatedusersgraceperioddays {

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

            public class Queuejobs {

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

            public class Ratelimitcreatepost {

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

            public class Ratelimitcreatetopic {

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

            public class Ratelimitnewusercreatepost {

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

            public class Ratelimitnewusercreatetopic {

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

            public class Readonlymodeduringbackup {

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

            public class Readtimewordcount {

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

            public class Rebakeoldpostscount {

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

            public class Redirectuserstotoppage {

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

            public class Relativedateduration {

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

            public class Removemutedtagsfromlatest {

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

            public class Replybyemailaddress {

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

            public class Replybyemailenabled {

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

            public class Reservedusernames {

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

            public class Resetbouncescoreafterdays {

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

            public class S3accesskeyid {

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

            public class S3backupbucket {

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

            public class S3cdnurl {

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

            public class S3disablecleanup {

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

            public class S3region {

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

            public class S3secretaccesskey {

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

            public class S3uploadbucket {

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

            public class S3useiamprofile {

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

            public class Searchpreferrecentposts {

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

            public class Searchrecentpostssize {

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

            public class Searchtokenizechinesejapanesekorean {

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

            public class Sendwelcomemessage {

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

            public class Sequentialrepliesthreshold {

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

            public class Setlocalefromacceptlanguageheader {

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

            public class Shortemaillength {

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

            public class Shortprogresstextthreshold {

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

            public class Showcreatetopicsnotice {

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

            public class Showemailonprofile {

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

            public class Showfilterbytag {

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

            public class Showpinnedexcerptdesktop {

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

            public class Showpinnedexcerptmobile {

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

            public class Showsubcategorylist {

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

            public class Showtimegapdays {

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

            public class Showtopicfeaturedlinkindigest {

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

            public class Sitecontactusername {

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

            public class Sitedescription {

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

            public class Sluggenerationmethod {

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

            public class Softbouncescore {

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

            public class Ssoallowsallreturnpaths {

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

            public class Ssonotapprovedurl {

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

            public class Ssooverridesavatar {

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

            public class Ssooverridesbio {

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

            public class Ssooverridesemail {

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

            public class Ssooverridesname {

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

            public class Ssooverridesusername {

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

            public class Ssosecret {

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

            public class Ssourl {

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

            public class Stafflikeweight {

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

            public class Stafftags {

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

            public class Staffuserscustomfields {

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

            public class Stripimagesfromshortemails {

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

            public class Suggestedtopics {

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

            public class Suggestedtopicsmaxdaysold {

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

            public class Summarylikesrequired {

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

            public class Summarymaxresults {

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

            public class Summarypercentfilter {

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

            public class Summarypostsrequired {

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

            public class Summaryscorethreshold {

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

            public class Suppressoverlappingtagsinlist {

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

            public class Suppressreplydirectlyabove {

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

            public class Suppressreplydirectlybelow {

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

            public class Suppressreplywhenquoting {

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

            public class Suppressuncategorizedbadge {

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

            public class Taggingenabled {

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

            public class Tagssortalphabetically {

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

            public class Tagstyle {

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

            public class Titlefancyentities {

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

            public class Titlemaxwordlength {

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

            public class Titleminentropy {

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

            public class Titleprettify {

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

            public class Tl1requiresreadposts {

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

            public class Tl1requirestimespentmins {

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

            public class Tl1requirestopicsentered {

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

            public class Tl2additionallikesperdaymultiplier {

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

            public class Tl2requiresdaysvisited {

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

            public class Tl2requireslikesgiven {

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

            public class Tl2requireslikesreceived {

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

            public class Tl2requiresreadposts {

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

            public class Tl2requirestimespentmins {

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

            public class Tl2requirestopicreplycount {

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

            public class Tl2requirestopicsentered {

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

            public class Tl3additionallikesperdaymultiplier {

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

            public class Tl3linksnofollow {

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

            public class Tl3promotionminduration {

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

            public class Tl3requiresdaysvisited {

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

            public class Tl3requireslikesgiven {

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

            public class Tl3requireslikesreceived {

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

            public class Tl3requiresmaxflagged {

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

            public class Tl3requirespostsread {

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

            public class Tl3requirespostsreadalltime {

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

            public class Tl3requirespostsreadcap {

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

            public class Tl3requirestopicsrepliedto {

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

            public class Tl3requirestopicsviewed {

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

            public class Tl3requirestopicsviewedalltime {

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

            public class Tl3requirestopicsviewedcap {

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

            public class Tl3timeperiod {

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

            public class Tl4additionallikesperdaymultiplier {

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

            public class Topicfeaturedlinkenabled {

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

            public class Topicpagetitleincludescategory {

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

            public class Topicpostlikeheathigh {

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

            public class Topicpostlikeheatlow {

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

            public class Topicpostlikeheatmedium {

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

            public class Topicviewdurationhours {

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

            public class Topicviewsheathigh {

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

            public class Topicviewsheatlow {

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

            public class Topicviewsheatmedium {

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

            public class Topmenu {

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

            public class Toptopicsformulafirstpostlikesmultiplier {

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

            public class Toptopicsformulalogviewsmultiplier {

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

            public class Tosurl {

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

            public class Trackexternalrightclicks {

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

            public class Traditionalmarkdownlinebreaks {

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

            public class Twitterconsumerkey {

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

            public class Twitterconsumersecret {

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

            public class Twittersummarylargeimageurl {

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

            public class Uniquepostsmin {

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

            public class Unsubscribeviaemail {

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

            public class Unsubscribeviaemailfooter {

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

            public class Useadminipwhitelist {

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

            public class Usernamechangeperiod {

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

            public class Userprofileviewdurationhours {

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

            public class Vacuumdbdays {

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

            public class Verboselocalization {

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

            public class Verbosessologging {

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

            public class Versionchecks {

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

            public class Warnrevivingoldtopicage {

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

            public class Whitelistedspamhostdomains {

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

        public class Sitesettingsjson {

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
            public final Anonymous.Admin.Users.Generateapikey generateapikey = new Anonymous.Admin.Users.Generateapikey();
            public final Anonymous.Admin.Users.Groups groups = new Anonymous.Admin.Users.Groups();
            public final Anonymous.Admin.Users.List list = new Anonymous.Admin.Users.List();
            public final Anonymous.Admin.Users.Logout logout = new Anonymous.Admin.Users.Logout();

            /**
             * 
             * <p>
             * Get a specific user by id. Returns more info than the public user route.
             * </p>
             * 
             * @param id
             */
            public Requested<Object> getByIdjson(long id) {
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
            public Requested<Object> deleteByIdjson(long id,
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

            public class Generateapikey {

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
                public void deleteByIdGroupid(long id, long group_id) {
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
                public Requested<Object[]> getByFlagjson(discourse.example.com.structures.flag flag,
                    discourse.example.com.structures.order order,
                    Boolean ascending,
                    Long page,
                    Boolean show_emails) {
                    String url = ("https://discourse.example.com//admin/users/list/{flag}.json".replace("{flag}", ""+flag)+"?"+(order==null?"":"&order="+flatten(order))+(ascending==null?"":"&ascending="+flatten(ascending))+(page==null?"":"&page="+flatten(page))+(show_emails==null?"":"&show_emails="+flatten(show_emails)));
                    return requestGet(url, null, Object[].class);
                }
            }

            public class Logout {

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
        public Requested<Object> getByIdjson(long id, Long page) {
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

    public class Categoriesjson {

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

    public class Directoryitemsjson {

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

    public class Exportcsv {
        public final Anonymous.Exportcsv.Exportentityjson exportentity_json = new Anonymous.Exportcsv.Exportentityjson();

        public class Exportentityjson {

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
        public final Anonymous.Groups.Membersjson members_json = new Anonymous.Groups.Membersjson();

        /**
         * 
         * <p>
         * Get a specific group
         * </p>
         */
        public Requested<Object> getByNamejson() {
            String url = ("https://discourse.example.com//groups/{name}.json");
            return requestGet(url, null, Object.class);
        }

        /**
         * 
         * <p>
         * Update a group
         * </p>
         */
        public Requested<Object> putByNamejson() {
            String url = ("https://discourse.example.com//groups/{name}.json");
            return requestPut(url, null, null, Object.class);
        }

        public class Membersjson {

            /**
             * 
             * <p>
             * Get some group members
             * </p>
             */
            public Requested<Object> getByGroupname() {
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
            public Requested<Object> putByGroupid(String usernames) {
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
            public Requested<Object> deleteByGroupid(long user_id,
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

    public class Groupsjson {

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
            public Requested<Object> post(String email, String group_names, String custom_message) {
                String url = ("https://discourse.example.com//invites/link");
                Map<String, Object> content = new HashMap<>();
                content.put("email", email);
                content.put("group_names", group_names);
                content.put("custom_message", custom_message);
                return requestPost(url, null, content, Object.class);
            }
        }
    }

    public class Latestjson {

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
        public final Anonymous.Notifications.Markreadjson markread_json = new Anonymous.Notifications.Markreadjson();

        public class Markreadjson {

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

    public class Notificationsjson {

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

    public class Pageviewtotalreqs {

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

    public class Postactions {

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
        public Requested<Object> getByIdjson(long id) {
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
        public Requested<Object> putByIdjson(long id,
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

    public class Postsjson {

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
        public final Anonymous.Session.Forgotpassword forgotpassword = new Anonymous.Session.Forgotpassword();

        public class Forgotpassword {

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
        public final Anonymous.T.Postsjson posts_json = new Anonymous.T.Postsjson();
        public final Anonymous.T.Invite invite = new Anonymous.T.Invite();
        public final Anonymous.T.Bookmark bookmark = new Anonymous.T.Bookmark();
        public final Anonymous.T.Status status = new Anonymous.T.Status();
        public final Anonymous.T.Timer timer = new Anonymous.T.Timer();
        public final Anonymous.T.Changetimestamp changetimestamp = new Anonymous.T.Changetimestamp();
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
        public Requested<Object> getByIdjson(long id, Boolean print) {
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
        public void deleteByIdjson(long id) {
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
        public Requested<Object> putBySlugIdjson(String slug,
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

        public class Changetimestamp {

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

        public class Postsjson {

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

    public class Taggroups {

        /**
         * 
         * <p>
         * Get a single tag group
         * </p>
         * 
         * @param id
         */
        public Requested<Object> getByIdjson(long id) {
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
        public Requested<Object> putByIdjson(long id, String name, String[] tag_names) {
            String url = ("https://discourse.example.com//tag_groups/{id}.json".replace("{id}", ""+id));
            Map<String, Object> content = new HashMap<>();
            content.put("name", name);
            content.put("tag_names", tag_names);
            return requestPut(url, null, content, Object.class);
        }
    }

    public class Taggroupsjson {

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
        public void getByFlagjson(discourse.example.com.structures.flag flag) {
            String url = ("https://discourse.example.com//top/{flag}.json".replace("{flag}", ""+flag));
            requestGet(url, null, Void.class);
        }
    }

    public class Topics {
        public final Anonymous.Topics.Privatemessages privatemessages = new Anonymous.Topics.Privatemessages();
        public final Anonymous.Topics.Privatemessagessent privatemessagessent = new Anonymous.Topics.Privatemessagessent();

        public class Privatemessages {

            /**
             * 
             * <p>
             * Get a list of private messages for a user
             * </p>
             */
            public Requested<Object> getByUsernamejson() {
                String url = ("https://discourse.example.com//topics/private-messages/{username}.json");
                return requestGet(url, null, Object.class);
            }
        }

        public class Privatemessagessent {

            /**
             * 
             * <p>
             * Get a list of private messages sent
             * </p>
             */
            public Requested<Object> getByUsernamejson() {
                String url = ("https://discourse.example.com//topics/private-messages-sent/{username}.json");
                return requestGet(url, null, Object.class);
            }
        }
    }

    public class Topjson {

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
        public final Anonymous.U.Byexternal byexternal = new Anonymous.U.Byexternal();

        public class Byexternal {

            /**
             * 
             * <p>
             * Get a single user by SSO external ID
             * </p>
             * 
             * @param external_id
             */
            public Requested<Object> getByExternalidjson(long external_id) {
                String url = ("https://discourse.example.com//u/by-external/{external_id}.json".replace("{external_id}", ""+external_id));
                return requestGet(url, null, Object.class);
            }
        }
    }

    public class Uploadsjson {

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

    public class Useractionsjson {

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

    public class Useravatar {
        public final Anonymous.Useravatar.Refreshgravatarjson refreshgravatar_json = new Anonymous.Useravatar.Refreshgravatarjson();

        public class Refreshgravatarjson {

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

    public class Userbadges {

        /**
         * 
         * <p>
         * get a list of badges assigned to a user
         * </p>
         */
        public Requested<Object> getByUsernamejson() {
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

    public class Userbadgesjson {

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
        public final Anonymous.Users.Passwordreset passwordreset = new Anonymous.Users.Passwordreset();

        /**
         * 
         * <p>
         * Get a single user by username
         * </p>
         * 
         * @param username
         */
        public Requested<Object> getByUsernamejson(String username) {
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

        public class Passwordreset {

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
