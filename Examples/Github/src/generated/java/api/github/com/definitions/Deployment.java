package api.github.com.definitions;

import api.github.com.definitions.deployment.Payload;

public class Deployment {
    public String description;
    public Payload payload;
    public String ref;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Deployment othersame = ((Deployment) other);
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((payload!= othersame.payload)&&((payload == null)||(!payload.equals(othersame.payload)))) {
            return false;
        }
        if ((ref!= othersame.ref)&&((ref == null)||(!ref.equals(othersame.ref)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((description == null)? 0 :description.hashCode())+((payload == null)? 0 :payload.hashCode()))+((ref == null)? 0 :ref.hashCode()));
    }
}
