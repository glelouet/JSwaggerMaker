package api.github.com.definitions.pulls;

import api.github.com.definitions.issuescomments.links.Html;

public class Links {
    public Html comments;
    public Html html;
    public Html review_comments;
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
        if ((comments!= othersame.comments)&&((comments == null)||(!comments.equals(othersame.comments)))) {
            return false;
        }
        if ((html!= othersame.html)&&((html == null)||(!html.equals(othersame.html)))) {
            return false;
        }
        if ((review_comments!= othersame.review_comments)&&((review_comments == null)||(!review_comments.equals(othersame.review_comments)))) {
            return false;
        }
        if ((self!= othersame.self)&&((self == null)||(!self.equals(othersame.self)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((comments == null)? 0 :comments.hashCode())+((html == null)? 0 :html.hashCode()))+((review_comments == null)? 0 :review_comments.hashCode()))+((self == null)? 0 :self.hashCode()));
    }
}
