package api.apis.guru.definitions;

public class ApiVersion {
    /**
     * Timestamp when the version was added
     */
    public String added;
    /**
     * Copy of `externalDocs` section from Swagger spec
     */
    public Object externalDocs;
    /**
     * Copy of `info` section from Swagger spec
     */
    public Object info;
    /**
     * URL to Swagger spec in JSON format
     */
    public String swaggerUrl;
    /**
     * URL to Swagger spec in YAML format
     */
    public String swaggerYamlUrl;
    /**
     * Timestamp when the version was updated
     */
    public String updated;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ApiVersion othersame = ((ApiVersion) other);
        if ((added!= othersame.added)&&((added == null)||(!added.equals(othersame.added)))) {
            return false;
        }
        if ((externalDocs!= othersame.externalDocs)&&((externalDocs == null)||(!externalDocs.equals(othersame.externalDocs)))) {
            return false;
        }
        if ((info!= othersame.info)&&((info == null)||(!info.equals(othersame.info)))) {
            return false;
        }
        if ((swaggerUrl!= othersame.swaggerUrl)&&((swaggerUrl == null)||(!swaggerUrl.equals(othersame.swaggerUrl)))) {
            return false;
        }
        if ((swaggerYamlUrl!= othersame.swaggerYamlUrl)&&((swaggerYamlUrl == null)||(!swaggerYamlUrl.equals(othersame.swaggerYamlUrl)))) {
            return false;
        }
        if ((updated!= othersame.updated)&&((updated == null)||(!updated.equals(othersame.updated)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((added == null)? 0 :added.hashCode())+((externalDocs == null)? 0 :externalDocs.hashCode()))+((info == null)? 0 :info.hashCode()))+((swaggerUrl == null)? 0 :swaggerUrl.hashCode()))+((swaggerYamlUrl == null)? 0 :swaggerYamlUrl.hashCode()))+((updated == null)? 0 :updated.hashCode()));
    }
}
