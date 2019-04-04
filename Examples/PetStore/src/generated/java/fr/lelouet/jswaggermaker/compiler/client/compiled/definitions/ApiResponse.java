package fr.lelouet.jswaggermaker.compiler.client.compiled.definitions;

public class ApiResponse {
    public int code;
    public String type;
    public String message;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ApiResponse othersame = ((ApiResponse) other);
        if (code!= othersame.code) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        if ((message!= othersame.message)&&((message == null)||(!message.equals(othersame.message)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((code +((type == null)? 0 :type.hashCode()))+((message == null)? 0 :message.hashCode()));
    }
}
