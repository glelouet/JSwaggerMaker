package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CodeFormattingStyle
    extends DelegateTransfer<Anonymous>
{

    public CodeFormattingStyle(Anonymous delegate) {
        super(delegate);
    }

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
        content.put("code_formatting_style", (code_formatting_style));
        requestPut(url, null, content, Void.class);
    }
}
