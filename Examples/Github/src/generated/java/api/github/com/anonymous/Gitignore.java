package api.github.com.anonymous;

import api.github.com.Anonymous;
import api.github.com.anonymous.gitignore.Templates;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Gitignore
    extends DelegateTransfer<Anonymous>
{
    public final Templates templates;

    public Gitignore(Anonymous delegate) {
        super(delegate);
        templates = new Templates((delegate));
    }
}
