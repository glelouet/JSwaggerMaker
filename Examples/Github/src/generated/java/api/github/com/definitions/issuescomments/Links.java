package api.github.com.definitions.issuescomments;

import api.github.com.definitions.issuescomments.links.Html;

public class Links {
    public Html html;
    public Html pull_request;
    public Html self;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Links othersame = ((Links) other);
        if ((html!= othersame.html)&&((html == null)||(!html.equals(othersame.html)))) {
            return false;
        }
        if ((pull_request!= othersame.pull_request)&&((pull_request == null)||(!pull_request.equals(othersame.pull_request)))) {
            return false;
        }
        if ((self!= othersame.self)&&((self == null)||(!self.equals(othersame.self)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((html == null)? 0 :html.hashCode())+((pull_request == null)? 0 :pull_request.hashCode()))+((self == null)? 0 :self.hashCode()));
    }
}
