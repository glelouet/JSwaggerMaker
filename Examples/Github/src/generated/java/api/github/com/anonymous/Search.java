package api.github.com.anonymous;

import api.github.com.Anonymous;
import api.github.com.anonymous.search.Code;
import api.github.com.anonymous.search.Issues;
import api.github.com.anonymous.search.Repositories;
import api.github.com.anonymous.search.Users;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Search
    extends DelegateTransfer<Anonymous>
{
    public final Code code;
    public final Issues issues;
    public final Repositories repositories;
    public final Users users;

    public Search(Anonymous delegate) {
        super(delegate);
        code = new Code((delegate));
        issues = new Issues((delegate));
        repositories = new Repositories((delegate));
        users = new Users((delegate));
    }
}
