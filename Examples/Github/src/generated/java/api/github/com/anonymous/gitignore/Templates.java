package api.github.com.anonymous.gitignore;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.GitignoreLang;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Templates
    extends DelegateTransfer<Anonymous>
{

    public Templates(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
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
     * 
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
