package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SearchTokenizeChineseJapaneseKorean
    extends DelegateTransfer<Anonymous>
{

    public SearchTokenizeChineseJapaneseKorean(Anonymous delegate) {
        super(delegate);
    }

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
        content.put("search_tokenize_chinese_japanese_korean", (search_tokenize_chinese_japanese_korean));
        requestPut(url, null, content, Void.class);
    }
}
