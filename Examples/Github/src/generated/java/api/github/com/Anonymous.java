package api.github.com;

import java.util.HashMap;
import java.util.Map;
import api.github.com.definitions.Asset;
import api.github.com.definitions.Blob;
import api.github.com.definitions.Branch;
import api.github.com.definitions.Comment;
import api.github.com.definitions.CommentBody;
import api.github.com.definitions.Commit;
import api.github.com.definitions.CommitActivityStats;
import api.github.com.definitions.CommitComment;
import api.github.com.definitions.CommitCommentBody;
import api.github.com.definitions.CompareCommits;
import api.github.com.definitions.ContentsPath;
import api.github.com.definitions.ContributorsStats;
import api.github.com.definitions.CreateFile;
import api.github.com.definitions.CreateFileBody;
import api.github.com.definitions.DeleteFile;
import api.github.com.definitions.DeleteFileBody;
import api.github.com.definitions.Deployment;
import api.github.com.definitions.DeploymentResp;
import api.github.com.definitions.DeploymentStatuses;
import api.github.com.definitions.DeploymentStatusesCreate;
import api.github.com.definitions.Download;
import api.github.com.definitions.Event;
import api.github.com.definitions.ForkBody;
import api.github.com.definitions.Gist;
import api.github.com.definitions.GitCommit;
import api.github.com.definitions.GitignoreLang;
import api.github.com.definitions.HeadBranch;
import api.github.com.definitions.Hook;
import api.github.com.definitions.HookBody;
import api.github.com.definitions.Issue;
import api.github.com.definitions.IssueEvent;
import api.github.com.definitions.IssuesComment;
import api.github.com.definitions.IssuesComments;
import api.github.com.definitions.Label;
import api.github.com.definitions.MergePullBody;
import api.github.com.definitions.MergesBody;
import api.github.com.definitions.MergesSuccessful;
import api.github.com.definitions.Milestone;
import api.github.com.definitions.MilestoneUpdate;
import api.github.com.definitions.NotificationMarkRead;
import api.github.com.definitions.OrgTeamsPost;
import api.github.com.definitions.Organization;
import api.github.com.definitions.ParticipationStats;
import api.github.com.definitions.PostGist;
import api.github.com.definitions.PostRepo;
import api.github.com.definitions.PullRequest;
import api.github.com.definitions.PullsComment;
import api.github.com.definitions.PullsCommentPost;
import api.github.com.definitions.PullsPost;
import api.github.com.definitions.PutSubscription;
import api.github.com.definitions.RateLimit;
import api.github.com.definitions.Ref;
import api.github.com.definitions.RefStatus;
import api.github.com.definitions.RefsBody;
import api.github.com.definitions.Release;
import api.github.com.definitions.ReleaseCreate;
import api.github.com.definitions.Repo;
import api.github.com.definitions.RepoComments;
import api.github.com.definitions.RepoCommit;
import api.github.com.definitions.RepoCommitBody;
import api.github.com.definitions.RepoDeployments;
import api.github.com.definitions.SearchCode;
import api.github.com.definitions.SearchIssues;
import api.github.com.definitions.SearchIssuesByKeyword;
import api.github.com.definitions.SearchRepositories;
import api.github.com.definitions.SearchRepositoriesByKeyword;
import api.github.com.definitions.SearchUserByEmail;
import api.github.com.definitions.SearchUsers;
import api.github.com.definitions.SearchUsersByKeyword;
import api.github.com.definitions.SubscriptionBody;
import api.github.com.definitions.Tag;
import api.github.com.definitions.TagBody;
import api.github.com.definitions.Team;
import api.github.com.definitions.TeamMembership;
import api.github.com.definitions.TeamsList;
import api.github.com.definitions.Tree;
import api.github.com.definitions.UserKeysKeyId;
import api.github.com.definitions.UserKeysPost;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Disconnected;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;


/**
 * access api.github.com with no authorization.
 */
