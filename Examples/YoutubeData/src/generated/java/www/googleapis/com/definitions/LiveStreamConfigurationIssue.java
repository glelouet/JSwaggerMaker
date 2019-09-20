package www.googleapis.com.definitions;

import www.googleapis.com.structures.SEVERITY;
import www.googleapis.com.structures.TYPE;

public class LiveStreamConfigurationIssue {
    /**
     * The long-form description of the issue and how to resolve it.
     */
    public String description;
    /**
     * The short-form reason for this issue.
     */
    public String reason;
    /**
     * How severe this issue is to the stream.
     */
    public SEVERITY severity;
    /**
     * The kind of error happening.
     */
    public TYPE type;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveStreamConfigurationIssue othersame = ((LiveStreamConfigurationIssue) other);
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((reason!= othersame.reason)&&((reason == null)||(!reason.equals(othersame.reason)))) {
            return false;
        }
        if ((severity!= othersame.severity)&&((severity == null)||(!severity.equals(othersame.severity)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((description == null)? 0 :description.hashCode())+((reason == null)? 0 :reason.hashCode()))+((severity == null)? 0 :severity.hashCode()))+((type == null)? 0 :type.hashCode()));
    }
}
