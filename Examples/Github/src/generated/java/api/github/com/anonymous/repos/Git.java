package api.github.com.anonymous.repos;

import api.github.com.Anonymous;
import api.github.com.anonymous.repos.git.Blobs;
import api.github.com.anonymous.repos.git.Commits;
import api.github.com.anonymous.repos.git.Refs;
import api.github.com.anonymous.repos.git.Tags;
import api.github.com.anonymous.repos.git.Trees;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Git
    extends DelegateTransfer<Anonymous>
{
    public final Blobs blobs;
    public final Commits commits;
    public final Refs refs;
    public final Tags tags;
    public final Trees trees;

    public Git(Anonymous delegate) {
        super(delegate);
        blobs = new Blobs((delegate));
        commits = new Commits((delegate));
        refs = new Refs((delegate));
        tags = new Tags((delegate));
        trees = new Trees((delegate));
    }
}