public class Anonymous
    extends Disconnected
{
    public final Anonymous.Emojis emojis = new Anonymous.Emojis();
    public final Anonymous.Events events = new Anonymous.Events();
    public final Anonymous.Feeds feeds = new Anonymous.Feeds();
    public final Anonymous.Gists gists = new Anonymous.Gists();
    public final Anonymous.Gitignore gitignore = new Anonymous.Gitignore();
    public final Anonymous.Issues issues = new Anonymous.Issues();
    public final Anonymous.Legacy legacy = new Anonymous.Legacy();
    public final Anonymous.Markdown markdown = new Anonymous.Markdown();
    public final Anonymous.Meta meta = new Anonymous.Meta();
    public final Anonymous.Networks networks = new Anonymous.Networks();
    public final Anonymous.Notifications notifications = new Anonymous.Notifications();
    public final Anonymous.Orgs orgs = new Anonymous.Orgs();
    public final Anonymous.Ratelimit ratelimit = new Anonymous.Ratelimit();
    public final Anonymous.Repos repos = new Anonymous.Repos();
    public final Anonymous.Repositories repositories = new Anonymous.Repositories();
    public final Anonymous.Search search = new Anonymous.Search();
    public final Anonymous.Teams teams = new Anonymous.Teams();
    public final Anonymous.User user = new Anonymous.User();
    public final Anonymous.Users users = new Anonymous.Users();

    public class Emojis {

        /**
         * null
         * <p>
         * Lists all the emojis available to use on GitHub.
         * </p>
         * 
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<HashMap<String, String>> get(String Accept) {
            String url = ("https://api.github.com//emojis");
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, HashMap.class);
        }
    }

    public class Events {

        /**
         * null
         * <p>
         * List public events.
         * </p>
         * 
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<Event[]> get(String Accept) {
            String url = ("https://api.github.com//events");
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, Event[].class);
        }
    }

    public class Feeds {

        /**
         * null
         * <p>
         * List Feeds.
         * GitHub provides several timeline resources in Atom format. The Feeds API
         *  lists all the feeds available to the authenticating user.
         * </p>
         * 
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<api.github.com.definitions.Feeds> get(String Accept) {
            String url = ("https://api.github.com//feeds");
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, api.github.com.definitions.Feeds.class);
        }
    }

    public class Gists {
        public final Anonymous.Gists.Public _public = new Anonymous.Gists.Public();
        public final Anonymous.Gists.Starred starred = new Anonymous.Gists.Starred();
        public final Anonymous.Gists.Comments comments = new Anonymous.Gists.Comments();
        public final Anonymous.Gists.Forks forks = new Anonymous.Gists.Forks();
        public final Anonymous.Gists.Star star = new Anonymous.Gists.Star();

        /**
         * null
         * <p>
         * List the authenticated user's gists or if called anonymously, this will
         * return all public gists.
         * </p>
         * 
         * @param since
         *     Timestamp in ISO 8601 format YYYY-MM-DDTHH:MM:SSZ.
         *     Only gists updated at or after this time are returned.
         *     
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<api.github.com.definitions.Gists[]> get(String since, String Accept) {
            String url = ("https://api.github.com//gists"+"?"+(since==null?"":"&since="+flatten(since)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, api.github.com.definitions.Gists[].class);
        }

        /**
         * null
         * <p>
         * Create a gist.
         * </p>
         * 
         * @param Accept
         *     Is used to set specified media type.
         * @param body
         */
        public Requested<Gist> post(String Accept, PostGist body) {
            String url = ("https://api.github.com//gists");
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            return requestPost(url, headerProperties, content, Gist.class);
        }

        /**
         * null
         * <p>
         * Get a single gist.
         * </p>
         * 
         * @param id
         *     Id of gist.
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<Gist> getById(long id, String Accept) {
            String url = ("https://api.github.com//gists/{id}".replace("{id}", ""+id));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, Gist.class);
        }

        /**
         * null
         * <p>
         * Delete a gist.
         * </p>
         * 
         * @param id
         *     Id of gist.
         * @param Accept
         *     Is used to set specified media type.
         */
        public void deleteById(long id, String Accept) {
            String url = ("https://api.github.com//gists/{id}".replace("{id}", ""+id));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            requestDel(url, headerProperties);
        }

        public class Comments {

            /**
             * null
             * <p>
             * List comments on a gist.
             * </p>
             * 
             * @param id
             *     Id of gist.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Comments[]> getById(long id, String Accept) {
                String url = ("https://api.github.com//gists/{id}/comments".replace("{id}", ""+id));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Comments[].class);
            }

            /**
             * null
             * <p>
             * Create a commen
             * </p>
             * 
             * @param id
             *     Id of gist.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<Comment> postById(long id, String Accept, CommentBody body) {
                String url = ("https://api.github.com//gists/{id}/comments".replace("{id}", ""+id));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, Comment.class);
            }

            /**
             * null
             * <p>
             * Get a single comment.
             * </p>
             * 
             * @param id
             *     Id of gist.
             * @param commentId
             *     Id of comment.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Comment> getByIdCommentid(long id, long commentId, String Accept) {
                String url = ("https://api.github.com//gists/{id}/comments/{commentId}".replace("{id}", ""+id).replace("{commentId}", ""+commentId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Comment.class);
            }

            /**
             * null
             * <p>
             * Delete a comment.
             * </p>
             * 
             * @param id
             *     Id of gist.
             * @param commentId
             *     Id of comment.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByIdCommentid(long id, long commentId, String Accept) {
                String url = ("https://api.github.com//gists/{id}/comments/{commentId}".replace("{id}", ""+id).replace("{commentId}", ""+commentId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Forks {

            /**
             * null
             * <p>
             * Fork a gist.
             * </p>
             * 
             * @param id
             *     Id of gist.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void postById(long id, String Accept) {
                String url = ("https://api.github.com//gists/{id}/forks".replace("{id}", ""+id));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestPost(url, headerProperties, null, Void.class);
            }
        }

        public class Public {

            /**
             * null
             * <p>
             * List all public gists.
             * </p>
             * 
             * @param since
             *     Timestamp in ISO 8601 format YYYY-MM-DDTHH:MM:SSZ.
             *     Only gists updated at or after this time are returned.
             *     
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Gists[]> get(String since, String Accept) {
                String url = ("https://api.github.com//gists/public"+"?"+(since==null?"":"&since="+flatten(since)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Gists[].class);
            }
        }

        public class Star {

            /**
             * null
             * <p>
             * Check if a gist is starred.
             * </p>
             * 
             * @param id
             *     Id of gist.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getById(long id, String Accept) {
                String url = ("https://api.github.com//gists/{id}/star".replace("{id}", ""+id));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }

            /**
             * null
             * <p>
             * Star a gist.
             * </p>
             * 
             * @param id
             *     Id of gist.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void putById(long id, String Accept) {
                String url = ("https://api.github.com//gists/{id}/star".replace("{id}", ""+id));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestPut(url, headerProperties, null, Void.class);
            }

            /**
             * null
             * <p>
             * Unstar a gist.
             * </p>
             * 
             * @param id
             *     Id of gist.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteById(long id, String Accept) {
                String url = ("https://api.github.com//gists/{id}/star".replace("{id}", ""+id));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Starred {

            /**
             * null
             * <p>
             * List the authenticated user's starred gists.
             * </p>
             * 
             * @param since
             *     Timestamp in ISO 8601 format YYYY-MM-DDTHH:MM:SSZ.
             *     Only gists updated at or after this time are returned.
             *     
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Gists[]> get(String since, String Accept) {
                String url = ("https://api.github.com//gists/starred"+"?"+(since==null?"":"&since="+flatten(since)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Gists[].class);
            }
        }
    }

    public class Gitignore {
        public final Anonymous.Gitignore.Templates templates = new Anonymous.Gitignore.Templates();

        public class Templates {

            /**
             * null
             * <p>
             * Listing available templates.
             * List all templates available to pass as an option when creating a repository.
             * </p>
             * 
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Object[]> get(String Accept) {
                String url = ("https://api.github.com//gitignore/templates");
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Object[].class);
            }

            /**
             * null
             * <p>
             * Get a single template.
             * </p>
             * 
             * @param language
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<GitignoreLang> getByLanguage(String language, String Accept) {
                String url = ("https://api.github.com//gitignore/templates/{language}".replace("{language}", ""+language));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, GitignoreLang.class);
            }
        }
    }

    public class Issues {

        /**
         * null
         * <p>
         * List issues.
         * List all issues across all the authenticated user's visible repositories.
         * </p>
         * 
         * @param filter
         *     Issues assigned to you / created by you / mentioning you / you're
         *     subscribed to updates for / All issues the authenticated user can see
         *     
         * @param state
         * @param labels
         *     String list of comma separated Label names. Example - bug,ui,@high.
         * @param sort
         * @param direction
         * @param since
         *     Optional string of a timestamp in ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
         *     Only issues updated at or after this time are returned.
         *     
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<api.github.com.definitions.Issues[]> get(api.github.com.structures.filter filter,
            api.github.com.structures.state state,
            String labels,
            api.github.com.structures.sort sort,
            api.github.com.structures.direction direction,
            String since,
            String Accept) {
            String url = ("https://api.github.com//issues"+"?"+(filter==null?"":"&filter="+flatten(filter))+(state==null?"":"&state="+flatten(state))+(labels==null?"":"&labels="+flatten(labels))+(sort==null?"":"&sort="+flatten(sort))+(direction==null?"":"&direction="+flatten(direction))+(since==null?"":"&since="+flatten(since)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, api.github.com.definitions.Issues[].class);
        }
    }

    public class Legacy {
        public final Anonymous.Legacy.Issues issues = new Anonymous.Legacy.Issues();
        public final Anonymous.Legacy.Repos repos = new Anonymous.Legacy.Repos();
        public final Anonymous.Legacy.User user = new Anonymous.Legacy.User();

        public class Issues {
            public final Anonymous.Legacy.Issues.Search search = new Anonymous.Legacy.Issues.Search();

            public class Search {

                /**
                 * null
                 * <p>
                 * Find issues by state and keyword.
                 * </p>
                 * 
                 * @param keyword
                 *     The search term.
                 * @param state
                 *     Indicates the state of the issues to return. Can be either open or closed.
                 * @param owner
                 * @param repository
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<SearchIssuesByKeyword> getByOwnerRepositoryStateKeyword(String keyword,
                    api.github.com.structures.state state,
                    String owner,
                    String repository,
                    String Accept) {
                    String url = ("https://api.github.com//legacy/issues/search/{owner}/{repository}/{state}/{keyword}".replace("{keyword}", ""+keyword).replace("{state}", ""+state).replace("{owner}", ""+owner).replace("{repository}", ""+repository));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, SearchIssuesByKeyword.class);
                }
            }
        }

        public class Repos {
            public final Anonymous.Legacy.Repos.Search search = new Anonymous.Legacy.Repos.Search();

            public class Search {

                /**
                 * null
                 * <p>
                 * Find repositories by keyword. Note, this legacy method does not follow the v3 pagination pattern. This method returns up to 100 results per page and pages can be fetched using the start_page parameter.
                 * </p>
                 * 
                 * @param keyword
                 *     The search term
                 * @param order
                 *     The sort field. if sort param is provided. Can be either asc or desc.
                 * @param language
                 *     Filter results by language
                 * @param start_page
                 *     The page number to fetch
                 * @param sort
                 *     The sort field. One of stars, forks, or updated. Default: results are sorted by best match.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<SearchRepositoriesByKeyword> getByKeyword(String keyword,
                    api.github.com.structures.order order,
                    String language,
                    String start_page,
                    api.github.com.structures.sort sort,
                    String Accept) {
                    String url = ("https://api.github.com//legacy/repos/search/{keyword}".replace("{keyword}", ""+keyword)+"?"+(order==null?"":"&order="+flatten(order))+(language==null?"":"&language="+flatten(language))+(start_page==null?"":"&start_page="+flatten(start_page))+(sort==null?"":"&sort="+flatten(sort)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, SearchRepositoriesByKeyword.class);
                }
            }
        }

        public class User {
            public final Anonymous.Legacy.User.Email email = new Anonymous.Legacy.User.Email();
            public final Anonymous.Legacy.User.Search search = new Anonymous.Legacy.User.Search();

            public class Email {

                /**
                 * null
                 * <p>
                 * This API call is added for compatibility reasons only.
                 * </p>
                 * 
                 * @param email
                 *     The email address
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<SearchUserByEmail> getByEmail(String email, String Accept) {
                    String url = ("https://api.github.com//legacy/user/email/{email}".replace("{email}", ""+email));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, SearchUserByEmail.class);
                }
            }

            public class Search {

                /**
                 * null
                 * <p>
                 * Find users by keyword.
                 * </p>
                 * 
                 * @param keyword
                 *     The search term
                 * @param order
                 *     The sort field. if sort param is provided. Can be either asc or desc.
                 * @param start_page
                 *     The page number to fetch
                 * @param sort
                 *     The sort field. One of stars, forks, or updated. Default: results are sorted by best match.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<SearchUsersByKeyword> getByKeyword(String keyword,
                    api.github.com.structures.order order,
                    String start_page,
                    api.github.com.structures.sort sort,
                    String Accept) {
                    String url = ("https://api.github.com//legacy/user/search/{keyword}".replace("{keyword}", ""+keyword)+"?"+(order==null?"":"&order="+flatten(order))+(start_page==null?"":"&start_page="+flatten(start_page))+(sort==null?"":"&sort="+flatten(sort)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, SearchUsersByKeyword.class);
                }
            }
        }
    }

    public class Markdown {
        public final Anonymous.Markdown.Raw raw = new Anonymous.Markdown.Raw();

        /**
         * null
         * <p>
         * Render an arbitrary Markdown document
         * </p>
         * 
         * @param Accept
         *     Is used to set specified media type.
         * @param body
         */
        public void post(String Accept, api.github.com.definitions.Markdown body) {
            String url = ("https://api.github.com//markdown");
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            requestPost(url, headerProperties, content, Void.class);
        }

        public class Raw {

            /**
             * null
             * <p>
             * Render a Markdown document in raw mode
             * </p>
             * 
             * @param Accept
             *     Is used to set specified media type.
             */
            public void post(String Accept) {
                String url = ("https://api.github.com//markdown/raw");
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestPost(url, headerProperties, null, Void.class);
            }
        }
    }

    public class Meta {

        /**
         * null
         * <p>
         * This gives some information about GitHub.com, the service.
         * </p>
         * 
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<api.github.com.definitions.Meta> get(String Accept) {
            String url = ("https://api.github.com//meta");
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, api.github.com.definitions.Meta.class);
        }
    }

    public class Networks {
        public final Anonymous.Networks.Events events = new Anonymous.Networks.Events();

        public class Events {

            /**
             * null
             * <p>
             * List public events for a network of repositories.
             * </p>
             * 
             * @param owner
             *     Name of the owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Event[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//networks/{owner}/{repo}/events".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Event[].class);
            }
        }
    }

    public class Notifications {
        public final Anonymous.Notifications.Threads threads = new Anonymous.Notifications.Threads();

        /**
         * null
         * <p>
         * List your notifications.
         * List all notifications for the current user, grouped by repository.
         * </p>
         * 
         * @param all
         *     True to show notifications marked as read.
         * @param participating
         *     True to show only notifications in which the user is directly participating
         *     or mentioned.
         *     
         * @param since
         *     The time should be passed in as UTC in the ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
         *     Example: "2012-10-09T23:39:01Z".
         *     
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<api.github.com.definitions.Notifications> get(Boolean all,
            Boolean participating,
            String since,
            String Accept) {
            String url = ("https://api.github.com//notifications"+"?"+(all==null?"":"&all="+flatten(all))+(participating==null?"":"&participating="+flatten(participating))+(since==null?"":"&since="+flatten(since)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, api.github.com.definitions.Notifications.class);
        }

        /**
         * null
         * <p>
         * Mark as read.
         * Marking a notification as "read" removes it from the default view on GitHub.com.
         * </p>
         * 
         * @param Accept
         *     Is used to set specified media type.
         * @param body
         */
        public void put(String Accept, NotificationMarkRead body) {
            String url = ("https://api.github.com//notifications");
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            requestPut(url, headerProperties, content, Void.class);
        }

        public class Threads {
            public final Anonymous.Notifications.Threads.Subscription subscription = new Anonymous.Notifications.Threads.Subscription();

            /**
             * null
             * <p>
             * View a single thread.
             * </p>
             * 
             * @param id
             *     Id of thread.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Notifications> getById(long id, String Accept) {
                String url = ("https://api.github.com//notifications/threads/{id}".replace("{id}", ""+id));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Notifications.class);
            }

            public class Subscription {

                /**
                 * null
                 * <p>
                 * Get a Thread Subscription.
                 * </p>
                 * 
                 * @param id
                 *     Id of thread.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<api.github.com.definitions.Subscription> getById(long id, String Accept) {
                    String url = ("https://api.github.com//notifications/threads/{id}/subscription".replace("{id}", ""+id));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, api.github.com.definitions.Subscription.class);
                }

                /**
                 * null
                 * <p>
                 * Set a Thread Subscription.
                 * This lets you subscribe to a thread, or ignore it. Subscribing to a thread
                 * is unnecessary if the user is already subscribed to the repository. Ignoring
                 * a thread will mute all future notifications (until you comment or get @mentioned).
                 * </p>
                 * 
                 * @param id
                 *     Id of thread.
                 * @param Accept
                 *     Is used to set specified media type.
                 * @param body
                 */
                public Requested<api.github.com.definitions.Subscription> putById(long id, String Accept, PutSubscription body) {
                    String url = ("https://api.github.com//notifications/threads/{id}/subscription".replace("{id}", ""+id));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    Map<String, Object> content = new HashMap<>();
                    content.put("body", body);
                    return requestPut(url, headerProperties, content, api.github.com.definitions.Subscription.class);
                }

                /**
                 * null
                 * <p>
                 * Delete a Thread Subscription.
                 * </p>
                 * 
                 * @param id
                 *     Id of thread.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public void deleteById(long id, String Accept) {
                    String url = ("https://api.github.com//notifications/threads/{id}/subscription".replace("{id}", ""+id));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    requestDel(url, headerProperties);
                }
            }
        }
    }

    public class Orgs {
        public final Anonymous.Orgs.Events events = new Anonymous.Orgs.Events();
        public final Anonymous.Orgs.Issues issues = new Anonymous.Orgs.Issues();
        public final Anonymous.Orgs.Members members = new Anonymous.Orgs.Members();
        public final Anonymous.Orgs.Publicmembers publicmembers = new Anonymous.Orgs.Publicmembers();
        public final Anonymous.Orgs.Repos repos = new Anonymous.Orgs.Repos();
        public final Anonymous.Orgs.Teams teams = new Anonymous.Orgs.Teams();

        /**
         * null
         * <p>
         * Get an Organization.
         * </p>
         * 
         * @param org
         *     Name of organisation.
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<Organization> getByOrg(String org, String Accept) {
            String url = ("https://api.github.com//orgs/{org}".replace("{org}", ""+org));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, Organization.class);
        }

        public class Events {

            /**
             * null
             * <p>
             * List public events for an organization.
             * </p>
             * 
             * @param org
             *     Name of organisation.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Event[]> getByOrg(String org, String Accept) {
                String url = ("https://api.github.com//orgs/{org}/events".replace("{org}", ""+org));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Event[].class);
            }
        }

        public class Issues {

            /**
             * null
             * <p>
             * List issues.
             * List all issues for a given organization for the authenticated user.
             * </p>
             * 
             * @param org
             *     Name of organisation.
             * @param filter
             *     Issues assigned to you / created by you / mentioning you / you're
             *     subscribed to updates for / All issues the authenticated user can see
             *     
             * @param state
             * @param labels
             *     String list of comma separated Label names. Example - bug,ui,@high.
             * @param sort
             * @param direction
             * @param since
             *     Optional string of a timestamp in ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
             *     Only issues updated at or after this time are returned.
             *     
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Issues[]> getByOrg(String org,
                api.github.com.structures.filter filter,
                api.github.com.structures.state state,
                String labels,
                api.github.com.structures.sort sort,
                api.github.com.structures.direction direction,
                String since,
                String Accept) {
                String url = ("https://api.github.com//orgs/{org}/issues".replace("{org}", ""+org)+"?"+(filter==null?"":"&filter="+flatten(filter))+(state==null?"":"&state="+flatten(state))+(labels==null?"":"&labels="+flatten(labels))+(sort==null?"":"&sort="+flatten(sort))+(direction==null?"":"&direction="+flatten(direction))+(since==null?"":"&since="+flatten(since)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Issues[].class);
            }
        }

        public class Members {

            /**
             * null
             * <p>
             * Members list.
             * List all users who are members of an organization. A member is a user tha
             * belongs to at least 1 team in the organization. If the authenticated user
             * is also an owner of this organization then both concealed and public members
             * will be returned. If the requester is not an owner of the organization the
             * query will be redirected to the public members list.
             * </p>
             * 
             * @param org
             *     Name of organisation.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.User[]> getByOrg(String org, String Accept) {
                String url = ("https://api.github.com//orgs/{org}/members".replace("{org}", ""+org));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.User[].class);
            }

            /**
             * null
             * <p>
             * Check if a user is, publicly or privately, a member of the organization.
             * </p>
             * 
             * @param org
             *     Name of organisation.
             * @param username
             *     Name of the user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getByOrgUsername(String org, String username, String Accept) {
                String url = ("https://api.github.com//orgs/{org}/members/{username}".replace("{org}", ""+org).replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }

            /**
             * null
             * <p>
             * Remove a member.
             * Removing a user from this list will remove them from all teams and they
             * will no longer have any access to the organization's repositories.
             * </p>
             * 
             * @param org
             *     Name of organisation.
             * @param username
             *     Name of the user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByOrgUsername(String org, String username, String Accept) {
                String url = ("https://api.github.com//orgs/{org}/members/{username}".replace("{org}", ""+org).replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Publicmembers {

            /**
             * null
             * <p>
             * Public members list.
             * Members of an organization can choose to have their membership publicized
             * or not.
             * </p>
             * 
             * @param org
             *     Name of organisation.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.User[]> getByOrg(String org, String Accept) {
                String url = ("https://api.github.com//orgs/{org}/public_members".replace("{org}", ""+org));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.User[].class);
            }

            /**
             * null
             * <p>
             * Check public membership.
             * </p>
             * 
             * @param org
             *     Name of organisation.
             * @param username
             *     Name of the user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getByOrgUsername(String org, String username, String Accept) {
                String url = ("https://api.github.com//orgs/{org}/public_members/{username}".replace("{org}", ""+org).replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }

            /**
             * null
             * <p>
             * Publicize a user's membership.
             * </p>
             * 
             * @param org
             *     Name of organisation.
             * @param username
             *     Name of the user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void putByOrgUsername(String org, String username, String Accept) {
                String url = ("https://api.github.com//orgs/{org}/public_members/{username}".replace("{org}", ""+org).replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestPut(url, headerProperties, null, Void.class);
            }

            /**
             * null
             * <p>
             * Conceal a user's membership.
             * </p>
             * 
             * @param org
             *     Name of organisation.
             * @param username
             *     Name of the user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByOrgUsername(String org, String username, String Accept) {
                String url = ("https://api.github.com//orgs/{org}/public_members/{username}".replace("{org}", ""+org).replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Repos {

            /**
             * null
             * <p>
             * List repositories for the specified org.
             * </p>
             * 
             * @param org
             *     Name of organisation.
             * @param type
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Repo[]> getByOrg(String org, api.github.com.structures.type type, String Accept) {
                String url = ("https://api.github.com//orgs/{org}/repos".replace("{org}", ""+org)+"?"+(type==null?"":"&type="+flatten(type)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Repo[].class);
            }

            /**
             * null
             * <p>
             * Create a new repository for the authenticated user. OAuth users must supply
             * repo scope.
             * </p>
             * 
             * @param org
             *     Name of organisation.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<Repo[]> postByOrg(String org, String Accept, PostRepo body) {
                String url = ("https://api.github.com//orgs/{org}/repos".replace("{org}", ""+org));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, Repo[].class);
            }
        }

        public class Teams {

            /**
             * null
             * <p>
             * List teams.
             * </p>
             * 
             * @param org
             *     Name of organisation.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Teams[]> getByOrg(String org, String Accept) {
                String url = ("https://api.github.com//orgs/{org}/teams".replace("{org}", ""+org));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Teams[].class);
            }

            /**
             * null
             * <p>
             * Create team.
             * In order to create a team, the authenticated user must be an owner of organization.
             * </p>
             * 
             * @param org
             *     Name of organisation.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<Team> postByOrg(String org, String Accept, OrgTeamsPost body) {
                String url = ("https://api.github.com//orgs/{org}/teams".replace("{org}", ""+org));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, Team.class);
            }
        }
    }

    public class Ratelimit {

        /**
         * null
         * <p>
         * Get your current rate limit status
         * Note: Accessing this endpoint does not count against your rate limit.
         * </p>
         * 
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<RateLimit> get(String Accept) {
            String url = ("https://api.github.com//rate_limit");
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, RateLimit.class);
        }
    }

    public class Repos {
        public final Anonymous.Repos.Assignees assignees = new Anonymous.Repos.Assignees();
        public final Anonymous.Repos.Branches branches = new Anonymous.Repos.Branches();
        public final Anonymous.Repos.Collaborators collaborators = new Anonymous.Repos.Collaborators();
        public final Anonymous.Repos.Comments comments = new Anonymous.Repos.Comments();
        public final Anonymous.Repos.Commits commits = new Anonymous.Repos.Commits();
        public final Anonymous.Repos.Compare compare = new Anonymous.Repos.Compare();
        public final Anonymous.Repos.Contents contents = new Anonymous.Repos.Contents();
        public final Anonymous.Repos.Contributors contributors = new Anonymous.Repos.Contributors();
        public final Anonymous.Repos.Deployments deployments = new Anonymous.Repos.Deployments();
        public final Anonymous.Repos.Downloads downloads = new Anonymous.Repos.Downloads();
        public final Anonymous.Repos.Events events = new Anonymous.Repos.Events();
        public final Anonymous.Repos.Forks forks = new Anonymous.Repos.Forks();
        public final Anonymous.Repos.Git git = new Anonymous.Repos.Git();
        public final Anonymous.Repos.Hooks hooks = new Anonymous.Repos.Hooks();
        public final Anonymous.Repos.Issues issues = new Anonymous.Repos.Issues();
        public final Anonymous.Repos.Keys keys = new Anonymous.Repos.Keys();
        public final Anonymous.Repos.Labels labels = new Anonymous.Repos.Labels();
        public final Anonymous.Repos.Languages languages = new Anonymous.Repos.Languages();
        public final Anonymous.Repos.Merges merges = new Anonymous.Repos.Merges();
        public final Anonymous.Repos.Milestones milestones = new Anonymous.Repos.Milestones();
        public final Anonymous.Repos.Notifications notifications = new Anonymous.Repos.Notifications();
        public final Anonymous.Repos.Pulls pulls = new Anonymous.Repos.Pulls();
        public final Anonymous.Repos.Readme readme = new Anonymous.Repos.Readme();
        public final Anonymous.Repos.Releases releases = new Anonymous.Repos.Releases();
        public final Anonymous.Repos.Stargazers stargazers = new Anonymous.Repos.Stargazers();
        public final Anonymous.Repos.Stats stats = new Anonymous.Repos.Stats();
        public final Anonymous.Repos.Statuses statuses = new Anonymous.Repos.Statuses();
        public final Anonymous.Repos.Subscribers subscribers = new Anonymous.Repos.Subscribers();
        public final Anonymous.Repos.Subscription subscription = new Anonymous.Repos.Subscription();
        public final Anonymous.Repos.Tags tags = new Anonymous.Repos.Tags();
        public final Anonymous.Repos.Teams teams = new Anonymous.Repos.Teams();
        public final Anonymous.Repos.Watchers watchers = new Anonymous.Repos.Watchers();

        /**
         * null
         * <p>
         * Get repository.
         * </p>
         * 
         * @param owner
         *     Name of repository owner.
         * @param repo
         *     Name of repository.
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<Repo> getByOwnerRepo(String owner, String repo, String Accept) {
            String url = ("https://api.github.com//repos/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, Repo.class);
        }

        /**
         * null
         * <p>
         * Delete a Repository.
         * Deleting a repository requires admin access. If OAuth is used, the delete_repo
         * scope is required.
         * </p>
         * 
         * @param owner
         *     Name of repository owner.
         * @param repo
         *     Name of repository.
         * @param Accept
         *     Is used to set specified media type.
         */
        public void deleteByOwnerRepo(String owner, String repo, String Accept) {
            String url = ("https://api.github.com//repos/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            requestDel(url, headerProperties);
        }

        /**
         * null
         * <p>
         * Get archive link.
         * This method will return a 302 to a URL to download a tarball or zipball
         * archive for a repository. Please make sure your HTTP framework is
         * configured to follow redirects or you will need to use the Location header
         * to make a second GET request.
         * Note: For private repositories, these links are temporary and expire quickly.
         * </p>
         * 
         * @param owner
         *     Name of repository owner.
         * @param repo
         *     Name of repository.
         * @param archive_format
         * @param path
         *     Valid Git reference, defaults to 'master'.
         * @param Accept
         *     Is used to set specified media type.
         */
        public void getByOwnerRepoArchiveformatPath(String owner,
            String repo,
            api.github.com.structures.archive_format archive_format,
            String path,
            String Accept) {
            String url = ("https://api.github.com//repos/{owner}/{repo}/{archive_format}/{path}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{archive_format}", ""+archive_format).replace("{path}", ""+path));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            requestGet(url, headerProperties, Void.class);
        }

        public class Assignees {

            /**
             * null
             * <p>
             * List assignees.
             * This call lists all the available assignees (owner + collaborators) to which
             * issues may be assigned.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.User[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/assignees".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.User[].class);
            }

            /**
             * null
             * <p>
             * Check assignee.
             * You may also check to see if a particular user is an assignee for a repository.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param assignee
             *     Login of the assignee.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getByOwnerRepoAssignee(String owner,
                String repo,
                String assignee,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/assignees/{assignee}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{assignee}", ""+assignee));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }
        }

        public class Branches {

            /**
             * null
             * <p>
             * Get list of branches
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Branches[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/branches".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Branches[].class);
            }

            /**
             * null
             * <p>
             * Get Branch
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param branch
             *     Name of the branch.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Branch> getByOwnerRepoBranch(String owner,
                String repo,
                String branch,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/branches/{branch}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{branch}", ""+branch));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Branch.class);
            }
        }

        public class Collaborators {

            /**
             * null
             * <p>
             * List.
             * When authenticating as an organization owner of an organization-owned
             * repository, all organization owners are included in the list of
             * collaborators. Otherwise, only users with access to the repository are
             * returned in the collaborators list.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.User[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/collaborators".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.User[].class);
            }

            /**
             * null
             * <p>
             * Check if user is a collaborator
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param user
             *     Login of the user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getByOwnerRepoUser(String owner,
                String repo,
                String user,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/collaborators/{user}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{user}", ""+user));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }

            /**
             * null
             * <p>
             * Add collaborator.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param user
             *     Login of the user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void putByOwnerRepoUser(String owner,
                String repo,
                String user,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/collaborators/{user}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{user}", ""+user));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestPut(url, headerProperties, null, Void.class);
            }

            /**
             * null
             * <p>
             * Remove collaborator.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param user
             *     Login of the user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByOwnerRepoUser(String owner,
                String repo,
                String user,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/collaborators/{user}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{user}", ""+user));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Comments {

            /**
             * null
             * <p>
             * List commit comments for a repository.
             * Comments are ordered by ascending ID.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<RepoComments[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, RepoComments[].class);
            }

            /**
             * null
             * <p>
             * Get a single commit comment.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param commentId
             *     Id of comment.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<CommitComment> getByOwnerRepoCommentid(String owner,
                String repo,
                long commentId,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/comments/{commentId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{commentId}", ""+commentId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, CommitComment.class);
            }

            /**
             * null
             * <p>
             * Delete a commit comment
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param commentId
             *     Id of comment.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByOwnerRepoCommentid(String owner,
                String repo,
                long commentId,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/comments/{commentId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{commentId}", ""+commentId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Commits {
            public final Anonymous.Repos.Commits.Status status = new Anonymous.Repos.Commits.Status();
            public final Anonymous.Repos.Commits.Comments comments = new Anonymous.Repos.Commits.Comments();

            /**
             * null
             * <p>
             * List commits on a repository.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param since
             *     The time should be passed in as UTC in the ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
             *     Example: "2012-10-09T23:39:01Z".
             *     
             * @param sha
             *     Sha or branch to start listing commits from.
             * @param path
             *     Only commits containing this file path will be returned.
             * @param author
             *     GitHub login, name, or email by which to filter by commit author.
             * @param until
             *     ISO 8601 Date - Only commits before this date will be returned.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Commits[]> getByOwnerRepo(String owner,
                String repo,
                String since,
                String sha,
                String path,
                String author,
                String until,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/commits".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(since==null?"":"&since="+flatten(since))+(sha==null?"":"&sha="+flatten(sha))+(path==null?"":"&path="+flatten(path))+(author==null?"":"&author="+flatten(author))+(until==null?"":"&until="+flatten(until)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Commits[].class);
            }

            /**
             * null
             * <p>
             * Get a single commit.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param shaCode
             *     SHA-1 code of the commit.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Commit> getByOwnerRepoShacode(String owner,
                String repo,
                String shaCode,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/commits/{shaCode}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{shaCode}", ""+shaCode));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Commit.class);
            }

            public class Comments {

                /**
                 * null
                 * <p>
                 * List comments for a single commitList comments for a single commit.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param shaCode
                 *     SHA-1 code of the commit.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<RepoComments[]> getByOwnerRepoShacode(String owner,
                    String repo,
                    String shaCode,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/commits/{shaCode}/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{shaCode}", ""+shaCode));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, RepoComments[].class);
                }

                /**
                 * null
                 * <p>
                 * Create a commit comment.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param shaCode
                 *     SHA-1 code of the commit.
                 * @param Accept
                 *     Is used to set specified media type.
                 * @param body
                 */
                public Requested<CommitComment> postByOwnerRepoShacode(String owner,
                    String repo,
                    String shaCode,
                    String Accept,
                    CommitCommentBody body) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/commits/{shaCode}/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{shaCode}", ""+shaCode));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    Map<String, Object> content = new HashMap<>();
                    content.put("body", body);
                    return requestPost(url, headerProperties, content, CommitComment.class);
                }
            }

            public class Status {

                /**
                 * null
                 * <p>
                 * Get the combined Status for a specific Ref
                 * The Combined status endpoint is currently available for developers to preview. During the preview period, the API may change without advance notice. Please see the blog post for full details.
                 * To access this endpoint during the preview period, you must provide a custom media type in the Accept header:
                 * application/vnd.github.she-hulk-preview+json
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param ref
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<RefStatus[]> getByOwnerRepoRef(String owner,
                    String repo,
                    String ref,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/commits/{ref}/status".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{ref}", ""+ref));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, RefStatus[].class);
                }
            }
        }

        public class Compare {

            /**
             * null
             * <p>
             * Compare two commits
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param baseId
             * @param headId
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<CompareCommits> getByOwnerRepoBaseidheadid(String owner,
                String repo,
                String baseId,
                String headId,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/compare/{baseId}...{headId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{baseId}", ""+baseId).replace("{headId}", ""+headId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, CompareCommits.class);
            }
        }

        public class Contents {

            /**
             * null
             * <p>
             * Get contents.
             * This method returns the contents of a file or directory in a repository.
             * Files and symlinks support a custom media type for getting the raw content.
             * Directories and submodules do not support custom media types.
             * Note: This API supports files up to 1 megabyte in size.
             * Here can be many outcomes. For details see "http://developer.github.com/v3/repos/contents/"
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param path
             *     The content path.
             * @param ref
             *     The String name of the Commit/Branch/Tag. Defaults to 'master'.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<ContentsPath> getByOwnerRepoPath(String owner,
                String repo,
                String path,
                String path,
                String ref,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/contents/{path}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{path}", ""+path)+"?"+(path==null?"":"&path="+flatten(path))+(ref==null?"":"&ref="+flatten(ref)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, ContentsPath.class);
            }

            /**
             * null
             * <p>
             * Create a file.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param path
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<CreateFile> putByOwnerRepoPath(String owner,
                String repo,
                String path,
                String Accept,
                CreateFileBody body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/contents/{path}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{path}", ""+path));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPut(url, headerProperties, content, CreateFile.class);
            }

            /**
             * null
             * <p>
             * Delete a file.
             * This method deletes a file in a repository.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param path
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<DeleteFile> deleteByOwnerRepoPath(String owner,
                String repo,
                String path,
                String Accept,
                DeleteFileBody body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/contents/{path}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{path}", ""+path));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestDel(url, headerProperties);
            }
        }

        public class Contributors {

            /**
             * null
             * <p>
             * Get list of contributors.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param anon
             *     Set to 1 or true to include anonymous contributors in results.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.User[]> getByOwnerRepo(String owner,
                String repo,
                String anon,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/contributors".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(anon==null?"":"&anon="+flatten(anon)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.User[].class);
            }
        }

        public class Deployments {
            public final Anonymous.Repos.Deployments.Statuses statuses = new Anonymous.Repos.Deployments.Statuses();

            /**
             * null
             * <p>
             * Users with pull access can view deployments for a repository
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<RepoDeployments[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/deployments".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, RepoDeployments[].class);
            }

            /**
             * null
             * <p>
             * Users with push access can create a deployment for a given ref
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<DeploymentResp> postByOwnerRepo(String owner,
                String repo,
                String Accept,
                Deployment body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/deployments".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, DeploymentResp.class);
            }

            public class Statuses {

                /**
                 * null
                 * <p>
                 * Users with pull access can view deployment statuses for a deployment
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param id
                 *     The Deployment ID to list the statuses from.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<DeploymentStatuses[]> getByOwnerRepoId(String owner,
                    String repo,
                    long id,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/deployments/{id}/statuses".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{id}", ""+id));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, DeploymentStatuses[].class);
                }

                /**
                 * null
                 * <p>
                 * Create a Deployment Status
                 * Users with push access can create deployment statuses for a given deployment:
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param id
                 *     The Deployment ID to list the statuses from.
                 * @param Accept
                 *     Is used to set specified media type.
                 * @param body
                 */
                public void postByOwnerRepoId(String owner,
                    String repo,
                    long id,
                    String Accept,
                    DeploymentStatusesCreate body) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/deployments/{id}/statuses".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{id}", ""+id));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    Map<String, Object> content = new HashMap<>();
                    content.put("body", body);
                    requestPost(url, headerProperties, content, Void.class);
                }
            }
        }

        public class Downloads {

            /**
             * null
             * <p>
             * Deprecated. List downloads for a repository.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Download[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/downloads".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Download[].class);
            }

            /**
             * null
             * <p>
             * Deprecated. Get a single download.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param downloadId
             *     Id of download.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Download> getByOwnerRepoDownloadid(String owner,
                String repo,
                long downloadId,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/downloads/{downloadId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{downloadId}", ""+downloadId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Download.class);
            }

            /**
             * null
             * <p>
             * Deprecated. Delete a download.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param downloadId
             *     Id of download.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByOwnerRepoDownloadid(String owner,
                String repo,
                long downloadId,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/downloads/{downloadId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{downloadId}", ""+downloadId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Events {

            /**
             * null
             * <p>
             * Get list of repository events.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Event[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/events".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Event[].class);
            }
        }

        public class Forks {

            /**
             * null
             * <p>
             * List forks.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param sort
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Repo[]> getByOwnerRepo(String owner,
                String repo,
                api.github.com.structures.sort sort,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/forks".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(sort==null?"":"&sort="+flatten(sort)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Repo[].class);
            }

            /**
             * null
             * <p>
             * Create a fork.
             * Forking a Repository happens asynchronously. Therefore, you may have to wai
             * a short period before accessing the git objects. If this takes longer than 5
             * minutes, be sure to contact Support.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<Repo> postByOwnerRepo(String owner,
                String repo,
                String Accept,
                ForkBody body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/forks".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, Repo.class);
            }
        }

        public class Git {
            public final Anonymous.Repos.Git.Blobs blobs = new Anonymous.Repos.Git.Blobs();
            public final Anonymous.Repos.Git.Commits commits = new Anonymous.Repos.Git.Commits();
            public final Anonymous.Repos.Git.Refs refs = new Anonymous.Repos.Git.Refs();
            public final Anonymous.Repos.Git.Tags tags = new Anonymous.Repos.Git.Tags();
            public final Anonymous.Repos.Git.Trees trees = new Anonymous.Repos.Git.Trees();

            public class Blobs {

                /**
                 * null
                 * <p>
                 * Create a Blob.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param Accept
                 *     Is used to set specified media type.
                 * @param body
                 */
                public Requested<api.github.com.definitions.Blobs> postByOwnerRepo(String owner,
                    String repo,
                    String Accept,
                    Blob body) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/git/blobs".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    Map<String, Object> content = new HashMap<>();
                    content.put("body", body);
                    return requestPost(url, headerProperties, content, api.github.com.definitions.Blobs.class);
                }

                /**
                 * null
                 * <p>
                 * Get a Blob.
                 * Since blobs can be any arbitrary binary data, the input and responses for
                 * the blob API takes an encoding parameter that can be either utf-8 or
                 * base64. If your data cannot be losslessly sent as a UTF-8 string, you can
                 * base64 encode it.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param shaCode
                 *     SHA-1 code.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<Blob> getByOwnerRepoShacode(String owner,
                    String repo,
                    String shaCode,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/git/blobs/{shaCode}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{shaCode}", ""+shaCode));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, Blob.class);
                }
            }

            public class Commits {

                /**
                 * null
                 * <p>
                 * Create a Commit.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param Accept
                 *     Is used to set specified media type.
                 * @param body
                 */
                public Requested<GitCommit> postByOwnerRepo(String owner,
                    String repo,
                    String Accept,
                    RepoCommitBody body) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/git/commits".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    Map<String, Object> content = new HashMap<>();
                    content.put("body", body);
                    return requestPost(url, headerProperties, content, GitCommit.class);
                }

                /**
                 * null
                 * <p>
                 * Get a Commit.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param shaCode
                 *     SHA-1 code.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<RepoCommit> getByOwnerRepoShacode(String owner,
                    String repo,
                    String shaCode,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/git/commits/{shaCode}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{shaCode}", ""+shaCode));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, RepoCommit.class);
                }
            }

            public class Refs {

                /**
                 * null
                 * <p>
                 * Get all References
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<api.github.com.definitions.Refs[]> getByOwnerRepo(String owner, String repo, String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/git/refs".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, api.github.com.definitions.Refs[].class);
                }

                /**
                 * null
                 * <p>
                 * Create a Reference
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param Accept
                 *     Is used to set specified media type.
                 * @param body
                 */
                public Requested<HeadBranch> postByOwnerRepo(String owner,
                    String repo,
                    String Accept,
                    RefsBody body) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/git/refs".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    Map<String, Object> content = new HashMap<>();
                    content.put("body", body);
                    return requestPost(url, headerProperties, content, HeadBranch.class);
                }

                /**
                 * null
                 * <p>
                 * Get a Reference
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param ref
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<HeadBranch> getByOwnerRepoRef(String owner,
                    String repo,
                    String ref,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/git/refs/{ref}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{ref}", ""+ref));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, HeadBranch.class);
                }

                /**
                 * null
                 * <p>
                 * Delete a Reference
                 * Example: Deleting a branch: DELETE /repos/octocat/Hello-World/git/refs/heads/feature-a 
                 * Example: Deleting a tag:        DELETE /repos/octocat/Hello-World/git/refs/tags/v1.0
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param ref
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public void deleteByOwnerRepoRef(String owner,
                    String repo,
                    String ref,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/git/refs/{ref}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{ref}", ""+ref));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    requestDel(url, headerProperties);
                }
            }

            public class Tags {

                /**
                 * null
                 * <p>
                 * Create a Tag Object.
                 * Note that creating a tag object does not create the reference that makes a
                 * tag in Git. If you want to create an annotated tag in Git, you have to do
                 * this call to create the tag object, and then create the refs/tags/[tag]
                 * reference. If you want to create a lightweight tag, you only have to create
                 * the tag reference - this call would be unnecessary.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param Accept
                 *     Is used to set specified media type.
                 * @param body
                 */
                public Requested<Tag> postByOwnerRepo(String owner,
                    String repo,
                    String Accept,
                    TagBody body) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/git/tags".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    Map<String, Object> content = new HashMap<>();
                    content.put("body", body);
                    return requestPost(url, headerProperties, content, Tag.class);
                }

                /**
                 * null
                 * <p>
                 * Get a Tag.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param shaCode
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<Tag> getByOwnerRepoShacode(String owner,
                    String repo,
                    String shaCode,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/git/tags/{shaCode}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{shaCode}", ""+shaCode));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, Tag.class);
                }
            }

            public class Trees {

                /**
                 * null
                 * <p>
                 * Create a Tree.
                 * The tree creation API will take nested entries as well. If both a tree and
                 * a nested path modifying that tree are specified, it will overwrite the
                 * contents of that tree with the new path contents and write a new tree out.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param Accept
                 *     Is used to set specified media type.
                 * @param body
                 */
                public Requested<api.github.com.definitions.Trees> postByOwnerRepo(String owner,
                    String repo,
                    String Accept,
                    Tree body) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/git/trees".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    Map<String, Object> content = new HashMap<>();
                    content.put("body", body);
                    return requestPost(url, headerProperties, content, api.github.com.definitions.Trees.class);
                }

                /**
                 * null
                 * <p>
                 * Get a Tree.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param shaCode
                 *     Tree SHA.
                 * @param recursive
                 *     Get a Tree Recursively. (0 or 1)
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<Tree> getByOwnerRepoShacode(String owner,
                    String repo,
                    String shaCode,
                    Long recursive,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/git/trees/{shaCode}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{shaCode}", ""+shaCode)+"?"+(recursive==null?"":"&recursive="+flatten(recursive)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, Tree.class);
                }
            }
        }

        public class Hooks {
            public final Anonymous.Repos.Hooks.Tests tests = new Anonymous.Repos.Hooks.Tests();

            /**
             * null
             * <p>
             * Get list of hooks.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Hook[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/hooks".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Hook[].class);
            }

            /**
             * null
             * <p>
             * Create a hook.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<Hook[]> postByOwnerRepo(String owner,
                String repo,
                String Accept,
                HookBody body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/hooks".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, Hook[].class);
            }

            /**
             * null
             * <p>
             * Get single hook.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param hookId
             *     Id of hook.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Hook[]> getByOwnerRepoHookid(String owner,
                String repo,
                long hookId,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/hooks/{hookId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{hookId}", ""+hookId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Hook[].class);
            }

            /**
             * null
             * <p>
             * Delete a hook.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param hookId
             *     Id of hook.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByOwnerRepoHookid(String owner,
                String repo,
                long hookId,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/hooks/{hookId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{hookId}", ""+hookId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }

            public class Tests {

                /**
                 * null
                 * <p>
                 * Test a push hook.
                 * This will trigger the hook with the latest push to the current repository
                 * if the hook is subscribed to push events. If the hook is not subscribed
                 * to push events, the server will respond with 204 but no test POST will
                 * be generated.
                 * Note: Previously /repos/:owner/:repo/hooks/:id/tes
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param hookId
                 *     Id of hook.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public void postByOwnerRepoHookid(String owner,
                    String repo,
                    long hookId,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/hooks/{hookId}/tests".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{hookId}", ""+hookId));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    requestPost(url, headerProperties, null, Void.class);
                }
            }
        }

        public class Issues {
            public final Anonymous.Repos.Issues.Comments comments = new Anonymous.Repos.Issues.Comments();
            public final Anonymous.Repos.Issues.Events events = new Anonymous.Repos.Issues.Events();
            public final Anonymous.Repos.Issues.Labels labels = new Anonymous.Repos.Issues.Labels();

            /**
             * null
             * <p>
             * List issues for a repository.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param filter
             *     Issues assigned to you / created by you / mentioning you / you're
             *     subscribed to updates for / All issues the authenticated user can see
             *     
             * @param state
             * @param labels
             *     String list of comma separated Label names. Example - bug,ui,@high.
             * @param sort
             * @param direction
             * @param since
             *     Optional string of a timestamp in ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
             *     Only issues updated at or after this time are returned.
             *     
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Issues[]> getByOwnerRepo(String owner,
                String repo,
                api.github.com.structures.filter filter,
                api.github.com.structures.state state,
                String labels,
                api.github.com.structures.sort sort,
                api.github.com.structures.direction direction,
                String since,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/issues".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(filter==null?"":"&filter="+flatten(filter))+(state==null?"":"&state="+flatten(state))+(labels==null?"":"&labels="+flatten(labels))+(sort==null?"":"&sort="+flatten(sort))+(direction==null?"":"&direction="+flatten(direction))+(since==null?"":"&since="+flatten(since)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Issues[].class);
            }

            /**
             * null
             * <p>
             * Create an issue.
             * Any user with pull access to a repository can create an issue.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<Issue> postByOwnerRepo(String owner,
                String repo,
                String Accept,
                Issue body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/issues".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, Issue.class);
            }

            /**
             * null
             * <p>
             * Get a single issue
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param number
             *     Number of issue.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Issue> getByOwnerRepoNumber(String owner,
                String repo,
                long number,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Issue.class);
            }

            public class Comments {

                /**
                 * null
                 * <p>
                 * List comments in a repository.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param direction
                 *     Ignored without 'sort' parameter.
                 * @param sort
                 *     
                 * @param since
                 *     The time should be passed in as UTC in the ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
                 *     Example: "2012-10-09T23:39:01Z".
                 *     
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<IssuesComments[]> getByOwnerRepo(String owner,
                    String repo,
                    String direction,
                    api.github.com.structures.sort sort,
                    String since,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/issues/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(direction==null?"":"&direction="+flatten(direction))+(sort==null?"":"&sort="+flatten(sort))+(since==null?"":"&since="+flatten(since)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, IssuesComments[].class);
                }

                /**
                 * null
                 * <p>
                 * Get a single comment.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param commentId
                 *     ID of comment.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<IssuesComment> getByOwnerRepoCommentid(String owner,
                    String repo,
                    long commentId,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/issues/comments/{commentId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{commentId}", ""+commentId));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, IssuesComment.class);
                }

                /**
                 * null
                 * <p>
                 * Delete a comment.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param commentId
                 *     ID of comment.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public void deleteByOwnerRepoCommentid(String owner,
                    String repo,
                    long commentId,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/issues/comments/{commentId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{commentId}", ""+commentId));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    requestDel(url, headerProperties);
                }

                /**
                 * null
                 * <p>
                 * List comments on an issue.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Number of issue.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<IssuesComments[]> getByOwnerRepoNumber(String owner,
                    String repo,
                    long number,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, IssuesComments[].class);
                }

                /**
                 * null
                 * <p>
                 * Create a comment.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Number of issue.
                 * @param Accept
                 *     Is used to set specified media type.
                 * @param body
                 */
                public Requested<IssuesComment> postByOwnerRepoNumber(String owner,
                    String repo,
                    long number,
                    String Accept,
                    CommentBody body) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    Map<String, Object> content = new HashMap<>();
                    content.put("body", body);
                    return requestPost(url, headerProperties, content, IssuesComment.class);
                }
            }

            public class Events {

                /**
                 * null
                 * <p>
                 * List issue events for a repository.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<IssueEvent[]> getByOwnerRepo(String owner, String repo, String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/issues/events".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, IssueEvent[].class);
                }

                /**
                 * null
                 * <p>
                 * Get a single event.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param eventId
                 *     Id of the event.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<IssueEvent> getByOwnerRepoEventid(String owner,
                    String repo,
                    long eventId,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/issues/events/{eventId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{eventId}", ""+eventId));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, IssueEvent.class);
                }

                /**
                 * null
                 * <p>
                 * List events for an issue.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Number of issue.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<IssueEvent[]> getByOwnerRepoNumber(String owner,
                    String repo,
                    long number,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/events".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, IssueEvent[].class);
                }
            }

            public class Labels {

                /**
                 * null
                 * <p>
                 * List labels on an issue.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Number of issue.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<api.github.com.definitions.Labels[]> getByOwnerRepoNumber(String owner,
                    String repo,
                    long number,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/labels".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, api.github.com.definitions.Labels[].class);
                }

                /**
                 * null
                 * <p>
                 * Add labels to an issue.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Number of issue.
                 * @param Accept
                 *     Is used to set specified media type.
                 * @param body
                 */
                public Requested<Label> postByOwnerRepoNumber(String owner,
                    String repo,
                    long number,
                    String Accept,
                    String[] body) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/labels".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    Map<String, Object> content = new HashMap<>();
                    content.put("body", body);
                    return requestPost(url, headerProperties, content, Label.class);
                }

                /**
                 * null
                 * <p>
                 * Replace all labels for an issue.
                 * Sending an empty array ([]) will remove all Labels from the Issue.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Number of issue.
                 * @param Accept
                 *     Is used to set specified media type.
                 * @param body
                 */
                public Requested<Label> putByOwnerRepoNumber(String owner,
                    String repo,
                    long number,
                    String Accept,
                    String[] body) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/labels".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    Map<String, Object> content = new HashMap<>();
                    content.put("body", body);
                    return requestPut(url, headerProperties, content, Label.class);
                }

                /**
                 * null
                 * <p>
                 * Remove all labels from an issue.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Number of issue.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public void deleteByOwnerRepoNumber(String owner,
                    String repo,
                    long number,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/labels".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    requestDel(url, headerProperties);
                }

                /**
                 * null
                 * <p>
                 * Remove a label from an issue.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Number of issue.
                 * @param name
                 *     Name of the label.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public void deleteByOwnerRepoNumberName(String owner,
                    String repo,
                    long number,
                    String name,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/labels/{name}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number).replace("{name}", ""+name));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    requestDel(url, headerProperties);
                }
            }
        }

        public class Keys {

            /**
             * null
             * <p>
             * Get list of keys.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Keys[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/keys".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Keys[].class);
            }

            /**
             * null
             * <p>
             * Create a key.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<UserKeysKeyId> postByOwnerRepo(String owner,
                String repo,
                String Accept,
                UserKeysPost body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/keys".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, UserKeysKeyId.class);
            }

            /**
             * null
             * <p>
             * Get a key
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param keyId
             *     Id of key.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<UserKeysKeyId> getByOwnerRepoKeyid(String owner,
                String repo,
                long keyId,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/keys/{keyId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{keyId}", ""+keyId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, UserKeysKeyId.class);
            }

            /**
             * null
             * <p>
             * Delete a key.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param keyId
             *     Id of key.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByOwnerRepoKeyid(String owner,
                String repo,
                long keyId,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/keys/{keyId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{keyId}", ""+keyId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Labels {

            /**
             * null
             * <p>
             * List all labels for this repository.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Labels[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/labels".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Labels[].class);
            }

            /**
             * null
             * <p>
             * Create a label.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<Label> postByOwnerRepo(String owner,
                String repo,
                String Accept,
                String[] body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/labels".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, Label.class);
            }

            /**
             * null
             * <p>
             * Get a single label.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param name
             *     Name of the label.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Label> getByOwnerRepoName(String owner,
                String repo,
                String name,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/labels/{name}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{name}", ""+name));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Label.class);
            }

            /**
             * null
             * <p>
             * Delete a label.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param name
             *     Name of the label.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByOwnerRepoName(String owner,
                String repo,
                String name,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/labels/{name}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{name}", ""+name));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Languages {

            /**
             * null
             * <p>
             * List languages.
             * List languages for the specified repository. The value on the right of a
             * language is the number of bytes of code written in that language.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<HashMap<String, Integer>> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/languages".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, HashMap.class);
            }
        }

        public class Merges {

            /**
             * null
             * <p>
             * Perform a merge.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<MergesSuccessful> postByOwnerRepo(String owner,
                String repo,
                String Accept,
                MergesBody body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/merges".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, MergesSuccessful.class);
            }
        }

        public class Milestones {
            public final Anonymous.Repos.Milestones.Labels labels = new Anonymous.Repos.Milestones.Labels();

            /**
             * null
             * <p>
             * List milestones for a repository.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param state
             *     String to filter by state.
             * @param direction
             *     Ignored without 'sort' parameter.
             * @param sort
             *     
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Milestone> getByOwnerRepo(String owner,
                String repo,
                api.github.com.structures.state state,
                String direction,
                api.github.com.structures.sort sort,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/milestones".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(state==null?"":"&state="+flatten(state))+(direction==null?"":"&direction="+flatten(direction))+(sort==null?"":"&sort="+flatten(sort)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Milestone.class);
            }

            /**
             * null
             * <p>
             * Create a milestone.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<Milestone> postByOwnerRepo(String owner,
                String repo,
                String Accept,
                MilestoneUpdate body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/milestones".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, Milestone.class);
            }

            /**
             * null
             * <p>
             * Get a single milestone.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param number
             *     Number of milestone.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Milestone> getByOwnerRepoNumber(String owner,
                String repo,
                long number,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/milestones/{number}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Milestone.class);
            }

            /**
             * null
             * <p>
             * Delete a milestone.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param number
             *     Number of milestone.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByOwnerRepoNumber(String owner,
                String repo,
                long number,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/milestones/{number}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }

            public class Labels {

                /**
                 * null
                 * <p>
                 * Get labels for every issue in a milestone.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Number of milestone.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<api.github.com.definitions.Labels[]> getByOwnerRepoNumber(String owner,
                    String repo,
                    long number,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/milestones/{number}/labels".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, api.github.com.definitions.Labels[].class);
                }
            }
        }

        public class Notifications {

            /**
             * null
             * <p>
             * List your notifications in a repository
             * List all notifications for the current user.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param all
             *     True to show notifications marked as read.
             * @param participating
             *     True to show only notifications in which the user is directly participating
             *     or mentioned.
             *     
             * @param since
             *     The time should be passed in as UTC in the ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
             *     Example: "2012-10-09T23:39:01Z".
             *     
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Notifications> getByOwnerRepo(String owner,
                String repo,
                Boolean all,
                Boolean participating,
                String since,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/notifications".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(all==null?"":"&all="+flatten(all))+(participating==null?"":"&participating="+flatten(participating))+(since==null?"":"&since="+flatten(since)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Notifications.class);
            }

            /**
             * null
             * <p>
             * Mark notifications as read in a repository.
             * Marking all notifications in a repository as "read" removes them from the
             * default view on GitHub.com.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public void putByOwnerRepo(String owner,
                String repo,
                String Accept,
                NotificationMarkRead body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/notifications".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                requestPut(url, headerProperties, content, Void.class);
            }
        }

        public class Pulls {
            public final Anonymous.Repos.Pulls.Comments comments = new Anonymous.Repos.Pulls.Comments();
            public final Anonymous.Repos.Pulls.Commits commits = new Anonymous.Repos.Pulls.Commits();
            public final Anonymous.Repos.Pulls.Files files = new Anonymous.Repos.Pulls.Files();
            public final Anonymous.Repos.Pulls.Merge merge = new Anonymous.Repos.Pulls.Merge();

            /**
             * null
             * <p>
             * List pull requests.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param state
             *     String to filter by state.
             * @param head
             *     Filter pulls by head user and branch name in the format of 'user:ref-name'.
             *     Example: github:new-script-format.
             *     
             * @param base
             *     Filter pulls by base branch name. Example - gh-pages.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Pulls[]> getByOwnerRepo(String owner,
                String repo,
                api.github.com.structures.state state,
                String head,
                String base,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/pulls".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(state==null?"":"&state="+flatten(state))+(head==null?"":"&head="+flatten(head))+(base==null?"":"&base="+flatten(base)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Pulls[].class);
            }

            /**
             * null
             * <p>
             * Create a pull request.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<api.github.com.definitions.Pulls[]> postByOwnerRepo(String owner,
                String repo,
                String Accept,
                PullsPost body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/pulls".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, api.github.com.definitions.Pulls[].class);
            }

            /**
             * null
             * <p>
             * Get a single pull request.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param number
             *     Id of pull.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<PullRequest> getByOwnerRepoNumber(String owner,
                String repo,
                long number,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/{number}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, PullRequest.class);
            }

            public class Comments {

                /**
                 * null
                 * <p>
                 * List comments in a repository.
                 * By default, Review Comments are ordered by ascending ID.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param direction
                 *     Ignored without 'sort' parameter.
                 * @param sort
                 *     
                 * @param since
                 *     The time should be passed in as UTC in the ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
                 *     Example: "2012-10-09T23:39:01Z".
                 *     
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<IssuesComments[]> getByOwnerRepo(String owner,
                    String repo,
                    String direction,
                    api.github.com.structures.sort sort,
                    String since,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(direction==null?"":"&direction="+flatten(direction))+(sort==null?"":"&sort="+flatten(sort))+(since==null?"":"&since="+flatten(since)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, IssuesComments[].class);
                }

                /**
                 * null
                 * <p>
                 * Get a single comment.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param commentId
                 *     Id of comment.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<PullsComment> getByOwnerRepoCommentid(String owner,
                    String repo,
                    long commentId,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/comments/{commentId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{commentId}", ""+commentId));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, PullsComment.class);
                }

                /**
                 * null
                 * <p>
                 * Delete a comment.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param commentId
                 *     Id of comment.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public void deleteByOwnerRepoCommentid(String owner,
                    String repo,
                    long commentId,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/comments/{commentId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{commentId}", ""+commentId));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    requestDel(url, headerProperties);
                }

                /**
                 * null
                 * <p>
                 * List comments on a pull request.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Id of pull.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<PullsComment> getByOwnerRepoNumber(String owner,
                    String repo,
                    long number,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/{number}/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, PullsComment.class);
                }

                /**
                 * null
                 * <p>
                 * Create a comment.
                 *   #TODO Alternative input ( http://developer.github.com/v3/pulls/comments/ )
                 *   description: |
                 *     Alternative Input.
                 *     Instead of passing commit_id, path, and position you can reply to an
                 *     existing Pull Request Comment like this:
                 *         body
                 *            Required string
                 *         in_reply_to
                 *            Required number - Comment id to reply to.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Id of pull.
                 * @param Accept
                 *     Is used to set specified media type.
                 * @param body
                 */
                public Requested<PullsComment> postByOwnerRepoNumber(String owner,
                    String repo,
                    long number,
                    String Accept,
                    PullsCommentPost body) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/{number}/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    Map<String, Object> content = new HashMap<>();
                    content.put("body", body);
                    return requestPost(url, headerProperties, content, PullsComment.class);
                }
            }

            public class Commits {

                /**
                 * null
                 * <p>
                 * List commits on a pull request.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Id of pull.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<api.github.com.definitions.Commits[]> getByOwnerRepoNumber(String owner,
                    String repo,
                    long number,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/{number}/commits".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, api.github.com.definitions.Commits[].class);
                }
            }

            public class Files {

                /**
                 * null
                 * <p>
                 * List pull requests files.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Id of pull.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<api.github.com.definitions.Pulls[]> getByOwnerRepoNumber(String owner,
                    String repo,
                    long number,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/{number}/files".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, api.github.com.definitions.Pulls[].class);
                }
            }

            public class Merge {

                /**
                 * null
                 * <p>
                 * Get if a pull request has been merged.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Id of pull.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public void getByOwnerRepoNumber(String owner,
                    String repo,
                    long number,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/{number}/merge".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    requestGet(url, headerProperties, Void.class);
                }

                /**
                 * null
                 * <p>
                 * Merge a pull request (Merge Button's)
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param number
                 *     Id of pull.
                 * @param Accept
                 *     Is used to set specified media type.
                 * @param body
                 */
                public Requested<api.github.com.definitions.Merge> putByOwnerRepoNumber(String owner,
                    String repo,
                    long number,
                    String Accept,
                    MergePullBody body) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/{number}/merge".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    Map<String, Object> content = new HashMap<>();
                    content.put("body", body);
                    return requestPut(url, headerProperties, content, api.github.com.definitions.Merge.class);
                }
            }
        }

        public class Readme {

            /**
             * null
             * <p>
             * Get the README.
             * This method returns the preferred README for a repository.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param ref
             *     The String name of the Commit/Branch/Tag. Defaults to master.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<ContentsPath> getByOwnerRepo(String owner,
                String repo,
                String ref,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/readme".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(ref==null?"":"&ref="+flatten(ref)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, ContentsPath.class);
            }
        }

        public class Releases {
            public final Anonymous.Repos.Releases.Assets assets = new Anonymous.Repos.Releases.Assets();

            /**
             * null
             * <p>
             * Users with push access to the repository will receive all releases (i.e., published releases and draft releases). Users with pull access will receive published releases only
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Releases[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/releases".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Releases[].class);
            }

            /**
             * null
             * <p>
             * Create a release
             * Users with push access to the repository can create a release.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<Release> postByOwnerRepo(String owner,
                String repo,
                String Accept,
                ReleaseCreate body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/releases".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, Release.class);
            }

            /**
             * null
             * <p>
             * Get a single release
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param id
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Release> getByOwnerRepoId(String owner,
                String repo,
                String id,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/releases/{id}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{id}", ""+id));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Release.class);
            }

            /**
             * null
             * <p>
             * Users with push access to the repository can delete a release.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param id
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByOwnerRepoId(String owner,
                String repo,
                String id,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/releases/{id}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{id}", ""+id));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }

            public class Assets {

                /**
                 * null
                 * <p>
                 * Get a single release asset
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param id
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<Asset> getByOwnerRepoId(String owner,
                    String repo,
                    String id,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/releases/assets/{id}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{id}", ""+id));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, Asset.class);
                }

                /**
                 * null
                 * <p>
                 * Delete a release asset
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param id
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public void deleteByOwnerRepoId(String owner,
                    String repo,
                    String id,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/releases/assets/{id}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{id}", ""+id));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    requestDel(url, headerProperties);
                }

                /**
                 * null
                 * <p>
                 * List assets for a release
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param id
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<Asset[]> getByOwnerRepoId(String owner,
                    String repo,
                    String id,
                    String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/releases/{id}/assets".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{id}", ""+id));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, Asset[].class);
                }
            }
        }

        public class Stargazers {

            /**
             * null
             * <p>
             * List Stargazers.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.User[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/stargazers".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.User[].class);
            }
        }

        public class Stats {
            public final Anonymous.Repos.Stats.Codefrequency codefrequency = new Anonymous.Repos.Stats.Codefrequency();
            public final Anonymous.Repos.Stats.Commitactivity commitactivity = new Anonymous.Repos.Stats.Commitactivity();
            public final Anonymous.Repos.Stats.Contributors contributors = new Anonymous.Repos.Stats.Contributors();
            public final Anonymous.Repos.Stats.Participation participation = new Anonymous.Repos.Stats.Participation();
            public final Anonymous.Repos.Stats.Punchcard punchcard = new Anonymous.Repos.Stats.Punchcard();

            public class Codefrequency {

                /**
                 * null
                 * <p>
                 * Get the number of additions and deletions per week.
                 * Returns a weekly aggregate of the number of additions and deletions pushed
                 * to a repository.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<int[]> getByOwnerRepo(String owner, String repo, String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/stats/code_frequency".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, int[].class);
                }
            }

            public class Commitactivity {

                /**
                 * null
                 * <p>
                 * Get the last year of commit activity data.
                 * Returns the last year of commit activity grouped by week. The days array
                 * is a group of commits per day, starting on Sunday.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<CommitActivityStats[]> getByOwnerRepo(String owner, String repo, String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/stats/commit_activity".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, CommitActivityStats[].class);
                }
            }

            public class Contributors {

                /**
                 * null
                 * <p>
                 * Get contributors list with additions, deletions, and commit counts.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<ContributorsStats[]> getByOwnerRepo(String owner, String repo, String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/stats/contributors".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, ContributorsStats[].class);
                }
            }

            public class Participation {

                /**
                 * null
                 * <p>
                 * Get the weekly commit count for the repo owner and everyone else.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<ParticipationStats> getByOwnerRepo(String owner, String repo, String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/stats/participation".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, ParticipationStats.class);
                }
            }

            public class Punchcard {

                /**
                 * null
                 * <p>
                 * Get the number of commits per hour in each day.
                 * Each array contains the day number, hour number, and number of commits
                 *  0-6 Sunday - Saturday
                 *  0-23 Hour of day
                 * Number of commits
                 * For example, [2, 14, 25] indicates that there were 25 total commits, during
                 * the 2.00pm hour on Tuesdays. All times are based on the time zone of
                 * individual commits.
                 * </p>
                 * 
                 * @param owner
                 *     Name of repository owner.
                 * @param repo
                 *     Name of repository.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public Requested<int[]> getByOwnerRepo(String owner, String repo, String Accept) {
                    String url = ("https://api.github.com//repos/{owner}/{repo}/stats/punch_card".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    return requestGet(url, headerProperties, int[].class);
                }
            }
        }

        public class Statuses {

            /**
             * null
             * <p>
             * List Statuses for a specific Ref.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param ref
             *     Ref to list the statuses from. It can be a SHA, a branch name, or a tag name.
             *     
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Ref[]> getByOwnerRepoRef(String owner,
                String repo,
                String ref,
                String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/statuses/{ref}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{ref}", ""+ref));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Ref[].class);
            }

            /**
             * null
             * <p>
             * Create a Status.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param ref
             *     Ref to list the statuses from. It can be a SHA, a branch name, or a tag name.
             *     
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<Ref[]> postByOwnerRepoRef(String owner,
                String repo,
                String ref,
                String Accept,
                HeadBranch body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/statuses/{ref}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{ref}", ""+ref));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, Ref[].class);
            }
        }

        public class Subscribers {

            /**
             * null
             * <p>
             * List watchers.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.User[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/subscribers".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.User[].class);
            }
        }

        public class Subscription {

            /**
             * null
             * <p>
             * Get a Repository Subscription.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Subscription> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/subscription".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Subscription.class);
            }

            /**
             * null
             * <p>
             * Set a Repository Subscription
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<api.github.com.definitions.Subscription> putByOwnerRepo(String owner,
                String repo,
                String Accept,
                SubscriptionBody body) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/subscription".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPut(url, headerProperties, content, api.github.com.definitions.Subscription.class);
            }

            /**
             * null
             * <p>
             * Delete a Repository Subscription.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/subscription".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Tags {

            /**
             * null
             * <p>
             * Get list of tags.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Tag[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/tags".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Tag[].class);
            }
        }

        public class Teams {

            /**
             * null
             * <p>
             * Get list of teams
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Teams[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/teams".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Teams[].class);
            }
        }

        public class Watchers {

            /**
             * null
             * <p>
             * List Stargazers. New implementation.
             * </p>
             * 
             * @param owner
             *     Name of repository owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.User[]> getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//repos/{owner}/{repo}/watchers".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.User[].class);
            }
        }
    }

    public class Repositories {

        /**
         * null
         * <p>
         * List all public repositories.
         * This provides a dump of every public repository, in the order that they
         * were created.
         * Note: Pagination is powered exclusively by the since parameter. is the
         * Link header to get the URL for the next page of repositories.
         * </p>
         * 
         * @param since
         *     The time should be passed in as UTC in the ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
         *     Example: "2012-10-09T23:39:01Z".
         *     
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<Repo[]> get(String since, String Accept) {
            String url = ("https://api.github.com//repositories"+"?"+(since==null?"":"&since="+flatten(since)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, Repo[].class);
        }
    }

    public class Search {
        public final Anonymous.Search.Code code = new Anonymous.Search.Code();
        public final Anonymous.Search.Issues issues = new Anonymous.Search.Issues();
        public final Anonymous.Search.Repositories repositories = new Anonymous.Search.Repositories();
        public final Anonymous.Search.Users users = new Anonymous.Search.Users();

        public class Code {

            /**
             * null
             * <p>
             * Search code.
             * </p>
             * 
             * @param order
             *     The sort field. if sort param is provided. Can be either asc or desc.
             * @param q
             *     The search terms. This can be any combination of the supported code
             *     search parameters:
             *     'Search In' Qualifies which fields are searched. With this qualifier
             *     you can restrict the search to just the file contents, the file path,
             *     or both.
             *     'Languages' Searches code based on the language it's written in.
             *     'Forks' Filters repositories based on the number of forks, and/or
             *     whether code from forked repositories should be included in the results
             *     at all.
             *     'Size' Finds files that match a certain size (in bytes).
             *     'Path' Specifies the path that the resulting file must be at.
             *     'Extension' Matches files with a certain extension.
             *     'Users' or 'Repositories' Limits searches to a specific user or repository.
             *     
             * @param sort
             *     Can only be 'indexed', which indicates how recently a file has been indexed
             *     by the GitHub search infrastructure. If not provided, results are sorted
             *     by best match.
             *     
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<SearchCode> get(api.github.com.structures.order order,
                String q,
                api.github.com.structures.sort sort,
                String Accept) {
                String url = ("https://api.github.com//search/code"+"?"+(order==null?"":"&order="+flatten(order))+(q==null?"":"&q="+flatten(q))+(sort==null?"":"&sort="+flatten(sort)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, SearchCode.class);
            }
        }

        public class Issues {

            /**
             * null
             * <p>
             * Find issues by state and keyword. (This method returns up to 100 results per page.)
             * </p>
             * 
             * @param order
             *     The sort field. if sort param is provided. Can be either asc or desc.
             * @param q
             *     The q search term can also contain any combination of the supported issue search qualifiers:
             * @param sort
             *     The sort field. Can be comments, created, or updated. Default: results are sorted by best match.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<SearchIssues> get(api.github.com.structures.order order,
                String q,
                api.github.com.structures.sort sort,
                String Accept) {
                String url = ("https://api.github.com//search/issues"+"?"+(order==null?"":"&order="+flatten(order))+(q==null?"":"&q="+flatten(q))+(sort==null?"":"&sort="+flatten(sort)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, SearchIssues.class);
            }
        }

        public class Repositories {

            /**
             * null
             * <p>
             * Search repositories.
             * </p>
             * 
             * @param order
             *     The sort field. if sort param is provided. Can be either asc or desc.
             * @param q
             *     The search terms. This can be any combination of the supported repository
             *     search parameters:
             *     'Search In' Qualifies which fields are searched. With this qualifier you
             *     can restrict the search to just the repository name, description, readme,
             *     or any combination of these.
             *     'Size' Finds repositories that match a certain size (in kilobytes).
             *     'Forks' Filters repositories based on the number of forks, and/or whether
             *     forked repositories should be included in the results at all.
             *     'Created' and 'Last Updated' Filters repositories based on times of
             *     creation, or when they were last updated.
             *     'Users or Repositories' Limits searches to a specific user or repository.
             *     'Languages' Searches repositories based on the language they are written in.
             *     'Stars' Searches repositories based on the number of stars.
             *     
             * @param sort
             *     If not provided, results are sorted by best match.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<SearchRepositories> get(api.github.com.structures.order order,
                String q,
                api.github.com.structures.sort sort,
                String Accept) {
                String url = ("https://api.github.com//search/repositories"+"?"+(order==null?"":"&order="+flatten(order))+(q==null?"":"&q="+flatten(q))+(sort==null?"":"&sort="+flatten(sort)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, SearchRepositories.class);
            }
        }

        public class Users {

            /**
             * null
             * <p>
             * Search users.
             * </p>
             * 
             * @param order
             *     The sort field. if sort param is provided. Can be either asc or desc.
             * @param q
             *     The search terms. This can be any combination of the supported user
             *     search parameters:
             *     'Search In' Qualifies which fields are searched. With this qualifier you
             *     can restrict the search to just the username, public email, full name,
             *     location, or any combination of these.
             *     'Repository count' Filters users based on the number of repositories they
             *     have.
             *     'Location' Filter users by the location indicated in their profile.
             *     'Language' Search for users that have repositories that match a certain
             *     language.
             *     'Created' Filter users based on when they joined.
             *     'Followers' Filter users based on the number of followers they have.
             *     
             * @param sort
             *     If not provided, results are sorted by best match.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<SearchUsers> get(api.github.com.structures.order order,
                String q,
                api.github.com.structures.sort sort,
                String Accept) {
                String url = ("https://api.github.com//search/users"+"?"+(order==null?"":"&order="+flatten(order))+(q==null?"":"&q="+flatten(q))+(sort==null?"":"&sort="+flatten(sort)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, SearchUsers.class);
            }
        }
    }

    public class Teams {
        public final Anonymous.Teams.Members members = new Anonymous.Teams.Members();
        public final Anonymous.Teams.Memberships memberships = new Anonymous.Teams.Memberships();
        public final Anonymous.Teams.Repos repos = new Anonymous.Teams.Repos();

        /**
         * null
         * <p>
         * Get team.
         * </p>
         * 
         * @param teamId
         *     Id of team.
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<Team> getByTeamid(long teamId, String Accept) {
            String url = ("https://api.github.com//teams/{teamId}".replace("{teamId}", ""+teamId));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, Team.class);
        }

        /**
         * null
         * <p>
         * Delete team.
         * In order to delete a team, the authenticated user must be an owner of the
         * org that the team is associated with.
         * </p>
         * 
         * @param teamId
         *     Id of team.
         * @param Accept
         *     Is used to set specified media type.
         */
        public void deleteByTeamid(long teamId, String Accept) {
            String url = ("https://api.github.com//teams/{teamId}".replace("{teamId}", ""+teamId));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            requestDel(url, headerProperties);
        }

        public class Members {

            /**
             * null
             * <p>
             * List team members.
             * In order to list members in a team, the authenticated user must be a member
             * of the team.
             * </p>
             * 
             * @param teamId
             *     Id of team.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.User[]> getByTeamid(long teamId, String Accept) {
                String url = ("https://api.github.com//teams/{teamId}/members".replace("{teamId}", ""+teamId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.User[].class);
            }

            /**
             * null
             * <p>
             * The "Get team member" API is deprecated and is scheduled for removal in the next major version of the API. We recommend using the Get team membership API instead. It allows you to get both active and pending memberships.
             * Get team member.
             * In order to get if a user is a member of a team, the authenticated user mus
             * be a member of the team.
             * </p>
             * 
             * @param teamId
             *     Id of team.
             * @param username
             *     Name of a member.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getByTeamidUsername(long teamId, String username, String Accept) {
                String url = ("https://api.github.com//teams/{teamId}/members/{username}".replace("{teamId}", ""+teamId).replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }

            /**
             * null
             * <p>
             * The API (described below) is deprecated and is scheduled for removal in the next major version of the API. We recommend using the Add team membership API instead. It allows you to invite new organization members to your teams.
             * Add team member.
             * In order to add a user to a team, the authenticated user must have 'admin'
             * permissions to the team or be an owner of the org that the team is associated
             * with.
             * </p>
             * 
             * @param teamId
             *     Id of team.
             * @param username
             *     Name of a member.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void putByTeamidUsername(long teamId, String username, String Accept) {
                String url = ("https://api.github.com//teams/{teamId}/members/{username}".replace("{teamId}", ""+teamId).replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestPut(url, headerProperties, null, Void.class);
            }

            /**
             * null
             * <p>
             * The "Remove team member" API is deprecated and is scheduled for removal in the next major version of the API. We recommend using the Remove team membership API instead. It allows you to remove both active and pending memberships.
             * Remove team member.
             * In order to remove a user from a team, the authenticated user must have 'admin'
             * permissions to the team or be an owner of the org that the team is associated
             * with.
             * NOTE This does not delete the user, it just remove them from the team.
             * </p>
             * 
             * @param teamId
             *     Id of team.
             * @param username
             *     Name of a member.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByTeamidUsername(long teamId, String username, String Accept) {
                String url = ("https://api.github.com//teams/{teamId}/members/{username}".replace("{teamId}", ""+teamId).replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Memberships {

            /**
             * null
             * <p>
             * Get team membership.
             * In order to get a user's membership with a team, the authenticated user must be a member of the team or an owner of the team's organization.
             * </p>
             * 
             * @param teamId
             *     Id of team.
             * @param username
             *     Name of a member.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<TeamMembership> getByTeamidUsername(long teamId, String username, String Accept) {
                String url = ("https://api.github.com//teams/{teamId}/memberships/{username}".replace("{teamId}", ""+teamId).replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, TeamMembership.class);
            }

            /**
             * null
             * <p>
             * Add team membership.
             * In order to add a membership between a user and a team, the authenticated user must have 'admin' permissions to the team or be an owner of the organization that the team is associated with.
             * If the user is already a part of the team's organization (meaning they're on at least one other team in the organization), this endpoint will add the user to the team.
             * If the user is completely unaffiliated with the team's organization (meaning they're on none of the organization's teams), this endpoint will send an invitation to the user via email. This newly-created membership will be in the 'pending' state until the user accepts the invitation, at which point the membership will transition to the 'active' state and the user will be added as a member of the team.
             * </p>
             * 
             * @param teamId
             *     Id of team.
             * @param username
             *     Name of a member.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<TeamMembership> putByTeamidUsername(long teamId, String username, String Accept) {
                String url = ("https://api.github.com//teams/{teamId}/memberships/{username}".replace("{teamId}", ""+teamId).replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestPut(url, headerProperties, null, TeamMembership.class);
            }

            /**
             * null
             * <p>
             * Remove team membership.
             * In order to remove a membership between a user and a team, the authenticated user must have 'admin' permissions to the team or be an owner of the organization that the team is associated with. NOTE: This does not delete the user, it just removes their membership from the team.
             * </p>
             * 
             * @param teamId
             *     Id of team.
             * @param username
             *     Name of a member.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByTeamidUsername(long teamId, String username, String Accept) {
                String url = ("https://api.github.com//teams/{teamId}/memberships/{username}".replace("{teamId}", ""+teamId).replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Repos {

            /**
             * null
             * <p>
             * List team repos
             * </p>
             * 
             * @param teamId
             *     Id of team.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Repo[]> getByTeamid(long teamId, String Accept) {
                String url = ("https://api.github.com//teams/{teamId}/repos".replace("{teamId}", ""+teamId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Repo[].class);
            }

            /**
             * null
             * <p>
             * Check if a team manages a repository
             * </p>
             * 
             * @param teamId
             *     Id of team.
             * @param owner
             *     Name of a repository owner.
             * @param repo
             *     Name of a repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getByTeamidOwnerRepo(long teamId,
                String owner,
                String repo,
                String Accept) {
                String url = ("https://api.github.com//teams/{teamId}/repos/{owner}/{repo}".replace("{teamId}", ""+teamId).replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }

            /**
             * null
             * <p>
             * In order to add a repository to a team, the authenticated user must be an owner of the org that the team is associated with. Also, the repository must be owned by the organization, or a direct fork of a repository owned by the organization.
             * </p>
             * 
             * @param teamId
             *     Id of team.
             * @param owner
             *     Name of a organization.
             * @param repo
             *     Name of a repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void putByTeamidOwnerRepo(long teamId,
                String owner,
                String repo,
                String Accept) {
                String url = ("https://api.github.com//teams/{teamId}/repos/{owner}/{repo}".replace("{teamId}", ""+teamId).replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestPut(url, headerProperties, null, Void.class);
            }

            /**
             * null
             * <p>
             * In order to remove a repository from a team, the authenticated user must be an owner of the org that the team is associated with. NOTE: This does not delete the repository, it just removes it from the team.
             * </p>
             * 
             * @param teamId
             *     Id of team.
             * @param owner
             *     Name of a repository owner.
             * @param repo
             *     Name of a repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByTeamidOwnerRepo(long teamId,
                String owner,
                String repo,
                String Accept) {
                String url = ("https://api.github.com//teams/{teamId}/repos/{owner}/{repo}".replace("{teamId}", ""+teamId).replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }
    }

    public class User {
        public final Anonymous.User.Emails emails = new Anonymous.User.Emails();
        public final Anonymous.User.Followers followers = new Anonymous.User.Followers();
        public final Anonymous.User.Following following = new Anonymous.User.Following();
        public final Anonymous.User.Issues issues = new Anonymous.User.Issues();
        public final Anonymous.User.Keys keys = new Anonymous.User.Keys();
        public final Anonymous.User.Orgs orgs = new Anonymous.User.Orgs();
        public final Anonymous.User.Repos repos = new Anonymous.User.Repos();
        public final Anonymous.User.Starred starred = new Anonymous.User.Starred();
        public final Anonymous.User.Subscriptions subscriptions = new Anonymous.User.Subscriptions();
        public final Anonymous.User.Teams teams = new Anonymous.User.Teams();

        /**
         * null
         * <p>
         * Get the authenticated user.
         * </p>
         * 
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<api.github.com.definitions.User> get(String Accept) {
            String url = ("https://api.github.com//user");
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, api.github.com.definitions.User.class);
        }

        public class Emails {

            /**
             * null
             * <p>
             * List email addresses for a user.
             * In the final version of the API, this method will return an array of hashes
             * with extended information for each email address indicating if the address
             * has been verified and if it's primary email address for GitHub.
             * Until API v3 is finalized, use the application/vnd.github.v3 media type to
             * get other response format.
             * </p>
             * 
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<String[]> get(String Accept) {
                String url = ("https://api.github.com//user/emails");
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, String[].class);
            }

            /**
             * null
             * <p>
             * Add email address(es).
             * You can post a single email address or an array of addresses.
             * </p>
             * 
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public void post(String Accept, String[] body) {
                String url = ("https://api.github.com//user/emails");
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                requestPost(url, headerProperties, content, Void.class);
            }

            /**
             * null
             * <p>
             * Delete email address(es).
             * You can include a single email address or an array of addresses.
             * </p>
             * 
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public void delete(String Accept, String[] body) {
                String url = ("https://api.github.com//user/emails");
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Followers {

            /**
             * null
             * <p>
             * List the authenticated user's followers
             * </p>
             * 
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.User[]> get(String Accept) {
                String url = ("https://api.github.com//user/followers");
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.User[].class);
            }
        }

        public class Following {

            /**
             * null
             * <p>
             * List who the authenticated user is following.
             * </p>
             * 
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.User[]> get(String Accept) {
                String url = ("https://api.github.com//user/following");
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.User[].class);
            }

            /**
             * null
             * <p>
             * Check if you are following a user.
             * </p>
             * 
             * @param username
             *     Name of user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getByUsername(String username, String Accept) {
                String url = ("https://api.github.com//user/following/{username}".replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }

            /**
             * null
             * <p>
             * Follow a user.
             * Following a user requires the user to be logged in and authenticated with
             * basic auth or OAuth with the user:follow scope.
             * </p>
             * 
             * @param username
             *     Name of user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void putByUsername(String username, String Accept) {
                String url = ("https://api.github.com//user/following/{username}".replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestPut(url, headerProperties, null, Void.class);
            }

            /**
             * null
             * <p>
             * Unfollow a user.
             * Unfollowing a user requires the user to be logged in and authenticated with
             * basic auth or OAuth with the user:follow scope.
             * </p>
             * 
             * @param username
             *     Name of user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByUsername(String username, String Accept) {
                String url = ("https://api.github.com//user/following/{username}".replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Issues {

            /**
             * null
             * <p>
             * List issues.
             * List all issues across owned and member repositories for the authenticated
             * user.
             * </p>
             * 
             * @param filter
             *     Issues assigned to you / created by you / mentioning you / you're
             *     subscribed to updates for / All issues the authenticated user can see
             *     
             * @param state
             * @param labels
             *     String list of comma separated Label names. Example - bug,ui,@high.
             * @param sort
             * @param direction
             * @param since
             *     Optional string of a timestamp in ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
             *     Only issues updated at or after this time are returned.
             *     
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Issues[]> get(api.github.com.structures.filter filter,
                api.github.com.structures.state state,
                String labels,
                api.github.com.structures.sort sort,
                api.github.com.structures.direction direction,
                String since,
                String Accept) {
                String url = ("https://api.github.com//user/issues"+"?"+(filter==null?"":"&filter="+flatten(filter))+(state==null?"":"&state="+flatten(state))+(labels==null?"":"&labels="+flatten(labels))+(sort==null?"":"&sort="+flatten(sort))+(direction==null?"":"&direction="+flatten(direction))+(since==null?"":"&since="+flatten(since)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Issues[].class);
            }
        }

        public class Keys {

            /**
             * null
             * <p>
             * List your public keys.
             * Lists the current user's keys. Management of public keys via the API requires
             * that you are authenticated through basic auth, or OAuth with the 'user', 'write:public_key' scopes.
             * </p>
             * 
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Object[]> get(String Accept) {
                String url = ("https://api.github.com//user/keys");
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Object[].class);
            }

            /**
             * null
             * <p>
             * Create a public key.
             * </p>
             * 
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<UserKeysKeyId> post(String Accept, UserKeysPost body) {
                String url = ("https://api.github.com//user/keys");
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, UserKeysKeyId.class);
            }

            /**
             * null
             * <p>
             * Get a single public key.
             * </p>
             * 
             * @param keyId
             *     ID of key.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<UserKeysKeyId> getByKeyid(long keyId, String Accept) {
                String url = ("https://api.github.com//user/keys/{keyId}".replace("{keyId}", ""+keyId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, UserKeysKeyId.class);
            }

            /**
             * null
             * <p>
             * Delete a public key. Removes a public key. Requires that you are authenticated via Basic Auth or via OAuth with at least admin:public_key scope.
             * </p>
             * 
             * @param keyId
             *     ID of key.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByKeyid(long keyId, String Accept) {
                String url = ("https://api.github.com//user/keys/{keyId}".replace("{keyId}", ""+keyId));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Orgs {

            /**
             * null
             * <p>
             * List public and private organizations for the authenticated user.
             * </p>
             * 
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Object[]> get(String Accept) {
                String url = ("https://api.github.com//user/orgs");
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Object[].class);
            }
        }

        public class Repos {

            /**
             * null
             * <p>
             * List repositories for the authenticated user. Note that this does not include
             * repositories owned by organizations which the user can access. You can lis
             * user organizations and list organization repositories separately.
             * </p>
             * 
             * @param type
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Repo[]> get(api.github.com.structures.type type, String Accept) {
                String url = ("https://api.github.com//user/repos"+"?"+(type==null?"":"&type="+flatten(type)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Repo[].class);
            }

            /**
             * null
             * <p>
             * Create a new repository for the authenticated user. OAuth users must supply
             * repo scope.
             * </p>
             * 
             * @param Accept
             *     Is used to set specified media type.
             * @param body
             */
            public Requested<Repo[]> post(String Accept, PostRepo body) {
                String url = ("https://api.github.com//user/repos");
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, headerProperties, content, Repo[].class);
            }
        }

        public class Starred {

            /**
             * null
             * <p>
             * List repositories being starred by the authenticated user.
             * </p>
             * 
             * @param direction
             *     Ignored without 'sort' parameter.
             * @param sort
             *     
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Object[]> get(String direction, api.github.com.structures.sort sort, String Accept) {
                String url = ("https://api.github.com//user/starred"+"?"+(direction==null?"":"&direction="+flatten(direction))+(sort==null?"":"&sort="+flatten(sort)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Object[].class);
            }

            /**
             * null
             * <p>
             * Check if you are starring a repository.
             * </p>
             * 
             * @param owner
             *     Name of a repository owner.
             * @param repo
             *     Name of a repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//user/starred/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }

            /**
             * null
             * <p>
             * Star a repository.
             * </p>
             * 
             * @param owner
             *     Name of a repository owner.
             * @param repo
             *     Name of a repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void putByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//user/starred/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestPut(url, headerProperties, null, Void.class);
            }

            /**
             * null
             * <p>
             * Unstar a repository
             * </p>
             * 
             * @param owner
             *     Name of a repository owner.
             * @param repo
             *     Name of a repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//user/starred/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Subscriptions {

            /**
             * null
             * <p>
             * List repositories being watched by the authenticated user.
             * </p>
             * 
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Repo[]> get(String Accept) {
                String url = ("https://api.github.com//user/subscriptions");
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Repo[].class);
            }

            /**
             * null
             * <p>
             * Check if you are watching a repository.
             * </p>
             * 
             * @param owner
             *     Name of the owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//user/subscriptions/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }

            /**
             * null
             * <p>
             * Watch a repository.
             * </p>
             * 
             * @param owner
             *     Name of the owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void putByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//user/subscriptions/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestPut(url, headerProperties, null, Void.class);
            }

            /**
             * null
             * <p>
             * Stop watching a repository
             * </p>
             * 
             * @param owner
             *     Name of the owner.
             * @param repo
             *     Name of repository.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void deleteByOwnerRepo(String owner, String repo, String Accept) {
                String url = ("https://api.github.com//user/subscriptions/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestDel(url, headerProperties);
            }
        }

        public class Teams {

            /**
             * null
             * <p>
             * List all of the teams across all of the organizations to which the authenticated user belongs. This method requires user or repo scope when authenticating via OAuth.
             * </p>
             * 
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<TeamsList[]> get(String Accept) {
                String url = ("https://api.github.com//user/teams");
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, TeamsList[].class);
            }
        }
    }

    public class Users {
        public final Anonymous.Users.Events events = new Anonymous.Users.Events();
        public final Anonymous.Users.Followers followers = new Anonymous.Users.Followers();
        public final Anonymous.Users.Following following = new Anonymous.Users.Following();
        public final Anonymous.Users.Gists gists = new Anonymous.Users.Gists();
        public final Anonymous.Users.Keys keys = new Anonymous.Users.Keys();
        public final Anonymous.Users.Orgs orgs = new Anonymous.Users.Orgs();
        public final Anonymous.Users.Receivedevents receivedevents = new Anonymous.Users.Receivedevents();
        public final Anonymous.Users.Repos repos = new Anonymous.Users.Repos();
        public final Anonymous.Users.Starred starred = new Anonymous.Users.Starred();
        public final Anonymous.Users.Subscriptions subscriptions = new Anonymous.Users.Subscriptions();

        /**
         * null
         * <p>
         * Get all users.
         * This provides a dump of every user, in the order that they signed up for GitHub.
         * Note: Pagination is powered exclusively by the since parameter. Use the Link
         * header to get the URL for the next page of users.
         * </p>
         * 
         * @param since
         *     The integer ID of the last user that you've seen.
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<api.github.com.definitions.User[]> get(Long since, String Accept) {
            String url = ("https://api.github.com//users"+"?"+(since==null?"":"&since="+flatten(since)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, api.github.com.definitions.User[].class);
        }

        /**
         * null
         * <p>
         * Get a single user.
         * </p>
         * 
         * @param username
         *     Name of user.
         * @param Accept
         *     Is used to set specified media type.
         */
        public Requested<api.github.com.definitions.User> getByUsername(String username, String Accept) {
            String url = ("https://api.github.com//users/{username}".replace("{username}", ""+username));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (Accept!= null) {
                headerProperties.put("Accept", (""+ Accept));
            }
            return requestGet(url, headerProperties, api.github.com.definitions.User.class);
        }

        public class Events {
            public final Anonymous.Users.Events.Orgs orgs = new Anonymous.Users.Events.Orgs();

            /**
             * null
             * <p>
             * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
             * </p>
             * 
             * @param username
             *     Name of user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getByUsername(String username, String Accept) {
                String url = ("https://api.github.com//users/{username}/events".replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }

            public class Orgs {

                /**
                 * null
                 * <p>
                 * This is the user's organization dashboard. You must be authenticated as the user to view this.
                 * </p>
                 * 
                 * @param username
                 *     Name of user.
                 * @param org
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public void getByUsernameOrg(String username, String org, String Accept) {
                    String url = ("https://api.github.com//users/{username}/events/orgs/{org}".replace("{username}", ""+username).replace("{org}", ""+org));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    requestGet(url, headerProperties, Void.class);
                }
            }
        }

        public class Followers {

            /**
             * null
             * <p>
             * List a user's followers
             * </p>
             * 
             * @param username
             *     Name of user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.User[]> getByUsername(String username, String Accept) {
                String url = ("https://api.github.com//users/{username}/followers".replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.User[].class);
            }
        }

        public class Following {

            /**
             * null
             * <p>
             * Check if one user follows another.
             * </p>
             * 
             * @param username
             *     Name of user.
             * @param targetUser
             *     Name of user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getByUsernameTargetuser(String username, String targetUser, String Accept) {
                String url = ("https://api.github.com//users/{username}/following/{targetUser}".replace("{username}", ""+username).replace("{targetUser}", ""+targetUser));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }
        }

        public class Gists {

            /**
             * null
             * <p>
             * List a users gists.
             * </p>
             * 
             * @param username
             *     Name of user.
             * @param since
             *     The time should be passed in as UTC in the ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
             *     Example: "2012-10-09T23:39:01Z".
             *     
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<api.github.com.definitions.Gists[]> getByUsername(String username, String since, String Accept) {
                String url = ("https://api.github.com//users/{username}/gists".replace("{username}", ""+username)+"?"+(since==null?"":"&since="+flatten(since)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, api.github.com.definitions.Gists[].class);
            }
        }

        public class Keys {

            /**
             * null
             * <p>
             * List public keys for a user.
             * Lists the verified public keys for a user. This is accessible by anyone.
             * </p>
             * 
             * @param username
             *     Name of user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Object[]> getByUsername(String username, String Accept) {
                String url = ("https://api.github.com//users/{username}/keys".replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Object[].class);
            }
        }

        public class Orgs {

            /**
             * null
             * <p>
             * List all public organizations for a user.
             * </p>
             * 
             * @param username
             *     Name of user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Object[]> getByUsername(String username, String Accept) {
                String url = ("https://api.github.com//users/{username}/orgs".replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Object[].class);
            }
        }

        public class Receivedevents {
            public final Anonymous.Users.Receivedevents.Public _public = new Anonymous.Users.Receivedevents.Public();

            /**
             * null
             * <p>
             * These are events that you'll only see public events.
             * </p>
             * 
             * @param username
             *     Name of user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getByUsername(String username, String Accept) {
                String url = ("https://api.github.com//users/{username}/received_events".replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }

            public class Public {

                /**
                 * null
                 * <p>
                 * List public events that a user has received
                 * </p>
                 * 
                 * @param username
                 *     Name of user.
                 * @param Accept
                 *     Is used to set specified media type.
                 */
                public void getByUsername(String username, String Accept) {
                    String url = ("https://api.github.com//users/{username}/received_events/public".replace("{username}", ""+username));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (Accept!= null) {
                        headerProperties.put("Accept", (""+ Accept));
                    }
                    requestGet(url, headerProperties, Void.class);
                }
            }
        }

        public class Repos {

            /**
             * null
             * <p>
             * List public repositories for the specified user.
             * </p>
             * 
             * @param username
             *     Name of user.
             * @param type
             * @param Accept
             *     Is used to set specified media type.
             */
            public Requested<Repo[]> getByUsername(String username, api.github.com.structures.type type, String Accept) {
                String url = ("https://api.github.com//users/{username}/repos".replace("{username}", ""+username)+"?"+(type==null?"":"&type="+flatten(type)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                return requestGet(url, headerProperties, Repo[].class);
            }
        }

        public class Starred {

            /**
             * null
             * <p>
             * List repositories being starred by a user.
             * </p>
             * 
             * @param username
             *     Name of user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getByUsername(String username, String Accept) {
                String url = ("https://api.github.com//users/{username}/starred".replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }
        }

        public class Subscriptions {

            /**
             * null
             * <p>
             * List repositories being watched by a user.
             * </p>
             * 
             * @param username
             *     Name of user.
             * @param Accept
             *     Is used to set specified media type.
             */
            public void getByUsername(String username, String Accept) {
                String url = ("https://api.github.com//users/{username}/subscriptions".replace("{username}", ""+username));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept!= null) {
                    headerProperties.put("Accept", (""+ Accept));
                }
                requestGet(url, headerProperties, Void.class);
            }
        }
    }
}
