package api.github.com.definitions;

import api.github.com.definitions.actor.Plan;
import api.github.com.structures.Type;

public class Actor {
    public String avatar_url;
    public String bio;
    /**
     * The website URL from the profile page
     */
    public String blog;
    public long collaborators;
    public String company;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String created_at;
    public long disk_usage;
    /**
     * Note: The returned email is the user’s publicly visible email address (or null if the user has not specified a public email address in their profile).
     */
    public String email;
    public long followers;
    public String followers_url;
    public long following;
    public String following_url;
    public String gists_url;
    public String gravatar_id;
    public boolean hireable;
    public String html_url;
    public long id;
    public String location;
    /**
     * The account username
     */
    public String login;
    /**
     * The full account name
     */
    public String name;
    public String organizations_url;
    public long owned_private_repos;
    public Plan plan;
    public long private_gists;
    public long public_gists;
    public long public_repos;
    public String starred_url;
    public String subscriptions_url;
    public long total_private_repos;
    public Type type;
    /**
     * ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ
     */
    public String updated_at;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Actor othersame = ((Actor) other);
        if ((avatar_url!= othersame.avatar_url)&&((avatar_url == null)||(!avatar_url.equals(othersame.avatar_url)))) {
            return false;
        }
        if ((bio!= othersame.bio)&&((bio == null)||(!bio.equals(othersame.bio)))) {
            return false;
        }
        if ((blog!= othersame.blog)&&((blog == null)||(!blog.equals(othersame.blog)))) {
            return false;
        }
        if (collaborators!= othersame.collaborators) {
            return false;
        }
        if ((company!= othersame.company)&&((company == null)||(!company.equals(othersame.company)))) {
            return false;
        }
        if ((created_at!= othersame.created_at)&&((created_at == null)||(!created_at.equals(othersame.created_at)))) {
            return false;
        }
        if (disk_usage!= othersame.disk_usage) {
            return false;
        }
        if ((email!= othersame.email)&&((email == null)||(!email.equals(othersame.email)))) {
            return false;
        }
        if (followers!= othersame.followers) {
            return false;
        }
        if ((followers_url!= othersame.followers_url)&&((followers_url == null)||(!followers_url.equals(othersame.followers_url)))) {
            return false;
        }
        if (following!= othersame.following) {
            return false;
        }
        if ((following_url!= othersame.following_url)&&((following_url == null)||(!following_url.equals(othersame.following_url)))) {
            return false;
        }
        if ((gists_url!= othersame.gists_url)&&((gists_url == null)||(!gists_url.equals(othersame.gists_url)))) {
            return false;
        }
        if ((gravatar_id!= othersame.gravatar_id)&&((gravatar_id == null)||(!gravatar_id.equals(othersame.gravatar_id)))) {
            return false;
        }
        if (hireable!= othersame.hireable) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if ((location!= othersame.location)&&((location == null)||(!location.equals(othersame.location)))) {
            return false;
        }
        if ((login!= othersame.login)&&((login == null)||(!login.equals(othersame.login)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((organizations_url!= othersame.organizations_url)&&((organizations_url == null)||(!organizations_url.equals(othersame.organizations_url)))) {
            return false;
        }
        if (owned_private_repos!= othersame.owned_private_repos) {
            return false;
        }
        if ((plan!= othersame.plan)&&((plan == null)||(!plan.equals(othersame.plan)))) {
            return false;
        }
        if (private_gists!= othersame.private_gists) {
            return false;
        }
        if (public_gists!= othersame.public_gists) {
            return false;
        }
        if (public_repos!= othersame.public_repos) {
            return false;
        }
        if ((starred_url!= othersame.starred_url)&&((starred_url == null)||(!starred_url.equals(othersame.starred_url)))) {
            return false;
        }
        if ((subscriptions_url!= othersame.subscriptions_url)&&((subscriptions_url == null)||(!subscriptions_url.equals(othersame.subscriptions_url)))) {
            return false;
        }
        if (total_private_repos!= othersame.total_private_repos) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        if ((updated_at!= othersame.updated_at)&&((updated_at == null)||(!updated_at.equals(othersame.updated_at)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((avatar_url == null)? 0 :avatar_url.hashCode())+((bio == null)? 0 :bio.hashCode()))+((blog == null)? 0 :blog.hashCode()))+ Long.hashCode(collaborators))+((company == null)? 0 :company.hashCode()))+((created_at == null)? 0 :created_at.hashCode()))+ Long.hashCode(disk_usage))+((email == null)? 0 :email.hashCode()))+ Long.hashCode(followers))+((followers_url == null)? 0 :followers_url.hashCode()))+ Long.hashCode(following))+((following_url == null)? 0 :following_url.hashCode()))+((gists_url == null)? 0 :gists_url.hashCode()))+((gravatar_id == null)? 0 :gravatar_id.hashCode()))+ Boolean.hashCode(hireable))+((html_url == null)? 0 :html_url.hashCode()))+ Long.hashCode(id))+((location == null)? 0 :location.hashCode()))+((login == null)? 0 :login.hashCode()))+((name == null)? 0 :name.hashCode()))+((organizations_url == null)? 0 :organizations_url.hashCode()))+ Long.hashCode(owned_private_repos))+((plan == null)? 0 :plan.hashCode()))+ Long.hashCode(private_gists))+ Long.hashCode(public_gists))+ Long.hashCode(public_repos))+((starred_url == null)? 0 :starred_url.hashCode()))+((subscriptions_url == null)? 0 :subscriptions_url.hashCode()))+ Long.hashCode(total_private_repos))+((type == null)? 0 :type.hashCode()))+((updated_at == null)? 0 :updated_at.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
