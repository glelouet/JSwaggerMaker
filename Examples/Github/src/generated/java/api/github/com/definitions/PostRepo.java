package api.github.com.definitions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRepo {
    /**
     * True to create an initial commit with empty README. Default is false.
     */
    public boolean auto_init;
    public String description;
    /**
     * Desired language or platform .gitignore template to apply. Use the name of the template without the extension. For example, "Haskell" Ignored if auto_init parameter is not provided. 
     */
    public String gitignore_template;
    /**
     * True to enable downloads for this repository, false to disable them. Default is true.
     */
    public boolean has_downloads;
    /**
     * True to enable issues for this repository, false to disable them. Default is true.
     */
    public boolean has_issues;
    /**
     * True to enable the wiki for this repository, false to disable it. Default is true.
     */
    public boolean has_wiki;
    public String homepage;
    public String name;
    /**
     * True to create a private repository, false to create a public one. Creating private repositories requires a paid GitHub account.
     */
    @JsonProperty("private")
    public boolean _private;
    /**
     * The id of the team that will be granted access to this repository. This is only valid when creating a repo in an organization.
     */
    public long team_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PostRepo othersame = ((PostRepo) other);
        if (auto_init!= othersame.auto_init) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((gitignore_template!= othersame.gitignore_template)&&((gitignore_template == null)||(!gitignore_template.equals(othersame.gitignore_template)))) {
            return false;
        }
        if (has_downloads!= othersame.has_downloads) {
            return false;
        }
        if (has_issues!= othersame.has_issues) {
            return false;
        }
        if (has_wiki!= othersame.has_wiki) {
            return false;
        }
        if ((homepage!= othersame.homepage)&&((homepage == null)||(!homepage.equals(othersame.homepage)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (_private!= othersame._private) {
            return false;
        }
        if (team_id!= othersame.team_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(auto_init)+((description == null)? 0 :description.hashCode()))+((gitignore_template == null)? 0 :gitignore_template.hashCode()))+ Boolean.hashCode(has_downloads))+ Boolean.hashCode(has_issues))+ Boolean.hashCode(has_wiki))+((homepage == null)? 0 :homepage.hashCode()))+((name == null)? 0 :name.hashCode()))+ Boolean.hashCode(_private))+ Long.hashCode(team_id));
    }
}
